package afraidmonster.moredoors;

import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CustomDoorBlock extends DoorBlock {
    public CustomDoorBlock(Properties settings, BlockSetType blockSetType ) {

        super(blockSetType, settings.noOcclusion());
    
        
        //TODO Auto-generated constructor stub
    }
}