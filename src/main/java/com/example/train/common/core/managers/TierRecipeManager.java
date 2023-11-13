//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.train.common.core.managers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.example.train.common.api.crafting.ITierCraftingManager;
import com.example.train.common.api.crafting.ITierRecipe;

public class TierRecipeManager implements ITierCraftingManager {
    private final List<ITierRecipe> recipeList = new ArrayList();
    private static TierRecipeManager instance = new TierRecipeManager();

    public TierRecipeManager() {
    }

    public static ITierCraftingManager getInstance() {
        return instance;
    }

    public void addRecipe(int tier, ItemStack planks, ItemStack wheels, ItemStack frame, ItemStack coupler, ItemStack chimney, ItemStack cab, ItemStack boiler, ItemStack firebox, ItemStack additional, ItemStack dye, ItemStack output, int outputSize) {
        if (tier > 0 && tier < 4 && outputSize > 0 && outputSize < 65) {
            this.addRecipeFinal(tier, planks, wheels, frame, coupler, chimney, cab, boiler, firebox, additional, dye, output, outputSize);
        } else {
            this.addRecipeFinal(1, planks, wheels, frame, coupler, chimney, cab, boiler, firebox, additional, dye, output, 1);
        }

    }

    public void addRecipeFinal(int tier, ItemStack planks, ItemStack wheels, ItemStack frame, ItemStack coupler, ItemStack chimney, ItemStack cab, ItemStack boiler, ItemStack firebox, ItemStack additional, ItemStack dye, ItemStack output, int outputSize) {
        this.recipeList.add(new TierRecipe(tier, planks, wheels, frame, coupler, chimney, cab, boiler, firebox, additional, dye, output, outputSize));
    }

    public ITierRecipe getTierRecipe(int tier, ItemStack output) {
        if (output == null) {
            return null;
        } else {
            Iterator var3 = this.recipeList.iterator();

            ITierRecipe recipe;
            do {
                if (!var3.hasNext()) {
                    return null;
                }

                recipe = (ITierRecipe)var3.next();
            } while(Item.getIdFromItem(recipe.getOutput().getItem()) != Item.getIdFromItem(output.getItem()) || recipe.getTier() != tier);

            return recipe;
        }
    }

    public List<ITierRecipe> getRecipeList() {
        return new ArrayList(this.recipeList);
    }

    public List<ITierRecipe> getTierRecipeList(int tier) {
        List<ITierRecipe> list = new ArrayList();
        Iterator var3 = this.recipeList.iterator();

        while(var3.hasNext()) {
            ITierRecipe recipe = (ITierRecipe)var3.next();
            if (recipe.getTier() == tier) {
                list.add(recipe);
            }
        }

        return list;
    }
}
