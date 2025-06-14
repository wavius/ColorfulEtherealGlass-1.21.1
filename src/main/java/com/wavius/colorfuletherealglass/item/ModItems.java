package com.wavius.colorfuletherealglass.item;

import com.wavius.colorfuletherealglass.ColorfulEtherealGlass;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ColorfulEtherealGlass.MOD_ID);

    public static final DeferredItem<Item> ETHEREAL_GLASS_ITEM = ITEMS.register("ethereal_glass",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
