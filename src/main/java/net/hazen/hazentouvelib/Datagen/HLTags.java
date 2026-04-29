package net.hazen.hazentouvelib.Datagen;

import net.hazen.hazentouvelib.HazentouveLib;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class HLTags {

    /*
     *** Items
     */

    // Radiance School Focus
    public static final TagKey<Item> RADIANCE_FOCUS = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "focus/radiance_focus").toString()));
    // Shadow School Focus
    public static final TagKey<Item> SHADOW_FOCUS = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "focus/shadow_focus").toString()));
    // Shadow School Focus
    public static final TagKey<Item> COSMIC_FOCUS = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "focus/cosmic_focus").toString()));

    public static final TagKey<Item> ENDER_MASK = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "misc/ender_mask").toString()));

    public static final TagKey<Item> SCHOOL_HELMET = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "armors/school/school_helmet").toString()));
    public static final TagKey<Item> SCHOOL_CHESTPLATE = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "armors/school/school_chestplate").toString()));
    public static final TagKey<Item> SCHOOL_LEGGINGS = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "armors/school/school_leggings").toString()));
    public static final TagKey<Item> SCHOOL_BOOTS = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "armors/school/school_boots").toString()));


    public static final TagKey<Item> NETHERITE_BATTLEMAGE_HELMET = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "armors/netherite_battlemage/netherite_battlemage_helmet").toString()));
    public static final TagKey<Item> NETHERITE_BATTLEMAGE_CHESTPLATE = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "armors/netherite_battlemage/netherite_battlemage_chestplate").toString()));
    public static final TagKey<Item> NETHERITE_BATTLEMAGE_LEGGINGS = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "armors/netherite_battlemage/netherite_battlemage_leggings").toString()));
    public static final TagKey<Item> NETHERITE_BATTLEMAGE_BOOTS = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "armors/netherite_battlemage/netherite_battlemage_boots").toString()));

    public static final TagKey<Item> PURE_HELMET = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "armors/pure/pure_helmet").toString()));
    public static final TagKey<Item> PURE_CHESTPLATE = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "armors/pure/pure_chestplate").toString()));
    public static final TagKey<Item> PURE_LEGGINGS = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "armors/pure/pure_leggings").toString()));
    public static final TagKey<Item> PURE_BOOTS = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "armors/pure/pure_boots").toString()));

    public static final TagKey<Item> PARAGON_HELMET = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "armors/paragon/paragon_helmet").toString()));
    public static final TagKey<Item> PARAGON_CHESTPLATE = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "armors/paragon/paragon_chestplate").toString()));
    public static final TagKey<Item> PARAGON_LEGGINGS = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "armors/paragon/paragon_leggings").toString()));
    public static final TagKey<Item> PARAGON_BOOTS = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "armors/paragon/paragon_boots").toString()));

    /*
     *** Equipment
     */

    public static final TagKey<Item> ENCHANTED_SPELLBOOK = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "enchanted_spellbook").toString()));

    public static final TagKey<Item> FIRE_SPELLBOOK = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "spellbooks/fire_spellbook").toString()));

    public static final TagKey<Item> ICE_SPELLBOOK = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "spellbooks/ice_spellbook").toString()));

    public static final TagKey<Item> NATURE_SPELLBOOK = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "spellbooks/nature_spellbook").toString()));

    public static final TagKey<Item> LIGHTNING_SPELLBOOK = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "spellbooks/lightning_spellbook").toString()));

    public static final TagKey<Item> ENDER_SPELLBOOK = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "spellbooks/ender_spellbook").toString()));

    public static final TagKey<Item> BLOOD_SPELLBOOK = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "spellbooks/blood_spellbook").toString()));

    public static final TagKey<Item> EVOCATION_SPELLBOOK = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "spellbooks/evocation_spellbook").toString()));

    public static final TagKey<Item> HOLY_SPELLBOOK = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "spellbooks/holy_spellbook").toString()));

    public static final TagKey<Item> SHADOW_SPELLBOOK = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "spellbooks/shadow_spellbook").toString()));

    public static final TagKey<Item> RADIANCE_SPELLBOOK = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "spellbooks/radiance_spellbook").toString()));

    public static final TagKey<Item> COSMIC_SPELLBOOK = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "spellbooks/cosmic_spellbook").toString()));

    public static final TagKey<Item> ELDRITCH_SPELLBOOK = ItemTags
            .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "spellbooks/eldritch_spellbook").toString()));


    /*
    *** Entities
     */

    public static final TagKey<EntityType<?>> ASTRAL_CONSTRUCT = TagKey
            .create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "astral_construct"));

    public static final TagKey<EntityType<?>> SPAWNS_OF_ENDER = TagKey
            .create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "spawns_of_ender"));

    public static class Blocks {

        public static final TagKey<Block> NEEDS_MITRHIL_TOOL = BlockTags
                .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "needs_mithril_tool").toString()));

        public static final TagKey<Block> INCORRECT_FOR_MITHRIL_TOOl = BlockTags
                .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "incorrect_for_mithril_tool").toString()));

    }


}