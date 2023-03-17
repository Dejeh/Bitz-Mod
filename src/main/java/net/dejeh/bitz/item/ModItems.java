package net.dejeh.bitz.item;

import net.dejeh.bitz.Bitz;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Bitz.MOD_ID);

    public static final RegistryObject<HorseArmorItem> NETHERITE_HORSE_ARMOR = ITEMS.register("netherite_horse_armor",
            () -> new HorseArmorItem(13, "netherite",
                    new Item.Properties().stacksTo(1).fireResistant()));
    public static final RegistryObject<HorseArmorItem> ENDERITE_HORSE_ARMOR = ITEMS.register("enderite_horse_armor",
            () -> new HorseArmorItem(15, "enderite",
                    new Item.Properties().stacksTo(1).fireResistant()));
    public static final RegistryObject<Item> ENDERITE_SCRAP = ITEMS.register("enderite_scrap",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ENDERITE_INGOT = ITEMS.register("enderite_ingot",
            () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> ENDERITE_HELMET = ITEMS.register("enderite_helmet",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE, EquipmentSlot.HEAD,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ENDERITE_CHESTPLATE = ITEMS.register("enderite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE, EquipmentSlot.CHEST,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ENDERITE_LEGGINGS = ITEMS.register("enderite_leggings",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE, EquipmentSlot.LEGS,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ENDERITE_BOOTS = ITEMS.register("enderite_boots",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE, EquipmentSlot.FEET,
                    new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> ENDERITE_SHOVEL = ITEMS.register("enderite_shovel",
            () -> new ShovelItem(ModTiers.ENDERITE, 1.5F, -3F,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ENDERITE_PICKAXE = ITEMS.register("enderite_pickaxe",
            () -> new PickaxeItem(ModTiers.ENDERITE, 1, -2.8F,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ENDERITE_AXE = ITEMS.register("enderite_axe",
            () -> new AxeItem(ModTiers.ENDERITE, 5, -2.9F,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ENDERITE_HOE = ITEMS.register("enderite_hoe",
            () -> new HoeItem(ModTiers.ENDERITE, -5, 1F,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ENDERITE_SWORD = ITEMS.register("enderite_sword",
            () -> new SwordItem(ModTiers.ENDERITE, 3, -2.4F,
                    new Item.Properties().fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
