package net.tb.addons.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.tb.addons.block.ModBlocks;
import net.tb.addons.item.ModItems;

public class ModModelProvider extends FabricModelProvider {

	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_GLASS);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_SMOOTH_BLOCK).stairs(ModBlocks.ANCIENT_SMOOTH_STAIRS).slab(ModBlocks.ANCIENT_SMOOTH_SLAB);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_BRICKS).stairs(ModBlocks.ANCIENT_BRICKS_STAIRS).slab(ModBlocks.ANCIENT_BRICKS_SLAB);
		blockStateModelGenerator.registerLog(ModBlocks.FAKE_ANCIENT_CHISELED_BLOCK).log(ModBlocks.FAKE_ANCIENT_CHISELED_BLOCK);
		blockStateModelGenerator.registerLog(ModBlocks.ANCIENT_CHISELED_BLOCK).log(ModBlocks.ANCIENT_CHISELED_BLOCK);
		blockStateModelGenerator.registerLog(ModBlocks.ANCIENT_RECEPTOR).log(ModBlocks.ANCIENT_RECEPTOR);
		blockStateModelGenerator.registerLog(ModBlocks.ANCIENT_PILLAR).log(ModBlocks.ANCIENT_PILLAR);

		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK1);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK2);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK3);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK4);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK5);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK6);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK7);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK8);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK9);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK10);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK11);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK12);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK13);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK14);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK15);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK16);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK17);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK18);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK19);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK20);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK21);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK22);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK23);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK24);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK25);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK26);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK27);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK28);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK29);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK30);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK31);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK32);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK33);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK34);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK35);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK36);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK37);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK38);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK39);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK40);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_RUNE_BLOCK41);

	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		itemModelGenerator.register(ModItems.ANCIENT_TABLET, Models.GENERATED);
	}
	
}