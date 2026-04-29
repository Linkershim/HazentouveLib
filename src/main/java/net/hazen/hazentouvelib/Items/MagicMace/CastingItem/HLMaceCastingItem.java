package net.hazen.hazentouvelib.Items.MagicMace.CastingItem;

import io.redspace.ironsspellbooks.registries.ComponentRegistry;
import net.minecraft.util.Unit;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.MaceItem;

public class HLMaceCastingItem extends MaceItem {
    public HLMaceCastingItem(Properties pProperties) {
        super(pProperties.component(ComponentRegistry.CASTING_IMPLEMENT, Unit.INSTANCE));
    }

    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return slotChanged;
    }
}

