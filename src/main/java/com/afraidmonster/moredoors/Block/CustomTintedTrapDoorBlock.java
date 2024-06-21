package com.afraidmonster.moredoors.Block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CustomTintedTrapDoorBlock extends TrapDoorBlock {
    public CustomTintedTrapDoorBlock(Properties properties, BlockSetType blockSetType) {
        super(properties.noOcclusion(), blockSetType);
    }

    public boolean propagatesSkylightDown(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }

    public int getLightBlock(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return blockGetter.getMaxLightLevel();
    }
}
