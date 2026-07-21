/*package afraidmonster.moredoors;


import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

public class moredoorsclient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(moredoors.GOLD_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.DIAMOND_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.GOLD_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.DIAMOND_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.LAPIS_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.LAPIS_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.NETHERITE_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.NETHERITE_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.EMERALD_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.EMERALD_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.REDSTONE_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.REDSTONE_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.COAL_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.COAL_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.ANDESITE_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.ANDESITE_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.PRISMARINE_DOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.POLISHED_DEEPSLATE_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.POLISHED_DEEPSLATE_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.GRANITE_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.NETHER_BRICK_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.NETHER_BRICK_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.PRISMARINE_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.BASALT_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.SANDSTONE_DOOR, ChunkSectionLayer.CUTOUT);                                                                                                                                                              
        BlockRenderLayerMap.putBlock(moredoors.SANDSTONE_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.MUD_BRICK_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.RED_SANDSTONE_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.RED_SANDSTONE_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.PURPUR_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.PURPUR_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.BRICK_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.BRICK_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.NETHERRACK_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.NETHERRACK_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.SMOOTH_STONE_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.ICE_DOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.ICE_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.CALCITE_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.CALCITE_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.GRANITE_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.COBBLESTONE_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.COBBLED_DEEPSLATE_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.BASALT_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.QUARTZ_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.SMOOTH_STONE_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.BEDROCK_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.BEDROCK_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.SPONGE_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.SPONGE_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.DRIPSTONE_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.DRIPSTONE_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(moredoors.BLACK_STAINED_GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT); 
        BlockRenderLayerMap.putBlock(moredoors.BLACK_STAINED_GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.BLUE_STAINED_GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT); 
        BlockRenderLayerMap.putBlock(moredoors.BLUE_STAINED_GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.BROWN_STAINED_GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT); 
        BlockRenderLayerMap.putBlock(moredoors.BROWN_STAINED_GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.CYAN_STAINED_GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT); 
        BlockRenderLayerMap.putBlock(moredoors.CYAN_STAINED_GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.GRAY_STAINED_GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT); 
        BlockRenderLayerMap.putBlock(moredoors.GRAY_STAINED_GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.GREEN_STAINED_GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT); 
        BlockRenderLayerMap.putBlock(moredoors.GREEN_STAINED_GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.LIGHT_BLUE_STAINED_GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT); 
        BlockRenderLayerMap.putBlock(moredoors.LIGHT_BLUE_STAINED_GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.LIGHT_GRAY_STAINED_GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT); 
        BlockRenderLayerMap.putBlock(moredoors.LIGHT_GRAY_STAINED_GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.LIME_STAINED_GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT); 
        BlockRenderLayerMap.putBlock(moredoors.LIME_STAINED_GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.MAGENTA_STAINED_GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT); 
        BlockRenderLayerMap.putBlock(moredoors.MAGENTA_STAINED_GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.ORANGE_STAINED_GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT); 
        BlockRenderLayerMap.putBlock(moredoors.ORANGE_STAINED_GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.PINK_STAINED_GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT); 
        BlockRenderLayerMap.putBlock(moredoors.PINK_STAINED_GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.PURPLE_STAINED_GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT); 
        BlockRenderLayerMap.putBlock(moredoors.PURPLE_STAINED_GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.RED_STAINED_GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT); 
        BlockRenderLayerMap.putBlock(moredoors.RED_STAINED_GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.WHITE_STAINED_GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT); 
        BlockRenderLayerMap.putBlock(moredoors.WHITE_STAINED_GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.YELLOW_STAINED_GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.YELLOW_STAINED_GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.TINTED_GLASS_DOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(moredoors.TINTED_GLASS_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
    }
}
*/