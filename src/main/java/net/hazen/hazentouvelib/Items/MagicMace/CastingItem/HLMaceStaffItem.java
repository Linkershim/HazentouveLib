package net.hazen.hazentouvelib.Items.MagicMace.CastingItem;

import net.minecraft.world.item.ItemStack;

public class HLMaceStaffItem extends HLMaceCastingItem {
    public HLMaceStaffItem(Properties properties) {
        super(properties);
    }

    public boolean isEnchantable(ItemStack pStack) {
        return true;
    }

    public int getEnchantmentValue(ItemStack stack) {
        return 20;
    }

    public boolean hasCustomRendering() {
        return false;
    }
}
