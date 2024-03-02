package net.tb.addons.armor_effects;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ProtectionTypeArmorEffect extends ArmorEffect {
    private final float strength;
    private final RegistryKey<DamageType> type;
    private final String typeName;

    public ProtectionTypeArmorEffect(float strength, RegistryKey<DamageType> type, String typeName) {
        this.strength = strength;
        this.type = type;
        this.typeName = typeName;
    }

    @Override
    public float applyArmorToDamage(LivingEntity entity, DamageSource source, float amount, ItemStack armor) {
        if (source.isOf(type)) {
            return amount * (1.0f - strength);
        } else {
            return amount;
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);

        MutableText typeText = Text.translatable("armorEffect.Resistance." + typeName);
        tooltip.add(Text.translatable("armorEffect.Resistance", (int)(strength * 100), typeText).formatted(Formatting.RED));
    }
}
