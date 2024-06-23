package afraidmonster.moredoors;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class CustomTintedDoorBlock extends DoorBlock {

    public CustomTintedDoorBlock(Settings settings, BlockSetType blockSetType ) {super(settings.nonOpaque(), blockSetType);}

    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    public int getOpacity(BlockState state, BlockView world, BlockPos pos) {
        return world.getMaxLightLevel();
    }

}