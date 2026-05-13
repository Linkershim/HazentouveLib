package net.hazen.hazentouvelib.Items;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public record HLMessageItemKey(int playerId, int typ)
        implements CustomPacketPayload {

    public static final Type<HLMessageItemKey> TYPE =
            new Type<>(ResourceLocation.fromNamespaceAndPath("hazentouvelib", "weapon_key"));

    public static final StreamCodec<RegistryFriendlyByteBuf, HLMessageItemKey>
            STREAM_CODEC =
            CustomPacketPayload.codec(
                    HLMessageItemKey::write,
                    HLMessageItemKey::new
            );

    public HLMessageItemKey(FriendlyByteBuf buf) {
        this(buf.readInt(), buf.readInt());
    }

    public void write(FriendlyByteBuf buf) {
        buf.writeInt(this.playerId);
        buf.writeInt(this.typ);
    }

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    public static void handle(
            HLMessageItemKey message,
            IPayloadContext context
    ) {
        if (!context.flow().isServerbound()) {
            return;
        }

        context.enqueueWork(() -> {
            Player player = context.player();
            if (player == null) {
                return;
            }

            // Check main hand first
            ItemStack mainHand = player.getMainHandItem();

            if (mainHand.getItem() instanceof HLKeybindItem weapon) {
                weapon.onKeyPacket(player, mainHand, message.typ);
                return;
            }

            // Then offhand
            ItemStack offHand = player.getOffhandItem();

            if (offHand.getItem() instanceof HLKeybindItem weapon) {
                weapon.onKeyPacket(player, offHand, message.typ);
            }
        });
    }
}