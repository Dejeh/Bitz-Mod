package net.dejeh.bitz.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier ENDERITE = new ForgeTier(4, 2439, 10.0F,
            5.0F, 20, Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ModItems.ENDERITE_INGOT.get()));
}
