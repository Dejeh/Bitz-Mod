package net.dejeh.placehold.item;

import net.dejeh.placehold.Placehold;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Placehold.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab PLACEHOLD_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        PLACEHOLD_TAB = event.registerCreativeModeTab(new ResourceLocation(Placehold.MOD_ID, "placehold_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.NETHERITE_HORSE_ARMOR.get())).title(Component.translatable("creativemodetab.placehold_tab")));
    }
}
