package com.afraidmonster.moredoors.Block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.TrapDoorBlock;

public class CustomTrapDoorBlock extends TrapDoorBlock {
    public CustomTrapDoorBlock(Properties properties, SoundEvent soundEventClose, SoundEvent soundEventOpen) {
        super(properties.noOcclusion(), soundEventClose, soundEventOpen);
    }
}
