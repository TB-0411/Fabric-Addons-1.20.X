package net.tb.addons.mixin.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.AbstractPiglinEntity;
import net.minecraft.entity.mob.PiglinBruteEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.World;
import net.tb.addons.item.ModItems;
import net.minecraft.util.math.random.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;


@Mixin(value = PiglinBruteEntity.class, priority = 1100)
public abstract class MixinPiglinBruteEntity extends AbstractPiglinEntity{
    protected MixinPiglinBruteEntity(EntityType<? extends AbstractPiglinEntity> entityType, World world) {
        super(entityType, world);
        //TODO Auto-generated constructor stub
    }

    private void equipAtChance(EquipmentSlot slot, ItemStack stack, Random random) {
        if (random.nextFloat() < 0.1f) {
            this.equipStack(slot, stack);
        }
    }

    @Overwrite()
    public void initEquipment(Random random, LocalDifficulty localDifficulty) {
        this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(Items.NETHERITE_AXE));
        this.equipAtChance(EquipmentSlot.HEAD, new ItemStack(Items.NETHERITE_HELMET), random);
        this.equipAtChance(EquipmentSlot.CHEST, new ItemStack(Items.NETHERITE_CHESTPLATE), random);
        this.equipAtChance(EquipmentSlot.LEGS, new ItemStack(Items.NETHERITE_LEGGINGS), random);
        this.equipAtChance(EquipmentSlot.FEET, new ItemStack(Items.NETHERITE_BOOTS), random);
    }

    @Overwrite()
    public boolean canGather(ItemStack stack) {
        if (stack.isOf(Items.NETHERITE_AXE) || stack.isOf(ModItems.NETHERSTEEL_AXE) || stack.isOf(ModItems.STEEL_AXE)) {
            return super.canGather(stack);
        }
        return false;
    }
}