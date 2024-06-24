package afraidmonster.moredoors;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class moredoors implements ModInitializer {

	public static final String MOD_ID = "moredoors";

	public static final RegistryKey<ItemGroup> MORE_DOORS = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MOD_ID, "more_doors"));

	public static final BlockSetTypeBuilder METAL_TYPE = new BlockSetTypeBuilder();
	public static final BlockSetTypeBuilder WOOD_TYPE = new BlockSetTypeBuilder();

	//Metal Doors
	public static BlockSetType registerSound(AbstractBlock.AbstractBlockState block, Boolean isMetal)  {

		if(isMetal){
			 METAL_TYPE
					 .openableByHand(false)
					.openableByWindCharge(false)
					.soundGroup(block.getSoundGroup())
					.doorCloseSound(SoundEvents.BLOCK_IRON_DOOR_CLOSE)
					.doorOpenSound(SoundEvents.BLOCK_IRON_DOOR_OPEN)
					.trapdoorCloseSound(SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE)
					.trapdoorOpenSound(SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN);
			 return METAL_TYPE.register(Identifier.of("moredoors", "blockset_metal"));


		}else{
			WOOD_TYPE
					.openableByHand(true)
					.openableByWindCharge(true)
					.soundGroup(block.getSoundGroup())
					.doorCloseSound(SoundEvents.BLOCK_WOODEN_DOOR_CLOSE)
					.doorOpenSound(SoundEvents.BLOCK_WOODEN_DOOR_OPEN)
					.trapdoorCloseSound(SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE)
					.trapdoorOpenSound(SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN);
			return WOOD_TYPE.register(Identifier.of("moredoors", "blockset_wood"));
		}
	}

	public static final Block GOLD_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK), registerSound(Blocks.GOLD_BLOCK.getDefaultState(), true));
	public static final Block GOLD_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK), registerSound(Blocks.GOLD_BLOCK.getDefaultState(), true));

	public static final Block DIAMOND_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK), registerSound(Blocks.DIAMOND_BLOCK.getDefaultState(), true));
	public static final Block DIAMOND_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK), registerSound(Blocks.DIAMOND_BLOCK.getDefaultState(), true));

	public static final Block LAPIS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK), registerSound(Blocks.LAPIS_BLOCK.getDefaultState(), true));
	public static final Block LAPIS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK), registerSound(Blocks.LAPIS_BLOCK.getDefaultState(), true));


	public static final Block NETHERITE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK), registerSound(Blocks.NETHERITE_BLOCK.getDefaultState(), true));
	public static final Block NETHERITE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK), registerSound(Blocks.NETHERITE_BLOCK.getDefaultState(), true));

	public static final Block EMERALD_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK), registerSound(Blocks.EMERALD_BLOCK.getDefaultState(), true));
	public static final Block EMERALD_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK), registerSound(Blocks.EMERALD_BLOCK.getDefaultState(), true));

	public static final Block REDSTONE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK), registerSound(Blocks.REDSTONE_BLOCK.getDefaultState(), true));
	public static final Block REDSTONE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK), registerSound(Blocks.REDSTONE_BLOCK.getDefaultState(), true));

	public static final Block COAL_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.COAL_BLOCK), registerSound(Blocks.COAL_BLOCK.getDefaultState(), true));
	public static final Block COAL_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.COAL_BLOCK), registerSound(Blocks.COAL_BLOCK.getDefaultState(), true));

	//Other Doors
	public static final Block STONE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.STONE), registerSound(Blocks.STONE.getDefaultState(), false));
	public static final Block STONE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.STONE), registerSound(Blocks.STONE.getDefaultState(), false));

	public static final Block COBBLESTONE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE), registerSound(Blocks.COBBLESTONE.getDefaultState(), false));
	public static final Block COBBLESTONE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE), registerSound(Blocks.COBBLESTONE.getDefaultState(), false));

	public static final Block ANDESITE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE), registerSound(Blocks.POLISHED_ANDESITE.getDefaultState(), false));
	public static final Block ANDESITE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE), registerSound(Blocks.POLISHED_ANDESITE.getDefaultState(), false));

	public static final Block DIORITE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE), registerSound(Blocks.POLISHED_DIORITE.getDefaultState(), false));
	public static final Block DIORITE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE), registerSound(Blocks.POLISHED_DIORITE.getDefaultState(), false));

	public static final Block GRANITE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE), registerSound(Blocks.POLISHED_GRANITE.getDefaultState(), false));
	public static final Block GRANITE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE), registerSound(Blocks.POLISHED_GRANITE.getDefaultState(), false));

	public static final Block SANDSTONE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE), registerSound(Blocks.SANDSTONE.getDefaultState(), false));
	public static final Block SANDSTONE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE), registerSound(Blocks.SANDSTONE.getDefaultState(), false));

	public static final Block RED_SANDSTONE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE), registerSound(Blocks.RED_SANDSTONE.getDefaultState(), false));
	public static final Block RED_SANDSTONE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE), registerSound(Blocks.RED_SANDSTONE.getDefaultState(), false));

	public static final Block COBBLED_DEEPSLATE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE), registerSound(Blocks.COBBLED_DEEPSLATE.getDefaultState(), false));
	public static final Block COBBLED_DEEPSLATE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE), registerSound(Blocks.COBBLED_DEEPSLATE.getDefaultState(), false));

	public static final Block CALCITE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.CALCITE), registerSound(Blocks.CALCITE.getDefaultState(), false));
	public static final Block CALCITE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.CALCITE), registerSound(Blocks.CALCITE.getDefaultState(), false));

	public static final Block POLISHED_DEEPSLATE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE), registerSound(Blocks.POLISHED_DEEPSLATE.getDefaultState(), false));
	public static final Block POLISHED_DEEPSLATE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE), registerSound(Blocks.POLISHED_DEEPSLATE.getDefaultState(), false));

	public static final Block BASALT_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.BASALT), registerSound(Blocks.BASALT.getDefaultState(), false));
	public static final Block BASALT_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.BASALT), registerSound(Blocks.BASALT.getDefaultState(), false));

	public static final Block BLACKSTONE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.BLACKSTONE), registerSound(Blocks.BLACKSTONE.getDefaultState(), false));
	public static final Block BLACKSTONE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.BLACKSTONE), registerSound(Blocks.BLACKSTONE.getDefaultState(), false));

	public static final Block NETHERRACK_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK), registerSound(Blocks.NETHERRACK.getDefaultState(), false));
	public static final Block NETHERRACK_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK), registerSound(Blocks.NETHERRACK.getDefaultState(), false));

	public static final Block END_STONE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.END_STONE), registerSound(Blocks.END_STONE.getDefaultState(), false));
	public static final Block END_STONE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.END_STONE), registerSound(Blocks.END_STONE.getDefaultState(), false));

	public static final Block PURPUR_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK), registerSound(Blocks.PURPUR_BLOCK.getDefaultState(), false));
	public static final Block PURPUR_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK), registerSound(Blocks.PURPUR_BLOCK.getDefaultState(), false));

	public static final Block QUARTZ_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK), registerSound(Blocks.QUARTZ_BLOCK.getDefaultState(), false));
	public static final Block QUARTZ_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK), registerSound(Blocks.QUARTZ_BLOCK.getDefaultState(), false));

	public static final Block NETHER_BRICK_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS), registerSound(Blocks.NETHER_BRICKS.getDefaultState(), false));
	public static final Block NETHER_BRICK_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS), registerSound(Blocks.NETHER_BRICKS.getDefaultState(), false));

	public static final Block PRISMARINE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS), registerSound(Blocks.PRISMARINE_BRICKS.getDefaultState(), false));
	public static final Block PRISMARINE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS), registerSound(Blocks.PRISMARINE_BRICKS.getDefaultState(), false));

	public static final Block BOOKSHELF_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.BOOKSHELF), registerSound(Blocks.BOOKSHELF.getDefaultState(), false));
	public static final Block BOOKSHELF_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.BOOKSHELF), registerSound(Blocks.BOOKSHELF.getDefaultState(), false));

	public static final Block AMETHYST_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK), registerSound(Blocks.AMETHYST_BLOCK.getDefaultState(), false));
	public static final Block AMETHYST_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK), registerSound(Blocks.AMETHYST_BLOCK.getDefaultState(), false));


	public static final Block SMOOTH_STONE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE), registerSound(Blocks.SMOOTH_STONE.getDefaultState(), false));
	public static final Block SMOOTH_STONE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE), registerSound(Blocks.SMOOTH_STONE.getDefaultState(), false));


	public static final Block OBSIDIAN_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.OBSIDIAN),registerSound(Blocks.OBSIDIAN.getDefaultState(), true));
	public static final Block OBSIDIAN_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.OBSIDIAN), registerSound(Blocks.OBSIDIAN.getDefaultState(), true));

	public static final Block BRICK_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.BRICKS), registerSound(Blocks.BRICKS.getDefaultState(), false));
	public static final Block BRICK_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.BRICKS), registerSound(Blocks.BRICKS.getDefaultState(), false));

	public static final Block ICE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.ICE), registerSound(Blocks.ICE.getDefaultState(), false));
	public static final Block ICE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.ICE), registerSound(Blocks.ICE.getDefaultState(), false));

	public static final Block GLASS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.GLASS), registerSound(Blocks.GLASS.getDefaultState(), false));
	public static final Block GLASS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.GLASS), registerSound(Blocks.GLASS.getDefaultState(), false));

	public static final Block BEDROCK_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK), registerSound(Blocks.BEDROCK.getDefaultState(), true));
	public static final Block BEDROCK_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK), registerSound(Blocks.BEDROCK.getDefaultState(), true));

	public static final Block SPONGE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.SPONGE), registerSound(Blocks.SPONGE.getDefaultState(), false));
	public static final Block SPONGE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.SPONGE), registerSound(Blocks.SPONGE.getDefaultState(), false));

	public static final Block DRIPSTONE_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK), registerSound(Blocks.DRIPSTONE_BLOCK.getDefaultState(), false));
	public static final Block DRIPSTONE_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK), registerSound(Blocks.DRIPSTONE_BLOCK.getDefaultState(), false));

	public static final Block MUD_BRICK_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS), registerSound(Blocks.MUD_BRICKS.getDefaultState(), false));
	public static final Block MUD_BRICK_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS), registerSound(Blocks.MUD_BRICKS.getDefaultState(), false));

	public static final Block SCULK_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.SCULK), registerSound(Blocks.SCULK.getDefaultState(), false));

	public static final Block SCULK_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.SCULK), registerSound(Blocks.SCULK.getDefaultState(), false));

	//Glass Doors
	public static final Block BLACK_STAINED_GLASS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS), registerSound(Blocks.BLACK_STAINED_GLASS.getDefaultState(), false));
	public static final Block BLACK_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS), registerSound(Blocks.BLACK_STAINED_GLASS.getDefaultState(), false));

	public static final Block BLUE_STAINED_GLASS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS), registerSound(Blocks.BLUE_STAINED_GLASS.getDefaultState(), false));
	public static final Block BLUE_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS), registerSound(Blocks.BLUE_STAINED_GLASS.getDefaultState(), false));

	public static final Block BROWN_STAINED_GLASS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS), registerSound(Blocks.BROWN_STAINED_GLASS.getDefaultState(), false));
	public static final Block BROWN_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS), registerSound(Blocks.BROWN_STAINED_GLASS.getDefaultState(), false));

	public static final Block CYAN_STAINED_GLASS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS), registerSound(Blocks.CYAN_STAINED_GLASS.getDefaultState(), false));
	public static final Block CYAN_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS), registerSound(Blocks.CYAN_STAINED_GLASS.getDefaultState(), false));

	public static final Block GRAY_STAINED_GLASS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS), registerSound(Blocks.GRAY_STAINED_GLASS.getDefaultState(), false));
	public static final Block GRAY_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS), registerSound(Blocks.GRAY_STAINED_GLASS.getDefaultState(), false));

	public static final Block GREEN_STAINED_GLASS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS), registerSound(Blocks.GREEN_STAINED_GLASS.getDefaultState(), false));
	public static final Block GREEN_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS), registerSound(Blocks.GREEN_STAINED_GLASS.getDefaultState(), false));

	public static final Block LIGHT_BLUE_STAINED_GLASS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS), registerSound(Blocks.LIGHT_BLUE_STAINED_GLASS.getDefaultState(), false));
	public static final Block LIGHT_BLUE_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS), registerSound(Blocks.LIGHT_BLUE_STAINED_GLASS.getDefaultState(), false));

	public static final Block LIGHT_GRAY_STAINED_GLASS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS), registerSound(Blocks.LIGHT_GRAY_STAINED_GLASS.getDefaultState(), false));
	public static final Block LIGHT_GRAY_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS), registerSound(Blocks.LIGHT_GRAY_STAINED_GLASS.getDefaultState(), false));

	public static final Block LIME_STAINED_GLASS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS), registerSound(Blocks.LIME_STAINED_GLASS.getDefaultState(), false));
	public static final Block LIME_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS), registerSound(Blocks.LIME_STAINED_GLASS.getDefaultState(), false));

	public static final Block MAGENTA_STAINED_GLASS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS), registerSound(Blocks.MAGENTA_STAINED_GLASS.getDefaultState(), false));
	public static final Block MAGENTA_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS), registerSound(Blocks.MAGENTA_STAINED_GLASS.getDefaultState(), false));

	public static final Block ORANGE_STAINED_GLASS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS), registerSound(Blocks.ORANGE_STAINED_GLASS.getDefaultState(), false));
	public static final Block ORANGE_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS), registerSound(Blocks.ORANGE_STAINED_GLASS.getDefaultState(), false));

	public static final Block PINK_STAINED_GLASS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS), registerSound(Blocks.PINK_STAINED_GLASS.getDefaultState(), false));
	public static final Block PINK_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS), registerSound(Blocks.PINK_STAINED_GLASS.getDefaultState(), false));

	public static final Block PURPLE_STAINED_GLASS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS), registerSound(Blocks.PURPLE_STAINED_GLASS.getDefaultState(), false));
	public static final Block PURPLE_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS), registerSound(Blocks.PURPLE_STAINED_GLASS.getDefaultState(), false));

	public static final Block RED_STAINED_GLASS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS), registerSound(Blocks.RED_STAINED_GLASS.getDefaultState(), false));
	public static final Block RED_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS), registerSound(Blocks.RED_STAINED_GLASS.getDefaultState(), false));

	public static final Block WHITE_STAINED_GLASS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS), registerSound(Blocks.WHITE_STAINED_GLASS.getDefaultState(), false));
	public static final Block WHITE_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS), registerSound(Blocks.WHITE_STAINED_GLASS.getDefaultState(), false));

	public static final Block YELLOW_STAINED_GLASS_DOOR = new CustomDoorBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS), registerSound(Blocks.YELLOW_STAINED_GLASS.getDefaultState(), false));
	public static final Block YELLOW_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS), registerSound(Blocks.YELLOW_STAINED_GLASS.getDefaultState(), false));

	public static final Block TINTED_GLASS_DOOR = new CustomTintedDoorBlock(AbstractBlock.Settings.copy(Blocks.TINTED_GLASS), registerSound(Blocks.TINTED_GLASS.getDefaultState(), false));
	public static final Block TINTED_GLASS_TRAPDOOR = new CustomTintedTrapdoorBlock(AbstractBlock.Settings.copy(Blocks.TINTED_GLASS), registerSound(Blocks.TINTED_GLASS.getDefaultState(), false));

	@Override
	public void onInitialize() {

		Registry.register(Registries.ITEM_GROUP, MORE_DOORS, FabricItemGroup.builder()
		    .icon(() -> new ItemStack(moredoors.GOLD_DOOR))
			.displayName(Text.literal("More Doors"))
			.entries((displayContext, entries) -> {
				entries.add(moredoors.GOLD_DOOR);
				entries.add(moredoors.GOLD_TRAPDOOR);
				entries.add(moredoors.DIAMOND_DOOR);
				entries.add(moredoors.DIAMOND_TRAPDOOR);
				entries.add(moredoors.LAPIS_DOOR);
				entries.add(moredoors.LAPIS_TRAPDOOR);
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
				entries.add(moredoors.SCULK_DOOR);
				entries.add(moredoors.SCULK_TRAPDOOR);
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

            .build());

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "gold_door"), GOLD_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "gold_door"), new BlockItem(GOLD_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "diamond_door"), DIAMOND_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "diamond_door"), new BlockItem(DIAMOND_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "lapis_door"), LAPIS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "lapis_door"), new BlockItem(LAPIS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "netherite_door"), NETHERITE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "netherite_door"), new BlockItem(NETHERITE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "emerald_door"), EMERALD_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "emerald_door"), new BlockItem(EMERALD_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "redstone_door"), REDSTONE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "redstone_door"), new BlockItem(REDSTONE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "coal_door"), COAL_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "coal_door"), new BlockItem(COAL_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "stone_door"), STONE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "stone_door"), new BlockItem(STONE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "gold_trapdoor"), GOLD_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "gold_trapdoor"), new BlockItem(GOLD_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "diamond_trapdoor"), DIAMOND_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "diamond_trapdoor"), new BlockItem(DIAMOND_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "lapis_trapdoor"), LAPIS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "lapis_trapdoor"), new BlockItem(LAPIS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "netherite_trapdoor"), NETHERITE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "netherite_trapdoor"), new BlockItem(NETHERITE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "emerald_trapdoor"), EMERALD_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "emerald_trapdoor"), new BlockItem(EMERALD_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "redstone_trapdoor"), REDSTONE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "redstone_trapdoor"), new BlockItem(REDSTONE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "coal_trapdoor"), COAL_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "coal_trapdoor"), new BlockItem(COAL_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "stone_trapdoor"), STONE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "stone_trapdoor"), new BlockItem(STONE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "cobblestone_door"), COBBLESTONE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "cobblestone_door"), new BlockItem(COBBLESTONE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "andesite_door"), ANDESITE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "andesite_door"), new BlockItem(ANDESITE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "diorite_door"), DIORITE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "diorite_door"), new BlockItem(DIORITE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "granite_door"), GRANITE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "granite_door"), new BlockItem(GRANITE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "sandstone_door"), SANDSTONE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "sandstone_door"), new BlockItem(SANDSTONE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "red_sandstone_door"), RED_SANDSTONE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "red_sandstone_door"), new BlockItem(RED_SANDSTONE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "cobbled_deepslate_door"), COBBLED_DEEPSLATE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "cobbled_deepslate_door"), new BlockItem(COBBLED_DEEPSLATE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "calcite_door"), CALCITE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "calcite_door"), new BlockItem(CALCITE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "polished_deepslate_door"), POLISHED_DEEPSLATE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "polished_deepslate_door"), new BlockItem(POLISHED_DEEPSLATE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "cobblestone_trapdoor"), COBBLESTONE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "cobblestone_trapdoor"), new BlockItem(COBBLESTONE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "andesite_trapdoor"), ANDESITE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "andesite_trapdoor"), new BlockItem(ANDESITE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "diorite_trapdoor"), DIORITE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "diorite_trapdoor"), new BlockItem(DIORITE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "granite_trapdoor"), GRANITE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "granite_trapdoor"), new BlockItem(GRANITE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "sandstone_trapdoor"), SANDSTONE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "sandstone_trapdoor"), new BlockItem(SANDSTONE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "red_sandstone_trapdoor"), RED_SANDSTONE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "red_sandstone_trapdoor"), new BlockItem(RED_SANDSTONE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "cobbled_deepslate_trapdoor"), COBBLED_DEEPSLATE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "cobbled_deepslate_trapdoor"), new BlockItem(COBBLED_DEEPSLATE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "calcite_trapdoor"), CALCITE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "calcite_trapdoor"), new BlockItem(CALCITE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "polished_deepslate_trapdoor"), POLISHED_DEEPSLATE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "polished_deepslate_trapdoor"), new BlockItem(POLISHED_DEEPSLATE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "basalt_door"), BASALT_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "basalt_door"), new BlockItem(BASALT_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "blackstone_door"), BLACKSTONE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "blackstone_door"), new BlockItem(BLACKSTONE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "netherrack_door"), NETHERRACK_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "netherrack_door"), new BlockItem(NETHERRACK_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "end_stone_door"), END_STONE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "end_stone_door"), new BlockItem(END_STONE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "purpur_door"), PURPUR_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "purpur_door"), new BlockItem(PURPUR_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "quartz_door"), QUARTZ_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "quartz_door"), new BlockItem(QUARTZ_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "nether_brick_door"), NETHER_BRICK_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "nether_brick_door"), new BlockItem(NETHER_BRICK_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "prismarine_door"), PRISMARINE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "prismarine_door"), new BlockItem(PRISMARINE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "bookshelf_door"), BOOKSHELF_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "bookshelf_door"), new BlockItem(BOOKSHELF_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "basalt_trapdoor"), BASALT_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "basalt_trapdoor"), new BlockItem(BASALT_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "blackstone_trapdoor"), BLACKSTONE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "blackstone_trapdoor"), new BlockItem(BLACKSTONE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "netherrack_trapdoor"), NETHERRACK_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "netherrack_trapdoor"), new BlockItem(NETHERRACK_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "end_stone_trapdoor"), END_STONE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "end_stone_trapdoor"), new BlockItem(END_STONE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "purpur_trapdoor"), PURPUR_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "purpur_trapdoor"), new BlockItem(PURPUR_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "quartz_trapdoor"), QUARTZ_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "quartz_trapdoor"), new BlockItem(QUARTZ_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "nether_brick_trapdoor"), NETHER_BRICK_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "nether_brick_trapdoor"), new BlockItem(NETHER_BRICK_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "prismarine_trapdoor"), PRISMARINE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "prismarine_trapdoor"), new BlockItem(PRISMARINE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "bookshelf_trapdoor"), BOOKSHELF_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "bookshelf_trapdoor"), new BlockItem(BOOKSHELF_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "amethyst_door"), AMETHYST_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "amethyst_door"), new BlockItem(AMETHYST_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "smooth_stone_door"), SMOOTH_STONE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "smooth_stone_door"), new BlockItem(SMOOTH_STONE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "obsidian_door"), OBSIDIAN_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "obsidian_door"), new BlockItem(OBSIDIAN_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "brick_door"), BRICK_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "brick_door"), new BlockItem(BRICK_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "ice_door"), ICE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "ice_door"), new BlockItem(ICE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "glass_door"), GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "glass_door"), new BlockItem(GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "bedrock_door"), BEDROCK_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "bedrock_door"), new BlockItem(BEDROCK_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "sponge_door"), SPONGE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "sponge_door"), new BlockItem(SPONGE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "dripstone_door"), DRIPSTONE_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "dripstone_door"), new BlockItem(DRIPSTONE_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "mud_brick_door"),MUD_BRICK_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "mud_brick_door"), new BlockItem(MUD_BRICK_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "sculk_door"),SCULK_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "sculk_door"), new BlockItem(SCULK_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "amethyst_trapdoor"), AMETHYST_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "amethyst_trapdoor"), new BlockItem(AMETHYST_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "smooth_stone_trapdoor"), SMOOTH_STONE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "smooth_stone_trapdoor"), new BlockItem(SMOOTH_STONE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "obsidian_trapdoor"), OBSIDIAN_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "obsidian_trapdoor"), new BlockItem(OBSIDIAN_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "brick_trapdoor"), BRICK_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "brick_trapdoor"), new BlockItem(BRICK_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "ice_trapdoor"), ICE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "ice_trapdoor"), new BlockItem(ICE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "glass_trapdoor"), GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "glass_trapdoor"), new BlockItem(GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "bedrock_trapdoor"), BEDROCK_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "bedrock_trapdoor"), new BlockItem(BEDROCK_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "sponge_trapdoor"), SPONGE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "sponge_trapdoor"), new BlockItem(SPONGE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "dripstone_trapdoor"), DRIPSTONE_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "dripstone_trapdoor"), new BlockItem(DRIPSTONE_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "mud_brick_trapdoor"), MUD_BRICK_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "mud_brick_trapdoor"), new BlockItem(MUD_BRICK_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "sculk_trapdoor"), SCULK_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "sculk_trapdoor"), new BlockItem(SCULK_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "black_stained_glass_door"), BLACK_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "black_stained_glass_door"), new BlockItem(BLACK_STAINED_GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "black_stained_glass_trapdoor"), BLACK_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "black_stained_glass_trapdoor"), new BlockItem(BLACK_STAINED_GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "blue_stained_glass_door"), BLUE_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "blue_stained_glass_door"), new BlockItem(BLUE_STAINED_GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "blue_stained_glass_trapdoor"), BLUE_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "blue_stained_glass_trapdoor"), new BlockItem(BLUE_STAINED_GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "brown_stained_glass_door"), BROWN_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "brown_stained_glass_door"), new BlockItem(BROWN_STAINED_GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "brown_stained_glass_trapdoor"), BROWN_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "brown_stained_glass_trapdoor"), new BlockItem(BROWN_STAINED_GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "cyan_stained_glass_door"), CYAN_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "cyan_stained_glass_door"), new BlockItem(CYAN_STAINED_GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "cyan_stained_glass_trapdoor"), CYAN_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "cyan_stained_glass_trapdoor"), new BlockItem(CYAN_STAINED_GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "gray_stained_glass_door"), GRAY_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "gray_stained_glass_door"), new BlockItem(GRAY_STAINED_GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "gray_stained_glass_trapdoor"), GRAY_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "gray_stained_glass_trapdoor"), new BlockItem(GRAY_STAINED_GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "green_stained_glass_door"), GREEN_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "green_stained_glass_door"), new BlockItem(GREEN_STAINED_GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "green_stained_glass_trapdoor"), GREEN_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "green_stained_glass_trapdoor"), new BlockItem(GREEN_STAINED_GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "light_blue_stained_glass_door"), LIGHT_BLUE_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "light_blue_stained_glass_door"), new BlockItem(LIGHT_BLUE_STAINED_GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "light_blue_stained_glass_trapdoor"), LIGHT_BLUE_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "light_blue_stained_glass_trapdoor"), new BlockItem(LIGHT_BLUE_STAINED_GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "light_gray_stained_glass_door"), LIGHT_GRAY_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "light_gray_stained_glass_door"), new BlockItem(LIGHT_GRAY_STAINED_GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "light_gray_stained_glass_trapdoor"), LIGHT_GRAY_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "light_gray_stained_glass_trapdoor"), new BlockItem(LIGHT_GRAY_STAINED_GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "lime_stained_glass_door"), LIME_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "lime_stained_glass_door"), new BlockItem(LIME_STAINED_GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "lime_stained_glass_trapdoor"), LIME_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "lime_stained_glass_trapdoor"), new BlockItem(LIME_STAINED_GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "magenta_stained_glass_door"), MAGENTA_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "magenta_stained_glass_door"), new BlockItem(MAGENTA_STAINED_GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "magenta_stained_glass_trapdoor"), MAGENTA_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "magenta_stained_glass_trapdoor"), new BlockItem(MAGENTA_STAINED_GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "orange_stained_glass_door"), ORANGE_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "orange_stained_glass_door"), new BlockItem(ORANGE_STAINED_GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "orange_stained_glass_trapdoor"), ORANGE_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "orange_stained_glass_trapdoor"), new BlockItem(ORANGE_STAINED_GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "pink_stained_glass_door"), PINK_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "pink_stained_glass_door"), new BlockItem(PINK_STAINED_GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "pink_stained_glass_trapdoor"), PINK_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "pink_stained_glass_trapdoor"), new BlockItem(PINK_STAINED_GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "purple_stained_glass_door"), PURPLE_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "purple_stained_glass_door"), new BlockItem(PURPLE_STAINED_GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "purple_stained_glass_trapdoor"), PURPLE_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "purple_stained_glass_trapdoor"), new BlockItem(PURPLE_STAINED_GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "red_stained_glass_door"), RED_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "red_stained_glass_door"), new BlockItem(RED_STAINED_GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "red_stained_glass_trapdoor"), RED_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "red_stained_glass_trapdoor"), new BlockItem(RED_STAINED_GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "white_stained_glass_door"), WHITE_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "white_stained_glass_door"), new BlockItem(WHITE_STAINED_GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "white_stained_glass_trapdoor"), WHITE_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "white_stained_glass_trapdoor"), new BlockItem(WHITE_STAINED_GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "yellow_stained_glass_door"), YELLOW_STAINED_GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "yellow_stained_glass_door"), new BlockItem(YELLOW_STAINED_GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "yellow_stained_glass_trapdoor"), YELLOW_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "yellow_stained_glass_trapdoor"), new BlockItem(YELLOW_STAINED_GLASS_TRAPDOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "tinted_glass_door"), TINTED_GLASS_DOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "tinted_glass_door"), new BlockItem(TINTED_GLASS_DOOR, new Item.Settings()));

		Registry.register(Registries.BLOCK, Identifier.of("moredoors", "tinted_glass_trapdoor"), TINTED_GLASS_TRAPDOOR);
		Registry.register(Registries.ITEM, Identifier.of("moredoors", "tinted_glass_trapdoor"), new BlockItem(TINTED_GLASS_TRAPDOOR, new Item.Settings()));

	}
	}
