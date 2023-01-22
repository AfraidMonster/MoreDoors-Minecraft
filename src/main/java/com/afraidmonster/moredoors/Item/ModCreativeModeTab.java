package com.afraidmonster.moredoors.Item;

import com.afraidmonster.moredoors.Block.ModBlocks;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MORE_DOORS = new CreativeModeTab("more_doors") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.GOLD_DOOR.get());
        }
    };
}