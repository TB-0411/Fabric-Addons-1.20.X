package net.tb.addons.armor_effects;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

public class RadarArmorEffect extends ArmorEffect {

    @Override
    public void equippedTick(ItemStack armor, World world, LivingEntity entity, int slot) {
        super.equippedTick(armor, world, entity, slot);


        //detector
        if (!world.isClient() && entity.isSneaking() && getEquipmentSlot(armor) == EquipmentSlot.HEAD && entity.age % 20 == 0) {
            final boolean[] sound = {false};
            world.getOtherEntities(entity, new Box(entity.getPos(), entity.getPos()).expand(16)).forEach(e -> {
                if (e instanceof HostileEntity) {
                    LivingEntity le = (LivingEntity)e;
                    le.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 5));
                    if (!sound[0]) {
                        sound[0] = true;
                        entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON, entity.getSoundCategory(), 0.25f, 3f);
                    }
                }
            });
        }
    }

    private EquipmentSlot getEquipmentSlot(ItemStack stack) {
        return ((ArmorItem)stack.getItem()).getSlotType();
    }
}
