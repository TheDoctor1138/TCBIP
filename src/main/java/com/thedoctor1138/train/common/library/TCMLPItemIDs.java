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

	minecartClass74("ItemRollingStock", "Class_74_icon", 1),
	minecartCstockEngine("ItemRollingStock", "C_stock_engine_icon", 3),
	minecartCstockPassenger("ItemRollingStock", "C_stock_passenger_icon", 1),
	minecartClass20("ItemRollingStock", "Class_20_Icon_Iso", 1),
	minecartClass68("ItemRollingStock", "Class_68_Icon", 4),
	minecartClass88("ItemRollingStock", "Class_88_Icon", 4),
	minecartLessCoWagon("ItemRollingStock", "Less_Co_Wagon_Icon", 2),
	minecartGWRMogul("ItemRollingStock", "GWR_Mogul_Icon", 4),
	minecartChurchward3500GalTender("ItemRollingStock", "Churchward_3500_Gal_Icon", 4),
    minecartNGT6ERLoco("ItemRollingStock", "DuewagNGT6ER_Loco_icon", 2),
	minecartNGT6ERTail("ItemRollingStock", "DuewagNGT6ER_Tail_icon", 2),

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