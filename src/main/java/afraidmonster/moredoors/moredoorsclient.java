package afraidmonster.moredoors;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;


public class moredoorsclient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.GOLD_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.DIAMOND_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.GOLD_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.DIAMOND_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.LAPIS_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.LAPIS_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.COPPER_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.COPPER_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.NETHERITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.NETHERITE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.EMERALD_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.EMERALD_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.REDSTONE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.REDSTONE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.COAL_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.COAL_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.ANDESITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.ANDESITE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.PRISMARINE_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.POLISHED_DEEPSLATE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.POLISHED_DEEPSLATE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.GRANITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.NETHER_BRICK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.NETHER_BRICK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.PRISMARINE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.BASALT_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.SANDSTONE_DOOR, RenderLayer.getCutout());                                                                                                                                                              
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.SANDSTONE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.MUD_BRICK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.RED_SANDSTONE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.RED_SANDSTONE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.PURPUR_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.PURPUR_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.BRICK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.BRICK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.NETHERRACK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.NETHERRACK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.SMOOTH_STONE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.ICE_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.ICE_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.CALCITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.CALCITE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.GRANITE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.COBBLESTONE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.COBBLED_DEEPSLATE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.BASALT_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.QUARTZ_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.SMOOTH_STONE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.BEDROCK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.BEDROCK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.SPONGE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.SPONGE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.DRIPSTONE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.DRIPSTONE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.BLACK_STAINED_GLASS_DOOR, RenderLayer.getTranslucent()); 
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.BLACK_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.BLUE_STAINED_GLASS_DOOR, RenderLayer.getTranslucent()); 
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.BLUE_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.BROWN_STAINED_GLASS_DOOR, RenderLayer.getTranslucent()); 
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.BROWN_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.CYAN_STAINED_GLASS_DOOR, RenderLayer.getTranslucent()); 
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.CYAN_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.GRAY_STAINED_GLASS_DOOR, RenderLayer.getTranslucent()); 
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.GRAY_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.GREEN_STAINED_GLASS_DOOR, RenderLayer.getTranslucent()); 
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.GREEN_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.LIGHT_BLUE_STAINED_GLASS_DOOR, RenderLayer.getTranslucent()); 
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.LIGHT_BLUE_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.LIGHT_GRAY_STAINED_GLASS_DOOR, RenderLayer.getTranslucent()); 
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.LIGHT_GRAY_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.LIME_STAINED_GLASS_DOOR, RenderLayer.getTranslucent()); 
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.LIME_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.MAGENTA_STAINED_GLASS_DOOR, RenderLayer.getTranslucent()); 
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.MAGENTA_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.ORANGE_STAINED_GLASS_DOOR, RenderLayer.getTranslucent()); 
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.ORANGE_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.PINK_STAINED_GLASS_DOOR, RenderLayer.getTranslucent()); 
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.PINK_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.PURPLE_STAINED_GLASS_DOOR, RenderLayer.getTranslucent()); 
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.PURPLE_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.RED_STAINED_GLASS_DOOR, RenderLayer.getTranslucent()); 
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.RED_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.WHITE_STAINED_GLASS_DOOR, RenderLayer.getTranslucent()); 
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.WHITE_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.YELLOW_STAINED_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.YELLOW_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.TINTED_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(moredoors.TINTED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        
        
        

        

        
    }

    
    
}
