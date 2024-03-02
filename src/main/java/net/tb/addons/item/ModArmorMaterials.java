package net.tb.addons.item;

import net.tb.addons.TBsAddons;
import net.tb.addons.armor_effects.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {

    /*LEATHER("leather", 5, new int[] {1,2,1,1}, 3, 
    SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.LEATHER))*/
    ;
    public static ExtendedArmorMaterial CREEPY = new ExtendedArmorMaterial("sentients_v")
            .protectionAmount(3, 5, 4, 3)
            .weight(-0.03f)
            .color(6553600)
            .enchantability(8)
            .durabilityMultiplier(16)
            .repairIngredient(() -> Ingredient.ofItems(Items.PAPER))
            .toughness(0.5f)
            .knockbackReduction(0.0f)
            .equipSound(SoundEvents.ITEM_ARMOR_EQUIP_GENERIC);

    public static ExtendedArmorMaterial BONE = new ExtendedArmorMaterial("bone")
            .protectionAmount(2, 3, 3, 2)
            .enchantability(4)
            .durabilityMultiplier(8)
            .repairIngredient(() -> Ingredient.ofItems(Items.BONE))
            .toughness(0.0f)
            .knockbackReduction(0.0f)
            .antiSkeleton()
            .equipSound(SoundEvents.ENTITY_SKELETON_AMBIENT);

    public static ExtendedArmorMaterial WITHER = new ExtendedArmorMaterial("wither")
            .protectionAmount(3, 4, 4, 3)
            .enchantability(4)
            .durabilityMultiplier(16)
            .repairIngredient(() -> Ingredient.ofItems(Items.BONE))
            .toughness(0.1f)
            .knockbackReduction(0.01f)
            .antiSkeleton()
            .effect(new WitherArmorEffect(-0.3f, 75))
            .equipSound(SoundEvents.ENTITY_WITHER_SKELETON_AMBIENT);

    public static ExtendedArmorMaterial SLIME = new ExtendedArmorMaterial("slime")
            .protectionAmount(2, 4, 3, 2)
            .enchantability(5)
            .color(4428800)
            .durabilityMultiplier(12)
            .repairIngredient(() -> Ingredient.ofItems(Items.SLIME_BALL))
            .toughness(0.0f)
            .knockbackReduction(0.1f)
            .dyeable_effect(new BouncingArmorEffect(0.1f))
            .equipSound(SoundEvents.ENTITY_SLIME_SQUISH);
    /*
    public static ExtendedArmorMaterial FABRIC = new ExtendedArmorMaterial("fabric")
            .protectionAmount(1, 3, 2, 1)
            .color(13025686)
            .enchantability(4)
            .durabilityMultiplier(8)
            .repairIngredient(() -> Ingredient.ofItems(Items.PAPER))
            .knockbackReduction(0.0f)
            .equipSound(SoundEvents.ITEM_ARMOR_EQUIP_GENERIC);

    public static ExtendedArmorMaterial ELECTRUM = new ExtendedArmorMaterial("electrum")
            .protectionAmount(2, 3, 3, 2)
            .color(12451840)
            .enchantability(7)
            .durabilityMultiplier(8)
            .repairIngredient(() -> Ingredient.ofItems(ModItems.ELECTRUM_INGOT))
            .knockbackReduction(0.0f)
            .dyeable_effect(new ProtectionTypeDyeableArmorEffect(0.25f, DamageTypes.MAGIC, "magic"))
            .equipSound(SoundEvents.ITEM_ARMOR_EQUIP_GENERIC);
        */
    public static ExtendedArmorMaterial BRONZE = new ExtendedArmorMaterial("bronze")
            .protectionAmount(2, 4, 3, 1)
            .enchantability(6)
            .durabilityMultiplier(10)
            .repairIngredient(() -> Ingredient.ofItems(ModItems.BRONZE_INGOT))
            .knockbackReduction(0.0f)
            .equipSound(SoundEvents.ITEM_ARMOR_EQUIP_IRON);

    public static ExtendedArmorMaterial CHAIN = new ExtendedArmorMaterial("chainmail")
            .protectionAmount(2, 5, 4, 1)
            .enchantability(5)
            .durabilityMultiplier(14)
            .repairIngredient(() -> Ingredient.ofItems(Registries.ITEM.get(new Identifier("createbigcannons", "cast_iron_ingot"))))
            .knockbackReduction(0.0f)
            .toughness(0.5f)
            .effect(new WeaponProtectionArmorEffect(-0.2f,SwordItem.class,"sword"))
            .equipSound(SoundEvents.ITEM_ARMOR_EQUIP_CHAIN);

    public static ExtendedArmorMaterial STEEL = new ExtendedArmorMaterial("steel")
            .protectionAmount(3, 7, 5, 3)
            .enchantability(10)
            .durabilityMultiplier(23)
            .repairIngredient(() -> Ingredient.ofItems(ModItems.STEEL_INGOT))
            .toughness(1.0f)
            .knockbackReduction(0.05f)
            .equipSound(SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE);

    public static ExtendedArmorMaterial ANCIENT_GOLD = new ExtendedArmorMaterial("ancient_gold")
            .protectionAmount(2, 5, 4, 2)
            .enchantability(16)
            .durabilityMultiplier(12)
            .repairIngredient(() -> Ingredient.ofItems(ModItems.ANCIENT_GOLD_INGOT))
            .toughness(0.0f)
            .knockbackReduction(0.0f)
            .effect(new WeaponProtectionArmorEffect(-0.2f,AxeItem.class,"axe"))
            .equipSound(SoundEvents.ITEM_ARMOR_EQUIP_GOLD);

    public static ExtendedArmorMaterial VOID = new ExtendedArmorMaterial("void")
            .protectionAmount(3, 8, 6, 3)
            .enchantability(8)
            .durabilityMultiplier(35)
            .repairIngredient(() -> Ingredient.ofItems(ModItems.DYMALLOY_INGOT))
            .toughness(4.0f)
            .knockbackReduction(0.1f)
            .equipSound(SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE);

            /*NETHERITE("netherite", 37, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
                map.put(Type.BOOTS, 3);
                map.put(Type.LEGGINGS, 6);
                map.put(Type.CHESTPLATE, 8);
                map.put(Type.HELMET, 3);
             }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
                return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
             });*/

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return TBsAddons.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}