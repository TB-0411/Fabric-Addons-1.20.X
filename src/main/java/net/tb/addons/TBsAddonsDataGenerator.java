package net.tb.addons;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.tb.addons.data.ModItemTagProvider;
import net.tb.addons.data.ModLootTableGenerator;
import net.tb.addons.data.ModModelProvider;
import net.tb.addons.data.ModRecipeGenerator;
import net.tb.addons.data.ModWorldGenerator;

public class TBsAddonsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableGenerator::new);
		pack.addProvider(ModRecipeGenerator::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModWorldGenerator::new);
	}
}
