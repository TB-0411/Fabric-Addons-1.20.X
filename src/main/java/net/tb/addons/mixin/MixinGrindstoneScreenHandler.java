package net.tb.addons.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.GrindstoneScreenHandler;
import net.tb.addons.item.ModItems;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GrindstoneScreenHandler.class)
public class MixinGrindstoneScreenHandler {

    @Inject(method = "grind", at = @At("RETURN"), cancellable = true)
    private void grindGildedBook(ItemStack item, int damage, int amount, CallbackInfoReturnable<ItemStack> cir) {
        var stack = cir.getReturnValue();
        NbtCompound gildedNbt = item.getNbt();
        if (gildedNbt.getInt("CustomModelData") != 555890) return;

        var res = new ItemStack(ModItems.GILDED_BOOK, stack.getCount());
        ((ItemStack) res).setNbt(stack.getNbt());
        cir.setReturnValue((ItemStack) res);
    }
}