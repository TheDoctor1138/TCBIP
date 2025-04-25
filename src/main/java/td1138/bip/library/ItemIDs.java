/*******************************************************************************
 * Copyright (c) 2012 mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author mrbrutal
 ******************************************************************************/

package td1138.bip.library;

import net.minecraft.item.Item;
import train.common.api.IItemIDs;

public enum ItemIDs implements IItemIDs {
	RecipeBook("ItemRecipeBook", "item_book_black", 1),
	BR_UK_SpeedSign("ItemTCRail", "br_uk_speedsign", 2),
	BR_UK_SpeedSign_EPS("ItemTCRail", "br_uk_speedsign_eps", 2),
	BR_Modern_Buffer("ItemTCRail", "br_modern_buffer", 2),
	BR_2_Aspect_Signal("ItemTCRail", "br_2_aspect_signal", 2),
	BR_3_Aspect_Signal("ItemTCRail", "br_3_aspect_signal", 2),
	BR_4_Aspect_Signal("ItemTCRail", "br_4_aspect_signal", 2),
	Platform_Slab_Diagonal("ItemBlock", "platform_slab_diagonal", 1),
	Platform_Slab_Diagonal_End("ItemBlock", "platform_slab_diagonal", 1),
	;

	public Item item;
	public String className;
	public String iconName;

	/**
	 * amount for one emerald. For ItemRollingStock, it is the price for one train
	 */
	public int amountForEmerald;



	/**
	 * @param classMethodName
	 * @param iconName
	 * @param amountForEmerald for one emerald. For ItemRollingStock, it is the price for one train
	 */
	ItemIDs(String classMethodName, String iconName, int amountForEmerald) {
		this.className = classMethodName;
		this.iconName = iconName;
		this.amountForEmerald = amountForEmerald;
	}


	@Override
	public Item getItem() {
		return this.item;
	}

	public String getItemName() {
		return this.item.getUnlocalizedName().replace("tc:", "");
	}
}

