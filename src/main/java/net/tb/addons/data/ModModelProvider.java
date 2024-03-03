package net.tb.addons.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.item.ArmorItem;
import net.tb.addons.block.ModBlocks;
import net.tb.addons.item.ModItems;

public class ModModelProvider extends FabricModelProvider {

	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TIN_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TIN_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TITANIUM_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANIUM_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VOID_TITANIUM_VEIN);

		blockStateModelGenerator.registerTrapdoor(ModBlocks.CAST_IRON_TRAPDOOR);

		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);
		blockStateModelGenerator.registerDoor(ModBlocks.STEEL_DOOR);
		blockStateModelGenerator.registerTrapdoor(ModBlocks.STEEL_TRAPDOOR);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_CASING);
		blockStateModelGenerator.registerGlassPane(ModBlocks.STEEL_CHAIN_BLOCK, ModBlocks.STEEL_CHAINS);
		BlockStateModelGenerator.BlockTexturePool steelSheetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STEEL_SHEET_BLOCK);
		steelSheetPool.stairs(ModBlocks.STEEL_SHEET_STAIRS);
		steelSheetPool.slab(ModBlocks.STEEL_SHEET_SLAB);


		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRONZE_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRONZE_CASING);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANCIENT_GOLD_BLOCK);

		BlockStateModelGenerator.BlockTexturePool voidPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VOID_SHALE);
		voidPool.stairs(ModBlocks.VOID_SHALE_STAIRS);
        voidPool.slab(ModBlocks.VOID_SHALE_SLAB);
		voidPool.wall(ModBlocks.VOID_SHALE_WALL);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_VOID_SHALE);
		BlockStateModelGenerator.BlockTexturePool voidBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VOID_SHALE_BRICKS);
		voidBricksPool.stairs(ModBlocks.VOID_SHALE_BRICK_STAIRS);
        voidBricksPool.slab(ModBlocks.VOID_SHALE_BRICK_SLAB);
		voidBricksPool.wall(ModBlocks.VOID_SHALE_BRICK_WALL);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_VOID_SHALE_BRICKS);
		BlockStateModelGenerator.BlockTexturePool voidTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VOID_SHALE_TILES);
		voidTilesPool.stairs(ModBlocks.VOID_SHALE_TILE_STAIRS);
        voidTilesPool.slab(ModBlocks.VOID_SHALE_TILE_SLAB);
		voidTilesPool.wall(ModBlocks.VOID_SHALE_TILE_WALL);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_VOID_SHALE_TILES);
		blockStateModelGenerator.registerLog(ModBlocks.VOID_SHALE_PILLAR).log(ModBlocks.VOID_SHALE_PILLAR);

		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDSTONE_DUST);

		blockStateModelGenerator.registerSingleton(ModBlocks.MOLTEN_DEBRIS, TexturedModel.CUBE_BOTTOM_TOP);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_ICE);
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {

		itemModelGenerator.register(ModItems.COKE, Models.GENERATED);

		itemModelGenerator.register(ModItems.RAW_TIN_NUGGET, Models.GENERATED);
		itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
		itemModelGenerator.register(ModItems.TIN_NUGGET, Models.GENERATED);
		itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
		itemModelGenerator.register(ModItems.RAW_TITANIUM_FRAGMENT, Models.GENERATED);
		itemModelGenerator.register(ModItems.TITANIUM_NUGGET, Models.GENERATED);
		itemModelGenerator.register(ModItems.TITANIUM_INGOT, Models.GENERATED);

		itemModelGenerator.register(ModItems.BLOOMERY_GATE, Models.GENERATED);

		itemModelGenerator.register(ModItems.IRON_BLOOM, Models.GENERATED);
		itemModelGenerator.register(ModItems.REFINED_IRON_BLOOM, Models.GENERATED);
		itemModelGenerator.register(ModItems.GOLD_BLOOM, Models.GENERATED);
		itemModelGenerator.register(ModItems.GILDED_CLUSTER, Models.GENERATED);
		itemModelGenerator.register(ModItems.ANCIENT_GOLD_DROP, Models.GENERATED);
		itemModelGenerator.register(ModItems.ANCIENT_GOLD_INGOT, Models.GENERATED);
		itemModelGenerator.register(ModItems.GILDED_BOOK, Models.GENERATED);

		itemModelGenerator.register(ModItems.BRONZE_NUGGET, Models.GENERATED);
		itemModelGenerator.register(ModItems.BRONZE_INGOT, Models.GENERATED);
		itemModelGenerator.register(ModItems.BRONZE_SHEET, Models.GENERATED);

		itemModelGenerator.register(ModItems.STEEL_NUGGET, Models.GENERATED);
		itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
		itemModelGenerator.register(ModItems.STEEL_PLATE, Models.GENERATED);

		itemModelGenerator.register(ModItems.DYMALLOY_INGOT, Models.GENERATED);

		itemModelGenerator.register(ModItems.CREEPY_LEATHER, Models.GENERATED);
		itemModelGenerator.register(ModItems.DRAGON_SKIN, Models.GENERATED);
		itemModelGenerator.register(ModItems.DRAGON_TOOTH, Models.GENERATED);
		itemModelGenerator.register(ModItems.DRAGON_BONE, Models.GENERATED);

		// ARMORS SET

		itemModelGenerator.registerArmor(((ArmorItem) ModItems.CREEPY_HELMET));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.CREEPY_CHESTPLATE));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.CREEPY_LEGGINGS));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.CREEPY_BOOTS));

		itemModelGenerator.registerArmor(((ArmorItem) ModItems.SLIME_HELMET));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.SLIME_CHESTPLATE));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.SLIME_LEGGINGS));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.SLIME_BOOTS));

		itemModelGenerator.registerArmor(((ArmorItem) ModItems.BONE_HELMET));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.BONE_CHESTPLATE));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.BONE_LEGGINGS));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.BONE_BOOTS));

		itemModelGenerator.registerArmor(((ArmorItem) ModItems.WITHER_BONE_HELMET));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.WITHER_BONE_CHESTPLATE));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.WITHER_BONE_LEGGINGS));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.WITHER_BONE_BOOTS));

		itemModelGenerator.registerArmor(((ArmorItem) ModItems.BRONZE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BRONZE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BRONZE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BRONZE_BOOTS));

		itemModelGenerator.registerArmor(((ArmorItem) ModItems.CHAINMAIL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CHAINMAIL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CHAINMAIL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CHAINMAIL_BOOTS));

		itemModelGenerator.registerArmor(((ArmorItem) ModItems.ANCIENT_GOLD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ANCIENT_GOLD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ANCIENT_GOLD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ANCIENT_GOLD_BOOTS));

		itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_BOOTS));

		itemModelGenerator.registerArmor(((ArmorItem) ModItems.VOID_HELMET));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.VOID_CHESTPLATE));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.VOID_LEGGINGS));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.VOID_BOOTS));

		// TOOLS SET

		//itemModelGenerator.register(ModItems.FLINT_SWORD, Models.HANDHELD);
		itemModelGenerator.register(ModItems.STONE_SHOVEL, Models.HANDHELD);
		itemModelGenerator.register(ModItems.STONE_PICKAXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.STONE_AXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.STONE_HOE, Models.HANDHELD);

		itemModelGenerator.register(ModItems.BRONZE_SWORD, Models.HANDHELD);
		itemModelGenerator.register(ModItems.BRONZE_SHOVEL, Models.HANDHELD);
		itemModelGenerator.register(ModItems.BRONZE_PICKAXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.BRONZE_AXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.BRONZE_HOE, Models.HANDHELD);

		itemModelGenerator.register(ModItems.IRON_SWORD, Models.HANDHELD);
		itemModelGenerator.register(ModItems.IRON_SHOVEL, Models.HANDHELD);
		itemModelGenerator.register(ModItems.IRON_PICKAXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.IRON_AXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.IRON_HOE, Models.HANDHELD);

		itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
		itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
		itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);

		itemModelGenerator.register(ModItems.NETHERSTEEL_SWORD, Models.HANDHELD);
		itemModelGenerator.register(ModItems.NETHERSTEEL_SHOVEL, Models.HANDHELD);
		itemModelGenerator.register(ModItems.NETHERSTEEL_PICKAXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.NETHERSTEEL_AXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.NETHERSTEEL_HOE, Models.HANDHELD);

		itemModelGenerator.register(ModItems.ANCIENT_GOLD_SWORD, Models.HANDHELD);
		itemModelGenerator.register(ModItems.ANCIENT_GOLD_SHOVEL, Models.HANDHELD);
		itemModelGenerator.register(ModItems.ANCIENT_GOLD_PICKAXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.ANCIENT_GOLD_AXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.ANCIENT_GOLD_HOE, Models.HANDHELD);

		itemModelGenerator.register(ModItems.TITANIUM_SWORD, Models.HANDHELD);
		itemModelGenerator.register(ModItems.TITANIUM_SHOVEL, Models.HANDHELD);
		itemModelGenerator.register(ModItems.TITANIUM_PICKAXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.TITANIUM_AXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.TITANIUM_HOE, Models.HANDHELD);
	}
	
}