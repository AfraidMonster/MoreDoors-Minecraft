package afraidmonster.moredoors;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockState;
import net.minecraft.block.TrapdoorBlock;

public class CustomTintedTrapdoorBlock extends TrapdoorBlock {

    public CustomTintedTrapdoorBlock(Settings settings, BlockSetType blockSetType) {super(blockSetType, settings.nonOpaque());}

    public boolean isTransparent(BlockState state) {
        return false;
    }

    public int getOpacity(BlockState state) {
        return 15;
    }

}

   