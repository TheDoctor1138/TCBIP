/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package td1138.bip.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import td1138.bip.blocks.blockSwitch.BlockBR_2_Aspect_Signal;
import td1138.bip.library.BlockIDs;
import train.common.Traincraft;
import train.common.library.Info;
import train.common.library.TraincraftRegistry;

public class TCBlocks {

	public static void init() {
		loadBlocks();
		registerBlocks();
		setHarvestLevels();
	}

	public static Block BR_2_Aspect_Signal = new BlockBR_2_Aspect_Signal().setHardness(1F);


	public static void loadBlocks() {

		BlockIDs.BR_2_Aspect_Signal.block = new BlockBR_2_Aspect_Signal().setHardness(1F).setResistance(10F).setLightLevel(0.2F).setCreativeTab(Traincraft.tcTab).setStepSound(Block.soundTypeMetal);
	}

	public static void registerBlocks() {
		for (BlockIDs blocks : BlockIDs.values()) {
			if(blocks.block != null) {
				blocks.block.setBlockName(Info.modID + ":" + blocks.name());
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
	}
}