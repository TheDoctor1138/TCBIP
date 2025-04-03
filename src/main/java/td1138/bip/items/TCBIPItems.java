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
import td1138.bip.library.TCBIPInfo;
import train.common.library.*;

public class TCBIPItems {

    public static void init() { registerItems(); }

    public static Item itemBIPRecipeBook = new ItemRecipeBook();
    public static Item itemBR_2_Aspect_Signal = new ItemBR_2_Aspect_Signal(null);

    public static void registerItems(){
        TraincraftRegistry.RegisterItem(itemBIPRecipeBook, TCBIPInfo.modID, "bipRecipeBook", TCBIP.tabBIP);
        TraincraftRegistry.RegisterItem(itemBR_2_Aspect_Signal, TCBIPInfo.modID, "BR_2_Aspect_Signal", TCBIP.tabBIP);
    }
}
