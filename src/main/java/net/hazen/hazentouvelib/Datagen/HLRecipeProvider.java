package net.hazen.hazentouvelib.Datagen;

import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.hazen.hazentouvelib.HazentouveLib;
import net.hazen.hazentouvelib.Registries.HLItemRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class HLRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public HLRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        /*
         *** Orbs and Runes
         */


        //Upgrade Orbs
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HLItemRegistry.RADIANCE_UPGRADE_ORB.get())
                .pattern("RRR")
                .pattern("ROR")
                .pattern("RRR")
                .define('R', HLItemRegistry.RADIANCE_RUNE.get())
                .define('O', ItemRegistry.UPGRADE_ORB.get())
                .unlockedBy("has_upgrade_orb", has(ItemRegistry.UPGRADE_ORB.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "crafting/upgrade_orbs/radiance_upgrade_orb"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HLItemRegistry.SHADOW_UPGRADE_ORB.get())
                .pattern("RRR")
                .pattern("ROR")
                .pattern("RRR")
                .define('R', HLItemRegistry.SHADOW_RUNE.get())
                .define('O', ItemRegistry.UPGRADE_ORB.get())
                .unlockedBy("has_upgrade_orb", has(ItemRegistry.UPGRADE_ORB.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "crafting/upgrade_orbs/shadow_upgrade_orb"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HLItemRegistry.COSMIC_UPGRADE_ORB.get())
                .pattern("RRR")
                .pattern("ROR")
                .pattern("RRR")
                .define('R', HLItemRegistry.COSMIC_RUNE.get())
                .define('O', ItemRegistry.UPGRADE_ORB.get())
                .unlockedBy("has_upgrade_orb", has(ItemRegistry.UPGRADE_ORB.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "crafting/upgrade_orbs/cosmic_upgrade_orb"));

        //Runes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HLItemRegistry.RADIANCE_RUNE.get())
                .pattern("RRR")
                .pattern("ROR")
                .pattern("RRR")
                .define('R', HLTags.RADIANCE_FOCUS)
                .define('O', ItemRegistry.BLANK_RUNE.get())
                .unlockedBy("has_blank_rune", has(ItemRegistry.BLANK_RUNE.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "crafting/runes/radiance_rune"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HLItemRegistry.COSMIC_RUNE.get())
                .pattern("RRR")
                .pattern("ROR")
                .pattern("RRR")
                .define('R', HLTags.COSMIC_FOCUS)
                .define('O', ItemRegistry.BLANK_RUNE.get())
                .unlockedBy("has_blank_rune", has(ItemRegistry.BLANK_RUNE.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "crafting/runes/cosmic_rune"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HLItemRegistry.SHADOW_RUNE.get())
                .pattern("RRR")
                .pattern("ROR")
                .pattern("RRR")
                .define('R', HLTags.SHADOW_FOCUS)
                .define('O', ItemRegistry.BLANK_RUNE.get())
                .unlockedBy("has_blank_rune", has(ItemRegistry.BLANK_RUNE.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "crafting/runes/shadow_rune"));
    }
}