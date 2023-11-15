//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.train.common.recipes;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import train.common.core.interfaces.ITCRecipe;
import train.common.core.util.TraincraftUtil;

public class ShapedTrainRecipes implements ITCRecipe {
    public final int recipeWidth;
    public final int recipeHeight;
    public final ItemStack[] recipeItems;
    public boolean[] slots;
    private ItemStack recipeOutput;
    public final int recipeOutputItemID;
    private boolean field_92049_f = false;

    public ShapedTrainRecipes(int par1, int par2, ItemStack[] stacks, ItemStack stack) {
        this.recipeOutputItemID = Item.getIdFromItem(stack.getItem());
        this.recipeWidth = par1;
        this.recipeHeight = par2;
        this.recipeItems = stacks;
        this.recipeOutput = stack;
        this.slots = new boolean[9];
    }

    public ItemStack getRecipeOutput() {
        return this.recipeOutput;
    }

    public boolean matches(IInventory inventory, World world) {
        int i;
        for(i = 0; i < this.slots.length; ++i) {
            this.slots[i] = false;
        }

        this.checkMatch(inventory, true);

        for(i = 0; i < this.slots.length; ++i) {
            if (!this.slots[i]) {
                return false;
            }
        }

        return true;
    }

    private boolean checkMatch(IInventory inventory, boolean par4) {
        for(int i = 0; i < 9; ++i) {
            ItemStack var9 = this.recipeItems[i];
            ItemStack var10 = inventory.getStackInSlot(i);
            if (var10 == null && var9 == null) {
                this.slots[i] = true;
            } else if (var10 != null && var9 != null) {
                if (TraincraftUtil.itemStackMatches(var9, var10) && var9.stackSize <= var10.stackSize) {
                    if (var9.getItemDamage() != 32767 && var9.getItemDamage() != var10.getItemDamage()) {
                        this.slots[i] = false;
                    } else {
                        this.slots[i] = true;
                    }
                } else {
                    this.slots[i] = false;
                }
            } else {
                this.slots[i] = false;
            }
        }

        return true;
    }

    public ItemStack getCraftingResult(IInventory inventory) {
        ItemStack var2 = this.getRecipeOutput().copy();
        if (this.field_92049_f) {
            for(int var3 = 0; var3 < inventory.getSizeInventory(); ++var3) {
                ItemStack var4 = inventory.getStackInSlot(var3);
                if (var4 != null && var4.hasTagCompound()) {
                    var2.setTagCompound((NBTTagCompound)var4.stackTagCompound.copy());
                }
            }
        }

        return var2;
    }

    public int getRecipeSize() {
        return this.recipeWidth * this.recipeHeight;
    }

    public ShapedTrainRecipes func_92048_c() {
        this.field_92049_f = true;
        return this;
    }
}
