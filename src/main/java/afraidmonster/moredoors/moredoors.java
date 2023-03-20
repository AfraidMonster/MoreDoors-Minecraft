package afraidmonster.moredoors;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class moredoors implements ModInitializer {

	public static final String MOD_ID = "moredoors";
	public static final SoundEvent METAL_OPEN = SoundEvents.BLOCK_IRON_DOOR_OPEN;
	public static final SoundEvent METAL_CLOSE = SoundEvents.BLOCK_IRON_DOOR_CLOSE;
	public static final SoundEvent NORMAL_OPEN = SoundEvents.BLOCK_WOODEN_DOOR_OPEN;
	public static final SoundEvent NORMAL_CLOSE = SoundEvents.BLOCK_WOODEN_DOOR_CLOSE;
	public static final SoundEvent METAL_TRAPDOOR_OPEN = SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN;
	public static final SoundEvent METAL_TRAPDOOR_CLOSE = SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE;
	public static final SoundEvent NORMAL_TRAPDOOR_OPEN = SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN;
	public static final SoundEvent NORMAL_TRAPDOOR_CLOSE = SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN;

	public static final ItemGroup MORE_DOORS = FabricItemGroup.builder(new Identifier("moredoors", "more_doors"))
            .icon(() -> new ItemStack(moredoors.GOLD_DOOR)) 
			.displayName(Text.literal("More Doors"))
			.entries((enabledFeatures, entries, operatorEnabled) -> {
				entries.add(moredoors.GOLD_DOOR);
				entries.add(moredoors.GOLD_TRAPDOOR);
				entries.add(moredoors.DIAMOND_DOOR);
				entries.add(moredoors.DIAMOND_TRAPDOOR);
				entries.add(moredoors.LAPIS_DOOR);
				entries.add(moredoors.LAPIS_TRAPDOOR);
				entries.add(moredoors.COPPER_DOOR);
				entries.add(moredoors.COPPER_TRAPDOOR);
				entries.add(moredoors.NETHERITE_DOOR);
				entries.add(moredoors.NETHERITE_TRAPDOOR);
				entries.add(moredoors.EMERALD_DOOR);
				entries.add(moredoors.EMERALD_TRAPDOOR);
				entries.add(moredoors.REDSTONE_DOOR);
				entries.add(moredoors.REDSTONE_TRAPDOOR);
				entries.add(moredoors.COAL_DOOR);
				entries.add(moredoors.COAL_TRAPDOOR);
				entries.add(moredoors.STONE_DOOR);
				entries.add(moredoors.STONE_TRAPDOOR);
				entries.add(moredoors.COBBLESTONE_DOOR);
				entries.add(moredoors.COBBLESTONE_TRAPDOOR);
				entries.add(moredoors.ANDESITE_DOOR);
				entries.add(moredoors.ANDESITE_TRAPDOOR);
				entries.add(moredoors.DIORITE_DOOR);
				entries.add(moredoors.DIORITE_TRAPDOOR);
				entries.add(moredoors.GRANITE_DOOR);
				entries.add(moredoors.GRANITE_TRAPDOOR);
				entries.add(moredoors.SANDSTONE_DOOR);
				entries.add(moredoors.SANDSTONE_TRAPDOOR);
				entries.add(moredoors.RED_SANDSTONE_DOOR);
				entries.add(moredoors.RED_SANDSTONE_TRAPDOOR);
				entries.add(moredoors.COBBLED_DEEPSLATE_DOOR);
				entries.add(moredoors.COBBLED_DEEPSLATE_TRAPDOOR);
				entries.add(moredoors.CALCITE_DOOR);
				entries.add(moredoors.CALCITE_TRAPDOOR);
				entries.add(moredoors.POLISHED_DEEPSLATE_DOOR);
				entries.add(moredoors.POLISHED_DEEPSLATE_TRAPDOOR);
				entries.add(moredoors.BASALT_DOOR);
				entries.add(moredoors.BASALT_TRAPDOOR);
				entries.add(moredoors.BLACKSTONE_DOOR);
				entries.add(moredoors.BLACKSTONE_TRAPDOOR);
				entries.add(moredoors.NETHERRACK_DOOR);
				entries.add(moredoors.NETHERRACK_TRAPDOOR);
				entries.add(moredoors.END_STONE_DOOR);
				entries.add(moredoors.END_STONE_TRAPDOOR);
				entries.add(moredoors.PURPUR_DOOR);
				entries.add(moredoors.PURPUR_TRAPDOOR);
				entries.add(moredoors.QUARTZ_DOOR);
				entries.add(moredoors.QUARTZ_TRAPDOOR);
				entries.add(moredoors.NETHER_BRICK_DOOR);
				entries.add(moredoors.NETHER_BRICK_TRAPDOOR);
				entries.add(moredoors.PRISMARINE_DOOR);
				entries.add(moredoors.PRISMARINE_TRAPDOOR);
				entries.add(moredoors.BOOKSHELF_DOOR);
				entries.add(moredoors.BOOKSHELF_TRAPDOOR);
				entries.add(moredoors.AMETHYST_DOOR);
				entries.add(moredoors.AMETHYST_TRAPDOOR);
				entries.add(moredoors.SMOOTH_STONE_DOOR);
				entries.add(moredoors.SMOOTH_STONE_TRAPDOOR);
				entries.add(moredoors.OBSIDIAN_DOOR);
				entries.add(moredoors.OBSIDIAN_TRAPDOOR);
				entries.add(moredoors.BRICK_DOOR);
				entries.add(moredoors.BRICK_TRAPDOOR);
				entries.add(moredoors.ICE_DOOR);
				entries.add(moredoors.ICE_TRAPDOOR);
				entries.add(moredoors.GLASS_DOOR);
				entries.add(moredoors.GLASS_TRAPDOOR);
				entries.add(moredoors.BEDROCK_DOOR);
				entries.add(moredoors.BEDROCK_TRAPDOOR);
				entries.add(moredoors.SPONGE_DOOR);
				entries.add(moredoors.SPONGE_TRAPDOOR);
				entries.add(moredoors.DRIPSTONE_DOOR);
				entries.add(moredoors.DRIPSTONE_TRAPDOOR);
				entries.add(moredoors.MUD_BRICK_DOOR);
				entries.add(moredoors.MUD_BRICK_TRAPDOOR);
				entries.add(moredoors.BLACK_STAINED_GLASS_DOOR); 
				entries.add(moredoors.BLACK_STAINED_GLASS_TRAPDOOR);
				entries.add(moredoors.BLUE_STAINED_GLASS_DOOR);
				entries.add(moredoors.BLUE_STAINED_GLASS_TRAPDOOR);
				entries.add(moredoors.BROWN_STAINED_GLASS_DOOR);
				entries.add(moredoors.BROWN_STAINED_GLASS_TRAPDOOR);
				entries.add(moredoors.CYAN_STAINED_GLASS_DOOR);
				entries.add(moredoors.CYAN_STAINED_GLASS_TRAPDOOR);
				entries.add(moredoors.GRAY_STAINED_GLASS_DOOR);
				entries.add(moredoors.GRAY_STAINED_GLASS_TRAPDOOR);
				entries.add(moredoors.GREEN_STAINED_GLASS_DOOR);
				entries.add(moredoors.GREEN_STAINED_GLASS_TRAPDOOR);
				entries.add(moredoors.LIGHT_BLUE_STAINED_GLASS_DOOR);
				entries.add(moredoors.LIGHT_BLUE_STAINED_GLASS_TRAPDOOR);
				entries.add(moredoors.LIGHT_GRAY_STAINED_GLASS_DOOR);
				entries.add(moredoors.LIGHT_GRAY_STAINED_GLASS_TRAPDOOR);
				entries.add(moredoors.LIME_STAINED_GLASS_DOOR);
				entries.add(moredoors.LIME_STAINED_GLASS_TRAPDOOR);
				entries.add(moredoors.MAGENTA_STAINED_GLASS_DOOR);
				entries.add(moredoors.MAGENTA_STAINED_GLASS_TRAPDOOR);
				entries.add(moredoors.ORANGE_STAINED_GLASS_DOOR);
				entries.add(moredoors.ORANGE_STAINED_GLASS_TRAPDOOR);
				entries.add(moredoors.PINK_STAINED_GLASS_DOOR);
				entries.add(moredoors.PINK_STAINED_GLASS_TRAPDOOR);
				entries.add(moredoors.PURPLE_STAINED_GLASS_DOOR);
				entries.add(moredoors.PURPLE_STAINED_GLASS_TRAPDOOR);
				entries.add(moredoors.RED_STAINED_GLASS_DOOR);
				entries.add(moredoors.RED_STAINED_GLASS_TRAPDOOR);
				entries.add(moredoors.WHITE_STAINED_GLASS_DOOR);
				entries.add(moredoors.WHITE_STAINED_GLASS_TRAPDOOR);
				entries.add(moredoors.YELLOW_STAINED_GLASS_DOOR);
				entries.add(moredoors.YELLOW_STAINED_GLASS_TRAPDOOR);
				entries.add(moredoors.TINTED_GLASS_DOOR);
				entries.add(moredoors.TINTED_GLASS_TRAPDOOR);

			})

            .build();
	//Metal Doors
	public static final Block GOLD_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK), METAL_CLOSE, METAL_OPEN);
	public static final Block GOLD_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN);
	
	public static final Block DIAMOND_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK), METAL_CLOSE, METAL_OPEN);
	public static final Block DIAMOND_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN);
	
	public static final Block LAPIS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK), METAL_CLOSE, METAL_OPEN);
	public static final Block LAPIS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN);
	
	public static final Block COPPER_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK), METAL_CLOSE, METAL_OPEN);
	public static final Block COPPER_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN);
	
	public static final Block NETHERITE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK), METAL_CLOSE, METAL_OPEN);
	public static final Block NETHERITE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN);
	
	public static final Block EMERALD_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK), METAL_CLOSE, METAL_OPEN);
	public static final Block EMERALD_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN);
	
	public static final Block REDSTONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.REDSTONE_BLOCK), METAL_CLOSE, METAL_OPEN);
	public static final Block REDSTONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.REDSTONE_BLOCK), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN);
	
	public static final Block COAL_DOOR = new CustomDoorBlock(FabricBlockSettings.of(Material.METAL).hardness(5.0f).sounds(BlockSoundGroup.STONE).resistance(6F), METAL_CLOSE, METAL_OPEN);
	public static final Block COAL_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.of(Material.METAL).hardness(5.0f).sounds(BlockSoundGroup.STONE).resistance(6F), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN);

	//Other Doors
	public static final Block STONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.STONE), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block STONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.STONE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block COBBLESTONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block COBBLESTONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block ANDESITE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block ANDESITE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block DIORITE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.POLISHED_DIORITE), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block DIORITE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.POLISHED_DIORITE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block GRANITE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block GRANITE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block SANDSTONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.SANDSTONE), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block SANDSTONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.SANDSTONE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block RED_SANDSTONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.RED_SANDSTONE), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block RED_SANDSTONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.RED_SANDSTONE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block COBBLED_DEEPSLATE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block COBBLED_DEEPSLATE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block CALCITE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.CALCITE), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block CALCITE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.CALCITE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block POLISHED_DEEPSLATE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block POLISHED_DEEPSLATE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block BASALT_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.BASALT), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block BASALT_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.BASALT), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block BLACKSTONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block BLACKSTONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block NETHERRACK_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.NETHERRACK), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block NETHERRACK_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.NETHERRACK), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block END_STONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.END_STONE), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block END_STONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.END_STONE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block PURPUR_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block PURPUR_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block QUARTZ_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block QUARTZ_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK), NORMAL_TRAPDOOR_OPEN, NORMAL_TRAPDOOR_CLOSE);

	public static final Block NETHER_BRICK_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block NETHER_BRICK_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block PRISMARINE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.PRISMARINE_BRICKS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block PRISMARINE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.PRISMARINE_BRICKS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block BOOKSHELF_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.BOOKSHELF), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block BOOKSHELF_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.BOOKSHELF), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block AMETHYST_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block AMETHYST_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	
	public static final Block SMOOTH_STONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.SMOOTH_STONE), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block SMOOTH_STONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.SMOOTH_STONE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	
	public static final Block OBSIDIAN_DOOR = new CustomDoorBlock(FabricBlockSettings.of(Material.METAL).hardness(50.0f).sounds(BlockSoundGroup.STONE).resistance(1200F),METAL_CLOSE, METAL_OPEN);
	public static final Block OBSIDIAN_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.of(Material.METAL).hardness(50.0f).sounds(BlockSoundGroup.STONE).resistance(1200F), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN);

	public static final Block BRICK_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.BRICKS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block BRICK_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.BRICKS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block ICE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.ICE), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block ICE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.ICE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block BEDROCK_DOOR = new CustomDoorBlock(FabricBlockSettings.of(Material.METAL).hardness(-1.0f).sounds(BlockSoundGroup.STONE).resistance(3600000F), METAL_CLOSE, METAL_OPEN);
	public static final Block BEDROCK_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.of(Material.METAL).hardness(-1.0f).sounds(BlockSoundGroup.STONE).resistance(3600000F), METAL_TRAPDOOR_CLOSE, METAL_TRAPDOOR_OPEN);

	public static final Block SPONGE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.SPONGE), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block SPONGE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.SPONGE), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block DRIPSTONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block DRIPSTONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block MUD_BRICK_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.MUD_BRICKS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block MUD_BRICK_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.MUD_BRICKS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	//Glass Doors
	public static final Block BLACK_STAINED_GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.BLACK_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block BLACK_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.BLACK_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);
	
	public static final Block BLUE_STAINED_GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.BLUE_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block BLUE_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.BLUE_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);
	
	public static final Block BROWN_STAINED_GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.BROWN_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block BROWN_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.BROWN_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block CYAN_STAINED_GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.CYAN_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block CYAN_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.CYAN_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block GRAY_STAINED_GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.GRAY_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block GRAY_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.GRAY_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block GREEN_STAINED_GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.GREEN_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block GREEN_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.GREEN_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block LIGHT_BLUE_STAINED_GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block LIGHT_BLUE_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block LIGHT_GRAY_STAINED_GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block LIGHT_GRAY_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block LIME_STAINED_GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.LIME_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block LIME_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.LIME_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block MAGENTA_STAINED_GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.MAGENTA_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block MAGENTA_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.MAGENTA_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block ORANGE_STAINED_GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.ORANGE_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block ORANGE_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.ORANGE_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block PINK_STAINED_GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.PINK_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block PINK_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.PINK_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block PURPLE_STAINED_GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.PURPLE_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block PURPLE_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.PURPLE_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block RED_STAINED_GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.RED_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block RED_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.RED_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block WHITE_STAINED_GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.WHITE_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block WHITE_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.WHITE_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block YELLOW_STAINED_GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.YELLOW_STAINED_GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block YELLOW_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.YELLOW_STAINED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	public static final Block TINTED_GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.TINTED_GLASS), NORMAL_CLOSE, NORMAL_OPEN);
	public static final Block TINTED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.TINTED_GLASS), NORMAL_TRAPDOOR_CLOSE, NORMAL_TRAPDOOR_OPEN);

	

	

	

	

	
	@Override
	public void onInitialize() {
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "gold_door"), GOLD_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "gold_door"), new BlockItem(GOLD_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "diamond_door"), DIAMOND_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "diamond_door"), new BlockItem(DIAMOND_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "lapis_door"), LAPIS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "lapis_door"), new BlockItem(LAPIS_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "copper_door"), COPPER_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "copper_door"), new BlockItem(COPPER_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "netherite_door"), NETHERITE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "netherite_door"), new BlockItem(NETHERITE_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "emerald_door"), EMERALD_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "emerald_door"), new BlockItem(EMERALD_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "redstone_door"), REDSTONE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "redstone_door"), new BlockItem(REDSTONE_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "coal_door"), COAL_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "coal_door"), new BlockItem(COAL_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "stone_door"), STONE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "stone_door"), new BlockItem(STONE_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "gold_trapdoor"), GOLD_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "gold_trapdoor"), new BlockItem(GOLD_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "diamond_trapdoor"), DIAMOND_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "diamond_trapdoor"), new BlockItem(DIAMOND_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "lapis_trapdoor"), LAPIS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "lapis_trapdoor"), new BlockItem(LAPIS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "copper_trapdoor"), COPPER_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "copper_trapdoor"), new BlockItem(COPPER_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "netherite_trapdoor"), NETHERITE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "netherite_trapdoor"), new BlockItem(NETHERITE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "emerald_trapdoor"), EMERALD_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "emerald_trapdoor"), new BlockItem(EMERALD_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "redstone_trapdoor"), REDSTONE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "redstone_trapdoor"), new BlockItem(REDSTONE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "coal_trapdoor"), COAL_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "coal_trapdoor"), new BlockItem(COAL_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "stone_trapdoor"), STONE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "stone_trapdoor"), new BlockItem(STONE_TRAPDOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "cobblestone_door"), COBBLESTONE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "cobblestone_door"), new BlockItem(COBBLESTONE_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "andesite_door"), ANDESITE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "andesite_door"), new BlockItem(ANDESITE_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "diorite_door"), DIORITE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "diorite_door"), new BlockItem(DIORITE_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "granite_door"), GRANITE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "granite_door"), new BlockItem(GRANITE_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "sandstone_door"), SANDSTONE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "sandstone_door"), new BlockItem(SANDSTONE_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "red_sandstone_door"), RED_SANDSTONE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "red_sandstone_door"), new BlockItem(RED_SANDSTONE_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "cobbled_deepslate_door"), COBBLED_DEEPSLATE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "cobbled_deepslate_door"), new BlockItem(COBBLED_DEEPSLATE_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "calcite_door"), CALCITE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "calcite_door"), new BlockItem(CALCITE_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "polished_deepslate_door"), POLISHED_DEEPSLATE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "polished_deepslate_door"), new BlockItem(POLISHED_DEEPSLATE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "cobblestone_trapdoor"), COBBLESTONE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "cobblestone_trapdoor"), new BlockItem(COBBLESTONE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "andesite_trapdoor"), ANDESITE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "andesite_trapdoor"), new BlockItem(ANDESITE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "diorite_trapdoor"), DIORITE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "diorite_trapdoor"), new BlockItem(DIORITE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "granite_trapdoor"), GRANITE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "granite_trapdoor"), new BlockItem(GRANITE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "sandstone_trapdoor"), SANDSTONE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "sandstone_trapdoor"), new BlockItem(SANDSTONE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "red_sandstone_trapdoor"), RED_SANDSTONE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "red_sandstone_trapdoor"), new BlockItem(RED_SANDSTONE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "cobbled_deepslate_trapdoor"), COBBLED_DEEPSLATE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "cobbled_deepslate_trapdoor"), new BlockItem(COBBLED_DEEPSLATE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "calcite_trapdoor"), CALCITE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "calcite_trapdoor"), new BlockItem(CALCITE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "polished_deepslate_trapdoor"), POLISHED_DEEPSLATE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "polished_deepslate_trapdoor"), new BlockItem(POLISHED_DEEPSLATE_TRAPDOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "basalt_door"), BASALT_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "basalt_door"), new BlockItem(BASALT_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "blackstone_door"), BLACKSTONE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "blackstone_door"), new BlockItem(BLACKSTONE_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "netherrack_door"), NETHERRACK_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "netherrack_door"), new BlockItem(NETHERRACK_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "end_stone_door"), END_STONE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "end_stone_door"), new BlockItem(END_STONE_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "purpur_door"), PURPUR_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "purpur_door"), new BlockItem(PURPUR_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "quartz_door"), QUARTZ_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "quartz_door"), new BlockItem(QUARTZ_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "nether_brick_door"), NETHER_BRICK_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "nether_brick_door"), new BlockItem(NETHER_BRICK_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "prismarine_door"), PRISMARINE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "prismarine_door"), new BlockItem(PRISMARINE_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "bookshelf_door"), BOOKSHELF_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "bookshelf_door"), new BlockItem(BOOKSHELF_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "basalt_trapdoor"), BASALT_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "basalt_trapdoor"), new BlockItem(BASALT_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "blackstone_trapdoor"), BLACKSTONE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "blackstone_trapdoor"), new BlockItem(BLACKSTONE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "netherrack_trapdoor"), NETHERRACK_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "netherrack_trapdoor"), new BlockItem(NETHERRACK_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "end_stone_trapdoor"), END_STONE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "end_stone_trapdoor"), new BlockItem(END_STONE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "purpur_trapdoor"), PURPUR_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "purpur_trapdoor"), new BlockItem(PURPUR_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "quartz_trapdoor"), QUARTZ_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "quartz_trapdoor"), new BlockItem(QUARTZ_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "nether_brick_trapdoor"), NETHER_BRICK_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "nether_brick_trapdoor"), new BlockItem(NETHER_BRICK_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "prismarine_trapdoor"), PRISMARINE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "prismarine_trapdoor"), new BlockItem(PRISMARINE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "bookshelf_trapdoor"), BOOKSHELF_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "bookshelf_trapdoor"), new BlockItem(BOOKSHELF_TRAPDOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "amethyst_door"), AMETHYST_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "amethyst_door"), new BlockItem(AMETHYST_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "smooth_stone_door"), SMOOTH_STONE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "smooth_stone_door"), new BlockItem(SMOOTH_STONE_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "obsidian_door"), OBSIDIAN_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "obsidian_door"), new BlockItem(OBSIDIAN_DOOR, new Item.Settings()));
	
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "brick_door"), BRICK_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "brick_door"), new BlockItem(BRICK_DOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "ice_door"), ICE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "ice_door"), new BlockItem(ICE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "glass_door"), GLASS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "glass_door"), new BlockItem(GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "bedrock_door"), BEDROCK_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "bedrock_door"), new BlockItem(BEDROCK_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "sponge_door"), SPONGE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "sponge_door"), new BlockItem(SPONGE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "dripstone_door"), DRIPSTONE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "dripstone_door"), new BlockItem(DRIPSTONE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "mud_brick_door"),MUD_BRICK_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "mud_brick_door"), new BlockItem(MUD_BRICK_DOOR, new Item.Settings()));
		
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "amethyst_trapdoor"), AMETHYST_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "amethyst_trapdoor"), new BlockItem(AMETHYST_TRAPDOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "smooth_stone_trapdoor"), SMOOTH_STONE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "smooth_stone_trapdoor"), new BlockItem(SMOOTH_STONE_TRAPDOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "obsidian_trapdoor"), OBSIDIAN_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "obsidian_trapdoor"), new BlockItem(OBSIDIAN_TRAPDOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "brick_trapdoor"), BRICK_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "brick_trapdoor"), new BlockItem(BRICK_TRAPDOOR, new Item.Settings()));
		
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "ice_trapdoor"), ICE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "ice_trapdoor"), new BlockItem(ICE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "glass_trapdoor"), GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "glass_trapdoor"), new BlockItem(GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "bedrock_trapdoor"), BEDROCK_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "bedrock_trapdoor"), new BlockItem(BEDROCK_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "sponge_trapdoor"), SPONGE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "sponge_trapdoor"), new BlockItem(SPONGE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "dripstone_trapdoor"), DRIPSTONE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "dripstone_trapdoor"), new BlockItem(DRIPSTONE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("moredoors", "mud_brick_trapdoor"), MUD_BRICK_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "mud_brick_trapdoor"), new BlockItem(MUD_BRICK_TRAPDOOR, new Item.Settings()));


		Registry.register(Registries.BLOCK, new Identifier("moredoors", "black_stained_glass_door"), BLACK_STAINED_GLASS_DOOR); 
		Registry.register(Registries.ITEM, new Identifier("moredoors", "black_stained_glass_door"), new BlockItem(BLACK_STAINED_GLASS_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "black_stained_glass_trapdoor"), BLACK_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "black_stained_glass_trapdoor"), new BlockItem(BLACK_STAINED_GLASS_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "blue_stained_glass_door"), BLUE_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "blue_stained_glass_door"), new BlockItem(BLUE_STAINED_GLASS_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "blue_stained_glass_trapdoor"), BLUE_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "blue_stained_glass_trapdoor"), new BlockItem(BLUE_STAINED_GLASS_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "brown_stained_glass_door"), BROWN_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "brown_stained_glass_door"), new BlockItem(BROWN_STAINED_GLASS_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "brown_stained_glass_trapdoor"), BROWN_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "brown_stained_glass_trapdoor"), new BlockItem(BROWN_STAINED_GLASS_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "cyan_stained_glass_door"), CYAN_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "cyan_stained_glass_door"), new BlockItem(CYAN_STAINED_GLASS_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "cyan_stained_glass_trapdoor"), CYAN_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "cyan_stained_glass_trapdoor"), new BlockItem(CYAN_STAINED_GLASS_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "gray_stained_glass_door"), GRAY_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "gray_stained_glass_door"), new BlockItem(GRAY_STAINED_GLASS_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "gray_stained_glass_trapdoor"), GRAY_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "gray_stained_glass_trapdoor"), new BlockItem(GRAY_STAINED_GLASS_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "green_stained_glass_door"), GREEN_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "green_stained_glass_door"), new BlockItem(GREEN_STAINED_GLASS_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "green_stained_glass_trapdoor"), GREEN_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "green_stained_glass_trapdoor"), new BlockItem(GREEN_STAINED_GLASS_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "light_blue_stained_glass_door"), LIGHT_BLUE_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "light_blue_stained_glass_door"), new BlockItem(LIGHT_BLUE_STAINED_GLASS_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "light_blue_stained_glass_trapdoor"), LIGHT_BLUE_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "light_blue_stained_glass_trapdoor"), new BlockItem(LIGHT_BLUE_STAINED_GLASS_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "light_gray_stained_glass_door"), LIGHT_GRAY_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "light_gray_stained_glass_door"), new BlockItem(LIGHT_GRAY_STAINED_GLASS_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "light_gray_stained_glass_trapdoor"), LIGHT_GRAY_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "light_gray_stained_glass_trapdoor"), new BlockItem(LIGHT_GRAY_STAINED_GLASS_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "lime_stained_glass_door"), LIME_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "lime_stained_glass_door"), new BlockItem(LIME_STAINED_GLASS_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "lime_stained_glass_trapdoor"), LIME_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "lime_stained_glass_trapdoor"), new BlockItem(LIME_STAINED_GLASS_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "magenta_stained_glass_door"), MAGENTA_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "magenta_stained_glass_door"), new BlockItem(MAGENTA_STAINED_GLASS_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "magenta_stained_glass_trapdoor"), MAGENTA_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "magenta_stained_glass_trapdoor"), new BlockItem(MAGENTA_STAINED_GLASS_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "orange_stained_glass_door"), ORANGE_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "orange_stained_glass_door"), new BlockItem(ORANGE_STAINED_GLASS_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "orange_stained_glass_trapdoor"), ORANGE_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "orange_stained_glass_trapdoor"), new BlockItem(ORANGE_STAINED_GLASS_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "pink_stained_glass_door"), PINK_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "pink_stained_glass_door"), new BlockItem(PINK_STAINED_GLASS_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "pink_stained_glass_trapdoor"), PINK_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "pink_stained_glass_trapdoor"), new BlockItem(PINK_STAINED_GLASS_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "purple_stained_glass_door"), PURPLE_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "purple_stained_glass_door"), new BlockItem(PURPLE_STAINED_GLASS_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "purple_stained_glass_trapdoor"), PURPLE_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "purple_stained_glass_trapdoor"), new BlockItem(PURPLE_STAINED_GLASS_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "red_stained_glass_door"), RED_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "red_stained_glass_door"), new BlockItem(RED_STAINED_GLASS_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "red_stained_glass_trapdoor"), RED_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "red_stained_glass_trapdoor"), new BlockItem(RED_STAINED_GLASS_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "white_stained_glass_door"), WHITE_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "white_stained_glass_door"), new BlockItem(WHITE_STAINED_GLASS_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "white_stained_glass_trapdoor"), WHITE_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "white_stained_glass_trapdoor"), new BlockItem(WHITE_STAINED_GLASS_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "yellow_stained_glass_door"), YELLOW_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "yellow_stained_glass_door"), new BlockItem(YELLOW_STAINED_GLASS_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "yellow_stained_glass_trapdoor"), YELLOW_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "yellow_stained_glass_trapdoor"), new BlockItem(YELLOW_STAINED_GLASS_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "tinted_glass_door"), TINTED_GLASS_DOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "tinted_glass_door"), new BlockItem(TINTED_GLASS_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("moredoors", "tinted_glass_trapdoor"), TINTED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("moredoors", "tinted_glass_trapdoor"), new BlockItem(TINTED_GLASS_TRAPDOOR, new Item.Settings()));

		
		
		











		

















		
















































		
	}

	}

