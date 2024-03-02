package net.tb.addons.armor_effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FallImunityArmorEffect extends ArmorEffect {

    @Override
    public void equippedTick(ItemStack armor, World world, LivingEntity entity, int slot) {
        super.equippedTick(armor, world, entity, slot);

            entity.fallDistance = Math.min(1, entity.fallDistance);

    }
}
