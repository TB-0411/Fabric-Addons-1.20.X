package net.tb.addons.mixin.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.VexEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.World;
import net.tb.addons.item.ModItems;
import net.minecraft.util.math.random.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;


@Mixin(value = VexEntity.class, priority = 1100)
public abstract class MixinVexEntity extends HostileEntity{
    protected MixinVexEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        //TODO Auto-generated constructor stub
    }

    @Overwrite()
    public void initEquipment(Random random, LocalDifficulty localDifficulty) {
      this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(ModItems.IRON_SWORD));
      this.setEquipmentDropChance(EquipmentSlot.MAINHAND, 0.0F);
   }
}