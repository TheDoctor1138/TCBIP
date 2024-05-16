/** *****************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 *****************************************************************************
 */
package com.thedoctor1138.train.common.items;

import com.thedoctor1138.train.common.TCMLP;
import com.thedoctor1138.train.common.library.TCMLPInfo;
import com.thedoctor1138.train.common.library.TCMLPItemIDs;
import cpw.mods.fml.common.registry.GameRegistry;
import train.common.items.ItemRollingStock;

public class TCMLPItems {

    public static void init() {
        loadItems();
        registerItems();
    }

    private static void loadItems() {
        for (TCMLPItemIDs items : TCMLPItemIDs.values()) {
            if (items.className != null) {
                if (items.className.equals("ItemRollingStock")) {
                    items.item = new ItemRollingStock(TCMLPInfo.modID.toLowerCase() + ":trains/" + items.iconName, TCMLP.tcMLPTab);
                }
            }
        }

        TCMLPItemIDs.recipeBook.item = new ItemRecipeBook();

    }

    private static void registerItems() {
        for (TCMLPItemIDs itemId : TCMLPItemIDs.values()) {
            if (itemId.item != null) {
                itemId.item.setUnlocalizedName(TCMLPInfo.modID + ":" + itemId.name());
                GameRegistry.registerItem(itemId.item, itemId.name());
            }
        }
    }
}
