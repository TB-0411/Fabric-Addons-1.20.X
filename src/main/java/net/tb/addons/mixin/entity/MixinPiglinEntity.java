package net.tb.addons.mixin.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.AbstractPiglinEntity;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.World;
import net.tb.addons.item.ModItems;
import net.minecraft.util.math.random.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;


@Mixin(value = PiglinEntity.class, priority = 1100)
public abstract class MixinPiglinEntity extends AbstractPiglinEntity{
    protected MixinPiglinEntity(EntityType<? extends AbstractPiglinEntity> entityType, World world) {
        super(entityType, world);
        //TODO Auto-generated constructor stub
    }

    private void equipAtChance(EquipmentSlot slot, ItemStack stack, Random random) {
        if (random.nextFloat() < 0.1f) {
            this.equipStack(slot, stack);
        }
    }

    @Overwrite()
    public ItemStack makeInitialWeapon() {
        if ((double)this.random.nextFloat() < 0.5) {
            return new ItemStack(Items.CROSSBOW);
        }
        return new ItemStack(ModItems.ANCIENT_GOLD_SWORD);
    }

    @Overwrite()
    public void initEquipment(Random random, LocalDifficulty localDifficulty) {
        if (this.isAdult()) {
            this.equipAtChance(EquipmentSlot.HEAD, new ItemStack(ModItems.ANCIENT_GOLD_HELMET), random);
            this.equipAtChance(EquipmentSlot.CHEST, new ItemStack(ModItems.ANCIENT_GOLD_CHESTPLATE), random);
            this.equipAtChance(EquipmentSlot.LEGS, new ItemStack(ModItems.ANCIENT_GOLD_LEGGINGS), random);
            this.equipAtChance(EquipmentSlot.FEET, new ItemStack(ModItems.ANCIENT_GOLD_BOOTS), random);
        }
    }
}