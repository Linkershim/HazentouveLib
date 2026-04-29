package net.hazen.hazentouvelib.Registries;

import net.hazen.hazentouvelib.Effects.GenericHazenEffect;
import net.hazen.hazentouvelib.HazentouveLib;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class HLEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, HazentouveLib.MOD_ID);


    public static final DeferredHolder<MobEffect, MobEffect> HEXED = MOB_EFFECTS.register("hexed",
            () -> new GenericHazenEffect(MobEffectCategory.HARMFUL, 0x2E2EFF));



    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }

}
