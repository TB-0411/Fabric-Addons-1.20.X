package net.tb.addons.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.tb.addons.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BRONZE_HELMET, ModItems.BRONZE_CHESTPLATE, ModItems.BRONZE_LEGGINGS, ModItems.BRONZE_BOOTS,
                ModItems.CHAINMAIL_HELMET, ModItems.CHAINMAIL_CHESTPLATE, ModItems.CHAINMAIL_LEGGINGS, ModItems.CHAINMAIL_BOOTS,
                ModItems.STEEL_HELMET, ModItems.STEEL_CHESTPLATE, ModItems.STEEL_LEGGINGS, ModItems.STEEL_BOOTS,
                ModItems.ANCIENT_GOLD_HELMET, ModItems.ANCIENT_GOLD_CHESTPLATE, ModItems.ANCIENT_GOLD_LEGGINGS, ModItems.ANCIENT_GOLD_BOOTS);
    }
}