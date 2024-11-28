/** *****************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 *****************************************************************************
 */
package td1138.bip.items;

import net.minecraft.item.Item;
import td1138.bip.TCBIP;
import train.common.library.TraincraftRegistry;

public class TCBIPItems {

    public static void init() {
        registerItems();
    }

    public static Item itemBIPRecipeBook = new ItemRecipeBook();

    public static void registerItems(){
        TraincraftRegistry.RegisterItem(itemBIPRecipeBook, TCBIP.MODID, "bipRecipeBook", TCBIP.tabBIP);
    }
}
