package com.example.train.common.library;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public enum BlockIDs {



    ;


    public Block block;
    public boolean hasItemBlock;
    public Class itemBlockClass;

    BlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass) {
        this.hasItemBlock = hasItemBlock;
        this.itemBlockClass = itemBlockClass;
    }
}
