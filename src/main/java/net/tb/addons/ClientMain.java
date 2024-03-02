package net.tb.addons;

import net.minecraft.client.MinecraftClient;
import net.minecraft.item.Item;
import net.tb.addons.item.DyeableExtendedArmorItem;
import net.tb.addons.item.ModItems;
import net.tb.addons.mixin.MixinItemRenderer;

public class ClientMain {
	public static void postLoad() {
		//Immersive Armors
		MixinItemRenderer itemRenderer = (MixinItemRenderer)MinecraftClient.getInstance().getItemRenderer();
        for (Item item : ModItems.coloredItems.values()) {
            itemRenderer.getColors().register((stack, tintIndex) -> tintIndex > 0 ? -1 : ((DyeableExtendedArmorItem)stack.getItem()).getColor(stack), item);
        }
	}
}