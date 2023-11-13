package com.example.train.common.blocks;

import com.example.train.common.library.Info;
import cpw.mods.fml.common.registry.GameRegistry;
import com.example.train.common.library.BlockIDs;


public class TC4AddonBlocks {

    public static void init() {
        loadBlocks();
        registerBlocks();
    }

    public static void loadBlocks() {
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
}
