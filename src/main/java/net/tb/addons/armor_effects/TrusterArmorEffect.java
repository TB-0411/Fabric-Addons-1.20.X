package net.tb.addons.armor_effects;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class TrusterArmorEffect extends ArmorEffect {

    @Override
    public void equippedTick(ItemStack armor, World world, LivingEntity entity, int slot) {
        super.equippedTick(armor, world, entity, slot);
        entity.fallDistance =  Math.min(1,entity.fallDistance);

        //machine smoke
        if (getEquipmentSlot(armor) == EquipmentSlot.FEET) {

            if (entity.getRandom().nextInt(10) == 0) {
                double x = Math.cos(entity.bodyYaw / 180.f * Math.PI - Math.PI * 0.5f) * 0.25;
                double z = Math.sin(entity.bodyYaw / 180.f * Math.PI - Math.PI * 0.5f) * 0.25;
                world.addParticle(ParticleTypes.SMOKE, entity.getX() + x, entity.getY() + 1.2f, entity.getZ() + z, x * 0.2f, -0.025f, z * 0.2f);
            }

            //braking fall
            Vec3d velocity = entity.getVelocity();
            if (velocity.getY() < -0.75) {
                entity.setVelocity(velocity.x, -0.75f, velocity.z);
                createSteamParticle(entity);

                if (entity.age % 5 == 0) {
                    entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.BLOCK_REDSTONE_TORCH_BURNOUT, entity.getSoundCategory(), 0.1f, 1.0f);
                }
            }
        }

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

    private void createSteamParticle(LivingEntity entity) {
        entity.getWorld().addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE,
                entity.getParticleX(0.5D),
                entity.getY() - 0.25,
                entity.getParticleZ(0.5D),
                (entity.getRandom().nextFloat() - 0.5) * 0.1,
                -0.75D + (entity.getRandom().nextFloat() - 0.5) * 0.1,
                (entity.getRandom().nextFloat() - 0.5) * 0.1
        );
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

        for (int i = 0; i < 5; i++) {
            createSteamParticle(entity);
        }

        entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.BLOCK_REDSTONE_TORCH_BURNOUT, entity.getSoundCategory(), 0.25f, 0.75f);
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
