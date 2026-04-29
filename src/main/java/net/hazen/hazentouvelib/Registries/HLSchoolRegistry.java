package net.hazen.hazentouvelib.Registries;

import io.redspace.ironsspellbooks.api.spells.SchoolType;
import io.redspace.ironsspellbooks.registries.SoundRegistry;
import net.hazen.hazentouvelib.Datagen.HLTags;
import net.hazen.hazentouvelib.HazentouveLib;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static io.redspace.ironsspellbooks.api.registry.SchoolRegistry.SCHOOL_REGISTRY_KEY;

public class HLSchoolRegistry {
    private static final DeferredRegister<SchoolType> HNS_SCHOOLS = DeferredRegister.create(SCHOOL_REGISTRY_KEY, HazentouveLib.MOD_ID);

    public static void register(IEventBus eventBus)
    {
        HNS_SCHOOLS.register(eventBus);
    }

    private static Supplier<SchoolType> registerSchool(SchoolType type)
    {
        return HNS_SCHOOLS.register(type.getId().getPath(), () -> type);
    }

    public static final ResourceLocation RADIANCE_RESOURCE = HazentouveLib.id("radiance");

    public static final Supplier<SchoolType> RADIANCE = registerSchool(new SchoolType
            (
                    RADIANCE_RESOURCE,
                    HLTags.RADIANCE_FOCUS,
                    Component.translatable("school.hazentouvelib.radiance")
                            .withStyle(Style.EMPTY.withColor(0xe4a6ea)),
                    HLAttributeRegistry.RADIANCE_SPELL_POWER,
                    HLAttributeRegistry.RADIANCE_SPELL_RESIST,
                    SoundRegistry.EVOCATION_CAST,
                    HLDamageTypes.RADIANCE_MAGIC
            ));

    public static final ResourceLocation SHADOW_RESOURCE = HazentouveLib.id("shadow");

    public static final Supplier<SchoolType> SHADOW = registerSchool(new SchoolType
            (
                    SHADOW_RESOURCE,
                    HLTags.SHADOW_FOCUS,
                    Component.translatable("school.hazentouvelib.shadow")
                            .withStyle(Style.EMPTY.withColor(0x553a7f)),
                    HLAttributeRegistry.SHADOW_SPELL_POWER,
                    HLAttributeRegistry.SHADOW_SPELL_RESIST,
                    SoundRegistry.EVOCATION_CAST,
                    HLDamageTypes.SHADOW_MAGIC
            ));

    public static final ResourceLocation COSMIC_RESOURCE = HazentouveLib.id("cosmic");

    public static final Supplier<SchoolType> COSMIC = registerSchool(new SchoolType
            (
                    COSMIC_RESOURCE,
                    HLTags.COSMIC_FOCUS,
                    Component.translatable("school.hazentouvelib.cosmic")
                            .withStyle(Style.EMPTY.withColor(0x473196)),
                    HLAttributeRegistry.COSMIC_SPELL_POWER,
                    HLAttributeRegistry.COSMIC_SPELL_RESIST,
                    HLSounds.COSMIC_CAST_INSTANT,
                    HLDamageTypes.COSMIC_MAGIC
            ));
    }