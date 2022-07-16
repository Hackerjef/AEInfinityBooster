package dev.nadie.aeinfinitybooster.mixins;

import appeng.container.slot.RestrictedInputSlot;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import dev.nadie.aeinfinitybooster.setup.ModItems;

/**
 * MixinRestrictedInputSlot
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 22/12/2021 - 10:10 am
 */

@Mixin(value = RestrictedInputSlot.class)
public class MixinRestrictedInputSlot {

    @Inject(method = "mayPlace", at = @At("HEAD"), cancellable = true)
    private void mayPlace(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (stack.getItem() == ModItems.INFINITY_CARD.get() || stack.getItem() == ModItems.DIMENSION_CARD.get()) {
            cir.setReturnValue(true);
        }
    }

}
