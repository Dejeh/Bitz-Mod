package net.dejeh.placehold;

import com.mojang.logging.LogUtils;
import net.dejeh.placehold.block.ModBlocks;
import net.dejeh.placehold.item.ModCreativeModeTabs;
import net.dejeh.placehold.item.ModItems;
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

@Mod(Placehold.MOD_ID)
public class Placehold {
    public static final String MOD_ID = "placehold";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Placehold() {
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
        if(event.getTab() == CreativeModeTabs.COMBAT) {
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
        if(event.getTab() == ModCreativeModeTabs.PLACEHOLD_TAB) {
            event.accept(ModBlocks.ENDERITE_BLOCK);
            event.accept(ModBlocks.ARCANE_DEBRIS);
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
