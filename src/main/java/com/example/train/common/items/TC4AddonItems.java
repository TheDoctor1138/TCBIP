/** *****************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 *****************************************************************************
 */
package com.example.train.common.items;

import com.example.train.common.TC4Addon;
import com.example.train.common.core.TC4AddonsTab;
import com.example.train.common.library.TC4AddonInfo;
import com.example.train.common.library.TC4AddonItemIDs;
import cpw.mods.fml.common.registry.GameRegistry;
import train.common.items.ItemRollingStock;
import train.common.Traincraft;

public class TC4AddonItems {

    public static void init() {
        loadItems();
        registerItems();
    }

    private static void loadItems() {
        for (TC4AddonItemIDs items : TC4AddonItemIDs.values()) {
            if (items.className != null) {
                if (items.className.equals("ItemRollingStock")) {
                    items.item = new ItemRollingStock(TC4AddonInfo.modID.toLowerCase() + ":trains/" + items.iconName, TC4Addon.tcAddonTab);
                }
            }
        }
    }

    private static void registerItems() {
        for (TC4AddonItemIDs itemId : TC4AddonItemIDs.values()) {
            if (itemId.item != null) {
                itemId.item.setUnlocalizedName(TC4AddonInfo.modID + ":" + itemId.name());
                GameRegistry.registerItem(itemId.item, itemId.name());
            }
        }
    }
}
