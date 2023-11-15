/** *****************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 *****************************************************************************
 */
package com.example.train.common.items;

import com.example.train.common.TC4Addon;
import com.example.train.common.library.Info;
import com.example.train.common.library.AddonItemIDs;
import cpw.mods.fml.common.registry.GameRegistry;
import train.common.items.ItemRollingStock;

public class TC4AddonItems {

    public static void init() {
        loadItems();
        registerItems();
    }

    private static void loadItems() {
        for (AddonItemIDs items :AddonItemIDs.values()) {
            if (items.className != null) {
                if (items.className.equals("ItemRollingStock")) {
                    items.item = new ItemRollingStock(Info.modID.toLowerCase() + ":trains/" + items.iconName, TC4Addon.tc4AddonTab);
                }
            }
        }

        AddonItemIDs.recipeBook.item = new ItemRecipeBook();
    }

    private static void registerItems() {
        for (AddonItemIDs itemId : AddonItemIDs.values()) {
            if (itemId.item != null) {
                itemId.item.setUnlocalizedName(Info.modID + ":" + itemId.name());
                GameRegistry.registerItem(itemId.item, itemId.name());
            }
        }
    }
}
