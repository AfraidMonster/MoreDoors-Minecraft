package afraidmonster.moredoors;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class moredoors implements ModInitializer {

	public static final String MOD_ID = "moredoors";

	public static final ResourceKey<CreativeModeTab> MORE_DOORS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, "more_doors"));

	public static final BlockSetTypeBuilder METAL_TYPE = new BlockSetTypeBuilder();
	public static final BlockSetTypeBuilder WOOD_TYPE = new BlockSetTypeBuilder();

	//Metal Doors
	public static BlockSetType registerSound(BlockBehaviour.BlockStateBase block, Boolean isMetal)  {

		if(isMetal){
			 METAL_TYPE
					 .openableByHand(false)
					.openableByWindCharge(false)
					.soundType(block.getSoundType())
					.doorCloseSound(SoundEvents.IRON_DOOR_CLOSE)
					.doorOpenSound(SoundEvents.IRON_DOOR_OPEN)
					.trapdoorCloseSound(SoundEvents.IRON_TRAPDOOR_CLOSE)
					.trapdoorOpenSound(SoundEvents.IRON_TRAPDOOR_OPEN);
			 return METAL_TYPE.register(Identifier.fromNamespaceAndPath("moredoors", "blockset_metal"));


		}else{
			WOOD_TYPE
					.openableByHand(true)
					.openableByWindCharge(true)
					.soundType(block.getSoundType())
					.doorCloseSound(SoundEvents.WOODEN_DOOR_CLOSE)
					.doorOpenSound(SoundEvents.WOODEN_DOOR_OPEN)
					.trapdoorCloseSound(SoundEvents.WOODEN_TRAPDOOR_CLOSE)
					.trapdoorOpenSound(SoundEvents.WOODEN_TRAPDOOR_OPEN);
			return WOOD_TYPE.register(Identifier.fromNamespaceAndPath("moredoors", "blockset_wood"));
		}
	}

	public static final Block GOLD_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "gold_door"))), registerSound(Blocks.GOLD_BLOCK.defaultBlockState(), true));
	public static final Block GOLD_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "gold_trapdoor"))), registerSound(Blocks.GOLD_BLOCK.defaultBlockState(), true));

	public static final Block DIAMOND_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "diamond_door"))), registerSound(Blocks.DIAMOND_BLOCK.defaultBlockState(), true));
	public static final Block DIAMOND_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "diamond_trapdoor"))), registerSound(Blocks.DIAMOND_BLOCK.defaultBlockState(), true));

	public static final Block LAPIS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "lapis_door"))), registerSound(Blocks.LAPIS_BLOCK.defaultBlockState(), true));
	public static final Block LAPIS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "lapis_trapdoor"))), registerSound(Blocks.LAPIS_BLOCK.defaultBlockState(), true));


	public static final Block NETHERITE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "netherite_door"))), registerSound(Blocks.NETHERITE_BLOCK.defaultBlockState(), true));
	public static final Block NETHERITE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "netherite_trapdoor"))), registerSound(Blocks.NETHERITE_BLOCK.defaultBlockState(), true));

	public static final Block EMERALD_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "emerald_door"))), registerSound(Blocks.EMERALD_BLOCK.defaultBlockState(), true));
	public static final Block EMERALD_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "emerald_trapdoor"))), registerSound(Blocks.EMERALD_BLOCK.defaultBlockState(), true));

	public static final Block REDSTONE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "redstone_door"))), registerSound(Blocks.REDSTONE_BLOCK.defaultBlockState(), true));
	public static final Block REDSTONE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "redstone_trapdoor"))), registerSound(Blocks.REDSTONE_BLOCK.defaultBlockState(), true));

	public static final Block COAL_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "coal_door"))), registerSound(Blocks.COAL_BLOCK.defaultBlockState(), true));
	public static final Block COAL_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "coal_trapdoor"))), registerSound(Blocks.COAL_BLOCK.defaultBlockState(), true));

	//Other Doors
	public static final Block STONE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "stone_door"))), registerSound(Blocks.STONE.defaultBlockState(), false));
	public static final Block STONE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "stone_trapdoor"))), registerSound(Blocks.STONE.defaultBlockState(), false));

	public static final Block COBBLESTONE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "cobblestone_door"))), registerSound(Blocks.COBBLESTONE.defaultBlockState(), false));
	public static final Block COBBLESTONE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "cobblestone_trapdoor"))), registerSound(Blocks.COBBLESTONE.defaultBlockState(), false));

	public static final Block ANDESITE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "andesite_door"))), registerSound(Blocks.POLISHED_ANDESITE.defaultBlockState(), false));
	public static final Block ANDESITE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "andesite_trapdoor"))), registerSound(Blocks.POLISHED_ANDESITE.defaultBlockState(), false));

	public static final Block DIORITE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "diorite_door"))), registerSound(Blocks.POLISHED_DIORITE.defaultBlockState(), false));
	public static final Block DIORITE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "diorite_trapdoor"))), registerSound(Blocks.POLISHED_DIORITE.defaultBlockState(), false));

	public static final Block GRANITE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "granite_door"))), registerSound(Blocks.POLISHED_GRANITE.defaultBlockState(), false));
	public static final Block GRANITE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "granite_trapdoor"))), registerSound(Blocks.POLISHED_GRANITE.defaultBlockState(), false));

	public static final Block SANDSTONE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "sandstone_door"))), registerSound(Blocks.SANDSTONE.defaultBlockState(), false));
	public static final Block SANDSTONE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "sandstone_trapdoor"))), registerSound(Blocks.SANDSTONE.defaultBlockState(), false));

	public static final Block RED_SANDSTONE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "red_sandstone_door"))), registerSound(Blocks.RED_SANDSTONE.defaultBlockState(), false));
	public static final Block RED_SANDSTONE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "red_sandstone_trapdoor"))), registerSound(Blocks.RED_SANDSTONE.defaultBlockState(), false));

	public static final Block COBBLED_DEEPSLATE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "cobbled_deepslate_door"))), registerSound(Blocks.COBBLED_DEEPSLATE.defaultBlockState(), false));
	public static final Block COBBLED_DEEPSLATE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "cobbled_deepslate_trapdoor"))), registerSound(Blocks.COBBLED_DEEPSLATE.defaultBlockState(), false));

	public static final Block CALCITE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "calcite_door"))), registerSound(Blocks.CALCITE.defaultBlockState(), false));
	public static final Block CALCITE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "calcite_trapdoor"))), registerSound(Blocks.CALCITE.defaultBlockState(), false));

	public static final Block POLISHED_DEEPSLATE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "polished_deepslate_door"))), registerSound(Blocks.POLISHED_DEEPSLATE.defaultBlockState(), false));
	public static final Block POLISHED_DEEPSLATE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "polished_deepslate_trapdoor"))), registerSound(Blocks.POLISHED_DEEPSLATE.defaultBlockState(), false));

	public static final Block BASALT_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "basalt_door"))), registerSound(Blocks.BASALT.defaultBlockState(), false));
	public static final Block BASALT_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "basalt_trapdoor"))), registerSound(Blocks.BASALT.defaultBlockState(), false));

	public static final Block BLACKSTONE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "blackstone_door"))), registerSound(Blocks.BLACKSTONE.defaultBlockState(), false));
	public static final Block BLACKSTONE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "blackstone_trapdoor"))), registerSound(Blocks.BLACKSTONE.defaultBlockState(), false));

	public static final Block NETHERRACK_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "netherrack_door"))), registerSound(Blocks.NETHERRACK.defaultBlockState(), false));
	public static final Block NETHERRACK_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "netherrack_trapdoor"))), registerSound(Blocks.NETHERRACK.defaultBlockState(), false));

	public static final Block END_STONE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "end_stone_door"))), registerSound(Blocks.END_STONE.defaultBlockState(), false));
	public static final Block END_STONE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "end_stone_trapdoor"))), registerSound(Blocks.END_STONE.defaultBlockState(), false));

	public static final Block PURPUR_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "purpur_door"))), registerSound(Blocks.PURPUR_BLOCK.defaultBlockState(), false));
	public static final Block PURPUR_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "purpur_trapdoor"))), registerSound(Blocks.PURPUR_BLOCK.defaultBlockState(), false));

	public static final Block QUARTZ_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "quartz_door"))), registerSound(Blocks.QUARTZ_BLOCK.defaultBlockState(), false));
	public static final Block QUARTZ_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "quartz_trapdoor"))), registerSound(Blocks.QUARTZ_BLOCK.defaultBlockState(), false));

	public static final Block NETHER_BRICK_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "nether_brick_door"))), registerSound(Blocks.NETHER_BRICKS.defaultBlockState(), false));
	public static final Block NETHER_BRICK_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "nether_brick_trapdoor"))), registerSound(Blocks.NETHER_BRICKS.defaultBlockState(), false));

	public static final Block PRISMARINE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "prismarine_door"))), registerSound(Blocks.PRISMARINE_BRICKS.defaultBlockState(), false));
	public static final Block PRISMARINE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "prismarine_trapdoor"))), registerSound(Blocks.PRISMARINE_BRICKS.defaultBlockState(), false));

	public static final Block BOOKSHELF_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "bookshelf_door"))), registerSound(Blocks.BOOKSHELF.defaultBlockState(), false));
	public static final Block BOOKSHELF_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "bookshelf_trapdoor"))), registerSound(Blocks.BOOKSHELF.defaultBlockState(), false));

	public static final Block AMETHYST_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "amethyst_door"))), registerSound(Blocks.AMETHYST_BLOCK.defaultBlockState(), false));
	public static final Block AMETHYST_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "amethyst_trapdoor"))), registerSound(Blocks.AMETHYST_BLOCK.defaultBlockState(), false));


	public static final Block SMOOTH_STONE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "smooth_stone_door"))), registerSound(Blocks.SMOOTH_STONE.defaultBlockState(), false));
	public static final Block SMOOTH_STONE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "smooth_stone_trapdoor"))), registerSound(Blocks.SMOOTH_STONE.defaultBlockState(), false));


	public static final Block OBSIDIAN_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "obsidian_door"))),registerSound(Blocks.OBSIDIAN.defaultBlockState(), true));
	public static final Block OBSIDIAN_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "obsidian_trapdoor"))), registerSound(Blocks.OBSIDIAN.defaultBlockState(), true));

	public static final Block BRICK_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "brick_door"))), registerSound(Blocks.BRICKS.defaultBlockState(), false));
	public static final Block BRICK_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "brick_trapdoor"))), registerSound(Blocks.BRICKS.defaultBlockState(), false));

	public static final Block ICE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ICE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "ice_door"))), registerSound(Blocks.ICE.defaultBlockState(), false));
	public static final Block ICE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ICE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "ice_trapdoor"))), registerSound(Blocks.ICE.defaultBlockState(), false));

	public static final Block GLASS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block GLASS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	public static final Block BEDROCK_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "bedrock_door"))), registerSound(Blocks.BEDROCK.defaultBlockState(), true));
	public static final Block BEDROCK_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "bedrock_trapdoor"))), registerSound(Blocks.BEDROCK.defaultBlockState(), true));

	public static final Block SPONGE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPONGE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "sponge_door"))), registerSound(Blocks.SPONGE.defaultBlockState(), false));
	public static final Block SPONGE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPONGE).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "sponge_trapdoor"))), registerSound(Blocks.SPONGE.defaultBlockState(), false));

	public static final Block DRIPSTONE_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "dripstone_door"))), registerSound(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), false));
	public static final Block DRIPSTONE_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "dripstone_trapdoor"))), registerSound(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), false));

	public static final Block MUD_BRICK_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "mud_brick_door"))), registerSound(Blocks.MUD_BRICKS.defaultBlockState(), false));
	public static final Block MUD_BRICK_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "mud_brick_trapdoor"))), registerSound(Blocks.MUD_BRICKS.defaultBlockState(), false));

	public static final Block SCULK_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SCULK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "sculk_door"))), registerSound(Blocks.SCULK.defaultBlockState(), false));

	public static final Block SCULK_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SCULK).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "sculk_trapdoor"))), registerSound(Blocks.SCULK.defaultBlockState(), false));

	//Glass Doors
	public static final Block BLACK_STAINED_GLASS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "black_stained_glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block BLACK_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "black_stained_glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	public static final Block BLUE_STAINED_GLASS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "blue_stained_glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block BLUE_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "blue_stained_glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	public static final Block BROWN_STAINED_GLASS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "brown_stained_glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block BROWN_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "brown_stained_glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	public static final Block CYAN_STAINED_GLASS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "cyan_stained_glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block CYAN_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "cyan_stained_glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	public static final Block GRAY_STAINED_GLASS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "gray_stained_glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block GRAY_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "gray_stained_glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	public static final Block GREEN_STAINED_GLASS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "green_stained_glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block GREEN_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "green_stained_glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	public static final Block LIGHT_BLUE_STAINED_GLASS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "light_blue_stained_glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block LIGHT_BLUE_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "light_blue_stained_glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	public static final Block LIGHT_GRAY_STAINED_GLASS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "light_gray_stained_glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block LIGHT_GRAY_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "light_gray_stained_glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	public static final Block LIME_STAINED_GLASS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "lime_stained_glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block LIME_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "lime_stained_glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	public static final Block MAGENTA_STAINED_GLASS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "magenta_stained_glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block MAGENTA_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "magenta_stained_glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	public static final Block ORANGE_STAINED_GLASS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "orange_stained_glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block ORANGE_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "orange_stained_glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	public static final Block PINK_STAINED_GLASS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "pink_stained_glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block PINK_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "pink_stained_glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	public static final Block PURPLE_STAINED_GLASS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "purple_stained_glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block PURPLE_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "purple_stained_glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	public static final Block RED_STAINED_GLASS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "red_stained_glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block RED_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "red_stained_glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	public static final Block WHITE_STAINED_GLASS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "white_stained_glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block WHITE_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "white_stained_glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	public static final Block YELLOW_STAINED_GLASS_DOOR = new CustomDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "yellow_stained_glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block YELLOW_STAINED_GLASS_TRAPDOOR = new CustomTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "yellow_stained_glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	public static final Block TINTED_GLASS_DOOR = new CustomTintedDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "tinted_glass_door"))), registerSound(Blocks.GLASS.defaultBlockState(), false));
	public static final Block TINTED_GLASS_TRAPDOOR = new CustomTintedTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "tinted_glass_trapdoor"))), registerSound(Blocks.GLASS.defaultBlockState(), false));

	@Override
	public void onInitialize() {

		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, MORE_DOORS, FabricCreativeModeTab.builder()
		    .icon(() -> new ItemStack(moredoors.GOLD_DOOR))
			.title(Component.literal("More Doors"))
			.displayItems((displayContext, entries) -> {
				entries.accept(moredoors.GOLD_DOOR);
				entries.accept(moredoors.GOLD_TRAPDOOR);
				entries.accept(moredoors.DIAMOND_DOOR);
				entries.accept(moredoors.DIAMOND_TRAPDOOR);
				entries.accept(moredoors.LAPIS_DOOR);
				entries.accept(moredoors.LAPIS_TRAPDOOR);
				entries.accept(moredoors.NETHERITE_DOOR);
				entries.accept(moredoors.NETHERITE_TRAPDOOR);
				entries.accept(moredoors.EMERALD_DOOR);
				entries.accept(moredoors.EMERALD_TRAPDOOR);
				entries.accept(moredoors.REDSTONE_DOOR);
				entries.accept(moredoors.REDSTONE_TRAPDOOR);
				entries.accept(moredoors.COAL_DOOR);
				entries.accept(moredoors.COAL_TRAPDOOR);
				entries.accept(moredoors.STONE_DOOR);
				entries.accept(moredoors.STONE_TRAPDOOR);
				entries.accept(moredoors.COBBLESTONE_DOOR);
				entries.accept(moredoors.COBBLESTONE_TRAPDOOR);
				entries.accept(moredoors.ANDESITE_DOOR);
				entries.accept(moredoors.ANDESITE_TRAPDOOR);
				entries.accept(moredoors.DIORITE_DOOR);
				entries.accept(moredoors.DIORITE_TRAPDOOR);
				entries.accept(moredoors.GRANITE_DOOR);
				entries.accept(moredoors.GRANITE_TRAPDOOR);
				entries.accept(moredoors.SANDSTONE_DOOR);
				entries.accept(moredoors.SANDSTONE_TRAPDOOR);
				entries.accept(moredoors.RED_SANDSTONE_DOOR);
				entries.accept(moredoors.RED_SANDSTONE_TRAPDOOR);
				entries.accept(moredoors.COBBLED_DEEPSLATE_DOOR);
				entries.accept(moredoors.COBBLED_DEEPSLATE_TRAPDOOR);
				entries.accept(moredoors.CALCITE_DOOR);
				entries.accept(moredoors.CALCITE_TRAPDOOR);
				entries.accept(moredoors.POLISHED_DEEPSLATE_DOOR);
				entries.accept(moredoors.POLISHED_DEEPSLATE_TRAPDOOR);
				entries.accept(moredoors.BASALT_DOOR);
				entries.accept(moredoors.BASALT_TRAPDOOR);
				entries.accept(moredoors.BLACKSTONE_DOOR);
				entries.accept(moredoors.BLACKSTONE_TRAPDOOR);
				entries.accept(moredoors.NETHERRACK_DOOR);
				entries.accept(moredoors.NETHERRACK_TRAPDOOR);
				entries.accept(moredoors.END_STONE_DOOR);
				entries.accept(moredoors.END_STONE_TRAPDOOR);
				entries.accept(moredoors.PURPUR_DOOR);
				entries.accept(moredoors.PURPUR_TRAPDOOR);
				entries.accept(moredoors.QUARTZ_DOOR);
				entries.accept(moredoors.QUARTZ_TRAPDOOR);
				entries.accept(moredoors.NETHER_BRICK_DOOR);
				entries.accept(moredoors.NETHER_BRICK_TRAPDOOR);
				entries.accept(moredoors.PRISMARINE_DOOR);
				entries.accept(moredoors.PRISMARINE_TRAPDOOR);
				entries.accept(moredoors.BOOKSHELF_DOOR);
				entries.accept(moredoors.BOOKSHELF_TRAPDOOR);
				entries.accept(moredoors.AMETHYST_DOOR);
				entries.accept(moredoors.AMETHYST_TRAPDOOR);
				entries.accept(moredoors.SMOOTH_STONE_DOOR);
				entries.accept(moredoors.SMOOTH_STONE_TRAPDOOR);
				entries.accept(moredoors.OBSIDIAN_DOOR);
				entries.accept(moredoors.OBSIDIAN_TRAPDOOR);
				entries.accept(moredoors.BRICK_DOOR);
				entries.accept(moredoors.BRICK_TRAPDOOR);
				entries.accept(moredoors.ICE_DOOR);
				entries.accept(moredoors.ICE_TRAPDOOR);
				entries.accept(moredoors.GLASS_DOOR);
				entries.accept(moredoors.GLASS_TRAPDOOR);
				entries.accept(moredoors.BEDROCK_DOOR);
				entries.accept(moredoors.BEDROCK_TRAPDOOR);
				entries.accept(moredoors.SPONGE_DOOR);
				entries.accept(moredoors.SPONGE_TRAPDOOR);
				entries.accept(moredoors.DRIPSTONE_DOOR);
				entries.accept(moredoors.DRIPSTONE_TRAPDOOR);
				entries.accept(moredoors.MUD_BRICK_DOOR);
				entries.accept(moredoors.MUD_BRICK_TRAPDOOR);
				entries.accept(moredoors.SCULK_DOOR);
				entries.accept(moredoors.SCULK_TRAPDOOR);
				entries.accept(moredoors.BLACK_STAINED_GLASS_DOOR);
				entries.accept(moredoors.BLACK_STAINED_GLASS_TRAPDOOR);
				entries.accept(moredoors.BLUE_STAINED_GLASS_DOOR);
				entries.accept(moredoors.BLUE_STAINED_GLASS_TRAPDOOR);
				entries.accept(moredoors.BROWN_STAINED_GLASS_DOOR);
				entries.accept(moredoors.BROWN_STAINED_GLASS_TRAPDOOR);
				entries.accept(moredoors.CYAN_STAINED_GLASS_DOOR);
				entries.accept(moredoors.CYAN_STAINED_GLASS_TRAPDOOR);
				entries.accept(moredoors.GRAY_STAINED_GLASS_DOOR);
				entries.accept(moredoors.GRAY_STAINED_GLASS_TRAPDOOR);
				entries.accept(moredoors.GREEN_STAINED_GLASS_DOOR);
				entries.accept(moredoors.GREEN_STAINED_GLASS_TRAPDOOR);
				entries.accept(moredoors.LIGHT_BLUE_STAINED_GLASS_DOOR);
				entries.accept(moredoors.LIGHT_BLUE_STAINED_GLASS_TRAPDOOR);
				entries.accept(moredoors.LIGHT_GRAY_STAINED_GLASS_DOOR);
				entries.accept(moredoors.LIGHT_GRAY_STAINED_GLASS_TRAPDOOR);
				entries.accept(moredoors.LIME_STAINED_GLASS_DOOR);
				entries.accept(moredoors.LIME_STAINED_GLASS_TRAPDOOR);
				entries.accept(moredoors.MAGENTA_STAINED_GLASS_DOOR);
				entries.accept(moredoors.MAGENTA_STAINED_GLASS_TRAPDOOR);
				entries.accept(moredoors.ORANGE_STAINED_GLASS_DOOR);
				entries.accept(moredoors.ORANGE_STAINED_GLASS_TRAPDOOR);
				entries.accept(moredoors.PINK_STAINED_GLASS_DOOR);
				entries.accept(moredoors.PINK_STAINED_GLASS_TRAPDOOR);
				entries.accept(moredoors.PURPLE_STAINED_GLASS_DOOR);
				entries.accept(moredoors.PURPLE_STAINED_GLASS_TRAPDOOR);
				entries.accept(moredoors.RED_STAINED_GLASS_DOOR);
				entries.accept(moredoors.RED_STAINED_GLASS_TRAPDOOR);
				entries.accept(moredoors.WHITE_STAINED_GLASS_DOOR);
				entries.accept(moredoors.WHITE_STAINED_GLASS_TRAPDOOR);
				entries.accept(moredoors.YELLOW_STAINED_GLASS_DOOR);
				entries.accept(moredoors.YELLOW_STAINED_GLASS_TRAPDOOR);
				entries.accept(moredoors.TINTED_GLASS_DOOR);
				entries.accept(moredoors.TINTED_GLASS_TRAPDOOR);
			})

            .build());

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "gold_door"), GOLD_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "gold_door"), new BlockItem(GOLD_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "gold_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "diamond_door"), DIAMOND_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "diamond_door"), new BlockItem(DIAMOND_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "diamond_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "lapis_door"), LAPIS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "lapis_door"), new BlockItem(LAPIS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "lapis_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "netherite_door"), NETHERITE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "netherite_door"), new BlockItem(NETHERITE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "netherite_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "emerald_door"), EMERALD_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "emerald_door"), new BlockItem(EMERALD_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "emerald_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "redstone_door"), REDSTONE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "redstone_door"), new BlockItem(REDSTONE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "redstone_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "coal_door"), COAL_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "coal_door"), new BlockItem(COAL_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "coal_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "stone_door"), STONE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "stone_door"), new BlockItem(STONE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "stone_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "gold_trapdoor"), GOLD_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "gold_trapdoor"), new BlockItem(GOLD_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "gold_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "diamond_trapdoor"), DIAMOND_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "diamond_trapdoor"), new BlockItem(DIAMOND_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "diamond_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "lapis_trapdoor"), LAPIS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "lapis_trapdoor"), new BlockItem(LAPIS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "lapis_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "netherite_trapdoor"), NETHERITE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "netherite_trapdoor"), new BlockItem(NETHERITE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "netherite_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "emerald_trapdoor"), EMERALD_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "emerald_trapdoor"), new BlockItem(EMERALD_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "emerald_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "redstone_trapdoor"), REDSTONE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "redstone_trapdoor"), new BlockItem(REDSTONE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "redstone_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "coal_trapdoor"), COAL_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "coal_trapdoor"), new BlockItem(COAL_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "coal_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "stone_trapdoor"), STONE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "stone_trapdoor"), new BlockItem(STONE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "stone_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "cobblestone_door"), COBBLESTONE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "cobblestone_door"), new BlockItem(COBBLESTONE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "cobblestone_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "andesite_door"), ANDESITE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "andesite_door"), new BlockItem(ANDESITE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "andesite_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "diorite_door"), DIORITE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "diorite_door"), new BlockItem(DIORITE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "diorite_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "granite_door"), GRANITE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "granite_door"), new BlockItem(GRANITE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "granite_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "sandstone_door"), SANDSTONE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "sandstone_door"), new BlockItem(SANDSTONE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "sandstone_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "red_sandstone_door"), RED_SANDSTONE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "red_sandstone_door"), new BlockItem(RED_SANDSTONE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "red_sandstone_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "cobbled_deepslate_door"), COBBLED_DEEPSLATE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "cobbled_deepslate_door"), new BlockItem(COBBLED_DEEPSLATE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "cobbled_deepslate_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "calcite_door"), CALCITE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "calcite_door"), new BlockItem(CALCITE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "calcite_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "polished_deepslate_door"), POLISHED_DEEPSLATE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "polished_deepslate_door"), new BlockItem(POLISHED_DEEPSLATE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "polished_deepslate_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "cobblestone_trapdoor"), COBBLESTONE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "cobblestone_trapdoor"), new BlockItem(COBBLESTONE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "cobblestone_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "andesite_trapdoor"), ANDESITE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "andesite_trapdoor"), new BlockItem(ANDESITE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "andesite_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "diorite_trapdoor"), DIORITE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "diorite_trapdoor"), new BlockItem(DIORITE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "diorite_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "granite_trapdoor"), GRANITE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "granite_trapdoor"), new BlockItem(GRANITE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "granite_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "sandstone_trapdoor"), SANDSTONE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "sandstone_trapdoor"), new BlockItem(SANDSTONE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "sandstone_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "red_sandstone_trapdoor"), RED_SANDSTONE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "red_sandstone_trapdoor"), new BlockItem(RED_SANDSTONE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "red_sandstone_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "cobbled_deepslate_trapdoor"), COBBLED_DEEPSLATE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "cobbled_deepslate_trapdoor"), new BlockItem(COBBLED_DEEPSLATE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "cobbled_deepslate_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "calcite_trapdoor"), CALCITE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "calcite_trapdoor"), new BlockItem(CALCITE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "calcite_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "polished_deepslate_trapdoor"), POLISHED_DEEPSLATE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "polished_deepslate_trapdoor"), new BlockItem(POLISHED_DEEPSLATE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "polished_deepslate_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "basalt_door"), BASALT_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "basalt_door"), new BlockItem(BASALT_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "basalt_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "blackstone_door"), BLACKSTONE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "blackstone_door"), new BlockItem(BLACKSTONE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "blackstone_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "netherrack_door"), NETHERRACK_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "netherrack_door"), new BlockItem(NETHERRACK_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "netherrack_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "end_stone_door"), END_STONE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "end_stone_door"), new BlockItem(END_STONE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "end_stone_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "purpur_door"), PURPUR_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "purpur_door"), new BlockItem(PURPUR_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "purpur_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "quartz_door"), QUARTZ_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "quartz_door"), new BlockItem(QUARTZ_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "quartz_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "nether_brick_door"), NETHER_BRICK_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "nether_brick_door"), new BlockItem(NETHER_BRICK_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "nether_brick_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "prismarine_door"), PRISMARINE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "prismarine_door"), new BlockItem(PRISMARINE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "prismarine_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "bookshelf_door"), BOOKSHELF_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "bookshelf_door"), new BlockItem(BOOKSHELF_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "bookshelf_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "basalt_trapdoor"), BASALT_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "basalt_trapdoor"), new BlockItem(BASALT_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "basalt_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "blackstone_trapdoor"), BLACKSTONE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "blackstone_trapdoor"), new BlockItem(BLACKSTONE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "blackstone_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "netherrack_trapdoor"), NETHERRACK_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "netherrack_trapdoor"), new BlockItem(NETHERRACK_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "netherrack_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "end_stone_trapdoor"), END_STONE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "end_stone_trapdoor"), new BlockItem(END_STONE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "end_stone_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "purpur_trapdoor"), PURPUR_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "purpur_trapdoor"), new BlockItem(PURPUR_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "purpur_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "quartz_trapdoor"), QUARTZ_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "quartz_trapdoor"), new BlockItem(QUARTZ_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "quartz_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "nether_brick_trapdoor"), NETHER_BRICK_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "nether_brick_trapdoor"), new BlockItem(NETHER_BRICK_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "nether_brick_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "prismarine_trapdoor"), PRISMARINE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "prismarine_trapdoor"), new BlockItem(PRISMARINE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "prismarine_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "bookshelf_trapdoor"), BOOKSHELF_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "bookshelf_trapdoor"), new BlockItem(BOOKSHELF_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "bookshelf_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "amethyst_door"), AMETHYST_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "amethyst_door"), new BlockItem(AMETHYST_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "amethyst_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "smooth_stone_door"), SMOOTH_STONE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "smooth_stone_door"), new BlockItem(SMOOTH_STONE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "smooth_stone_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "obsidian_door"), OBSIDIAN_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "obsidian_door"), new BlockItem(OBSIDIAN_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "obsidian_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "brick_door"), BRICK_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "brick_door"), new BlockItem(BRICK_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "brick_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "ice_door"), ICE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "ice_door"), new BlockItem(ICE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "ice_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "glass_door"), GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "glass_door"), new BlockItem(GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "bedrock_door"), BEDROCK_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "bedrock_door"), new BlockItem(BEDROCK_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "bedrock_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "sponge_door"), SPONGE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "sponge_door"), new BlockItem(SPONGE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "sponge_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "dripstone_door"), DRIPSTONE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "dripstone_door"), new BlockItem(DRIPSTONE_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "dripstone_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "mud_brick_door"),MUD_BRICK_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "mud_brick_door"), new BlockItem(MUD_BRICK_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "mud_brick_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "sculk_door"),SCULK_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "sculk_door"), new BlockItem(SCULK_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "sculk_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "amethyst_trapdoor"), AMETHYST_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "amethyst_trapdoor"), new BlockItem(AMETHYST_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "amethyst_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "smooth_stone_trapdoor"), SMOOTH_STONE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "smooth_stone_trapdoor"), new BlockItem(SMOOTH_STONE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "smooth_stone_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "obsidian_trapdoor"), OBSIDIAN_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "obsidian_trapdoor"), new BlockItem(OBSIDIAN_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "obsidian_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "brick_trapdoor"), BRICK_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "brick_trapdoor"), new BlockItem(BRICK_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "brick_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "ice_trapdoor"), ICE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "ice_trapdoor"), new BlockItem(ICE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "ice_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "glass_trapdoor"), GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "glass_trapdoor"), new BlockItem(GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "glass_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "bedrock_trapdoor"), BEDROCK_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "bedrock_trapdoor"), new BlockItem(BEDROCK_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "bedrock_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "sponge_trapdoor"), SPONGE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "sponge_trapdoor"), new BlockItem(SPONGE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "sponge_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "dripstone_trapdoor"), DRIPSTONE_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "dripstone_trapdoor"), new BlockItem(DRIPSTONE_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "dripstone_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "mud_brick_trapdoor"), MUD_BRICK_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "mud_brick_trapdoor"), new BlockItem(MUD_BRICK_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "mud_brick_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "sculk_trapdoor"), SCULK_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "sculk_trapdoor"), new BlockItem(SCULK_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "sculk_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "black_stained_glass_door"), BLACK_STAINED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "black_stained_glass_door"), new BlockItem(BLACK_STAINED_GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "black_stained_glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "black_stained_glass_trapdoor"), BLACK_STAINED_GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "black_stained_glass_trapdoor"), new BlockItem(BLACK_STAINED_GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "black_stained_glass_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "blue_stained_glass_door"), BLUE_STAINED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "blue_stained_glass_door"), new BlockItem(BLUE_STAINED_GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "blue_stained_glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "blue_stained_glass_trapdoor"), BLUE_STAINED_GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "blue_stained_glass_trapdoor"), new BlockItem(BLUE_STAINED_GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "blue_stained_glass_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "brown_stained_glass_door"), BROWN_STAINED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "brown_stained_glass_door"), new BlockItem(BROWN_STAINED_GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "brown_stained_glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "brown_stained_glass_trapdoor"), BROWN_STAINED_GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "brown_stained_glass_trapdoor"), new BlockItem(BROWN_STAINED_GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "brown_stained_glass_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "cyan_stained_glass_door"), CYAN_STAINED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "cyan_stained_glass_door"), new BlockItem(CYAN_STAINED_GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "cyan_stained_glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "cyan_stained_glass_trapdoor"), CYAN_STAINED_GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "cyan_stained_glass_trapdoor"), new BlockItem(CYAN_STAINED_GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "cyan_stained_glass_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "gray_stained_glass_door"), GRAY_STAINED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "gray_stained_glass_door"), new BlockItem(GRAY_STAINED_GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "gray_stained_glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "gray_stained_glass_trapdoor"), GRAY_STAINED_GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "gray_stained_glass_trapdoor"), new BlockItem(GRAY_STAINED_GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "gray_stained_glass_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "green_stained_glass_door"), GREEN_STAINED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "green_stained_glass_door"), new BlockItem(GREEN_STAINED_GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "green_stained_glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "green_stained_glass_trapdoor"), GREEN_STAINED_GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "green_stained_glass_trapdoor"), new BlockItem(GREEN_STAINED_GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "green_stained_glass_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "light_blue_stained_glass_door"), LIGHT_BLUE_STAINED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "light_blue_stained_glass_door"), new BlockItem(LIGHT_BLUE_STAINED_GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "light_blue_stained_glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "light_blue_stained_glass_trapdoor"), LIGHT_BLUE_STAINED_GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "light_blue_stained_glass_trapdoor"), new BlockItem(LIGHT_BLUE_STAINED_GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "light_blue_stained_glass_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "light_gray_stained_glass_door"), LIGHT_GRAY_STAINED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "light_gray_stained_glass_door"), new BlockItem(LIGHT_GRAY_STAINED_GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "light_gray_stained_glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "light_gray_stained_glass_trapdoor"), LIGHT_GRAY_STAINED_GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "light_gray_stained_glass_trapdoor"), new BlockItem(LIGHT_GRAY_STAINED_GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "light_gray_stained_glass_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "lime_stained_glass_door"), LIME_STAINED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "lime_stained_glass_door"), new BlockItem(LIME_STAINED_GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "lime_stained_glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "lime_stained_glass_trapdoor"), LIME_STAINED_GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "lime_stained_glass_trapdoor"), new BlockItem(LIME_STAINED_GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "lime_stained_glass_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "magenta_stained_glass_door"), MAGENTA_STAINED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "magenta_stained_glass_door"), new BlockItem(MAGENTA_STAINED_GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "magenta_stained_glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "magenta_stained_glass_trapdoor"), MAGENTA_STAINED_GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "magenta_stained_glass_trapdoor"), new BlockItem(MAGENTA_STAINED_GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "magenta_stained_glass_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "orange_stained_glass_door"), ORANGE_STAINED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "orange_stained_glass_door"), new BlockItem(ORANGE_STAINED_GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "orange_stained_glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "orange_stained_glass_trapdoor"), ORANGE_STAINED_GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "orange_stained_glass_trapdoor"), new BlockItem(ORANGE_STAINED_GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "orange_stained_glass_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "pink_stained_glass_door"), PINK_STAINED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "pink_stained_glass_door"), new BlockItem(PINK_STAINED_GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "pink_stained_glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "pink_stained_glass_trapdoor"), PINK_STAINED_GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "pink_stained_glass_trapdoor"), new BlockItem(PINK_STAINED_GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "pink_stained_glass_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "purple_stained_glass_door"), PURPLE_STAINED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "purple_stained_glass_door"), new BlockItem(PURPLE_STAINED_GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "purple_stained_glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "purple_stained_glass_trapdoor"), PURPLE_STAINED_GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "purple_stained_glass_trapdoor"), new BlockItem(PURPLE_STAINED_GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "purple_stained_glass_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "red_stained_glass_door"), RED_STAINED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "red_stained_glass_door"), new BlockItem(RED_STAINED_GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "red_stained_glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "red_stained_glass_trapdoor"), RED_STAINED_GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "red_stained_glass_trapdoor"), new BlockItem(RED_STAINED_GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "red_stained_glass_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "white_stained_glass_door"), WHITE_STAINED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "white_stained_glass_door"), new BlockItem(WHITE_STAINED_GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "white_stained_glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "white_stained_glass_trapdoor"), WHITE_STAINED_GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "white_stained_glass_trapdoor"), new BlockItem(WHITE_STAINED_GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "white_stained_glass_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "yellow_stained_glass_door"), YELLOW_STAINED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "yellow_stained_glass_door"), new BlockItem(YELLOW_STAINED_GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "yellow_stained_glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "yellow_stained_glass_trapdoor"), YELLOW_STAINED_GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "yellow_stained_glass_trapdoor"), new BlockItem(YELLOW_STAINED_GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "yellow_stained_glass_trapdoor")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "tinted_glass_door"), TINTED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "tinted_glass_door"), new BlockItem(TINTED_GLASS_DOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "tinted_glass_door")))));

		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath("moredoors", "tinted_glass_trapdoor"), TINTED_GLASS_TRAPDOOR);
		Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "tinted_glass_trapdoor"), new BlockItem(TINTED_GLASS_TRAPDOOR, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("moredoors", "tinted_glass_trapdoor")))));

	}
	}