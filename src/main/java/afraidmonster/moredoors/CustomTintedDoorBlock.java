package afraidmonster.moredoors;

import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CustomTintedDoorBlock extends DoorBlock {

    public CustomTintedDoorBlock(Properties settings, BlockSetType blockSetType ) {super(blockSetType, settings.noOcclusion());}

    public boolean propagatesSkylightDown(BlockState state) {
        return false;
    }

    public int getLightDampening(BlockState state) {
        return 15;
    }

}