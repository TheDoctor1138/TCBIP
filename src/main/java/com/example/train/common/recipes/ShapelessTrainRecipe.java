//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.train.common.recipes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.core.interfaces.ITCRecipe;

public class ShapelessTrainRecipe implements ITCRecipe {
    private final ItemStack recipeOutput;
    public final List recipeItems;

    public ShapelessTrainRecipe(ItemStack par1ItemStack, List par2List) {
        this.recipeOutput = par1ItemStack;
        this.recipeItems = par2List;
    }

    public ItemStack getRecipeOutput() {
        return this.recipeOutput;
    }

    public boolean matches(IInventory inventory, World world) {
        ArrayList var3 = new ArrayList(this.recipeItems);

        for(int i = 0; i < 9; ++i) {
            ItemStack var6 = inventory.getStackInSlot(i);
            if (var6 != null) {
                boolean var7 = false;
                Iterator var8 = var3.iterator();

                while(var8.hasNext()) {
                    ItemStack var9 = (ItemStack)var8.next();
                    if (var6 == var9 && (var9.getItemDamage() == 32767 || var6.getItemDamage() == var9.getItemDamage())) {
                        var7 = true;
                        var3.remove(var9);
                        break;
                    }
                }

                if (!var7) {
                    return false;
                }
            }
        }

        return var3.isEmpty();
    }

    public ItemStack getCraftingResult(IInventory inventory) {
        return this.recipeOutput.copy();
    }

    public int getRecipeSize() {
        return this.recipeItems.size();
    }
}
