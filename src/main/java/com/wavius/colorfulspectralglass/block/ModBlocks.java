package com.wavius.colorfulspectralglass.block;

import com.wavius.colorfulspectralglass.ColorfulSpectralGlass;
import com.wavius.colorfulspectralglass.block.custom.SpectralGlass;
import com.wavius.colorfulspectralglass.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
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
            DeferredRegister.createBlocks(ColorfulSpectralGlass.MOD_ID);


    // Stained ethereal glass method
    private static Block SpectralGlassBlock() {
        return new SpectralGlass(BlockBehaviour.Properties.of()
                .instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn((state, getter, pos, type) -> false).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false));
    }

    // Registered blocks
    public static final DeferredBlock<Block> SPECTRAL_GLASS_BLOCK = registerBlock("spectral_glass", ModBlocks::SpectralGlassBlock);
    public static final DeferredBlock<Block> SPECTRAL_GLASS_BLACK_BLOCK = registerBlock("spectral_glass_black", ModBlocks::SpectralGlassBlock);
    public static final DeferredBlock<Block> SPECTRAL_GLASS_BLUE_BLOCK = registerBlock("spectral_glass_blue", ModBlocks::SpectralGlassBlock);
    public static final DeferredBlock<Block> SPECTRAL_GLASS_BROWN_BLOCK = registerBlock("spectral_glass_brown", ModBlocks::SpectralGlassBlock);
    public static final DeferredBlock<Block> SPECTRAL_GLASS_CYAN_BLOCK = registerBlock("spectral_glass_cyan", ModBlocks::SpectralGlassBlock);
    public static final DeferredBlock<Block> SPECTRAL_GLASS_GRAY_BLOCK = registerBlock("spectral_glass_gray", ModBlocks::SpectralGlassBlock);
    public static final DeferredBlock<Block> SPECTRAL_GLASS_GREEN_BLOCK = registerBlock("spectral_glass_green", ModBlocks::SpectralGlassBlock);
    public static final DeferredBlock<Block> SPECTRAL_GLASS_LIGHTBLUE_BLOCK = registerBlock("spectral_glass_lightblue", ModBlocks::SpectralGlassBlock);
    public static final DeferredBlock<Block> SPECTRAL_GLASS_LIGHTGRAY_BLOCK = registerBlock("spectral_glass_lightgray", ModBlocks::SpectralGlassBlock);
    public static final DeferredBlock<Block> SPECTRAL_GLASS_LIME_BLOCK = registerBlock("spectral_glass_lime", ModBlocks::SpectralGlassBlock);
    public static final DeferredBlock<Block> SPECTRAL_GLASS_MAGENTA_BLOCK = registerBlock("spectral_glass_magenta", ModBlocks::SpectralGlassBlock);
    public static final DeferredBlock<Block> SPECTRAL_GLASS_ORANGE_BLOCK = registerBlock("spectral_glass_orange", ModBlocks::SpectralGlassBlock);
    public static final DeferredBlock<Block> SPECTRAL_GLASS_PINK_BLOCK = registerBlock("spectral_glass_pink", ModBlocks::SpectralGlassBlock);
    public static final DeferredBlock<Block> SPECTRAL_GLASS_PURPLE_BLOCK = registerBlock("spectral_glass_purple", ModBlocks::SpectralGlassBlock);
    public static final DeferredBlock<Block> SPECTRAL_GLASS_RED_BLOCK = registerBlock("spectral_glass_red", ModBlocks::SpectralGlassBlock);
    public static final DeferredBlock<Block> SPECTRAL_GLASS_WHITE_BLOCK = registerBlock("spectral_glass_white", ModBlocks::SpectralGlassBlock);
    public static final DeferredBlock<Block> SPECTRAL_GLASS_YELLOW_BLOCK = registerBlock("spectral_glass_yellow", ModBlocks::SpectralGlassBlock);
}
