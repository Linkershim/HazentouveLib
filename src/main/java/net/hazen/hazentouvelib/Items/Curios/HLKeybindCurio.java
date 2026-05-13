package net.hazen.hazentouvelib.Items.Curios;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public interface HLKeybindCurio {

    void onKeyPacket(Player player, ItemStack stack, int type);

}