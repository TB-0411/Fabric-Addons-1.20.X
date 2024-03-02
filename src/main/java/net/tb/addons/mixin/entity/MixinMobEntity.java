package net.tb.addons.mixin.entity;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.tb.addons.item.ModItems;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;


@Mixin(value = MobEntity.class, priority = 1100)
public abstract class MixinMobEntity {
    /**
     * @param equipmentSlot
     * @param equipmentLevel
     * @return
     */
    @Overwrite()
    public static Item getEquipmentForSlot(EquipmentSlot equipmentSlot, int equipmentLevel) {
        switch (equipmentSlot) {
            case MAINHAND: {
                if (equipmentLevel >= 3) {
                    return Items.DIAMOND_SWORD;
                } else if (equipmentLevel >= 2) {
                    return ModItems.STEEL_SWORD;
                } else if (equipmentLevel >= 1) {
                    return ModItems.IRON_SWORD;
                } else if (equipmentLevel <= 1) {
                    return ModItems.IRON_SHOVEL;
                } else if (equipmentLevel <= 1) {
                    return ModItems.BRONZE_SWORD;
                } else if (equipmentLevel == 0) {
                    return ModItems.STONE_AXE;
                }
            }
            case HEAD: {
                if (equipmentLevel >= 3) {
                    return Items.DIAMOND_HELMET;
                } else if (equipmentLevel >= 2) {
                    return ModItems.STEEL_HELMET;
                } else if (equipmentLevel >= 1) {
                    return Items.IRON_HELMET;
                } else if (equipmentLevel <= 1) {
                    return ModItems.BRONZE_HELMET;
                } else if (equipmentLevel == 0) {
                    return Items.LEATHER_HELMET;
                }
            }
            case CHEST: {
                if (equipmentLevel >= 3) {
                    return Items.DIAMOND_CHESTPLATE;
                } else if (equipmentLevel >= 2) {
                    return ModItems.STEEL_CHESTPLATE;
                } else if (equipmentLevel >= 1) {
                    return Items.IRON_CHESTPLATE;
                } else if (equipmentLevel <= 1) {
                    return ModItems.BRONZE_CHESTPLATE;
                } else if (equipmentLevel == 0) {
                    return Items.LEATHER_CHESTPLATE;
                }
            }
            case LEGS: {
                if (equipmentLevel >= 3) {
                    return Items.DIAMOND_LEGGINGS;
                } else if (equipmentLevel >= 2) {
                    return ModItems.STEEL_LEGGINGS;
                } else if (equipmentLevel >= 1) {
                    return Items.IRON_LEGGINGS;
                } else if (equipmentLevel <= 1) {
                    return ModItems.BRONZE_LEGGINGS;
                } else if (equipmentLevel == 0) {
                    return Items.LEATHER_LEGGINGS;
                }
            }
            case FEET: {
                if (equipmentLevel >= 3) {
                    return Items.DIAMOND_BOOTS;
                } else if (equipmentLevel >= 2) {
                    return ModItems.STEEL_BOOTS;
                } else if (equipmentLevel >= 1) {
                    return Items.IRON_BOOTS;
                } else if (equipmentLevel <= 1) {
                    return ModItems.BRONZE_BOOTS;
                } else if (equipmentLevel == 0) {
                    return Items.LEATHER_BOOTS;
                }
            }
            default:
                break;
        }
        return null;
    }
}