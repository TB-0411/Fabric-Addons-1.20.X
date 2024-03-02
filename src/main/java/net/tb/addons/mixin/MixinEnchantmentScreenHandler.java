package net.tb.addons.mixin;

import net.tb.addons.item.ModItems;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.EnchantmentScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnchantmentScreenHandler.class)
public abstract class MixinEnchantmentScreenHandler extends ScreenHandler {

    @Shadow
    @Final
    private Inventory inventory;

    public MixinEnchantmentScreenHandler(ScreenHandlerType<?> type, int syncId) {
        super(type, syncId);
    }

    @Inject(method = "onButtonClick", at = @At("RETURN"))
    public void enchantGildedBook(CallbackInfoReturnable<Boolean> cir) {
        var stack = inventory.getStack(0);
        if (!stack.isOf(ModItems.GILDED_BOOK)) return;
        var res = new ItemStack(Items.ENCHANTED_BOOK);
        NbtCompound nbtData = new NbtCompound();
        nbtData.putInt("CustomModelData", 555890);
        res.setNbt(nbtData);
        if (stack.hasCustomName()) res.setCustomName(stack.getName());
        var enchantments = EnchantmentHelper.fromNbt(stack.getEnchantments());
        EnchantmentHelper.set(enchantments, res);
        inventory.setStack(0, res);
    }
}