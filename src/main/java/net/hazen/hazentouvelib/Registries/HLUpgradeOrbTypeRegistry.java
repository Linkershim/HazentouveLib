package net.hazen.hazentouvelib.Registries;

import io.redspace.ironsspellbooks.item.armor.UpgradeOrbType;
import io.redspace.ironsspellbooks.registries.UpgradeOrbTypeRegistry;
import net.hazen.hazentouvelib.HazentouveLib;
import net.minecraft.resources.ResourceKey;

public class HLUpgradeOrbTypeRegistry {

    public static ResourceKey<UpgradeOrbType> RADIANCE_SPELL_POWER = ResourceKey.create(UpgradeOrbTypeRegistry.UPGRADE_ORB_REGISTRY_KEY, HazentouveLib.id("radiance_power"));
    public static ResourceKey<UpgradeOrbType> SHADOW_SPELL_POWER = ResourceKey.create(UpgradeOrbTypeRegistry.UPGRADE_ORB_REGISTRY_KEY, HazentouveLib.id("shadow_power"));
    public static ResourceKey<UpgradeOrbType> COSMIC_SPELL_POWER = ResourceKey.create(UpgradeOrbTypeRegistry.UPGRADE_ORB_REGISTRY_KEY, HazentouveLib.id("cosmic_power"));
    public static ResourceKey<UpgradeOrbType> HYDRO_SPELL_POWER = ResourceKey.create(UpgradeOrbTypeRegistry.UPGRADE_ORB_REGISTRY_KEY, HazentouveLib.id("hydro_power"));


}