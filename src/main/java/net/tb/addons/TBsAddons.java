package net.tb.addons;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.tb.addons.block.ModBlocks;
import net.tb.addons.item.ModItemGroups;
import net.tb.addons.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TBsAddons implements ModInitializer {
	public static final String MOD_ID = "tbs-addons";
    public static final Logger LOGGER = LoggerFactory.getLogger("tbs-addons");

	public static final RegistryKey<PlacedFeature> CUSTOM_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("tbs-addons","ore_custom"));

	@Override
	public void onInitialize() {
		
		LOGGER.info("Hello Fabric world!");

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, CUSTOM_ORE_PLACED_KEY);

		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}