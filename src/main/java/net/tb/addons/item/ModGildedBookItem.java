package net.tb.addons.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModGildedBookItem extends Item {
   public ModGildedBookItem(Item.Settings settings) {
      super(settings);
   }

   public boolean isEnchantable(ItemStack stack) {
      return stack.getCount() == 1;
   }

   public int getEnchantability() {
      return 5;
   }
}
