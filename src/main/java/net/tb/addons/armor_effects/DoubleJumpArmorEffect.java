package net.tb.addons.armor_effects;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class DoubleJumpArmorEffect extends ArmorEffect {

    @Override
    public void equippedTick(ItemStack armor, World world, LivingEntity entity, int slot) {
        super.equippedTick(armor, world, entity, slot);

        //double jump
        if (world.isClient && getEquipmentSlot(armor) == EquipmentSlot.LEGS) {
            NbtCompound nbt = armor.getOrCreateNbt();
            if (entity.isOnGround()) {
                nbt.putInt("thrusterState", ThrusterState.CHARGED.ordinal());
            } else if (nbt.getInt("thrusterState") == ThrusterState.CHARGED.ordinal()) {
                if (!isJumping()) {
                    nbt.putInt("thrusterState", ThrusterState.READY.ordinal());
                }
            } else if (nbt.getInt("thrusterState") == ThrusterState.READY.ordinal()) {
                if (isJumping()) {
                    thrust(entity);
                    nbt.putInt("thrusterState", ThrusterState.OFFLINE.ordinal());
                }
            }
        }
    }

    @Override
    public void receiveCommand(ItemStack armor, World world, LivingEntity entity, int slot, String command) {
        if (command.equals("thrust")) {
            thrust(entity);
        }
    }

    private boolean isJumping() {
        MinecraftClient client = MinecraftClient.getInstance();
        return client != null && client.player != null && client.player.input.jumping;
    }

    private void thrust(LivingEntity entity) {
        //thrust
        Vec3d velocity = entity.getVelocity();
        entity.setVelocity(velocity.x, 0.6, velocity.z);


        entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.BLOCK_BUBBLE_COLUMN_BUBBLE_POP, entity.getSoundCategory(), 0.25f, 0.75f);
    }

    private EquipmentSlot getEquipmentSlot(ItemStack stack) {
        return ((ArmorItem)stack.getItem()).getSlotType();
    }

    private enum ThrusterState {
        OFFLINE,
        CHARGED,
        READY
    }
}
