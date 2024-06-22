package com.afraidmonster.moredoors.Block;

import com.afraidmonster.moredoors.Item.ModItems;
import com.afraidmonster.moredoors.MoreDoors;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegisterEvent;

public class MoreDoorsCreativeTab {

    public static final ResourceKey<CreativeModeTab> MORE_DOORS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("more_doors", MoreDoors.MODID));

    public static void registerTab(RegisterEvent event) {
        event.register(Registries.CREATIVE_MODE_TAB, helper -> {
            helper.register(MORE_DOORS, CreativeModeTab.builder().displayItems((flags, output) -> ModItems.ITEMS.getEntries().forEach(o -> output.accept(o.get()))).title(Component.translatable("itemGroup.moredoorstab")).icon(() -> { return new ItemStack(ModBlocks.GOLD_DOOR.get()); }).build());

        });
    }





}
