package com.afraidmonster.moredoors.Block;


import com.afraidmonster.moredoors.Item.ModItems;
import com.afraidmonster.moredoors.MoreDoors;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final SoundEvent METAL_OPEN = SoundEvents.IRON_DOOR_OPEN;
    public static final SoundEvent METAL_CLOSE = SoundEvents.IRON_DOOR_CLOSE;
    public static final SoundEvent NORMAL_OPEN = SoundEvents.WOODEN_DOOR_OPEN;
    public static final SoundEvent NORMAL_CLOSE = SoundEvents.WOODEN_DOOR_CLOSE;
    public static final SoundEvent METAL_TRAPDOOR_OPEN = SoundEvents.IRON_TRAPDOOR_OPEN;
    public static final SoundEvent METAL_TRAPDOOR_CLOSE = SoundEvents.IRON_TRAPDOOR_CLOSE;
    public static final SoundEvent NORMAL_TRAPDOOR_OPEN = SoundEvents.WOODEN_TRAPDOOR_OPEN;
    public static final SoundEvent NORMAL_TRAPDOOR_CLOSE = SoundEvents.WOODEN_TRAPDOOR_CLOSE;

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreDoors.MODID);

    public static final RegistryObject<Block> GOLD_DOOR = registerBlock("gold_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK), METAL_CLOSE, METAL_OPEN));

    public static final RegistryObject<Block> DIAMOND_DOOR = registerBlock("diamond_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK), METAL_CLOSE, METAL_OPEN));

    public static final RegistryObject<Block> LAPIS_DOOR = registerBlock("lapis_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK), METAL_CLOSE, METAL_OPEN));

    public static final RegistryObject<Block> COPPER_DOOR = registerBlock("copper_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK), METAL_CLOSE, METAL_OPEN));

    public static final RegistryObject<Block> NETHERITE_DOOR = registerBlock("netherite_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK), METAL_CLOSE, METAL_OPEN));

    public static final RegistryObject<Block> EMERALD_DOOR = registerBlock("emerald_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK), METAL_CLOSE, METAL_OPEN));

    public static final RegistryObject<Block> REDSTONE_DOOR = registerBlock("redstone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK), METAL_CLOSE, METAL_OPEN));

    public static final RegistryObject<Block> COAL_DOOR = registerBlock("coal_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5.0f, 6F).sound(SoundType.STONE), METAL_CLOSE, METAL_OPEN));

    public static final RegistryObject<Block> STONE_DOOR = registerBlock("stone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE), NORMAL_CLOSE, NORMAL_OPEN));


    public static final RegistryObject<Block> GOLD_TRAPDOOR = registerBlock("gold_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> DIAMOND_TRAPDOOR = registerBlock("diamond_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> LAPIS_TRAPDOOR = registerBlock("lapis_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> COPPER_TRAPDOOR = registerBlock("copper_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> NETHERITE_TRAPDOOR = registerBlock("netherite_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> EMERALD_TRAPDOOR = registerBlock("emerald_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> REDSTONE_TRAPDOOR = registerBlock("redstone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> COAL_TRAPDOOR = registerBlock("coal_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5.0f, 6F).sound(SoundType.STONE), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> STONE_TRAPDOOR = registerBlock("stone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));


    public static final RegistryObject<Block> COBBLESTONE_DOOR = registerBlock("cobblestone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> ANDESITE_DOOR = registerBlock("andesite_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> DIORITE_DOOR = registerBlock("diorite_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> GRANITE_DOOR = registerBlock("granite_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> SANDSTONE_DOOR = registerBlock("sandstone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> RED_SANDSTONE_DOOR = registerBlock("red_sandstone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_DOOR = registerBlock("cobbled_deepslate_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE),NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> CALCITE_DOOR = registerBlock("calcite_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> POLISHED_DEEPSLATE_DOOR = registerBlock("polished_deepslate_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE), NORMAL_CLOSE, NORMAL_OPEN));


    public static final RegistryObject<Block> COBBLESTONE_TRAPDOOR = registerBlock("cobblestone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> ANDESITE_TRAPDOOR = registerBlock("andesite_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> DIORITE_TRAPDOOR = registerBlock("diorite_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> GRANITE_TRAPDOOR = registerBlock("granite_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> SANDSTONE_TRAPDOOR = registerBlock("sandstone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> RED_SANDSTONE_TRAPDOOR = registerBlock("red_sandstone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_TRAPDOOR = registerBlock("cobbled_deepslate_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE),NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> CALCITE_TRAPDOOR = registerBlock("calcite_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> POLISHED_DEEPSLATE_TRAPDOOR = registerBlock("polished_deepslate_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));


    public static final RegistryObject<Block> BASALT_DOOR = registerBlock("basalt_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.BASALT), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> BLACKSTONE_DOOR = registerBlock("blackstone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> NETHERRACK_DOOR = registerBlock("netherrack_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> END_STONE_DOOR = registerBlock("end_stone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> PURPUR_DOOR = registerBlock("purpur_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> QUARTZ_DOOR = registerBlock("quartz_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK),NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> NETHER_BRICK_DOOR = registerBlock("nether_brick_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> PRISMARINE_DOOR = registerBlock("prismarine_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> BOOKSHELF_DOOR = registerBlock("bookshelf_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF), NORMAL_CLOSE, NORMAL_OPEN));


    public static final RegistryObject<Block> BASALT_TRAPDOOR = registerBlock("basalt_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BASALT), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> BLACKSTONE_TRAPDOOR = registerBlock("blackstone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> NETHERRACK_TRAPDOOR = registerBlock("netherrack_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> END_STONE_TRAPDOOR = registerBlock("end_stone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> PURPUR_TRAPDOOR = registerBlock("purpur_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> QUARTZ_TRAPDOOR = registerBlock("quartz_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> NETHER_BRICK_TRAPDOOR = registerBlock("nether_brick_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS),NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> PRISMARINE_TRAPDOOR = registerBlock("prismarine_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> BOOKSHELF_TRAPDOOR = registerBlock("bookshelf_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));


    public static final RegistryObject<Block> AMETHYST_DOOR = registerBlock("amethyst_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> SMOOTH_STONE_DOOR = registerBlock("smooth_stone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> OBSIDIAN_DOOR = registerBlock("obsidian_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(50.0f, 1200F).sound(SoundType.STONE), METAL_CLOSE, METAL_OPEN));

    public static final RegistryObject<Block> BRICK_DOOR = registerBlock("brick_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> ICE_DOOR = registerBlock("ice_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.ICE), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> GLASS_DOOR = registerBlock("glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> BEDROCK_DOOR = registerBlock("bedrock_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(-1.0f, 3600000F).sound(SoundType.STONE), METAL_CLOSE, METAL_OPEN));

    public static final RegistryObject<Block> SPONGE_DOOR = registerBlock("sponge_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.SPONGE), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> DRIPSTONE_DOOR = registerBlock("dripstone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK), NORMAL_CLOSE, NORMAL_OPEN));


    public static final RegistryObject<Block> AMETHYST_TRAPDOOR = registerBlock("amethyst_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> SMOOTH_STONE_TRAPDOOR = registerBlock("smooth_stone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> OBSIDIAN_TRAPDOOR = registerBlock("obsidian_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(50.0f, 1200F).sound(SoundType.STONE), METAL_CLOSE, METAL_OPEN));

    public static final RegistryObject<Block> BRICK_TRAPDOOR = registerBlock("brick_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> ICE_TRAPDOOR = registerBlock("ice_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.ICE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> GLASS_TRAPDOOR = registerBlock("glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> BEDROCK_TRAPDOOR = registerBlock("bedrock_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(-1.0f, 3600000F).sound(SoundType.STONE), METAL_CLOSE, METAL_OPEN));

    public static final RegistryObject<Block> SPONGE_TRAPDOOR = registerBlock("sponge_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SPONGE),NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> DRIPSTONE_TRAPDOOR = registerBlock("dripstone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));


    public static final RegistryObject<Block> MUD_BRICK_DOOR = registerBlock("mud_brick_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> BLACK_STAINED_GLASS_DOOR = registerBlock("black_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> BLUE_STAINED_GLASS_DOOR = registerBlock("blue_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> BROWN_STAINED_GLASS_DOOR = registerBlock("brown_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> CYAN_STAINED_GLASS_DOOR = registerBlock("cyan_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> GRAY_STAINED_GLASS_DOOR = registerBlock("gray_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> GREEN_STAINED_GLASS_DOOR = registerBlock("green_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("light_blue_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("light_gray_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    


    public static final RegistryObject<Block> MUD_BRICK_TRAPDOOR = registerBlock("mud_brick_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> BLACK_STAINED_GLASS_TRAPDOOR = registerBlock("black_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));
            
    public static final RegistryObject<Block> BLUE_STAINED_GLASS_TRAPDOOR = registerBlock("blue_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> BROWN_STAINED_GLASS_TRAPDOOR = registerBlock("brown_stained_glass_trapdoor", () ->        
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> CYAN_STAINED_GLASS_TRAPDOOR = registerBlock("cyan_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> GRAY_STAINED_GLASS_TRAPDOOR = registerBlock("gray_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> GREEN_STAINED_GLASS_TRAPDOOR = registerBlock("green_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_TRAPDOOR = registerBlock("light_blue_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_TRAPDOOR = registerBlock("light_gray_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    

    public static final RegistryObject<Block> LIME_STAINED_GLASS_DOOR = registerBlock("lime_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_DOOR = registerBlock("magenta_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> ORANGE_STAINED_GLASS_DOOR = registerBlock("orange_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> PINK_STAINED_GLASS_DOOR = registerBlock("pink_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> PURPLE_STAINED_GLASS_DOOR = registerBlock("purple_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> RED_STAINED_GLASS_DOOR = registerBlock("red_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> WHITE_STAINED_GLASS_DOOR = registerBlock("white_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> YELLOW_STAINED_GLASS_DOOR = registerBlock("yellow_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    public static final RegistryObject<Block> TINTED_GLASS_DOOR = registerBlock("tinted_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.TINTED_GLASS), NORMAL_CLOSE, NORMAL_OPEN));

    


    public static final RegistryObject<Block> LIME_STAINED_GLASS_TRAPDOOR = registerBlock("lime_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_TRAPDOOR = registerBlock("magenta_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> ORANGE_STAINED_GLASS_TRAPDOOR = registerBlock("orange_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> PINK_STAINED_GLASS_TRAPDOOR = registerBlock("pink_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> PURPLE_STAINED_GLASS_TRAPDOOR = registerBlock("purple_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> RED_STAINED_GLASS_TRAPDOOR = registerBlock("red_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> WHITE_STAINED_GLASS_TRAPDOOR = registerBlock("white_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> YELLOW_STAINED_GLASS_TRAPDOOR = registerBlock("yellow_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> TINTED_GLASS_TRAPDOOR = registerBlock("tinted_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.TINTED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN));

   

    

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


    public static void registerTab(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(new ResourceLocation("moredoorstab", MoreDoors.MODID), builder -> builder.icon(() -> new ItemStack(ModBlocks.GOLD_DOOR.get())).displayItems((flags, output) -> ModItems.ITEMS.getEntries().forEach(o -> output.accept(o.get()))).title(Component.translatable("itemGroup.moredoorstab")));
    }



}
