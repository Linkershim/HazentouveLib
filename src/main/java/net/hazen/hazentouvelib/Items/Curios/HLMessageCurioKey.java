package net.hazen.hazentouvelib.Items.Curios;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import top.theillusivec4.curios.api.CuriosApi;

public record HLMessageCurioKey(int playerId, int typ)
        implements CustomPacketPayload {

    public static final Type<HLMessageCurioKey> TYPE =
            new Type<>(ResourceLocation.fromNamespaceAndPath("hazentouvelib", "curio_key"));

    public static final StreamCodec<RegistryFriendlyByteBuf, HLMessageCurioKey>
            STREAM_CODEC =
            CustomPacketPayload.codec(
                    HLMessageCurioKey::write,
                    HLMessageCurioKey::new
            );

    public HLMessageCurioKey(FriendlyByteBuf buf) {
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
            HLMessageCurioKey message,
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

            CuriosApi.getCuriosInventory(player).ifPresent(handler -> {

                for (var stacksHandler : handler.getCurios().values()) {

                    var stacks = stacksHandler.getStacks();

                    for (int i = 0; i < stacks.getSlots(); i++) {

                        ItemStack stack = stacks.getStackInSlot(i);

                        if (stack.isEmpty()) {
                            continue;
                        }

                        if (stack.getItem() instanceof HLKeybindCurio curio) {
                            curio.onKeyPacket(player, stack, message.typ);
                        }
                    }
                }
            });
        });
    }
}