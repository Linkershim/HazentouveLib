package net.hazen.hazentouvelib.Items.Utils;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.state.BlockState;

public class PickaxeAxe extends AxeItem {
    public PickaxeAxe(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public boolean isCorrectToolForDrops(ItemStack stack, BlockState state) {
        return state.is(BlockTags.MINEABLE_WITH_PICKAXE) || state.is(BlockTags.MINEABLE_WITH_AXE);
    }
}
