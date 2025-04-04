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
import td1138.bip.library.ItemIDs;
import td1138.bip.library.TCBIPInfo;
import train.common.library.*;

public class TCBIPItems {

    public static void init() {
        registerItems();
        loadItems();
    }

    public static Item BIPRecipeBook = new ItemRecipeBook();
    public static Item itemBR_2_Aspect_Signal = new ItemBR_2_Aspect_Signal(null);

    private static void loadItems() {
        ItemIDs.BIPRecipeBook.item = new td1138.bip.items.ItemRecipeBook();
        ItemIDs.BR_2_Aspect_Signal.item = new td1138.bip.items.ItemBR_2_Aspect_Signal(null);
    }

    public static void registerItems() {
        TraincraftRegistry.RegisterItem(BIPRecipeBook, TCBIPInfo.modID, "BIPRecipeBook", TCBIP.tabBIP);
        TraincraftRegistry.RegisterItem(itemBR_2_Aspect_Signal, TCBIPInfo.modID, "BR_2_Aspect_Signal", TCBIP.tabBIP);
    }
}
