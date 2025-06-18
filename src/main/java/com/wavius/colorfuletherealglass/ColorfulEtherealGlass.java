package com.wavius.colorfuletherealglass;

import com.wavius.colorfuletherealglass.block.ModBlocks;
import com.wavius.colorfuletherealglass.item.ModCreativeModeTabs;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTabs;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import static com.wavius.colorfuletherealglass.item.ModItems.register;

@Mod(ColorfulEtherealGlass.MOD_ID)
public class ColorfulEtherealGlass {
    public static final String MOD_ID = "colorfuletherealglass";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ColorfulEtherealGlass(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);
        register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {
            event.accept(ModBlocks.ETHEREAL_GLASS_BLOCK);
            event.accept(ModBlocks.ETHEREAL_GLASS_WHITE_BLOCK);
            event.accept(ModBlocks.ETHEREAL_GLASS_LIGHTGRAY_BLOCK);
            event.accept(ModBlocks.ETHEREAL_GLASS_GRAY_BLOCK);
            event.accept(ModBlocks.ETHEREAL_GLASS_BLACK_BLOCK);
            event.accept(ModBlocks.ETHEREAL_GLASS_BROWN_BLOCK);
            event.accept(ModBlocks.ETHEREAL_GLASS_RED_BLOCK);
            event.accept(ModBlocks.ETHEREAL_GLASS_ORANGE_BLOCK);
            event.accept(ModBlocks.ETHEREAL_GLASS_YELLOW_BLOCK);
            event.accept(ModBlocks.ETHEREAL_GLASS_LIME_BLOCK);
            event.accept(ModBlocks.ETHEREAL_GLASS_GREEN_BLOCK);
            event.accept(ModBlocks.ETHEREAL_GLASS_CYAN_BLOCK);
            event.accept(ModBlocks.ETHEREAL_GLASS_LIGHTBLUE_BLOCK);
            event.accept(ModBlocks.ETHEREAL_GLASS_BLUE_BLOCK);
            event.accept(ModBlocks.ETHEREAL_GLASS_PURPLE_BLOCK);
            event.accept(ModBlocks.ETHEREAL_GLASS_MAGENTA_BLOCK);
            event.accept(ModBlocks.ETHEREAL_GLASS_PINK_BLOCK);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // sets render type to cutout mipped
            // render_type in block's JSON is ignored by Fusion
            // setRenderLayer is deprecated and needs to be changed
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_GLASS_BLOCK.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_GLASS_WHITE_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_GLASS_LIGHTGRAY_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_GLASS_GRAY_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_GLASS_BLACK_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_GLASS_BROWN_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_GLASS_RED_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_GLASS_ORANGE_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_GLASS_YELLOW_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_GLASS_LIME_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_GLASS_GREEN_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_GLASS_CYAN_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_GLASS_LIGHTBLUE_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_GLASS_BLUE_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_GLASS_PURPLE_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_GLASS_MAGENTA_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_GLASS_PINK_BLOCK.get(), RenderType.translucent());
        }
    }
}
