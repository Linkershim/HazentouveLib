package net.hazen.hazentouvelib.Items.Shields;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public interface HLKeybindShield {

    void onKeyPacket(Player player, ItemStack stack, int type);

}