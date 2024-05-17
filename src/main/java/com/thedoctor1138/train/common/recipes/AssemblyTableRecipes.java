package com.thedoctor1138.train.common.recipes;

import com.thedoctor1138.train.common.library.TCMLPItemIDs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.managers.TierRecipeManager;
import train.common.library.ItemIDs;

import java.util.ArrayList;
import java.util.List;

public class AssemblyTableRecipes {



    public static void recipes() {
        //initialize these in the function because this only ever gets called on startup, gives a lot of space for GC to do its job.
        ArrayList<ItemStack> ingotIron	= OreDictionary.getOres("ingotIron");
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


            for  (ItemStack k :ingotSteel){
            Item itemSteel = k.getItem();
            int itemDamageSteel = k.getItemDamage();

            // TIER 1 //

            // TIER 2 //

            // TIER 3 //

            for (ItemStack dye : dyeRed){
                for (ItemStack rs : redstone){

                }
            }

            for (ItemStack dye : dyeBlue){

            }

        }
            for (ItemStack dye : dyeBlue){
                cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), null, null, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.electmotor.item, 2), new ItemStack(ItemIDs.transformer.item, 2), dye, new ItemStack(TCMLPItemIDs.minecartClass74.item, 1), 1);
                cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(ItemIDs.steel.item, 1), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.generator.item, 2), dye, new ItemStack(TCMLPItemIDs.minecartClass20.item, 1), 1);
                cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), null, null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.transformer.item, 2), new ItemStack(ItemIDs.electmotor.item, 2), new ItemStack(ItemIDs.transformer.item, 4), dye, new ItemStack(TCMLPItemIDs.minecartClass88.item, 1), 1);

        }

    }

        public static ArrayList<ItemStack> waterContainers(){
            ArrayList<ItemStack> containers = new ArrayList<ItemStack>();
            for (FluidContainerRegistry.FluidContainerData data : FluidContainerRegistry.getRegisteredFluidContainerData()){
                if(data.fluid.fluid == FluidRegistry.WATER){
                    containers.add(data.filledContainer);
                }
            }
            return containers;
        }
}
