package com.wavius.colorfuletherealglass.item;

import com.wavius.colorfuletherealglass.ColorfulEtherealGlass;
import com.wavius.colorfuletherealglass.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ColorfulEtherealGlass.MOD_ID);

    public static final Supplier<CreativeModeTab> COLORFUL_ETHEREAL_GLASS_ITEMS_TAB = CREATIVE_MODE_TAB.register("colorful_ethereal_glass_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ETHEREAL_GLASS_PURPLE_BLOCK.get()))
                    .title(Component.translatable("creativetab.colorfuletherealglass.colorful_ethereal_glass_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ETHEREAL_GLASS_BLOCK);
                        output.accept(ModBlocks.ETHEREAL_GLASS_WHITE_BLOCK);
                        output.accept(ModBlocks.ETHEREAL_GLASS_LIGHTGRAY_BLOCK);
                        output.accept(ModBlocks.ETHEREAL_GLASS_GRAY_BLOCK);
                        output.accept(ModBlocks.ETHEREAL_GLASS_BLACK_BLOCK);
                        output.accept(ModBlocks.ETHEREAL_GLASS_BROWN_BLOCK);
                        output.accept(ModBlocks.ETHEREAL_GLASS_RED_BLOCK);
                        output.accept(ModBlocks.ETHEREAL_GLASS_ORANGE_BLOCK);
                        output.accept(ModBlocks.ETHEREAL_GLASS_YELLOW_BLOCK);
                        output.accept(ModBlocks.ETHEREAL_GLASS_LIME_BLOCK);
                        output.accept(ModBlocks.ETHEREAL_GLASS_GREEN_BLOCK);
                        output.accept(ModBlocks.ETHEREAL_GLASS_CYAN_BLOCK);
                        output.accept(ModBlocks.ETHEREAL_GLASS_LIGHTBLUE_BLOCK);
                        output.accept(ModBlocks.ETHEREAL_GLASS_BLUE_BLOCK);
                        output.accept(ModBlocks.ETHEREAL_GLASS_PURPLE_BLOCK);
                        output.accept(ModBlocks.ETHEREAL_GLASS_MAGENTA_BLOCK);
                        output.accept(ModBlocks.ETHEREAL_GLASS_PINK_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
