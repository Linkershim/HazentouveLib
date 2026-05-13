package net.hazen.hazentouvelib.Items;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public interface HLKeybindItem {

    void onKeyPacket(Player player, ItemStack stack, int type);

}