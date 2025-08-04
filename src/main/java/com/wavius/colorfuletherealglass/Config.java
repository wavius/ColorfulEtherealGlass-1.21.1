package com.wavius.colorfuletherealglass;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@EventBusSubscriber(modid = ColorfulEtherealGlass.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final ModConfigSpec.BooleanValue CONNECT_TO_OTHER_GLASS = BUILDER
            .comment("Whether ethereal glass will have connecting textures to all other types of ethereal glass")
            .define("connectToOtherGlass", true);

    public static boolean connectToOtherGlass;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        connectToOtherGlass = CONNECT_TO_OTHER_GLASS.get();
    }
}