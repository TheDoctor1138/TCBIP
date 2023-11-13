//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.train.common.core.managers;

import java.util.Arrays;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.example.train.common.api.crafting.ITierRecipe;

public class TierRecipe implements ITierRecipe {
    private final int tier;
    private final ItemStack output;
    private final int outputSize;
    private final ItemStack[] stacks;

    public TierRecipe(int tier, ItemStack planks, ItemStack wheels, ItemStack frame, ItemStack coupler, ItemStack chimney, ItemStack cab, ItemStack boiler, ItemStack firebox, ItemStack additional, ItemStack dye, ItemStack output, int outputSize) {
        this.tier = tier;
        this.output = output;
        this.outputSize = outputSize;
        this.stacks = new ItemStack[]{planks, wheels, frame, coupler, chimney, cab, boiler, firebox, additional, dye};
    }

    public int getTier() {
        return this.tier;
    }

    public ItemStack getOutput() {
        return this.output;
    }

    public List<ItemStack> getInput() {
        return Arrays.asList(this.stacks);
    }

    public ItemStack hasComponents(ItemStack... items) {
        for(int i = 0; i < this.stacks.length; ++i) {
            if (!areItemsIdentical(items[i], this.stacks[i])) {
                return null;
            }

            if (!areSizesIdentical(items[i], this.stacks[i])) {
                return null;
            }
        }

        return this.output;
    }

    public static boolean areItemsIdentical(ItemStack inSlot, ItemStack inRecipe) {
        if (inRecipe != null && inSlot != null) {
            if (Item.getIdFromItem(inSlot.getItem()) != Item.getIdFromItem(inRecipe.getItem())) {
                return false;
            } else if (inRecipe.getItemDamage() == 32767) {
                return true;
            } else {
                return inSlot.getItemDamage() == inRecipe.getItemDamage();
            }
        } else {
            return inRecipe == inSlot;
        }
    }

    public static boolean areSizesIdentical(ItemStack inSlot, ItemStack inRecipe) {
        if (inRecipe != null && inSlot != null) {
            return inSlot.stackSize >= inRecipe.stackSize;
        } else {
            return inRecipe == inSlot;
        }
    }

    public int toDecrease(int slot) {
        return slot < this.stacks.length ? this.stacks[slot].stackSize : 0;
    }
}
