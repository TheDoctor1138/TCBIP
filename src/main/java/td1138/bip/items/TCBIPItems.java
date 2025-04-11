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

    public static Item RecipeBook = new ItemRecipeBook();
    public static Item itemBR_UK_SpeedSign = new ItemBR_UK_SpeedSign(null);
    public static Item itemBR_Modern_Buffer = new ItemBR_Modern_Buffer(null);
    public static Item itemBR_2_Aspect_Signal = new ItemBR_2_Aspect_Signal(null);
    public static Item itemBR_3_Aspect_Signal = new ItemBR_3_Aspect_Signal(null);
    public static Item itemBR_4_Aspect_Signal = new ItemBR_4_Aspect_Signal(null);

    private static void loadItems() {
        ItemIDs.RecipeBook.item = new td1138.bip.items.ItemRecipeBook();
        ItemIDs.BR_UK_SpeedSign.item = new td1138.bip.items.ItemBR_UK_SpeedSign(null);
        ItemIDs.BR_Modern_Buffer.item = new td1138.bip.items.ItemBR_Modern_Buffer(null);
        ItemIDs.BR_2_Aspect_Signal.item = new td1138.bip.items.ItemBR_2_Aspect_Signal(null);
        ItemIDs.BR_3_Aspect_Signal.item = new td1138.bip.items.ItemBR_3_Aspect_Signal(null);
        ItemIDs.BR_4_Aspect_Signal.item = new td1138.bip.items.ItemBR_4_Aspect_Signal(null);
    }

    public static void registerItems() {
        TraincraftRegistry.RegisterItem(RecipeBook, TCBIPInfo.modID, "RecipeBook", TCBIP.tabBIP);
        TraincraftRegistry.RegisterItem(itemBR_UK_SpeedSign, TCBIPInfo.modID, "BR_UK_SpeedSign", TCBIP.tabBIP);
        TraincraftRegistry.RegisterItem(itemBR_Modern_Buffer, TCBIPInfo.modID, "BR_Modern_Buffer", TCBIP.tabBIP);
        TraincraftRegistry.RegisterItem(itemBR_2_Aspect_Signal, TCBIPInfo.modID, "BR_2_Aspect_Signal", TCBIP.tabBIP);
        TraincraftRegistry.RegisterItem(itemBR_3_Aspect_Signal, TCBIPInfo.modID, "BR_3_Aspect_Signal", TCBIP.tabBIP);
        TraincraftRegistry.RegisterItem(itemBR_4_Aspect_Signal, TCBIPInfo.modID, "BR_4_Aspect_Signal", TCBIP.tabBIP);
    }
}
