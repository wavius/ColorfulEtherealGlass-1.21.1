package com.wavius.colorfuletherealglass.block;

import com.wavius.colorfuletherealglass.ColorfulEtherealGlass;
import com.wavius.colorfuletherealglass.block.custom.EtherealGlass;
import com.wavius.colorfuletherealglass.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StainedGlassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class ModBlocks {

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ColorfulEtherealGlass.MOD_ID);


    // Stained ethereal glass method
    private static Block EtherealGlassBlock() {
        return new EtherealGlass(BlockBehaviour.Properties.of()
                .instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn((state, getter, pos, type) -> false).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false));
    }

    // Registered blocks
    public static final DeferredBlock<Block> ETHEREAL_GLASS_BLOCK = registerBlock("ethereal_glass", ModBlocks::EtherealGlassBlock);
    public static final DeferredBlock<Block> ETHEREAL_GLASS_BLACK_BLOCK = registerBlock("ethereal_glass_black", ModBlocks::EtherealGlassBlock);
    public static final DeferredBlock<Block> ETHEREAL_GLASS_BLUE_BLOCK = registerBlock("ethereal_glass_blue", ModBlocks::EtherealGlassBlock);
    public static final DeferredBlock<Block> ETHEREAL_GLASS_BROWN_BLOCK = registerBlock("ethereal_glass_brown", ModBlocks::EtherealGlassBlock);
    public static final DeferredBlock<Block> ETHEREAL_GLASS_CYAN_BLOCK = registerBlock("ethereal_glass_cyan", ModBlocks::EtherealGlassBlock);
    public static final DeferredBlock<Block> ETHEREAL_GLASS_GRAY_BLOCK = registerBlock("ethereal_glass_gray", ModBlocks::EtherealGlassBlock);
    public static final DeferredBlock<Block> ETHEREAL_GLASS_GREEN_BLOCK = registerBlock("ethereal_glass_green", ModBlocks::EtherealGlassBlock);
    public static final DeferredBlock<Block> ETHEREAL_GLASS_LIGHTBLUE_BLOCK = registerBlock("ethereal_glass_lightblue", ModBlocks::EtherealGlassBlock);
    public static final DeferredBlock<Block> ETHEREAL_GLASS_LIGHTGRAY_BLOCK = registerBlock("ethereal_glass_lightgray", ModBlocks::EtherealGlassBlock);
    public static final DeferredBlock<Block> ETHEREAL_GLASS_LIME_BLOCK = registerBlock("ethereal_glass_lime", ModBlocks::EtherealGlassBlock);
    public static final DeferredBlock<Block> ETHEREAL_GLASS_MAGENTA_BLOCK = registerBlock("ethereal_glass_magenta", ModBlocks::EtherealGlassBlock);
    public static final DeferredBlock<Block> ETHEREAL_GLASS_ORANGE_BLOCK = registerBlock("ethereal_glass_orange", ModBlocks::EtherealGlassBlock);
    public static final DeferredBlock<Block> ETHEREAL_GLASS_PINK_BLOCK = registerBlock("ethereal_glass_pink", ModBlocks::EtherealGlassBlock);
    public static final DeferredBlock<Block> ETHEREAL_GLASS_PURPLE_BLOCK = registerBlock("ethereal_glass_purple", ModBlocks::EtherealGlassBlock);
    public static final DeferredBlock<Block> ETHEREAL_GLASS_RED_BLOCK = registerBlock("ethereal_glass_red", ModBlocks::EtherealGlassBlock);
    public static final DeferredBlock<Block> ETHEREAL_GLASS_WHITE_BLOCK = registerBlock("ethereal_glass_white", ModBlocks::EtherealGlassBlock);
    public static final DeferredBlock<Block> ETHEREAL_GLASS_YELLOW_BLOCK = registerBlock("ethereal_glass_yellow", ModBlocks::EtherealGlassBlock);
}
