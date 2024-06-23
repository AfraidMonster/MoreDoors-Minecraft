package afraidmonster.moredoors;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.DoorBlock;

public class CustomDoorBlock extends DoorBlock {
    public CustomDoorBlock(Settings settings, BlockSetType blockSetType ) {

        super(blockSetType, settings.nonOpaque());
    
        
        //TODO Auto-generated constructor stub
    }
}