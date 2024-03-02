package net.tb.addons.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    
    STONE(1, 47, 1.5f, 0.5f, 6,() -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),

    BRONZE(2, 250, 3.3f, 1.3f, 9,() -> Ingredient.ofItems(ModItems.BRONZE_INGOT)),

    IRON(3, 470, 5.0f, 2.0f, 10, () -> Ingredient.ofItems(Items.IRON_INGOT)),

    STEEL(4, 950, 6.0f, 3.0f, 11,() -> Ingredient.ofItems(ModItems.STEEL_INGOT)),

    NETHERSTEEL(4, 1150, 6.5f, 2.5f, 11,() -> Ingredient.ofItems(Registries.ITEM.get(new Identifier("createbigcannons", "nethersteel_ingot")))),

    ANCIENT_GOLD(2, 312, 11.0f, 0.5f, 20, () -> Ingredient.ofItems(ModItems.ANCIENT_GOLD_INGOT)),

    TITANIUM(5, 1831, 10.0f, 4.0f, 17, () -> Ingredient.ofItems(ModItems.DYMALLOY_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}