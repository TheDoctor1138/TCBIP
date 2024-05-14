/*******************************************************************************
 * Copyright (c) 2012 mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author mrbrutal
 ******************************************************************************/

package com.thedoctor1138.train.common.library;

import net.minecraft.item.Item;

public enum TCMLPItemIDs {

	//Items

	recipeBook("ItemRecipeBook", "item_book_blue", 1),

	//Rollingstock

	minecartNMBS_HLE_18("ItemRollingStock", "hle18", 1),
	minecartEuroFirmaPresidentiale("ItemRollingStock", "eurofima", 1),
	minecartClass74("ItemRollingStock", "Class_74_icon", 1),
	minecartCstockEngine("ItemRollingStock", "C_stock_engine_icon", 1),
	minecartCstockPassenger("ItemRollingStock", "C_stock_passenger_icon", 1),
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
	TCMLPItemIDs(String classMethodName, String iconName, int amountForEmerald) {
		this.className = classMethodName;
		this.iconName = iconName;
		this.amountForEmerald = amountForEmerald;
	}

}