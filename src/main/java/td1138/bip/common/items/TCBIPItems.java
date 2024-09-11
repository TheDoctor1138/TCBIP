/** *****************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 *****************************************************************************
 */
package td1138.bip.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import td1138.bip.common.TCBIP;
import td1138.bip.common.library.TCBIPInfo;
import td1138.bip.common.library.TCBIPItemIDs;
import train.common.items.ItemRollingStock;

public class TCBIPItems {

    public static void init() {
        loadItems();
        registerItems();
    }

    private static void loadItems() {

        TCBIPItemIDs.recipeBook.item = new ItemRecipeBook();
        for (TCBIPItemIDs items : TCBIPItemIDs.values()) {
            if (items.className != null) {
                if (items.className.equals("ItemRollingStock")) {
                    items.item = new ItemRollingStock(TCBIPInfo.modID.toLowerCase() + ":trains/" + items.iconName, TCBIP.tabBIP);
                }
            }
        }



    }

    private static void registerItems() {
        for (TCBIPItemIDs itemId : TCBIPItemIDs.values()) {
            if (itemId.item != null) {
                itemId.item.setUnlocalizedName(TCBIPInfo.modID + ":" + itemId.name());
                GameRegistry.registerItem(itemId.item, itemId.name());
            }
        }
    }
}
