package net.tb.addons.armor_effects;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FireInflictingArmorEffect extends ArmorEffect {
    private final int length;

    public FireInflictingArmorEffect(int length) {
        this.length = length;
    }

    @Override
    public float applyArmorToDamage(LivingEntity entity, DamageSource source, float amount, ItemStack armor) {
        if (isPrimaryArmor(armor, entity) && source.getAttacker() != null && !source.getAttacker().isFireImmune()) {
            source.getAttacker().setFireTicks(source.getAttacker().getFireTicks() + length * getSetCount(armor, entity));

            entity.getWorld().playSoundFromEntity(null, entity, SoundEvents.ENTITY_BLAZE_BURN, entity.getSoundCategory(), 1.0f, entity.getRandom().nextFloat() * 0.7F + 0.3F);
        }
        return amount;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);

        tooltip.add(Text.translatable("armorEffect.fireInflicting", length).formatted(Formatting.RED));
    }

    @Override
    public void equippedTick(ItemStack stack, World world, LivingEntity entity, int slot) {
        if (world.isClient && MinecraftClient.getInstance().player == entity && !MinecraftClient.getInstance().options.getPerspective().isFirstPerson() && entity.getRandom().nextInt(15) == 0) {
            world.addParticle(ParticleTypes.FLAME, entity.getParticleX(0.5D), entity.getRandomBodyY(), entity.getParticleZ(0.5D), 0.0D, 0.0D, 0.0D);
        }
    }
}
