/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package td1138.bip.library;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import td1138.bip.items.*;
import train.common.items.*;
import train.common.items.slabs.*;
import train.common.wellcar.ItemFortyFootContainer;

public enum BlockIDs {

	BR_UK_SpeedSign(true, ItemBR_UK_SpeedSign.class),//ItemBR_UK_SpeedSign.class
	BR_UK_SpeedSign_EPS(true, ItemBR_UK_SpeedSign_EPS.class),//ItemBR_UK_SpeedSign_EPS.class
	BR_Modern_Buffer(true, ItemBR_Modern_Buffer.class),//ItemBR_Modern_Buffer.class
	BR_2_Aspect_Signal(true, ItemBR_2_Aspect_Signal.class),//ItemBR_2_Aspect_Signal.class
	BR_3_Aspect_Signal(true, ItemBR_3_Aspect_Signal.class),//ItemBR_3_Aspect_Signal.class
	BR_4_Aspect_Signal(true, ItemBR_4_Aspect_Signal.class),//ItemBR_4_Aspect_Signal.class
	Platform_Slab_Diagonal_Left(true, ItemPlatform_Slab_Diagonal_Left.class),//ItemPlatform_Slab_Diagonal_Left.class
	Platform_Slab_Diagonal_Right(true, ItemPlatform_Slab_Diagonal_Right.class),//ItemPlatform_Slab_Diagonal_Right.class
	Platform_Slab_Diagonal_End(true, ItemPlatform_Slab_Diagonal_End.class),//ItemPlatform_Slab_Diagonal_End.class
	Platform_Slab_End_Left(true, ItemPlatform_Slab_End_Left.class),//ItemPlatform_Slab_End_Left.class
	Platform_Slab_End_Right(true, ItemPlatform_Slab_End_Right.class),//ItemPlatform_Slab_End_Right.class
	Platform_Slab_10x10_Outside(true, ItemPlatform_Slab_10x10_Outside.class),//ItemPlatform_Slab_10x10_Outside.class


	;

	public Block block;
	public boolean hasItemBlock;
	public Class itemBlockClass;

	BlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass) {
		this.hasItemBlock = hasItemBlock;
		this.itemBlockClass = itemBlockClass;
	}
}
