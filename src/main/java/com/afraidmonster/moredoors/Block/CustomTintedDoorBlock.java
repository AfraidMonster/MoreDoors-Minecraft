package com.afraidmonster.moredoors.Block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CustomTintedDoorBlock extends DoorBlock {
    public CustomTintedDoorBlock(Properties properties, BlockSetType blockSetType) {
        super(blockSetType, properties.noOcclusion());
    }

    public boolean propagatesSkylightDown(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }

    public int getLightBlock(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return blockGetter.getMaxLightLevel();
    }
}