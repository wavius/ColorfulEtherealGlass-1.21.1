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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ETHEREAL_GLASS_BLOCK.get()))
                    .title(Component.translatable("creativetab.colorfuletherealglass.colorful_ethereal_glass_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ETHEREAL_GLASS_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
