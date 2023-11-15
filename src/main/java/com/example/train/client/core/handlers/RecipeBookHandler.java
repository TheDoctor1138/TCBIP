package com.example.train.client.core.handlers;

import net.minecraft.item.Item;
import train.common.core.interfaces.ITCRecipe;
import com.example.train.common.core.managers.TierRecipe;
import train.common.library.ItemIDs;
import com.example.train.common.recipes.ShapedTrainRecipes;
import com.example.train.common.recipes.ShapelessTrainRecipe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecipeBookHandler {
    /**
     * This is used to show if the recipe can also be crafted in vanilla workbench
     */
    public static String[] vanillaWorkTableRecipes = new String[1];

    public RecipeBookHandler() {
        vanillaWorkTableRecipes[0] = ItemIDs.recipeBook.item.getUnlocalizedName();

    }

    // TODO: Make parameters more specific than List
    public static List<ITCRecipe> workbenchListCleaner(List recipeList) {
        Set<String> outputs = new HashSet<String>();
        ArrayList<ITCRecipe> cleaned = new ArrayList<ITCRecipe>();
        for(Object r: recipeList) {
            if (r instanceof ShapedTrainRecipes || r instanceof ShapelessTrainRecipe) {
                ITCRecipe recipe = (ITCRecipe) r;
                String output = Item.itemRegistry.getNameForObject(recipe.getRecipeOutput().getItem());
                if (!outputs.contains(output)) {
                    cleaned.add(recipe);
                    outputs.add(output);
                }
            }
        }
        return cleaned;
    }

    // TODO: Make it more generic: TierRecipe -> ITierRecipe
    public static List<TierRecipe> assemblyListCleaner(List recipeList) {
        Set<String> outputs = new HashSet<String>();
        ArrayList<TierRecipe> cleanedList = new ArrayList<TierRecipe>();
        for(Object r: recipeList) {
            if(r instanceof TierRecipe) {
                TierRecipe recipe = (TierRecipe) r;
                String output = Item.itemRegistry.getNameForObject(recipe.getOutput().getItem());
                if (!outputs.contains(output)) {
                    cleanedList.add(recipe);
                    outputs.add(output);
                }
            }
        }
        return cleanedList;
    }
}