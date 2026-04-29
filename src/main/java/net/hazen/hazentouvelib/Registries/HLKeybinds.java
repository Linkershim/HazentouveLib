package net.hazen.hazentouvelib.Registries;

import com.mojang.blaze3d.platform.InputConstants;
import io.redspace.ironsspellbooks.player.ExtendedKeyMapping;
import net.hazen.hazentouvelib.HazentouveLib;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.settings.KeyConflictContext;

@EventBusSubscriber(modid = HazentouveLib.MOD_ID, value = Dist.CLIENT)
public final class HLKeybinds {
    public static final String KEY_BIND_GENERAL_CATEGORY = "key.hazentouvelib.group";

    public static final ExtendedKeyMapping ABILITY_1 = new ExtendedKeyMapping(getResourceName("ability_1"), KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, InputConstants.KEY_H, KEY_BIND_GENERAL_CATEGORY);
    public static final ExtendedKeyMapping ABILITY_2 = new ExtendedKeyMapping(getResourceName("ability_2"), KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, InputConstants.KEY_Y, KEY_BIND_GENERAL_CATEGORY);
    public static final ExtendedKeyMapping ABILITY_3 = new ExtendedKeyMapping(getResourceName("ability_2"), KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, InputConstants.KEY_H, KEY_BIND_GENERAL_CATEGORY);
    public static final ExtendedKeyMapping ABILITY_4 = new ExtendedKeyMapping(getResourceName("ability_2"), KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, InputConstants.KEY_N, KEY_BIND_GENERAL_CATEGORY);
    public static final ExtendedKeyMapping ABILITY_5 = new ExtendedKeyMapping(getResourceName("ability_2"), KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, InputConstants.KEY_I, KEY_BIND_GENERAL_CATEGORY);

    private static String getResourceName(String name) {
        return String.format("key.hazentouvelib.%s", name);
    }

    @SubscribeEvent
    public static void onRegisterKeybinds(RegisterKeyMappingsEvent event) {
        event.register(ABILITY_1);
        event.register(ABILITY_2);
        event.register(ABILITY_3);
        event.register(ABILITY_4);
        event.register(ABILITY_5);
    }
}