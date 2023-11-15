package com.example.train.common.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;
import com.example.train.common.api.crafting.ITierCraftingManager;
import com.example.train.common.core.managers.TierRecipeManager;
import com.example.train.common.library.AddonItemIDs;
import train.common.library.ItemIDs;

import java.util.ArrayList;
import java.util.List;

public class AssemblyTableRecipes {

    public static void recipes() {
        //initialize these in the function because this only ever gets called on startup, gives a lot of space for GC to do its job.
        ArrayList<ItemStack> ingotIron = OreDictionary.getOres("ingotIron");
        ArrayList<ItemStack> s1 = OreDictionary.getOres("plankWood");
        ArrayList<ItemStack> s2 = OreDictionary.getOres("logWood");
        ArrayList<ItemStack> ingotSteel = OreDictionary.getOres("ingotSteel");
        ArrayList<ItemStack> dyeRed = OreDictionary.getOres("dyeRed"); //1
        ArrayList<ItemStack> dyeYellow = OreDictionary.getOres("dyeYellow"); //11
        ArrayList<ItemStack> dyeOrange = OreDictionary.getOres("dyeOrange");//14
        ArrayList<ItemStack> dyeGreen = OreDictionary.getOres("dyeGreen"); //2
        ArrayList<ItemStack> dyeBlue = OreDictionary.getOres("dyeBlue"); //4
        ArrayList<ItemStack> dyeLightBlue = OreDictionary.getOres("dyeLightBlue");
        ArrayList<ItemStack> dyeBrown = OreDictionary.getOres("dyeBrown"); //3
        ArrayList<ItemStack> dyeGray = OreDictionary.getOres("dyeGray"); //3
        ArrayList<ItemStack> dyeLightGray = OreDictionary.getOres("dyeLightGray"); //7
        ArrayList<ItemStack> dyeBlack = OreDictionary.getOres("dyeBlack");
        ArrayList<ItemStack> dyeWhite = OreDictionary.getOres("dyeWhite");
        ArrayList<ItemStack> dyePurple = OreDictionary.getOres("dyePurple");
        ArrayList<ItemStack> dyeCyan = OreDictionary.getOres("dyeCyan");
        ArrayList<ItemStack> dyePink = OreDictionary.getOres("dyePink");
        ArrayList<ItemStack> dyeLime = OreDictionary.getOres("dyeLime");
        ArrayList<ItemStack> dyeMagenta = OreDictionary.getOres("dyeMagenta");
        List<ItemStack> coal = new ArrayList<ItemStack>();
        coal.add(new ItemStack(Items.coal));
        coal.addAll(OreDictionary.getOres("coal"));
        ArrayList<ItemStack> redstone = OreDictionary.getOres("dustRedstone");
        ArrayList<ItemStack> waterbucket = waterContainers();


        ITierCraftingManager cm = TierRecipeManager.getInstance();

        // Recipes begin here!

        // Tier I

        // Tier II

        // Tier III

        for (ItemStack dye : dyeRed){
            for (ItemStack rs : redstone) {
                cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), null, null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.transformer.item, 2), new ItemStack(ItemIDs.electmotor.item, 2), new ItemStack(rs.getItem(), 4), dye, new ItemStack(AddonItemIDs.minecartNMBS_HLE_18.item, 1), 1);
            }
        }


    }

    public static ArrayList<ItemStack> waterContainers() {
        ArrayList<ItemStack> containers = new ArrayList<ItemStack>();
        for (FluidContainerRegistry.FluidContainerData data : FluidContainerRegistry.getRegisteredFluidContainerData()) {
            if (data.fluid.fluid == FluidRegistry.WATER) {
                containers.add(data.filledContainer);
            }
        }
        return containers;
    }

}
