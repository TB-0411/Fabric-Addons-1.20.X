package net.tb.addons.mixin;

import net.tb.addons.item.DyeableExtendedArmorItem;
import net.tb.addons.item.ExtendedArmorItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class MixinLivingEntity extends Entity {
    protected MixinLivingEntity(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Shadow
    public abstract ItemStack getEquippedStack(EquipmentSlot arg);

    private float apply(EquipmentSlot slot, DamageSource source, float amount) {
        ItemStack stack = this.getEquippedStack(slot);

        //noinspection ConstantConditions
        if (stack != null && stack.getItem() instanceof ExtendedArmorItem armor && (Entity) this instanceof LivingEntity livingEntity) {
            amount = armor.applyArmorToDamage(livingEntity, source, amount, stack);
        } else if (stack != null && stack.getItem() instanceof DyeableExtendedArmorItem armor && (Entity) this instanceof LivingEntity livingEntity){
            amount = armor.applyArmorToDamage(livingEntity, source, amount, stack);
        }

        return amount;
    }

    private float applyToAttacker(LivingEntity attacker, EquipmentSlot slot, DamageSource source, float amount) {
        ItemStack stack = attacker.getEquippedStack(slot);

        //noinspection ConstantConditions
        if (stack != null && stack.getItem() instanceof ExtendedArmorItem armor && (Entity) this instanceof LivingEntity livingEntity) {
            amount = armor.applyArmorToAttack(livingEntity, source, amount, stack);
        } else if (stack != null && stack.getItem() instanceof DyeableExtendedArmorItem armor && (Entity) this instanceof LivingEntity livingEntity){
            amount = armor.applyArmorToAttack(livingEntity, source, amount, stack);
        }

        return amount;
    }

    DamageSource source;

    @Inject(method = "damage(Lnet/minecraft/entity/damage/DamageSource;F)Z", at = @At(value = "HEAD"))
    public void immersiveArmors$injectDamage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        this.source = source;
    }

    @ModifyArg(method = "damage(Lnet/minecraft/entity/damage/DamageSource;F)Z",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraft/entity/LivingEntity;applyDamage(Lnet/minecraft/entity/damage/DamageSource;F)V"),
            index = 1)
    public float immersiveArmors$modifyArgs(float amount) {
        amount = apply(EquipmentSlot.HEAD, source, amount);
        amount = apply(EquipmentSlot.CHEST, source, amount);
        amount = apply(EquipmentSlot.LEGS, source, amount);
        amount = apply(EquipmentSlot.FEET, source, amount);

        Entity attacker = source.getAttacker();
        if (attacker instanceof LivingEntity livingAttacker) {
            amount = applyToAttacker(livingAttacker, EquipmentSlot.HEAD, source, amount);
            amount = applyToAttacker(livingAttacker, EquipmentSlot.CHEST, source, amount);
            amount = applyToAttacker(livingAttacker, EquipmentSlot.LEGS, source, amount);
            amount = applyToAttacker(livingAttacker, EquipmentSlot.FEET, source, amount);
        }

        return amount;
    }
}
