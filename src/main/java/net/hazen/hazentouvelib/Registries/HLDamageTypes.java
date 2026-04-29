package net.hazen.hazentouvelib.Registries;

import net.hazen.hazentouvelib.HazentouveLib;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageScaling;
import net.minecraft.world.damagesource.DamageType;

public class HLDamageTypes {
    public static ResourceKey<DamageType> register(String name) {
        return ResourceKey.create(
                Registries.DAMAGE_TYPE,
                ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, name).toString())
        );
    }

    public static final ResourceKey<DamageType> RADIANCE_MAGIC = register("radiance_magic");
    public static final ResourceKey<DamageType> SHADOW_MAGIC = register("shadow_magic");
    public static final ResourceKey<DamageType> COSMIC_MAGIC = register("cosmic_magic");
    public static final ResourceKey<DamageType> CORRUPT_MAGIC = register("corrupt_magic");

    public static void bootstrap(BootstrapContext<DamageType> context)
    {
        context.register(RADIANCE_MAGIC, new DamageType(RADIANCE_MAGIC.location().getPath(), DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0F));
        context.register(SHADOW_MAGIC, new DamageType(SHADOW_MAGIC.location().getPath(), DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0F));
        context.register(COSMIC_MAGIC, new DamageType(COSMIC_MAGIC.location().getPath(), DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0F));
        context.register(CORRUPT_MAGIC, new DamageType(CORRUPT_MAGIC.location().getPath(), DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0F));


    }
}