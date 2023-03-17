package net.dejeh.bitz;

import com.mojang.logging.LogUtils;
import net.dejeh.bitz.block.ModBlocks;
import net.dejeh.bitz.item.ModCreativeModeTabs;
import net.dejeh.bitz.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Bitz.MOD_ID)
public class Bitz {
    public static final String MOD_ID = "bitz";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Bitz() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.ENDERITE_BLOCK);
        }
        if(event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.ARCANE_DEBRIS);
        }
        if(event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.ENDERITE_SHOVEL);
            event.accept(ModItems.ENDERITE_PICKAXE);
            event.accept(ModItems.ENDERITE_AXE);
            event.accept(ModItems.ENDERITE_HOE);
        }
        if(event.getTab() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.ENDERITE_SWORD);
            event.accept(ModItems.ENDERITE_AXE);
            event.accept(ModItems.ENDERITE_HELMET);
            event.accept(ModItems.ENDERITE_CHESTPLATE);
            event.accept(ModItems.ENDERITE_LEGGINGS);
            event.accept(ModItems.ENDERITE_BOOTS);
            event.accept(ModItems.NETHERITE_HORSE_ARMOR);
            event.accept(ModItems.ENDERITE_HORSE_ARMOR);
        }
        if(event.getTab() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModBlocks.ARCANE_DEBRIS);
            event.accept(ModItems.ENDERITE_SCRAP);
            event.accept(ModItems.ENDERITE_INGOT);
        }
        // mod tab
        if(event.getTab() == ModCreativeModeTabs.BITZ_TAB) {
            event.accept(ModBlocks.ENDERITE_BLOCK);
            event.accept(ModBlocks.ARCANE_DEBRIS);
            event.accept(ModItems.ENDERITE_SHOVEL);
            event.accept(ModItems.ENDERITE_PICKAXE);
            event.accept(ModItems.ENDERITE_AXE);
            event.accept(ModItems.ENDERITE_HOE);
            event.accept(ModItems.ENDERITE_SWORD);
            event.accept(ModItems.ENDERITE_HELMET);
            event.accept(ModItems.ENDERITE_CHESTPLATE);
            event.accept(ModItems.ENDERITE_LEGGINGS);
            event.accept(ModItems.ENDERITE_BOOTS);
            event.accept(ModItems.NETHERITE_HORSE_ARMOR);
            event.accept(ModItems.ENDERITE_HORSE_ARMOR);
            event.accept(ModItems.ENDERITE_SCRAP);
            event.accept(ModItems.ENDERITE_INGOT);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
