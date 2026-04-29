package net.hazen.hazentouvelib.Datagen;

import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.hazen.hazentouvelib.HazentouveLib;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class HLTagProvider extends ItemTagsProvider  {
    public HLTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, HazentouveLib.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(HLTags.ENDER_MASK)
                .add(Items.CARVED_PUMPKIN)
        ;

        tag(HLTags.FIRE_SPELLBOOK)
                .add(
                        ItemRegistry.BLAZE_SPELL_BOOK.get()
                )
        ;

        tag(HLTags.ICE_SPELLBOOK)
                .add(
                        ItemRegistry.ICE_SPELL_BOOK.get()
                )
        ;

        tag(HLTags.NATURE_SPELLBOOK)
                .add(
                        ItemRegistry.DRUIDIC_SPELL_BOOK.get()
                )
        ;

        tag(HLTags.ENDER_SPELLBOOK)
                .add(
                        ItemRegistry.DRAGONSKIN_SPELL_BOOK.get()
                )
        ;

        tag(HLTags.BLOOD_SPELLBOOK)
                .add(
                        ItemRegistry.CURSED_DOLL_SPELLBOOK.get()
                )
        ;

        tag(HLTags.EVOCATION_SPELLBOOK)
                .add(
                        ItemRegistry.EVOKER_SPELL_BOOK.get()
                )
        ;

        tag(HLTags.HOLY_SPELLBOOK)
                .add(
                        ItemRegistry.VILLAGER_SPELL_BOOK.get()
                )
        ;


    }
}