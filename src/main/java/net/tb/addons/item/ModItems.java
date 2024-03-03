package net.tb.addons.item;

import java.util.*;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.tb.addons.TBsAddons;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShearsItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.loot.entry.ItemEntry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.tb.addons.TBsAddons;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Map<String, Item> coloredItems = new HashMap<>();
    static Map<String, Item> items = new HashMap<>();
    static List<Item> itemsOrdered = new LinkedList<>();
    Map<String, Map<Item, Float>> lootLookup = new HashMap<>();

    public static final Item COKE = registerItem("coke", new Item(new FabricItemSettings()));

    public static final Item RAW_TIN_NUGGET = registerItem("raw_tin_nugget", new Item(new FabricItemSettings()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));
    public static final Item TIN_NUGGET = registerItem("tin_nugget", new Item(new FabricItemSettings()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_TITANIUM_FRAGMENT = registerItem("raw_titanium_fragment", new Item(new FabricItemSettings()));
    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget", new Item(new FabricItemSettings()));
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new FabricItemSettings()));

    public static final Item BLOOMERY_GATE = registerItem("bloomery_gate", new Item(new FabricItemSettings()));

    public static final Item IRON_BLOOM = registerItem("iron_bloom", new Item(new FabricItemSettings()));
    public static final Item REFINED_IRON_BLOOM = registerItem("refined_iron_bloom", new Item(new FabricItemSettings()));
    public static final Item GOLD_BLOOM = registerItem("golden_bloom", new Item(new FabricItemSettings()));
    public static final Item GILDED_CLUSTER = registerItem("gilded_cluster", new Item(new FabricItemSettings()));
    public static final Item ANCIENT_GOLD_DROP = registerItem("ancient_gold_drop", new Item(new FabricItemSettings()));
    public static final Item ANCIENT_GOLD_INGOT = registerItem("ancient_gold_ingot", new Item(new FabricItemSettings()));

    public static final Item GILDED_BOOK = registerItem("gilded_book", new ModGildedBookItem(new FabricItemSettings()));
    
    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget", new Item(new FabricItemSettings()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings()));
    public static final Item BRONZE_SHEET = registerItem("bronze_sheet", new Item(new FabricItemSettings()));

    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_PLATE = registerItem("steel_plate", new Item(new FabricItemSettings()));

    public static final Item DYMALLOY_INGOT = registerItem("dymalloy_ingot", new Item(new FabricItemSettings()));

    public static final Item CREEPY_LEATHER = registerItem("creepy_leather", new Item(new FabricItemSettings()));
    public static final Item DRAGON_TOOTH = registerItem("dragon_tooth", new Item(new FabricItemSettings()));
    public static final Item DRAGON_SKIN = registerItem("dragon_skin", new Item(new FabricItemSettings()));
    public static final Item DRAGON_BONE = registerItem("dragon_bone", new Item(new FabricItemSettings()));

    // ARMORS SET

    public static final Item CREEPY_HELMET = registerDyeableItem("creepy_helmet",new DyeableExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.HELMET, ModArmorMaterials.CREEPY));
    public static final Item CREEPY_CHESTPLATE = registerDyeableItem("creepy_chestplate",new DyeableExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.CHESTPLATE, ModArmorMaterials.CREEPY));
    public static final Item CREEPY_LEGGINGS = registerDyeableItem("creepy_leggings",new DyeableExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.LEGGINGS, ModArmorMaterials.CREEPY));
    public static final Item CREEPY_BOOTS = registerDyeableItem("creepy_boots",new DyeableExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.BOOTS, ModArmorMaterials.CREEPY));

    public static final Item SLIME_HELMET = registerDyeableItem("slime_helmet",new DyeableExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.HELMET, ModArmorMaterials.SLIME));
    public static final Item SLIME_CHESTPLATE = registerDyeableItem("slime_chestplate",new DyeableExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.CHESTPLATE, ModArmorMaterials.SLIME));
    public static final Item SLIME_LEGGINGS = registerDyeableItem("slime_leggings",new DyeableExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.LEGGINGS, ModArmorMaterials.SLIME));
    public static final Item SLIME_BOOTS = registerDyeableItem("slime_boots",new DyeableExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.BOOTS, ModArmorMaterials.SLIME));

    public static final Item BONE_HELMET = registerItem("bone_helmet",new ExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.HELMET, ModArmorMaterials.BONE));
    public static final Item BONE_CHESTPLATE = registerItem("bone_chestplate",new ExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.CHESTPLATE, ModArmorMaterials.BONE));
    public static final Item BONE_LEGGINGS = registerItem("bone_leggings",new ExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.LEGGINGS, ModArmorMaterials.BONE));
    public static final Item BONE_BOOTS = registerItem("bone_boots",new ExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.BOOTS, ModArmorMaterials.BONE));

    public static final Item WITHER_BONE_HELMET = registerItem("wither_bone_helmet",new ExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.HELMET, ModArmorMaterials.WITHER));
    public static final Item WITHER_BONE_CHESTPLATE = registerItem("wither_bone_chestplate",new ExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.CHESTPLATE, ModArmorMaterials.WITHER));
    public static final Item WITHER_BONE_LEGGINGS = registerItem("wither_bone_leggings",new ExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.LEGGINGS, ModArmorMaterials.WITHER));
    public static final Item WITHER_BONE_BOOTS = registerItem("wither_bone_boots",new ExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.BOOTS, ModArmorMaterials.WITHER));
    /*
    public static final Item ELECTRUM_HELMET = registerDyeableItem("electrum_helmet",new DyeableExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.HELMET, ModArmorMaterials.ELECTRUM));
    public static final Item ELECTRUM_CHESTPLATE = registerDyeableItem("electrum_chestplate",new DyeableExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.CHESTPLATE, ModArmorMaterials.ELECTRUM));
    public static final Item ELECTRUM_LEGGINGS = registerDyeableItem("electrum_leggings",new DyeableExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.LEGGINGS, ModArmorMaterials.ELECTRUM));
    public static final Item ELECTRUM_BOOTS = registerDyeableItem("electrum_boots",new DyeableExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.BOOTS, ModArmorMaterials.ELECTRUM));

    public static final Item FABRIC_HELMET = registerDyeableItem("fabric_helmet",new DyeableExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.HELMET, ModArmorMaterials.FABRIC));
    public static final Item FABRIC_CHESTPLATE = registerDyeableItem("fabric_chestplate",new DyeableExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.CHESTPLATE, ModArmorMaterials.FABRIC));
    public static final Item FABRIC_LEGGINGS = registerDyeableItem("fabric_leggings",new DyeableExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.LEGGINGS, ModArmorMaterials.FABRIC));
    public static final Item FABRIC_BOOTS = registerDyeableItem("fabric_boots",new DyeableExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.BOOTS, ModArmorMaterials.FABRIC));
    */
    public static final Item BRONZE_HELMET = registerItem("bronze_helmet",new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BRONZE_CHESTPLATE = registerItem("bronze_chestplate",new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BRONZE_LEGGINGS = registerItem("bronze_leggings",new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BRONZE_BOOTS = registerItem("bronze_boots",new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item CHAINMAIL_HELMET = registerItem("chainmail_helmet",new ExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.HELMET, ModArmorMaterials.CHAIN));
    public static final Item CHAINMAIL_CHESTPLATE = registerItem("chainmail_chestplate",new ExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.CHESTPLATE, ModArmorMaterials.CHAIN));
    public static final Item CHAINMAIL_LEGGINGS = registerItem("chainmail_leggings",new ExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.LEGGINGS, ModArmorMaterials.CHAIN));
    public static final Item CHAINMAIL_BOOTS = registerItem("chainmail_boots",new ExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.BOOTS, ModArmorMaterials.CHAIN));

    public static final Item STEEL_HELMET = registerItem("steel_helmet",new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item STEEL_BOOTS = registerItem("steel_boots",new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item ANCIENT_GOLD_HELMET = registerItem("ancient_gold_helmet",new ExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.HELMET, ModArmorMaterials.ANCIENT_GOLD));
    public static final Item ANCIENT_GOLD_CHESTPLATE = registerItem("ancient_gold_chestplate",new ExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.CHESTPLATE, ModArmorMaterials.ANCIENT_GOLD));
    public static final Item ANCIENT_GOLD_LEGGINGS = registerItem("ancient_gold_leggings",new ExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.LEGGINGS, ModArmorMaterials.ANCIENT_GOLD));
    public static final Item ANCIENT_GOLD_BOOTS = registerItem("ancient_gold_boots",new ExtendedArmorItem(new FabricItemSettings(), ArmorItem.Type.BOOTS, ModArmorMaterials.ANCIENT_GOLD));

    public static final Item VOID_HELMET = registerItem("void_helmet",new ArmorItem(ModArmorMaterials.VOID, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item VOID_CHESTPLATE = registerItem("void_chestplate",new ArmorItem(ModArmorMaterials.VOID, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item VOID_LEGGINGS = registerItem("void_leggings",new ArmorItem(ModArmorMaterials.VOID, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item VOID_BOOTS = registerItem("void_boots",new ArmorItem(ModArmorMaterials.VOID, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    // TOOLS SET

    //public static final Item FLINT_SWORD = registerItem("flint_sword", new SwordItem(ModToolMaterials.FLINT, 2, -2.6f, new FabricItemSettings()));
    public static final Item STONE_SHOVEL = registerItem("stone_shovel", new ShovelItem(ModToolMaterials.STONE, 1.5f, -3.3f, new FabricItemSettings()));
    public static final Item STONE_PICKAXE = registerItem("stone_pickaxe", new PickaxeItem(ModToolMaterials.STONE, 1, -3.1f, new FabricItemSettings()));
    public static final Item STONE_AXE = registerItem("stone_axe", new AxeItem(ModToolMaterials.STONE, 3.0f, -3.5f, new FabricItemSettings()));
    public static final Item STONE_HOE = registerItem("stone_hoe", new HoeItem(ModToolMaterials.STONE, 0, -3.3f, new FabricItemSettings()));

    public static final Item BRONZE_SWORD = registerItem("bronze_sword", new SwordItem(ModToolMaterials.BRONZE, 3, -2.4f, new FabricItemSettings()));
    public static final Item BRONZE_SHOVEL = registerItem("bronze_shovel", new ShovelItem(ModToolMaterials.BRONZE, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item BRONZE_PICKAXE = registerItem("bronze_pickaxe", new PickaxeItem(ModToolMaterials.BRONZE, 1, -2.8f, new FabricItemSettings()));
    public static final Item BRONZE_AXE = registerItem("bronze_axe", new AxeItem(ModToolMaterials.BRONZE, 4.0f, -3.2f, new FabricItemSettings()));
    public static final Item BRONZE_HOE = registerItem("bronze_hoe", new HoeItem(ModToolMaterials.BRONZE, 0, -3.0f, new FabricItemSettings()));

    public static final Item IRON_SWORD = registerItem("iron_sword", new SwordItem(ModToolMaterials.IRON, 3, -2.4f, new FabricItemSettings()));
    public static final Item IRON_SHOVEL = registerItem("iron_shovel", new ShovelItem(ModToolMaterials.IRON, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item IRON_PICKAXE = registerItem("iron_pickaxe", new PickaxeItem(ModToolMaterials.IRON, 1, -2.8f, new FabricItemSettings()));
    public static final Item IRON_AXE = registerItem("iron_axe", new AxeItem(ModToolMaterials.IRON, 4.0f, -3.2f, new FabricItemSettings()));
    public static final Item IRON_HOE = registerItem("iron_hoe", new HoeItem(ModToolMaterials.IRON, 0, -3.0f, new FabricItemSettings()));

    public static final Item STEEL_SWORD = registerItem("steel_sword", new SwordItem(ModToolMaterials.STEEL, 3, -2.4f, new FabricItemSettings()));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel", new ShovelItem(ModToolMaterials.STEEL, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe", new PickaxeItem(ModToolMaterials.STEEL, 1, -2.8f, new FabricItemSettings()));
    public static final Item STEEL_AXE = registerItem("steel_axe", new AxeItem(ModToolMaterials.STEEL, 4.0f, -3.2f, new FabricItemSettings()));
    public static final Item STEEL_HOE = registerItem("steel_hoe", new HoeItem(ModToolMaterials.STEEL, 0, -3.0f, new FabricItemSettings()));

    public static final Item STEEL_SHEARS = registerItem("steel_shears", new ShearsItem(new FabricItemSettings().maxDamage(750)));

    public static final Item NETHERSTEEL_SWORD = registerItem("nethersteel_sword", new SwordItem(ModToolMaterials.NETHERSTEEL, 3, -2.4f, new FabricItemSettings()));
    public static final Item NETHERSTEEL_SHOVEL = registerItem("nethersteel_shovel", new ShovelItem(ModToolMaterials.NETHERSTEEL, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item NETHERSTEEL_PICKAXE = registerItem("nethersteel_pickaxe", new PickaxeItem(ModToolMaterials.NETHERSTEEL, 1, -2.8f, new FabricItemSettings()));
    public static final Item NETHERSTEEL_AXE = registerItem("nethersteel_axe", new AxeItem(ModToolMaterials.NETHERSTEEL, 4.0f, -3.2f, new FabricItemSettings()));
    public static final Item NETHERSTEEL_HOE = registerItem("nethersteel_hoe", new HoeItem(ModToolMaterials.NETHERSTEEL, 0, -3.0f, new FabricItemSettings()));

    public static final Item ANCIENT_GOLD_SWORD = registerItem("ancient_gold_sword", new SwordItem(ModToolMaterials.ANCIENT_GOLD, 3, -2.4f, new FabricItemSettings()));
    public static final Item ANCIENT_GOLD_SHOVEL = registerItem("ancient_gold_shovel", new ShovelItem(ModToolMaterials.ANCIENT_GOLD, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item ANCIENT_GOLD_PICKAXE = registerItem("ancient_gold_pickaxe", new PickaxeItem(ModToolMaterials.ANCIENT_GOLD, 1, -2.8f, new FabricItemSettings()));
    public static final Item ANCIENT_GOLD_AXE = registerItem("ancient_gold_axe", new AxeItem(ModToolMaterials.ANCIENT_GOLD, 4.0f, -3.2f, new FabricItemSettings()));
    public static final Item ANCIENT_GOLD_HOE = registerItem("ancient_gold_hoe", new HoeItem(ModToolMaterials.ANCIENT_GOLD, 0, -3.0f, new FabricItemSettings()));

    public static final Item TITANIUM_SWORD = registerItem("titanium_sword", new SwordItem(ModToolMaterials.TITANIUM, 3, -2.2f, new FabricItemSettings()));
    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel", new ShovelItem(ModToolMaterials.TITANIUM, 1.5f, -2.9f, new FabricItemSettings()));
    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe", new PickaxeItem(ModToolMaterials.TITANIUM, 1, -2.7f, new FabricItemSettings()));
    public static final Item TITANIUM_AXE = registerItem("titanium_axe", new AxeItem(ModToolMaterials.TITANIUM, 4.0f, -3.1f, new FabricItemSettings()));
    public static final Item TITANIUM_HOE = registerItem("titanium_hoe", new HoeItem(ModToolMaterials.TITANIUM, 0, -2.9f, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TBsAddons.MOD_ID, name), item);
    }


    private static Item registerDyeableItem(String name, Item item) {
        Item Temp_ = registerItem(name, item);
        ModItems.coloredItems.putAll(register(name, Temp_));
        ModItems.items.putAll(ModItems.coloredItems);
        return Temp_;
    }

    static Map<String, Item> register(String name, Item item) {
        return Collections.singletonMap(name, item);
    }

    public static void registerModItems() {
        TBsAddons.LOGGER.info("Registering Mod Items for " + TBsAddons.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}