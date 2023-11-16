/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package com.thedoctor1138.train.common.core;

import com.thedoctor1138.train.common.library.TCMLPItemIDs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TCMLPCreativeTabTraincraftTrains extends CreativeTabs {

	public TCMLPCreativeTabTraincraftTrains(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(TCMLPItemIDs.minecartNMBS_HLE_18.item);
	}

	@Override
	public String getTranslatedTabLabel() {
		return super.getTabLabel();
	}

	@Override
	public Item getTabIconItem(){return TCMLPItemIDs.minecartNMBS_HLE_18.item;}
}
