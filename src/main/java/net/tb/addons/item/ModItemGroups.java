package net.tb.addons.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.tb.addons.TBsAddons;
import net.tb.addons.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ADDONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TBsAddons.MOD_ID, "addons"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.addons"))
                    .icon(() -> new ItemStack(Items.CREEPER_BANNER_PATTERN)).entries((displayContext, entries) -> {
                        
                        entries.add(ModItems.COKE);

                        entries.add(ModItems.RAW_TIN_NUGGET);
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.TIN_NUGGET);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.RAW_TITANIUM_FRAGMENT);
                        entries.add(ModItems.TITANIUM_NUGGET);
                        entries.add(ModItems.TITANIUM_INGOT);

                        entries.add(ModItems.BLOOMERY_GATE);

                        entries.add(ModItems.IRON_BLOOM);
                        entries.add(ModItems.REFINED_IRON_BLOOM);
                        entries.add(ModItems.GOLD_BLOOM);
                        entries.add(ModItems.GILDED_CLUSTER);
                        entries.add(ModItems.ANCIENT_GOLD_DROP);
                        entries.add(ModItems.ANCIENT_GOLD_INGOT);
                        entries.add(ModBlocks.ANCIENT_GOLD_BLOCK);
                        entries.add(ModItems.GILDED_BOOK);

                        entries.add(ModItems.BRONZE_NUGGET);
                        entries.add(ModItems.BRONZE_INGOT);
                        entries.add(ModItems.BRONZE_SHEET);
                        entries.add(ModBlocks.BRONZE_BLOCK);
                        entries.add(ModBlocks.BRONZE_CASING);

                        entries.add(ModItems.STEEL_NUGGET);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.STEEL_PLATE);
                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModBlocks.STEEL_DOOR);
                        entries.add(ModBlocks.STEEL_TRAPDOOR);
                        entries.add(ModBlocks.CAST_IRON_TRAPDOOR);
                        entries.add(ModBlocks.STEEL_CASING);
                        entries.add(ModBlocks.STEEL_CHAIN_BLOCK);
                        entries.add(ModBlocks.STEEL_CHAINS);
                        entries.add(ModBlocks.STEEL_SHEET_BLOCK);
                        entries.add(ModBlocks.STEEL_SHEET_STAIRS);
                        entries.add(ModBlocks.STEEL_SHEET_SLAB);

                        entries.add(ModBlocks.RAW_TIN_BLOCK);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModBlocks.VOID_TITANIUM_VEIN);

                        entries.add(ModBlocks.VOID_SHALE);
                        entries.add(ModBlocks.SMOOTH_VOID_SHALE);
                        entries.add(ModBlocks.VOID_SHALE_STAIRS);
                        entries.add(ModBlocks.VOID_SHALE_SLAB);
                        entries.add(ModBlocks.VOID_SHALE_WALL);
                        entries.add(ModBlocks.VOID_SHALE_BRICKS);
                        entries.add(ModBlocks.CRACKED_VOID_SHALE_BRICKS);
                        entries.add(ModBlocks.VOID_SHALE_BRICK_STAIRS);
                        entries.add(ModBlocks.VOID_SHALE_BRICK_SLAB);
                        entries.add(ModBlocks.VOID_SHALE_BRICK_WALL);
                        entries.add(ModBlocks.VOID_SHALE_TILES);
                        entries.add(ModBlocks.CRACKED_VOID_SHALE_TILES);
                        entries.add(ModBlocks.VOID_SHALE_TILE_STAIRS);
                        entries.add(ModBlocks.VOID_SHALE_TILE_SLAB);
                        entries.add(ModBlocks.VOID_SHALE_TILE_WALL);
                        entries.add(ModBlocks.VOID_SHALE_PILLAR);

                        entries.add(ModBlocks.ENDSTONE_DUST);

                        entries.add(ModBlocks.MOLTEN_DEBRIS);
                        entries.add(ModBlocks.RED_ICE);

                        //TOOLS SET

                        //entries.add(ModItems.FLINT_SWORD);
                        entries.add(ModItems.STONE_SHOVEL);
                        entries.add(ModItems.STONE_PICKAXE);
                        entries.add(ModItems.STONE_AXE);
                        entries.add(ModItems.STONE_HOE);

                        entries.add(ModItems.BRONZE_SWORD);
                        entries.add(ModItems.BRONZE_SHOVEL);
                        entries.add(ModItems.BRONZE_PICKAXE);
                        entries.add(ModItems.BRONZE_AXE);
                        entries.add(ModItems.BRONZE_HOE);

                        entries.add(ModItems.IRON_SWORD);
                        entries.add(ModItems.IRON_SHOVEL);
                        entries.add(ModItems.IRON_PICKAXE);
                        entries.add(ModItems.IRON_AXE);
                        entries.add(ModItems.IRON_HOE);

                        entries.add(ModItems.ANCIENT_GOLD_SWORD);
                        entries.add(ModItems.ANCIENT_GOLD_SHOVEL);
                        entries.add(ModItems.ANCIENT_GOLD_PICKAXE);
                        entries.add(ModItems.ANCIENT_GOLD_AXE);
                        entries.add(ModItems.ANCIENT_GOLD_HOE);

                        entries.add(ModItems.STEEL_SWORD);
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_HOE);

                        entries.add(ModItems.NETHERSTEEL_SWORD);
                        entries.add(ModItems.NETHERSTEEL_SHOVEL);
                        entries.add(ModItems.NETHERSTEEL_PICKAXE);
                        entries.add(ModItems.NETHERSTEEL_AXE);
                        entries.add(ModItems.NETHERSTEEL_HOE);

                        entries.add(ModItems.TITANIUM_SWORD);
                        entries.add(ModItems.TITANIUM_SHOVEL);
                        entries.add(ModItems.TITANIUM_PICKAXE);
                        entries.add(ModItems.TITANIUM_AXE);
                        entries.add(ModItems.TITANIUM_HOE);

                        // ARMOR SET

                        entries.add(ModItems.DRAGON_SKIN);
                        entries.add(ModItems.DRAGON_TOOTH);
                        entries.add(ModItems.DRAGON_BONE);
                        entries.add(ModItems.CREEPY_LEATHER);

                        entries.add(ModItems.CREEPY_HELMET);
                        entries.add(ModItems.CREEPY_CHESTPLATE);
                        entries.add(ModItems.CREEPY_LEGGINGS);
                        entries.add(ModItems.CREEPY_BOOTS);

                        entries.add(ModItems.SLIME_HELMET);
                        entries.add(ModItems.SLIME_CHESTPLATE);
                        entries.add(ModItems.SLIME_LEGGINGS);
                        entries.add(ModItems.SLIME_BOOTS);

                        entries.add(ModItems.BONE_HELMET);
                        entries.add(ModItems.BONE_CHESTPLATE);
                        entries.add(ModItems.BONE_LEGGINGS);
                        entries.add(ModItems.BONE_BOOTS);

                        entries.add(ModItems.WITHER_BONE_HELMET);
                        entries.add(ModItems.WITHER_BONE_CHESTPLATE);
                        entries.add(ModItems.WITHER_BONE_LEGGINGS);
                        entries.add(ModItems.WITHER_BONE_BOOTS);

                        entries.add(ModItems.ANCIENT_GOLD_HELMET);
                        entries.add(ModItems.ANCIENT_GOLD_CHESTPLATE);
                        entries.add(ModItems.ANCIENT_GOLD_LEGGINGS);
                        entries.add(ModItems.ANCIENT_GOLD_BOOTS);

                        entries.add(ModItems.BRONZE_HELMET);
                        entries.add(ModItems.BRONZE_CHESTPLATE);
                        entries.add(ModItems.BRONZE_LEGGINGS);
                        entries.add(ModItems.BRONZE_BOOTS);

                        entries.add(ModItems.CHAINMAIL_HELMET);
                        entries.add(ModItems.CHAINMAIL_CHESTPLATE);
                        entries.add(ModItems.CHAINMAIL_LEGGINGS);
                        entries.add(ModItems.CHAINMAIL_BOOTS);

                        entries.add(ModItems.STEEL_HELMET);
                        entries.add(ModItems.STEEL_CHESTPLATE);
                        entries.add(ModItems.STEEL_LEGGINGS);
                        entries.add(ModItems.STEEL_BOOTS);

                        entries.add(ModItems.VOID_HELMET);
                        entries.add(ModItems.VOID_CHESTPLATE);
                        entries.add(ModItems.VOID_LEGGINGS);
                        entries.add(ModItems.VOID_BOOTS);
                        
                    }).build());


    public static void registerItemGroups() {
        TBsAddons.LOGGER.info("Registering Item Groups for " + TBsAddons.MOD_ID);
    }
}