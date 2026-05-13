package net.hazen.hazentouvelib.Items.Shields;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public record HLMessageShieldKey(int playerId, int typ)
        implements CustomPacketPayload {

    public static final Type<HLMessageShieldKey> TYPE =
            new Type<>(ResourceLocation.fromNamespaceAndPath("hazentouvelib", "shield_key"));

    public static final StreamCodec<RegistryFriendlyByteBuf, HLMessageShieldKey>
            STREAM_CODEC =
            CustomPacketPayload.codec(
                    HLMessageShieldKey::write,
                    HLMessageShieldKey::new
            );

    public HLMessageShieldKey(FriendlyByteBuf buf) {
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
            HLMessageShieldKey message,
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
            ItemStack stack = player.getUseItem();
            if (stack.isEmpty()) {
                return;
            }
            if (!player.isUsingItem()) {
                return;
            }
            if (stack.getItem() instanceof HLKeybindShield shield) {
                shield.onKeyPacket(player, stack, message.typ);
            }
        });
    }
}