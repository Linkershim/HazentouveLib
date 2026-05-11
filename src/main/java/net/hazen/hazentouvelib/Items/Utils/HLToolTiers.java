package net.hazen.hazentouvelib.Items.Utils;

import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.hazen.hazentouvelib.Datagen.HLTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class HLToolTiers {
    public static final Tier MITHRIL = new SimpleTier(HLTags.Blocks.INCORRECT_FOR_MITHRIL_TOOl,
            1400, 6f, 3f, 28, () -> Ingredient.of(ItemRegistry.MITHRIL_SCRAP.get()));
}

