package net.tb.addons.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.tb.addons.TBsAddons;
import net.tb.addons.block.custom.ModStairsBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block ANCIENT_CORE = registerBlock("ancient_core",new Block(FabricBlockSettings.copyOf(Blocks.SEA_LANTERN).nonOpaque().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block ENCASED_ANCIENT_CORE = registerBlock("encased_ancient_core",new Block(FabricBlockSettings.copyOf(Blocks.SEA_LANTERN).nonOpaque().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block ANCIENT_SMOOTH_BLOCK = registerBlock("ancient_smooth_block",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_SMOOTH_STAIRS = registerBlock("ancient_smooth_stairs",new ModStairsBlock(ModBlocks.ANCIENT_SMOOTH_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.QUARTZ_STAIRS)));
    public static final Block ANCIENT_SMOOTH_SLAB = registerBlock("ancient_smooth_slab",new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_SLAB)));

    public static final Block ANCIENT_GLASS = registerBlock("ancient_glass",new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block ANCIENT_BRICKS = registerBlock("ancient_bricks",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block ANCIENT_BRICKS_STAIRS = registerBlock("ancient_bricks_stairs",new ModStairsBlock(ModBlocks.ANCIENT_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.QUARTZ_STAIRS)));
    public static final Block ANCIENT_BRICKS_SLAB = registerBlock("ancient_bricks_slab",new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_SLAB)));

    public static final Block FAKE_ANCIENT_CHISELED_BLOCK = registerBlock("fake_ancient_chiseled_block",new PillarBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_PILLAR)));
    public static final Block ANCIENT_CHISELED_BLOCK = registerBlock("ancient_chiseled_block",new PillarBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_PILLAR)));
    public static final Block ANCIENT_RECEPTOR = registerBlock("ancient_receptor",new PillarBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_PILLAR)));
    public static final Block ANCIENT_PILLAR = registerBlock("ancient_pillar",new PillarBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_PILLAR)));

    public static final Block ANCIENT_RUNE_BLOCK1 = registerBlock("ancient_rune_block1",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK2 = registerBlock("ancient_rune_block2",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK3 = registerBlock("ancient_rune_block3",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK4 = registerBlock("ancient_rune_block4",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK5 = registerBlock("ancient_rune_block5",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK6 = registerBlock("ancient_rune_block6",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK7 = registerBlock("ancient_rune_block7",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK8 = registerBlock("ancient_rune_block8",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK9 = registerBlock("ancient_rune_block9",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK10 = registerBlock("ancient_rune_block10",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK11 = registerBlock("ancient_rune_block11",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK12 = registerBlock("ancient_rune_block12",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK13 = registerBlock("ancient_rune_block13",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK14 = registerBlock("ancient_rune_block14",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK15 = registerBlock("ancient_rune_block15",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK16 = registerBlock("ancient_rune_block16",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK17 = registerBlock("ancient_rune_block17",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK18 = registerBlock("ancient_rune_block18",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK19 = registerBlock("ancient_rune_block19",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK20 = registerBlock("ancient_rune_block20",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK21 = registerBlock("ancient_rune_block21",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK22 = registerBlock("ancient_rune_block22",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK23 = registerBlock("ancient_rune_block23",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK24 = registerBlock("ancient_rune_block24",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK25 = registerBlock("ancient_rune_block25",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK26 = registerBlock("ancient_rune_block26",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK27 = registerBlock("ancient_rune_block27",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK28 = registerBlock("ancient_rune_block28",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK29 = registerBlock("ancient_rune_block29",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK30 = registerBlock("ancient_rune_block30",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK31 = registerBlock("ancient_rune_block31",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK32 = registerBlock("ancient_rune_block32",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK33 = registerBlock("ancient_rune_block33",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK34 = registerBlock("ancient_rune_block34",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK35 = registerBlock("ancient_rune_block35",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK36 = registerBlock("ancient_rune_block36",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK37 = registerBlock("ancient_rune_block37",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK38 = registerBlock("ancient_rune_block38",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK39 = registerBlock("ancient_rune_block39",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK40 = registerBlock("ancient_rune_block40",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ANCIENT_RUNE_BLOCK41 = registerBlock("ancient_rune_block41",new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));


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