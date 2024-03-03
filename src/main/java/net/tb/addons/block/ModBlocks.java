package net.tb.addons.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.tb.addons.TBsAddons;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TransparentBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block",new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    public static final Block TIN_BLOCK = registerBlock("tin_block",new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block TIN_ORE = registerBlock("tin_ore",new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)));
    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block VOID_TITANIUM_VEIN = registerBlock("void_titanium_vein",new Block(FabricBlockSettings.copyOf(Blocks.BLACKSTONE)));

    public static final Block CAST_IRON_TRAPDOOR = registerBlock("cast_iron_trapdoor",new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR), BlockSetType.IRON));

    public static final Block STEEL_BLOCK = registerBlock("steel_block",new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block STEEL_DOOR = registerBlock("steel_door",new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block STEEL_TRAPDOOR = registerBlock("steel_trapdoor",new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.IRON));
    public static final Block STEEL_CASING = registerBlock("steel_casing",new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block STEEL_SHEET_BLOCK = registerBlock("steel_sheet_block",new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block STEEL_SHEET_STAIRS = registerBlock("steel_sheet_stairs",new StairsBlock(ModBlocks.STEEL_SHEET_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block STEEL_SHEET_SLAB = registerBlock("steel_sheet_slab",new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block STEEL_CHAIN_BLOCK = registerBlock("steel_chain_block",new TransparentBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block STEEL_CHAINS = registerBlock("steel_chains",new PaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRONZE_CASING = registerBlock("bronze_casing",new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));
    public static final Block ANCIENT_GOLD_BLOCK = registerBlock("ancient_gold_block",new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));

    public static final Block VOID_SHALE = registerBlock("void_shale",new Block(FabricBlockSettings.copyOf(Blocks.BLACKSTONE)));
    public static final Block VOID_SHALE_STAIRS = registerBlock("void_shale_stairs",new StairsBlock(ModBlocks.VOID_SHALE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BLACKSTONE)));
    public static final Block VOID_SHALE_SLAB = registerBlock("void_shale_slab",new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACKSTONE)));
    public static final Block VOID_SHALE_WALL = registerBlock("void_shale_wall",new WallBlock(FabricBlockSettings.copyOf(Blocks.BLACKSTONE)));
    public static final Block SMOOTH_VOID_SHALE = registerBlock("smooth_void_shale",new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block VOID_SHALE_BRICKS = registerBlock("void_shale_bricks",new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block VOID_SHALE_BRICK_STAIRS = registerBlock("void_shale_brick_stairs",new StairsBlock(ModBlocks.VOID_SHALE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block VOID_SHALE_BRICK_SLAB = registerBlock("void_shale_brick_slab",new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block VOID_SHALE_BRICK_WALL = registerBlock("void_shale_brick_wall",new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block VOID_SHALE_TILES = registerBlock("void_shale_tiles",new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES)));
    public static final Block VOID_SHALE_TILE_STAIRS = registerBlock("void_shale_tile_stairs",new StairsBlock(ModBlocks.VOID_SHALE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES)));
    public static final Block VOID_SHALE_TILE_SLAB = registerBlock("void_shale_tile_slab",new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES)));
    public static final Block VOID_SHALE_TILE_WALL = registerBlock("void_shale_tile_wall",new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES)));
    public static final Block CRACKED_VOID_SHALE_BRICKS = registerBlock("cracked_void_shale_bricks",new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block CRACKED_VOID_SHALE_TILES = registerBlock("cracked_void_shale_tiles",new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES)));
    public static final Block VOID_SHALE_PILLAR = registerBlock("void_shale_pillar",new PillarBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE)));

    public static final Block ENDSTONE_DUST = registerBlock("endstone_dust",new FallingBlock(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE_POWDER)));

    public static final Block MOLTEN_DEBRIS = registerBlock("molten_debris",new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).luminance(7)));
    public static final Block RED_ICE = registerBlock("red_ice",new Block(FabricBlockSettings.copyOf(Blocks.BLUE_ICE).strength(3.2f).slipperiness(0.979f)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TBsAddons.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TBsAddons.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TBsAddons.LOGGER.info("Registering ModBlocks for " + TBsAddons.MOD_ID);
    }
}