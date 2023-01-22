package afraidmonster.moredoors.Mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.tag.BlockTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DoorBlock.class)

public class WoodenDoorMixin {



    @Inject(at = @At(value = "HEAD"), method = "isWoodenDoor(Lnet/minecraft/block/BlockState;)Z", cancellable = true)
    private static void isWoodenDoor(BlockState blockState, CallbackInfoReturnable info) {
        if (blockState.getBlock() instanceof DoorBlock && (blockState.isIn(BlockTags.WOODEN_DOORS))) {
            info.setReturnValue(true);
        }



           //     blockState.isIn(BlockTags.WOODEN_DOORS





    }
}
    

 