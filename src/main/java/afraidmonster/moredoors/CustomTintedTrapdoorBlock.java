package afraidmonster.moredoors;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockState;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class CustomTintedTrapdoorBlock extends TrapdoorBlock {

    public CustomTintedTrapdoorBlock(Settings settings, BlockSetType blockSetType) {super(blockSetType, settings.nonOpaque());}

    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    public int getOpacity(BlockState state, BlockView world, BlockPos pos) {
        return world.getMaxLightLevel();
    }

}

   