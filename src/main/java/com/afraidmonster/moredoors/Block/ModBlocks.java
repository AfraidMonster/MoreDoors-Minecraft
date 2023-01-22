package com.afraidmonster.moredoors.Block;

import java.util.function.Supplier;

import com.afraidmonster.moredoors.moredoors;
import com.afraidmonster.moredoors.Item.ModCreativeModeTab;
import com.afraidmonster.moredoors.Item.ModItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    
    public static final DeferredRegister<Block> BLOCKS =
    DeferredRegister.create(ForgeRegistries.BLOCKS, moredoors.MOD_ID );

    public static final RegistryObject<Block> GOLD_DOOR = registerBlock("gold_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> DIAMOND_DOOR = registerBlock("diamond_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> LAPIS_DOOR = registerBlock("lapis_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> COPPER_DOOR = registerBlock("copper_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> NETHERITE_DOOR = registerBlock("netherite_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> EMERALD_DOOR = registerBlock("emerald_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> REDSTONE_DOOR = registerBlock("redstone_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> COAL_DOOR = registerBlock("coal_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5.0f, 6F).sound(SoundType.STONE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> STONE_DOOR = registerBlock("stone_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE)), ModCreativeModeTab.MORE_DOORS);


    public static final RegistryObject<Block> GOLD_TRAPDOOR = registerBlock("gold_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> DIAMOND_TRAPDOOR = registerBlock("diamond_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> LAPIS_TRAPDOOR = registerBlock("lapis_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> COPPER_TRAPDOOR = registerBlock("copper_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> NETHERITE_TRAPDOOR = registerBlock("netherite_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> EMERALD_TRAPDOOR = registerBlock("emerald_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> REDSTONE_TRAPDOOR = registerBlock("redstone_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> COAL_TRAPDOOR = registerBlock("coal_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5.0f, 6F).sound(SoundType.STONE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> STONE_TRAPDOOR = registerBlock("stone_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE)), ModCreativeModeTab.MORE_DOORS);


    public static final RegistryObject<Block> COBBLESTONE_DOOR = registerBlock("cobblestone_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> ANDESITE_DOOR = registerBlock("andesite_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> DIORITE_DOOR = registerBlock("diorite_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> GRANITE_DOOR = registerBlock("granite_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> SANDSTONE_DOOR = registerBlock("sandstone_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> RED_SANDSTONE_DOOR = registerBlock("red_sandstone_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_DOOR = registerBlock("cobbled_deepslate_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> CALCITE_DOOR = registerBlock("calcite_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> POLISHED_DEEPSLATE_DOOR = registerBlock("polished_deepslate_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)), ModCreativeModeTab.MORE_DOORS);


    public static final RegistryObject<Block> COBBLESTONE_TRAPDOOR = registerBlock("cobblestone_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> ANDESITE_TRAPDOOR = registerBlock("andesite_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> DIORITE_TRAPDOOR = registerBlock("diorite_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> GRANITE_TRAPDOOR = registerBlock("granite_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> SANDSTONE_TRAPDOOR = registerBlock("sandstone_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> RED_SANDSTONE_TRAPDOOR = registerBlock("red_sandstone_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_TRAPDOOR = registerBlock("cobbled_deepslate_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> CALCITE_TRAPDOOR = registerBlock("calcite_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> POLISHED_DEEPSLATE_TRAPDOOR = registerBlock("polished_deepslate_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)), ModCreativeModeTab.MORE_DOORS);


    public static final RegistryObject<Block> BASALT_DOOR = registerBlock("basalt_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.BASALT)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> BLACKSTONE_DOOR = registerBlock("blackstone_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> NETHERRACK_DOOR = registerBlock("netherrack_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> END_STONE_DOOR = registerBlock("end_stone_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> PURPUR_DOOR = registerBlock("purpur_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> QUARTZ_DOOR = registerBlock("quartz_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> NETHER_BRICK_DOOR = registerBlock("nether_brick_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> PRISMARINE_DOOR = registerBlock("prismarine_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> BOOKSHELF_DOOR = registerBlock("bookshelf_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF)), ModCreativeModeTab.MORE_DOORS);


    public static final RegistryObject<Block> BASALT_TRAPDOOR = registerBlock("basalt_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BASALT)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> BLACKSTONE_TRAPDOOR = registerBlock("blackstone_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> NETHERRACK_TRAPDOOR = registerBlock("netherrack_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> END_STONE_TRAPDOOR = registerBlock("end_stone_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> PURPUR_TRAPDOOR = registerBlock("purpur_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> QUARTZ_TRAPDOOR = registerBlock("quartz_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> NETHER_BRICK_TRAPDOOR = registerBlock("nether_brick_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> PRISMARINE_TRAPDOOR = registerBlock("prismarine_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> BOOKSHELF_TRAPDOOR = registerBlock("bookshelf_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF)), ModCreativeModeTab.MORE_DOORS);
    

    public static final RegistryObject<Block> AMETHYST_DOOR = registerBlock("amethyst_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> SMOOTH_STONE_DOOR = registerBlock("smooth_stone_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> OBSIDIAN_DOOR = registerBlock("obsidian_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(50.0f, 1200F).sound(SoundType.STONE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> BRICK_DOOR = registerBlock("brick_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> ICE_DOOR = registerBlock("ice_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.ICE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> GLASS_DOOR = registerBlock("glass_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> BEDROCK_DOOR = registerBlock("bedrock_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(-1.0f, 3600000F).sound(SoundType.STONE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> SPONGE_DOOR = registerBlock("sponge_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.SPONGE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> DRIPSTONE_DOOR = registerBlock("dripstone_door", () -> 
    new CustomDoorBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)), ModCreativeModeTab.MORE_DOORS);


    public static final RegistryObject<Block> AMETHYST_TRAPDOOR = registerBlock("amethyst_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> SMOOTH_STONE_TRAPDOOR = registerBlock("smooth_stone_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> OBSIDIAN_TRAPDOOR = registerBlock("obsidian_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(50.0f, 1200F).sound(SoundType.STONE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> BRICK_TRAPDOOR = registerBlock("brick_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> ICE_TRAPDOOR = registerBlock("ice_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.ICE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> GLASS_TRAPDOOR = registerBlock("glass_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> BEDROCK_TRAPDOOR = registerBlock("bedrock_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(-1.0f, 3600000F).sound(SoundType.STONE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> SPONGE_TRAPDOOR = registerBlock("sponge_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SPONGE)), ModCreativeModeTab.MORE_DOORS);

    public static final RegistryObject<Block> DRIPSTONE_TRAPDOOR = registerBlock("dripstone_trapdoor", () -> 
    new CustomTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)), ModCreativeModeTab.MORE_DOORS);

   



































    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
    



}
