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
	BIPRecipeBook("ItemRecipeBook", "item_book_black", 1),
	BR_2_Aspect_Signal("ItemTCRail", "BR_2_Aspect_Signal", 2),
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

