package net.tb.addons.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;
import net.tb.addons.armor_effects.DyeableArmorEffect;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class DyeableExtendedArmorItem extends DyeableArmorItem {
    private static final UUID[] MODIFIERS = new UUID[] {UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};

    private Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;
    private final ExtendedArmorMaterial material;

    public DyeableExtendedArmorItem(Item.Settings settings, ArmorItem.Type slot, ExtendedArmorMaterial material) {
        super(material, slot, settings);

        this.material = material;

        refreshAttributes();
    }

    @Override
    public int getProtection() {
        return material.getProtection(type);
    }

    @Override
    public float getToughness() {
        return material.getToughness();
    }

    public void refreshAttributes() {
        Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        UUID uUID = MODIFIERS[type.getEquipmentSlot().getEntitySlotId()];

        builder.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(uUID, "Armor modifier", getProtection(), EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, new EntityAttributeModifier(uUID, "Armor toughness", getMaterial().getToughness(), EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, new EntityAttributeModifier(uUID, "Armor knockback resistance", material.getKnockbackResistance(), EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(uUID, "Armor movement speed", -material.getWeight(), EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier(uUID, "Armor health gain", material.getExtraHealth(), EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(uUID, "Armor attack bonus", material.getAttackDamage(), EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(uUID, "Armor attack damage", material.getAttackSpeed(), EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        builder.put(EntityAttributes.GENERIC_LUCK, new EntityAttributeModifier(uUID, "Armor luck", material.getLuck(), EntityAttributeModifier.Operation.ADDITION));

        this.attributeModifiers = builder.build();
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        return slot == this.type.getEquipmentSlot() ? this.attributeModifiers : super.getAttributeModifiers(slot);
    }

    @Override
    public ExtendedArmorMaterial getMaterial() {
        return material;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);

        tooltip.add(Text.translatable("tbs-addons.dyeable").formatted(Formatting.GOLD));

        //effects
        for (DyeableArmorEffect e : getMaterial().getDyeableEffects()) {
            e.appendTooltip(stack, world, tooltip, context);
        }

        //static enchantments
        for (Map.Entry<Enchantment, Integer> entry : getMaterial().getEnchantments().entrySet()) {
            tooltip.add(entry.getKey().getName(entry.getValue()));
        }
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);

        if (entity instanceof LivingEntity livingEntity) {
            ItemStack equippedStack = livingEntity.getEquippedStack(getSlotType());
            if (equippedStack == stack) {
                for (DyeableArmorEffect e : getMaterial().getDyeableEffects()) {
                    e.equippedTick(stack, world, livingEntity, slot);
                }
            }
        }
    }

    public float applyArmorToDamage(LivingEntity entity, DamageSource source, float amount, ItemStack armor) {
        for (DyeableArmorEffect e : getMaterial().getDyeableEffects()) {
            amount = e.applyArmorToDamage(entity, source, amount, armor);
        }
        return amount;
    }

    public float applyArmorToAttack(LivingEntity target, DamageSource source, float amount, ItemStack armor) {
        for (DyeableArmorEffect e : getMaterial().getDyeableEffects()) {
            amount = e.applyArmorToAttack(target, source, amount, armor);
        }
        return amount;
    }

    @Override
    public int getColor(ItemStack stack) {
        NbtCompound nbtCompound = stack.getSubNbt("display");
        return nbtCompound != null && nbtCompound.contains("color", 99) ? nbtCompound.getInt("color") : getMaterial().getColor();
    }
}
