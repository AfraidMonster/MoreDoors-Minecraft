package afraidmonster.moredoors;

import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CustomTintedTrapdoorBlock extends TrapDoorBlock {

    public CustomTintedTrapdoorBlock(Properties settings, BlockSetType blockSetType) {super(blockSetType, settings.noOcclusion());}

    public boolean propagatesSkylightDown(BlockState state) {
        return false;
    }

    public int getLightDampening(BlockState state) {
        return 15;
    }

}

   