package afraidmonster.moredoors;

import net.minecraft.block.TrapdoorBlock;
import net.minecraft.sound.SoundEvent;

public class CustomTrapdoorBlock extends TrapdoorBlock {

    public CustomTrapdoorBlock(Settings settings, SoundEvent closeSound, SoundEvent openSound) {
        super(settings.nonOpaque(), closeSound, openSound);
        //TODO Auto-generated constructor stub
    }
    
}
