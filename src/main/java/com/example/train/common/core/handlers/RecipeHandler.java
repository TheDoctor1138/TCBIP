/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package com.example.train.common.core.handlers;

import com.example.train.common.inventory.TC4AddonCraftingManager;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import train.common.inventory.TrainCraftingManager;
import com.example.train.common.library.AddonItemIDs;
import train.common.recipes.RecipesArmorDyes;

import java.util.ArrayList;
import java.util.List;

import static com.example.train.common.recipes.AssemblyTableRecipes.waterContainers;

public class RecipeHandler {

    private static ArrayList<ItemStack> multiNameOreDict(String ... names){
        ArrayList<ItemStack> entries = new ArrayList<ItemStack>();
        for (String name : names){
            entries.addAll(OreDictionary.getOres(name));

        }
        return entries;
    }

    public static void initBlockRecipes() {
        ArrayList<ItemStack> iron = OreDictionary.getOres("ingotIron");
        TrainCraftingManager.instance.getRecipeList().add(new RecipesArmorDyes());

        // Recipe Book
        GameRegistry.addRecipe(new ItemStack(AddonItemIDs.recipeBook.item, 1),  "TTT", "TBT", "TTT", Character.valueOf('T'), Blocks.rail, Character.valueOf('B'), Items.book );


    }

    public static void initItemRecipes() {

        ArrayList<ItemStack> steel = OreDictionary.getOres("ingotSteel");
        ArrayList<ItemStack> iron = OreDictionary.getOres("ingotIron");
        ArrayList<ItemStack> planks = OreDictionary.getOres("plankWood");
        ArrayList<ItemStack> logs = OreDictionary.getOres("logWood");
        ArrayList<ItemStack> plastics	= multiNameOreDict("itemPlastic", "dustPlastic");//dustPlastic for MFR support
        ArrayList<ItemStack> copper = OreDictionary.getOres("ingotCopper");
        ArrayList<ItemStack> dustCoal = OreDictionary.getOres("dustCoal");
        List<ItemStack> coal = new ArrayList<ItemStack>();
        coal.add(new ItemStack(Items.coal));
        coal.addAll(OreDictionary.getOres("coal"));
        ArrayList<ItemStack> redstone = OreDictionary.getOres("dustRedstone");
        ArrayList<ItemStack> waterbucket = waterContainers();

        /* Recipe book */
       TC4AddonCraftingManager.instance.addRecipe(new ItemStack(AddonItemIDs.recipeBook.item, 1),  "TTT", "TBT", "TTT", Character.valueOf('T'), Blocks.rail, Character.valueOf('B'), Items.book );

    }

    public static void initSmeltingRecipes(){

    }

    public static void addDictRecipe(ItemStack stack, Object... obj) {
        ShapedOreRecipe recipe = new ShapedOreRecipe(stack, obj);
        GameRegistry.addRecipe(recipe);
    }
}
