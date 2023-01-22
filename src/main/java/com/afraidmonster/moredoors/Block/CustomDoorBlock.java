package com.afraidmonster.moredoors.Block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.DoorBlock;

public class CustomDoorBlock extends DoorBlock {
    public CustomDoorBlock(Properties properties, SoundEvent soundEventClose   , SoundEvent soundEventOpen) {
        super(properties.noOcclusion(), soundEventClose, soundEventOpen);
    }
}