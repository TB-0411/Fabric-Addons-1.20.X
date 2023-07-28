package net.tb.addons.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.tb.addons.TBsAddons;
import net.tb.addons.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ANCESTRY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TBsAddons.MOD_ID, "ancestry"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ancestry"))
                    .icon(() -> new ItemStack(ModBlocks.ANCIENT_CORE)).entries((displayContext, entries) -> {

                         entries.add(ModItems.ANCIENT_TABLET);

                        entries.add(ModBlocks.ANCIENT_CORE);
                        entries.add(ModBlocks.ENCASED_ANCIENT_CORE);

                        entries.add(ModBlocks.ANCIENT_GLASS);
                        entries.add(ModBlocks.ANCIENT_SMOOTH_BLOCK);entries.add(ModBlocks.ANCIENT_SMOOTH_STAIRS);entries.add(ModBlocks.ANCIENT_SMOOTH_SLAB);
                        entries.add(ModBlocks.ANCIENT_BRICKS);entries.add(ModBlocks.ANCIENT_BRICKS_STAIRS);entries.add(ModBlocks.ANCIENT_BRICKS_SLAB);
                        entries.add(ModBlocks.FAKE_ANCIENT_CHISELED_BLOCK);entries.add(ModBlocks.ANCIENT_CHISELED_BLOCK);
                        entries.add(ModBlocks.ANCIENT_RECEPTOR);
                        entries.add(ModBlocks.ANCIENT_PILLAR);

                        entries.add(ModBlocks.ANCIENT_RUNE_BLOCK1);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK2);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK3);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK4);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK5);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK6);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK7);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK8);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK9);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK10);
                        entries.add(ModBlocks.ANCIENT_RUNE_BLOCK11);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK12);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK13);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK14);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK15);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK16);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK17);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK18);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK19);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK20);
                        entries.add(ModBlocks.ANCIENT_RUNE_BLOCK21);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK22);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK23);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK24);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK25);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK26);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK27);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK28);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK29);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK30);
                        entries.add(ModBlocks.ANCIENT_RUNE_BLOCK31);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK32);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK33);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK34);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK35);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK36);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK37);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK38);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK39);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK40);entries.add(ModBlocks.ANCIENT_RUNE_BLOCK41);

                    }).build());


    public static void registerItemGroups() {
        TBsAddons.LOGGER.info("Registering Item Groups for " + TBsAddons.MOD_ID);
    }
}