/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package td1138.bip.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import td1138.bip.TCBIP;
import td1138.bip.blocks.blockSwitch.BlockBR_2_Aspect_Signal;
import td1138.bip.blocks.blockSwitch.BlockBR_3_Aspect_Signal;
import td1138.bip.blocks.blockSwitch.BlockBR_4_Aspect_Signal;
import td1138.bip.library.BlockIDs;
import td1138.bip.library.TCBIPInfo;
import train.common.Traincraft;
import train.common.library.Info;
import train.common.library.TraincraftRegistry;

public class TCBlocks {

	public static void init() {
		loadBlocks();
		registerBlocks();
		setHarvestLevels();
	}

	public static Block BR_Modern_Buffer = new BlockBR_Modern_Buffer().setHardness(1F);
	public static Block BR_2_Aspect_Signal = new BlockBR_2_Aspect_Signal().setHardness(1F);
	public static Block BR_3_Aspect_Signal = new BlockBR_3_Aspect_Signal().setHardness(1F);
	public static Block BR_4_Aspect_Signal = new BlockBR_4_Aspect_Signal().setHardness(1F);


	public static void loadBlocks() {

		BlockIDs.BR_Modern_Buffer.block = new BlockBR_Modern_Buffer().setHardness(1F).setResistance(10F).setLightLevel(0.2F).setCreativeTab(TCBIP.tabBIP).setStepSound(Block.soundTypeMetal);
		BlockIDs.BR_2_Aspect_Signal.block = new BlockBR_2_Aspect_Signal().setHardness(1F).setResistance(10F).setLightLevel(0.2F).setCreativeTab(TCBIP.tabBIP).setStepSound(Block.soundTypeMetal);
		BlockIDs.BR_3_Aspect_Signal.block = new BlockBR_3_Aspect_Signal().setHardness(1F).setResistance(10F).setLightLevel(0.2F).setCreativeTab(TCBIP.tabBIP).setStepSound(Block.soundTypeMetal);
		BlockIDs.BR_4_Aspect_Signal.block = new BlockBR_4_Aspect_Signal().setHardness(1F).setResistance(10F).setLightLevel(0.2F).setCreativeTab(TCBIP.tabBIP).setStepSound(Block.soundTypeMetal);
	}

	public static void registerBlocks() {
		for (BlockIDs blocks : BlockIDs.values()) {
			if(blocks.block != null) {
				blocks.block.setBlockName(TCBIPInfo.modID + ":" + blocks.name());
				if (blocks.hasItemBlock) {
					GameRegistry.registerBlock(blocks.block, blocks.itemBlockClass, blocks.name());
				} else {
					GameRegistry.registerBlock(blocks.block, blocks.name());
				}
			}
		}
	}

	public static void setHarvestLevels() {

		BlockIDs.BR_2_Aspect_Signal.block.setHarvestLevel("pickaxe",1);
		BlockIDs.BR_3_Aspect_Signal.block.setHarvestLevel("pickaxe",1);
		BlockIDs.BR_4_Aspect_Signal.block.setHarvestLevel("pickaxe",1);
	}
}