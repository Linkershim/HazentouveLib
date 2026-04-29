package net.hazen.hazentouvelib.Setup;

import net.hazen.hazentouvelib.HazentouveLib;
import net.hazen.hazentouvelib.Items.Armor.HLMessageArmorKey;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;

@EventBusSubscriber

public class HLPayloadHandler {

    @SubscribeEvent
    public static void register(final RegisterPayloadHandlersEvent event) {
        final PayloadRegistrar payloadRegistrar = event.registrar(HazentouveLib.MOD_ID).versioned("1.0.0").optional();

        payloadRegistrar.playToServer(HLMessageArmorKey.TYPE, HLMessageArmorKey.STREAM_CODEC, HLMessageArmorKey::handle);

    }
}
