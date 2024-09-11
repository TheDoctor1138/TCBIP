/*******************************************************************************
 * Copyright (c) 2012 mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author mrbrutal
 ******************************************************************************/

package td1138.bip.common.library;

import net.minecraft.item.Item;

public enum TCBIPItemIDs {

	//Items

	recipeBook("ItemRecipeBook", "item_book_black", 1),
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
	minecartBR_MK3_Sleeper("ItemRollingStock", "Mk3_Sleeper_Icon", 2),
	minecartHornby040E2("ItemRollingStock", "Hornby_040_E2_Icon", 4),
	minecart4WheeledCoach("ItemRollingStock", "4_Wheeled_Coach_Icon", 2),
	minecartHornby060E2("ItemRollingStock", "Hornby_060_E2_Icon", 4),

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
	TCBIPItemIDs(String classMethodName, String iconName, int amountForEmerald) {
		this.className = classMethodName;
		this.iconName = iconName;
		this.amountForEmerald = amountForEmerald;
	}

}