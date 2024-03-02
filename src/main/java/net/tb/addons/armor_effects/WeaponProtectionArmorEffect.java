package net.tb.addons.armor_effects;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class WeaponProtectionArmorEffect extends ArmorEffect{
    private final float damage;
    private final Class weapon;
    private final String weaponName;

    public WeaponProtectionArmorEffect(float damage, Class weapon, String weaponName) {
        this.damage = damage;
        this.weapon = weapon;
        this.weaponName = weaponName;
    }

    @Override
    public float applyArmorToDamage(LivingEntity entity, DamageSource source, float amount, ItemStack armor) {
        if (!source.isIndirect() && source.getAttacker() instanceof LivingEntity attacker) {
            if (isPrimaryArmor(armor, entity)) {
                boolean hasWeapon = Stream.of(attacker.getEquippedStack(EquipmentSlot.MAINHAND), attacker.getEquippedStack(EquipmentSlot.OFFHAND))
                        .filter(Objects::nonNull)
                        .anyMatch(v -> weapon.isInstance(v.getItem()));
                if (hasWeapon) {
                    amount *= (1.0f + getSetCount(armor, entity) * damage);
                }
            }
        }
        return amount;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);

        MutableText weaponText = Text.translatable("armorEffect.weaponArmorEfficiency." + weaponName);
        tooltip.add(Text.translatable("armorEffect.weaponArmorEfficiency", (int)(damage * 100), weaponText).formatted(Formatting.GOLD));
    }
}
