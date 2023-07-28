package net.tb.addons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.tb.addons.TBsAddons;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ANCIENT_TABLET = registerItem("ancient_tablet", new Item(new FabricItemSettings().maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TBsAddons.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TBsAddons.LOGGER.info("Registering Mod Items for " + TBsAddons.MOD_ID);
    }
}