package com.afraidmonster.moredoors.Block;

import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CustomTrapDoorBlock extends TrapDoorBlock {
    public CustomTrapDoorBlock(Properties properties, BlockSetType blockSetType) {
        super(blockSetType, properties.noOcclusion());
    }
}
