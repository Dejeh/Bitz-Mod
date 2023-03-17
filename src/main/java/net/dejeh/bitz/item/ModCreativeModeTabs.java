package net.dejeh.bitz.item;

import net.dejeh.bitz.Bitz;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Bitz.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab BITZ_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        BITZ_TAB = event.registerCreativeModeTab(new ResourceLocation(Bitz.MOD_ID, "bitz_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.NETHERITE_HORSE_ARMOR.get())).title(Component.translatable("creativemodetab.bitz_tab")));
    }
}
