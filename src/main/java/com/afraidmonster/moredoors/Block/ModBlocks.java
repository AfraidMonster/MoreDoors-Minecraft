package com.afraidmonster.moredoors.Block;


import com.afraidmonster.moredoors.Item.ModItems;
import com.afraidmonster.moredoors.MoreDoors;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.common.extensions.IForgeBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final SoundEvent METAL_OPEN = SoundEvents.IRON_DOOR_OPEN;
    public static final SoundEvent METAL_CLOSE = SoundEvents.IRON_DOOR_CLOSE;
    public static final SoundEvent WOOD_OPEN = SoundEvents.WOODEN_DOOR_OPEN;
    public static final SoundEvent WOOD_CLOSE = SoundEvents.WOODEN_DOOR_CLOSE;
    public static final SoundEvent METAL_TRAP_OPEN = SoundEvents.IRON_TRAPDOOR_OPEN;
    public static final SoundEvent METAL_TRAP_CLOSE = SoundEvents.IRON_TRAPDOOR_CLOSE;
    public static final SoundEvent WOOD_TRAP_OPEN = SoundEvents.WOODEN_TRAPDOOR_OPEN;
    public static final SoundEvent WOOD_TRAP_CLOSE = SoundEvents.WOODEN_TRAPDOOR_CLOSE;

    public static final BlockSetType.PressurePlateSensitivity PRESSURE_SENSITIVITY = BlockSetType.PressurePlateSensitivity.EVERYTHING;

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreDoors.MODID);

    public static BlockSetType registerSound(IForgeBlock block, Boolean isMetal)  {
        SoundType soundGroup = block.getSoundType(null, null, null, null);


        if(isMetal){
            return BlockSetType.register(new BlockSetType("blockset",false, false, false,PRESSURE_SENSITIVITY, soundGroup, METAL_CLOSE, METAL_OPEN, METAL_TRAP_CLOSE, METAL_TRAP_OPEN, SoundEvents.METAL_PRESSURE_PLATE_CLICK_OFF, SoundEvents.METAL_PRESSURE_PLATE_CLICK_ON, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON));

        }else {
            return BlockSetType.register(new BlockSetType("blockset",true, true, true, PRESSURE_SENSITIVITY, soundGroup, WOOD_CLOSE, WOOD_OPEN, WOOD_TRAP_CLOSE, WOOD_TRAP_OPEN, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));
        }


    }

    public static final RegistryObject<Block> GOLD_DOOR = registerBlock("gold_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK).setId(blockId("gold_door")), registerSound(Blocks.GOLD_BLOCK, true)));

    public static final RegistryObject<Block> GOLD_TRAPDOOR = registerBlock("gold_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK).setId(blockId("gold_trapdoor")),   registerSound( Blocks.GOLD_BLOCK, true)));


    public static final RegistryObject<Block> DIAMOND_DOOR = registerBlock("diamond_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).setId(blockId("diamond_door")),  registerSound( Blocks.DIAMOND_BLOCK, true)));

    public static final RegistryObject<Block> DIAMOND_TRAPDOOR = registerBlock("diamond_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).setId(blockId("diamond_trapdoor")),   registerSound( Blocks.DIAMOND_BLOCK, true)));


    public static final RegistryObject<Block> LAPIS_DOOR = registerBlock("lapis_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK).setId(blockId("lapis_door")),  registerSound( Blocks.LAPIS_BLOCK, true)));

    public static final RegistryObject<Block> LAPIS_TRAPDOOR = registerBlock("lapis_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK).setId(blockId("lapis_trapdoor")),   registerSound( Blocks.LAPIS_BLOCK, true)));

    public static final RegistryObject<Block> NETHERITE_DOOR = registerBlock("netherite_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).setId(blockId("netherite_door")), registerSound( Blocks.NETHERITE_BLOCK, true)));

    public static final RegistryObject<Block> NETHERITE_TRAPDOOR = registerBlock("netherite_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).setId(blockId("netherite_trapdoor")),   registerSound( Blocks.NETHERITE_BLOCK, true)));

    public static final RegistryObject<Block> EMERALD_DOOR = registerBlock("emerald_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK).setId(blockId("emerald_door")),  registerSound( Blocks.EMERALD_BLOCK, true)));

    public static final RegistryObject<Block> EMERALD_TRAPDOOR = registerBlock("emerald_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK).setId(blockId("emerald_trapdoor")),  registerSound( Blocks.EMERALD_BLOCK, true)));

    public static final RegistryObject<Block> REDSTONE_DOOR = registerBlock("redstone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK).setId(blockId("redstone_door")),   registerSound( Blocks.REDSTONE_BLOCK, true)));

    public static final RegistryObject<Block> REDSTONE_TRAPDOOR = registerBlock("redstone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK).setId(blockId("redstone_trapdoor")),  registerSound( Blocks.REDSTONE_BLOCK, true)));

    public static final RegistryObject<Block> COAL_DOOR = registerBlock("coal_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).setId(blockId("coal_door")),   registerSound( Blocks.COAL_BLOCK, true)));

    public static final RegistryObject<Block> COAL_TRAPDOOR = registerBlock("coal_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).setId(blockId("coal_trapdoor")),  registerSound( Blocks.COAL_BLOCK, true)));

    public static final RegistryObject<Block> STONE_DOOR = registerBlock("stone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(blockId("stone_door")),  registerSound( Blocks.STONE, false)));

    public static final RegistryObject<Block> STONE_TRAPDOOR = registerBlock("stone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(blockId("stone_trapdoor")),  registerSound( Blocks.STONE, false)));

    public static final RegistryObject<Block> COBBLESTONE_DOOR = registerBlock("cobblestone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).setId(blockId("cobblestone_door")),  registerSound( Blocks.STONE, false)));

    public static final RegistryObject<Block> COBBLESTONE_TRAPDOOR = registerBlock("cobblestone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).setId(blockId("cobblestone_trapdoor")),   registerSound( Blocks.COBBLESTONE, false)));

    public static final RegistryObject<Block> ANDESITE_DOOR = registerBlock("andesite_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).setId(blockId("andesite_door")),  registerSound( Blocks.POLISHED_ANDESITE, false)));

    public static final RegistryObject<Block> ANDESITE_TRAPDOOR = registerBlock("andesite_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).setId(blockId("andesite_trapdoor")),   registerSound( Blocks.POLISHED_ANDESITE, false)));

    public static final RegistryObject<Block> DIORITE_DOOR = registerBlock("diorite_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).setId(blockId("diorite_door")),   registerSound( Blocks.POLISHED_DIORITE, false)));

    public static final RegistryObject<Block> DIORITE_TRAPDOOR = registerBlock("diorite_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).setId(blockId("diorite_trapdoor")), registerSound( Blocks.POLISHED_DIORITE, false)));

    public static final RegistryObject<Block> GRANITE_DOOR = registerBlock("granite_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).setId(blockId("granite_door")),  registerSound( Blocks.POLISHED_GRANITE, false)));

    public static final RegistryObject<Block> GRANITE_TRAPDOOR = registerBlock("granite_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).setId(blockId("granite_trapdoor")),   registerSound( Blocks.POLISHED_GRANITE, false)));

    public static final RegistryObject<Block> SANDSTONE_DOOR = registerBlock("sandstone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(blockId("sandstone_door")),  registerSound( Blocks.SANDSTONE, false)));

    public static final RegistryObject<Block> SANDSTONE_TRAPDOOR = registerBlock("sandstone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(blockId("sandstone_trapdoor")),   registerSound( Blocks.SANDSTONE, false)));

    public static final RegistryObject<Block> RED_SANDSTONE_DOOR = registerBlock("red_sandstone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(blockId("red_sandstone_door")), registerSound( Blocks.RED_SANDSTONE, false)));

    public static final RegistryObject<Block> RED_SANDSTONE_TRAPDOOR = registerBlock("red_sandstone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(blockId("red_sandstone_trapdoor")),   registerSound( Blocks.RED_SANDSTONE, false)));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_DOOR = registerBlock("cobbled_deepslate_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(blockId("cobbled_deepslate_door")),  registerSound( Blocks.COBBLED_DEEPSLATE, false)));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_TRAPDOOR = registerBlock("cobbled_deepslate_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(blockId("cobbled_deepslate_trapdoor")),  registerSound( Blocks.COBBLED_DEEPSLATE, false)));

    public static final RegistryObject<Block> CALCITE_DOOR = registerBlock("calcite_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).setId(blockId("calcite_door")),   registerSound( Blocks.CALCITE, false)));

    public static final RegistryObject<Block> CALCITE_TRAPDOOR = registerBlock("calcite_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).setId(blockId("calcite_trapdoor")),  registerSound( Blocks.CALCITE, false)));


    public static final RegistryObject<Block> POLISHED_DEEPSLATE_DOOR = registerBlock("polished_deepslate_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DEEPSLATE).setId(blockId("polished_deepslate_door")),  registerSound( Blocks.POLISHED_DEEPSLATE, false)));

    public static final RegistryObject<Block> POLISHED_DEEPSLATE_TRAPDOOR = registerBlock("polished_deepslate_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DEEPSLATE).setId(blockId("polished_deepslate_trapdoor")),  registerSound( Blocks.POLISHED_DEEPSLATE, false)));


    public static final RegistryObject<Block> BASALT_DOOR = registerBlock("basalt_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(blockId("basalt_door")),   registerSound( Blocks.BASALT, false)));

    public static final RegistryObject<Block> BASALT_TRAPDOOR = registerBlock("basalt_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(blockId("basalt_trapdoor")),   registerSound( Blocks.BASALT, false)));

    public static final RegistryObject<Block> BLACKSTONE_DOOR = registerBlock("blackstone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS).setId(blockId("blackstone_door")),   registerSound( Blocks.BLACKSTONE, false)));

    public static final RegistryObject<Block> BLACKSTONE_TRAPDOOR = registerBlock("blackstone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS).setId(blockId("blackstone_trapdoor")),  registerSound( Blocks.BLACKSTONE, false)));

    public static final RegistryObject<Block> NETHERRACK_DOOR = registerBlock("netherrack_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK).setId(blockId("netherrack_door")),   registerSound( Blocks.NETHERRACK, false)));

    public static final RegistryObject<Block> NETHERRACK_TRAPDOOR = registerBlock("netherrack_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK).setId(blockId("netherrack_trapdoor")), registerSound( Blocks.NETHERRACK, false)));

    public static final RegistryObject<Block> END_STONE_DOOR = registerBlock("end_stone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(blockId("end_stone_door")),   registerSound( Blocks.END_STONE, false)));

    public static final RegistryObject<Block> END_STONE_TRAPDOOR = registerBlock("end_stone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(blockId("end_stone_trapdoor")),   registerSound( Blocks.END_STONE, false)));

    public static final RegistryObject<Block> PURPUR_DOOR = registerBlock("purpur_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(blockId("purpur_door")),   registerSound( Blocks.PURPUR_BLOCK, false)));

    public static final RegistryObject<Block> PURPUR_TRAPDOOR = registerBlock("purpur_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(blockId("purpur_trapdoor")),  registerSound( Blocks.PURPUR_BLOCK, false)));

    public static final RegistryObject<Block> QUARTZ_DOOR = registerBlock("quartz_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(blockId("quartz_door")),  registerSound( Blocks.QUARTZ_BLOCK, false)));

    public static final RegistryObject<Block> QUARTZ_TRAPDOOR = registerBlock("quartz_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(blockId("quartz_trapdoor")),  registerSound( Blocks.QUARTZ_BLOCK, false)));

    public static final RegistryObject<Block> NETHER_BRICK_DOOR = registerBlock("nether_brick_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(blockId("nether_brick_door")),  registerSound( Blocks.NETHER_BRICKS, false)));

    public static final RegistryObject<Block> NETHER_BRICK_TRAPDOOR = registerBlock("nether_brick_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(blockId("nether_brick_trapdoor")),  registerSound( Blocks.NETHER_BRICKS, false)));

    public static final RegistryObject<Block> PRISMARINE_DOOR = registerBlock("prismarine_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).setId(blockId("prismarine_door")),  registerSound( Blocks.PRISMARINE_BRICKS, false)));

    public static final RegistryObject<Block> PRISMARINE_TRAPDOOR = registerBlock("prismarine_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).setId(blockId("prismarine_trapdoor")),  registerSound( Blocks.PRISMARINE_BRICKS, false)));

    public static final RegistryObject<Block> BOOKSHELF_DOOR = registerBlock("bookshelf_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).setId(blockId("bookshelf_door")),  registerSound( Blocks.BOOKSHELF, false)));

    public static final RegistryObject<Block> BOOKSHELF_TRAPDOOR = registerBlock("bookshelf_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).setId(blockId("bookshelf_trapdoor")),   registerSound( Blocks.BOOKSHELF, false)));

    public static final RegistryObject<Block> AMETHYST_DOOR = registerBlock("amethyst_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK).setId(blockId("amethyst_door")),  registerSound( Blocks.AMETHYST_BLOCK, false)));

    public static final RegistryObject<Block> AMETHYST_TRAPDOOR = registerBlock("amethyst_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK).setId(blockId("amethyst_trapdoor")),  registerSound( Blocks.AMETHYST_BLOCK, false)));

    public static final RegistryObject<Block> SMOOTH_STONE_DOOR = registerBlock("smooth_stone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(blockId("smooth_stone_door")),  registerSound( Blocks.SMOOTH_STONE, false)));

    public static final RegistryObject<Block> SMOOTH_STONE_TRAPDOOR = registerBlock("smooth_stone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(blockId("smooth_stone_trapdoor")),  registerSound( Blocks.SMOOTH_STONE, false)));

    public static final RegistryObject<Block> OBSIDIAN_DOOR = registerBlock("obsidian_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN).setId(blockId("obsidian_door")),  registerSound( Blocks.OBSIDIAN, true)));

    public static final RegistryObject<Block> OBSIDIAN_TRAPDOOR = registerBlock("obsidian_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN).setId(blockId("obsidian_trapdoor")),  registerSound( Blocks.OBSIDIAN, true)));

    public static final RegistryObject<Block> BRICK_DOOR = registerBlock("brick_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(blockId("brick_door")),  registerSound( Blocks.BRICKS, false)));

    public static final RegistryObject<Block> BRICK_TRAPDOOR = registerBlock("brick_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(blockId("brick_trapdoor")),  registerSound( Blocks.BRICKS, false)));

    public static final RegistryObject<Block> ICE_DOOR = registerBlock("ice_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ICE).setId(blockId("ice_door")),  registerSound( Blocks.ICE, false)));

    public static final RegistryObject<Block> ICE_TRAPDOOR = registerBlock("ice_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ICE).setId(blockId("ice_trapdoor")),  registerSound( Blocks.ICE, false)));

    public static final RegistryObject<Block> GLASS_DOOR = registerBlock("glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(blockId("glass_door")),  registerSound( Blocks.GLASS, false)));

    public static final RegistryObject<Block> GLASS_TRAPDOOR = registerBlock("glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(blockId("glass_trapdoor")),  registerSound( Blocks.GLASS, false)));

    public static final RegistryObject<Block> BEDROCK_DOOR = registerBlock("bedrock_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK).setId(blockId("bedrock_door")),  registerSound( Blocks.BEDROCK, true)));

    public static final RegistryObject<Block> BEDROCK_TRAPDOOR = registerBlock("bedrock_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK).setId(blockId("bedrock_trapdoor")),  registerSound( Blocks.BEDROCK, true)));

    public static final RegistryObject<Block> SPONGE_DOOR = registerBlock("sponge_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPONGE).setId(blockId("sponge_door")),  registerSound( Blocks.SPONGE, false)));

    public static final RegistryObject<Block> SPONGE_TRAPDOOR = registerBlock("sponge_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPONGE).setId(blockId("sponge_trapdoor")),  registerSound( Blocks.SPONGE, false)));

    public static final RegistryObject<Block> DRIPSTONE_DOOR = registerBlock("dripstone_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).setId(blockId("dripstone_door")),   registerSound( Blocks.DRIPSTONE_BLOCK, false)));

    public static final RegistryObject<Block> DRIPSTONE_TRAPDOOR = registerBlock("dripstone_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).setId(blockId("dripstone_trapdoor")),  registerSound( Blocks.DRIPSTONE_BLOCK, false)));

    public static final RegistryObject<Block> MUD_BRICK_DOOR = registerBlock("mud_brick_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(blockId("mud_brick_door")),  registerSound( Blocks.MUD_BRICKS, false)));

    public static final RegistryObject<Block> MUD_BRICK_TRAPDOOR = registerBlock("mud_brick_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(blockId("mud_brick_trapdoor")),  registerSound( Blocks.MUD_BRICKS, false)));

    public static final RegistryObject<Block> SCULK_DOOR = registerBlock("sculk_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SCULK).setId(blockId("sculk_door")),  registerSound( Blocks.SCULK, false)));

    public static final RegistryObject<Block> SCULK_TRAPDOOR = registerBlock("sculk_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SCULK).setId(blockId("sculk_trapdoor")),  registerSound( Blocks.SCULK, false)));

    public static final RegistryObject<Block> BLACK_STAINED_GLASS_DOOR = registerBlock("black_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS).setId(blockId("black_stained_glass_door")),  registerSound( Blocks.BLACK_STAINED_GLASS, false)));

    public static final RegistryObject<Block> BLACK_STAINED_GLASS_TRAPDOOR = registerBlock("black_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS).setId(blockId("black_stained_glass_trapdoor")),  registerSound( Blocks.BLACK_STAINED_GLASS, false)));

    public static final RegistryObject<Block> BLUE_STAINED_GLASS_DOOR = registerBlock("blue_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_STAINED_GLASS).setId(blockId("blue_stained_glass_door")),  registerSound( Blocks.BLUE_STAINED_GLASS, false)));

    public static final RegistryObject<Block> BLUE_STAINED_GLASS_TRAPDOOR = registerBlock("blue_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_STAINED_GLASS).setId(blockId("blue_stained_glass_trapdoor")),  registerSound( Blocks.BLUE_STAINED_GLASS, false)));

    public static final RegistryObject<Block> BROWN_STAINED_GLASS_DOOR = registerBlock("brown_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_STAINED_GLASS).setId(blockId("brown_stained_glass_door")),  registerSound( Blocks.BROWN_STAINED_GLASS, false)));

    public static final RegistryObject<Block> BROWN_STAINED_GLASS_TRAPDOOR = registerBlock("brown_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_STAINED_GLASS).setId(blockId("brown_stained_glass_trapdoor")),  registerSound( Blocks.BROWN_STAINED_GLASS, false)));

    public static final RegistryObject<Block> CYAN_STAINED_GLASS_DOOR = registerBlock("cyan_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_STAINED_GLASS).setId(blockId("cyan_stained_glass_door")),  registerSound( Blocks.CYAN_STAINED_GLASS, false)));

    public static final RegistryObject<Block> CYAN_STAINED_GLASS_TRAPDOOR = registerBlock("cyan_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_STAINED_GLASS).setId(blockId("cyan_stained_glass_trapdoor")),  registerSound( Blocks.CYAN_STAINED_GLASS, false)));

    public static final RegistryObject<Block> GRAY_STAINED_GLASS_DOOR = registerBlock("gray_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_STAINED_GLASS).setId(blockId("gray_stained_glass_door")),  registerSound( Blocks.GRAY_STAINED_GLASS, false)));

    public static final RegistryObject<Block> GRAY_STAINED_GLASS_TRAPDOOR = registerBlock("gray_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_STAINED_GLASS).setId(blockId("gray_stained_glass_trapdoor")),  registerSound( Blocks.GRAY_STAINED_GLASS, false)));

    public static final RegistryObject<Block> GREEN_STAINED_GLASS_DOOR = registerBlock("green_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_STAINED_GLASS).setId(blockId("green_stained_glass_door")),  registerSound( Blocks.GREEN_STAINED_GLASS, false)));

    public static final RegistryObject<Block> GREEN_STAINED_GLASS_TRAPDOOR = registerBlock("green_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_STAINED_GLASS).setId(blockId("green_stained_glass_trapdoor")),   registerSound( Blocks.GREEN_STAINED_GLASS, false)));


    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("light_blue_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_STAINED_GLASS).setId(blockId("light_blue_stained_glass_door")),  registerSound( Blocks.LIGHT_BLUE_STAINED_GLASS, false)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_TRAPDOOR = registerBlock("light_blue_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_STAINED_GLASS).setId(blockId("light_blue_stained_glass_trapdoor")),  registerSound( Blocks.LIGHT_BLUE_STAINED_GLASS, false)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("light_gray_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_STAINED_GLASS).setId(blockId("light_gray_stained_glass_door")),  registerSound( Blocks.LIGHT_GRAY_STAINED_GLASS, false)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_TRAPDOOR = registerBlock("light_gray_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_STAINED_GLASS).setId(blockId("light_gray_stained_glass_trapdoor")),  registerSound( Blocks.LIGHT_GRAY_STAINED_GLASS, false)));

    public static final RegistryObject<Block> LIME_STAINED_GLASS_DOOR = registerBlock("lime_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_STAINED_GLASS).setId(blockId("lime_stained_glass_door")),   registerSound( Blocks.LIME_STAINED_GLASS, false)));

    public static final RegistryObject<Block> LIME_STAINED_GLASS_TRAPDOOR = registerBlock("lime_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_STAINED_GLASS).setId(blockId("lime_stained_glass_trapdoor")),  registerSound( Blocks.LIME_STAINED_GLASS, false)));

    public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_DOOR = registerBlock("magenta_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_STAINED_GLASS).setId(blockId("magenta_stained_glass_door")),  registerSound( Blocks.MAGENTA_STAINED_GLASS, false)));

    public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_TRAPDOOR = registerBlock("magenta_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_STAINED_GLASS).setId(blockId("magenta_stained_glass_trapdoor")),  registerSound( Blocks.MAGENTA_STAINED_GLASS, false)));

    public static final RegistryObject<Block> ORANGE_STAINED_GLASS_DOOR = registerBlock("orange_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS).setId(blockId("orange_stained_glass_door")),  registerSound( Blocks.ORANGE_STAINED_GLASS, false)));

    public static final RegistryObject<Block> ORANGE_STAINED_GLASS_TRAPDOOR = registerBlock("orange_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS).setId(blockId("orange_stained_glass_trapdoor")),  registerSound( Blocks.ORANGE_STAINED_GLASS, false)));

    public static final RegistryObject<Block> PINK_STAINED_GLASS_DOOR = registerBlock("pink_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_STAINED_GLASS).setId(blockId("pink_stained_glass_door")),  registerSound( Blocks.PINK_STAINED_GLASS, false)));

    public static final RegistryObject<Block> PINK_STAINED_GLASS_TRAPDOOR = registerBlock("pink_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_STAINED_GLASS).setId(blockId("pink_stained_glass_trapdoor")),  registerSound( Blocks.PINK_STAINED_GLASS, false)));

    public static final RegistryObject<Block> PURPLE_STAINED_GLASS_DOOR = registerBlock("purple_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_STAINED_GLASS).setId(blockId("purple_stained_glass_door")),  registerSound( Blocks.PURPLE_STAINED_GLASS, false)));

    public static final RegistryObject<Block> PURPLE_STAINED_GLASS_TRAPDOOR = registerBlock("purple_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_STAINED_GLASS).setId(blockId("purple_stained_glass_trapdoor")),   registerSound( Blocks.PURPLE_STAINED_GLASS, false)));

    public static final RegistryObject<Block> RED_STAINED_GLASS_DOOR = registerBlock("red_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_STAINED_GLASS).setId(blockId("red_stained_glass_door")),  registerSound( Blocks.RED_STAINED_GLASS, false)));

    public static final RegistryObject<Block> RED_STAINED_GLASS_TRAPDOOR = registerBlock("red_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_STAINED_GLASS).setId(blockId("red_stained_glass_trapdoor")),   registerSound( Blocks.RED_STAINED_GLASS, false)));

    public static final RegistryObject<Block> WHITE_STAINED_GLASS_DOOR = registerBlock("white_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS).setId(blockId("white_stained_glass_door")), registerSound( Blocks.WHITE_STAINED_GLASS, false)));

    public static final RegistryObject<Block> WHITE_STAINED_GLASS_TRAPDOOR = registerBlock("white_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS).setId(blockId("white_stained_glass_trapdoor")),  registerSound( Blocks.WHITE_STAINED_GLASS, false)));

    public static final RegistryObject<Block> YELLOW_STAINED_GLASS_DOOR = registerBlock("yellow_stained_glass_door", () ->
            new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_STAINED_GLASS).setId(blockId("yellow_stained_glass_door")),  registerSound( Blocks.YELLOW_STAINED_GLASS, false)));

    public static final RegistryObject<Block> YELLOW_STAINED_GLASS_TRAPDOOR = registerBlock("yellow_stained_glass_trapdoor", () ->
            new CustomTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_STAINED_GLASS).setId(blockId("yellow_stained_glass_trapdoor")),   registerSound( Blocks.YELLOW_STAINED_GLASS, false)));

    public static final RegistryObject<Block> TINTED_GLASS_DOOR = registerBlock("tinted_glass_door", () ->
            new CustomTintedDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TINTED_GLASS).setId(blockId("tinted_glass_door")),  registerSound( Blocks.TINTED_GLASS, false)));

    public static final RegistryObject<Block> TINTED_GLASS_TRAPDOOR = registerBlock("tinted_glass_trapdoor", () ->
            new CustomTintedTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TINTED_GLASS).setId(blockId("tinted_glass_trapdoor")),  registerSound( Blocks.TINTED_GLASS, false)));




    /**
     * As of Minecraft 1.21.3, BlockBehaviour.Properties requires its id to be set
     * explicitly via setId(...) before the Block is constructed, otherwise a
     * NullPointerException ("Block id not set") is thrown when the block is registered.
     */
    private static ResourceKey<Block> blockId(String name) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreDoors.MODID, name));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()
                .useBlockDescriptionPrefix()
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreDoors.MODID, name)))));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }




}