/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package td1138.bip.library;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import td1138.bip.items.ItemBR_2_Aspect_Signal;
import train.common.items.*;
import train.common.items.slabs.*;
import train.common.wellcar.ItemFortyFootContainer;

public enum BlockIDs {

	BR_2_Aspect_Signal(true, ItemBR_2_Aspect_Signal.class),//ItemBR_2_Aspect_Signal.class


	;

	public Block block;
	public boolean hasItemBlock;
	public Class itemBlockClass;

	BlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass) {
		this.hasItemBlock = hasItemBlock;
		this.itemBlockClass = itemBlockClass;
	}
}
