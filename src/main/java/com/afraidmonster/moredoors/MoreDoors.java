package com.afraidmonster.moredoors;

import com.afraidmonster.moredoors.Block.ModBlocks;
import com.afraidmonster.moredoors.Block.MoreDoorsCreativeTab;
import com.afraidmonster.moredoors.Item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ChunkRenderTypeSet;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.lang.reflect.Field;
import java.util.Map;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MoreDoors.MODID)
public class MoreDoors
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "moredoors";
    public static final String MOD_ID = "moredoors";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "moredoors" namespace

    public MoreDoors()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);


        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(MoreDoorsCreativeTab::registerTab);
        modEventBus.addListener(this::setupClient);






        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab

    }
    // ---- Reflection bridge into vanilla's ItemBlockRenderTypes#TYPE_BY_BLOCK ----
    // Forge 1.21.4 has a confirmed bug (MinecraftForge/MinecraftForge#10526) where
    // ItemBlockRenderTypes.setRenderLayer(Block, RenderType) writes to Forge's own tracking map,
    // but the code that actually renders BlockItems (BlockModelWrapper) reads from vanilla's
    // TYPE_BY_BLOCK map instead. As a result, setRenderLayer(..., RenderType.translucent()) has
    // no visible effect on item rendering. Cutout still works fine since it's the default fallback
    // either way, so only translucent entries need this workaround.
    private static final Map<Block, RenderType> VANILLA_TYPE_BY_BLOCK;

    static {
        try {
            Field field = ItemBlockRenderTypes.class.getDeclaredField("TYPE_BY_BLOCK");
            field.setAccessible(true);
            //noinspection unchecked
            VANILLA_TYPE_BY_BLOCK = (Map<Block, RenderType>) field.get(null);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Failed to access ItemBlockRenderTypes#TYPE_BY_BLOCK via reflection", e);
        }
    }

    /**
     * Marks a block's item AND in-world (chunk) rendering as translucent, working around two
     * separate Forge 1.21.4 bugs:
     *  - #10526: BlockItem rendering reads vanilla's TYPE_BY_BLOCK map, which setRenderLayer never
     *    writes to (fixed here via direct reflection into that map).
     *  - #10294: "render_type" in block model JSON is not honored for in-world chunk rendering;
     *    Forge dev-recommended workaround is calling setRenderLayer(Block, ChunkRenderTypeSet).
     */
    private static void setTranslucent(Block block) {
        // In-world chunk rendering (Forge #10294 workaround)
        ItemBlockRenderTypes.setRenderLayer(block, ChunkRenderTypeSet.of(RenderType.translucent()));
        // BlockItem rendering in hand/inventory (Forge #10526 workaround)
        VANILLA_TYPE_BY_BLOCK.put(block, RenderType.translucent());
    }

    private void setupClient(final FMLClientSetupEvent event) {
      event.enqueueWork(() -> {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GOLD_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DIAMOND_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAPIS_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHERITE_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EMERALD_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.REDSTONE_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COAL_DOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GOLD_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DIAMOND_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAPIS_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHERITE_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EMERALD_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.REDSTONE_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COAL_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANDESITE_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRANITE_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SANDSTONE_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_SANDSTONE_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CALCITE_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POLISHED_DEEPSLATE_DOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COBBLESTONE_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANDESITE_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRANITE_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SANDSTONE_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_SANDSTONE_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COBBLED_DEEPSLATE_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CALCITE_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POLISHED_DEEPSLATE_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BASALT_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHERRACK_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPUR_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHER_BRICK_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PRISMARINE_DOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BASALT_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHERRACK_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPUR_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.QUARTZ_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHER_BRICK_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PRISMARINE_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SMOOTH_STONE_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BRICK_DOOR.get(), RenderType.cutout());
        setTranslucent(ModBlocks.ICE_DOOR.get());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASS_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BEDROCK_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPONGE_DOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SMOOTH_STONE_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BRICK_TRAPDOOR.get(), RenderType.cutout());
        setTranslucent(ModBlocks.ICE_TRAPDOOR.get());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASS_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BEDROCK_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPONGE_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRIPSTONE_TRAPDOOR.get(), RenderType.cutout());

        setTranslucent(ModBlocks.BLACK_STAINED_GLASS_DOOR.get());
        setTranslucent(ModBlocks.BLUE_STAINED_GLASS_DOOR.get());
        setTranslucent(ModBlocks.BROWN_STAINED_GLASS_DOOR.get());
        setTranslucent(ModBlocks.CYAN_STAINED_GLASS_DOOR.get());
        setTranslucent(ModBlocks.GRAY_STAINED_GLASS_DOOR.get());
        setTranslucent(ModBlocks.GREEN_STAINED_GLASS_DOOR.get());
        setTranslucent(ModBlocks.LIGHT_BLUE_STAINED_GLASS_DOOR.get());
        setTranslucent(ModBlocks.LIGHT_GRAY_STAINED_GLASS_DOOR.get());
        setTranslucent(ModBlocks.LIME_STAINED_GLASS_DOOR.get());
        setTranslucent(ModBlocks.MAGENTA_STAINED_GLASS_DOOR.get());
        setTranslucent(ModBlocks.ORANGE_STAINED_GLASS_DOOR.get());
        setTranslucent(ModBlocks.PINK_STAINED_GLASS_DOOR.get());
        setTranslucent(ModBlocks.PURPLE_STAINED_GLASS_DOOR.get());
        setTranslucent(ModBlocks.RED_STAINED_GLASS_DOOR.get());
        setTranslucent(ModBlocks.WHITE_STAINED_GLASS_DOOR.get());
        setTranslucent(ModBlocks.YELLOW_STAINED_GLASS_DOOR.get());
        setTranslucent(ModBlocks.TINTED_GLASS_DOOR.get());
        

        setTranslucent(ModBlocks.BLACK_STAINED_GLASS_TRAPDOOR.get());
        setTranslucent(ModBlocks.BLUE_STAINED_GLASS_TRAPDOOR.get());
        setTranslucent(ModBlocks.BROWN_STAINED_GLASS_TRAPDOOR.get());
        setTranslucent(ModBlocks.CYAN_STAINED_GLASS_TRAPDOOR.get());
        setTranslucent(ModBlocks.GRAY_STAINED_GLASS_TRAPDOOR.get());
        setTranslucent(ModBlocks.GREEN_STAINED_GLASS_TRAPDOOR.get());
        setTranslucent(ModBlocks.LIGHT_BLUE_STAINED_GLASS_TRAPDOOR.get());
        setTranslucent(ModBlocks.LIGHT_GRAY_STAINED_GLASS_TRAPDOOR.get());
        setTranslucent(ModBlocks.LIME_STAINED_GLASS_TRAPDOOR.get());
        setTranslucent(ModBlocks.MAGENTA_STAINED_GLASS_TRAPDOOR.get());
        setTranslucent(ModBlocks.ORANGE_STAINED_GLASS_TRAPDOOR.get());
        setTranslucent(ModBlocks.PINK_STAINED_GLASS_TRAPDOOR.get());
        setTranslucent(ModBlocks.PURPLE_STAINED_GLASS_TRAPDOOR.get());
        setTranslucent(ModBlocks.RED_STAINED_GLASS_TRAPDOOR.get());
        setTranslucent(ModBlocks.WHITE_STAINED_GLASS_TRAPDOOR.get());
        setTranslucent(ModBlocks.YELLOW_STAINED_GLASS_TRAPDOOR.get());
        setTranslucent(ModBlocks.TINTED_GLASS_TRAPDOOR.get());
        setTranslucent(ModBlocks.MUD_BRICK_TRAPDOOR.get());
      });
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {   

    }




    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }







}