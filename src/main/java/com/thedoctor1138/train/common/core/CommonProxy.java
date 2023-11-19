package com.thedoctor1138.train.common.core;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import train.common.api.EntityRollingStock;
import train.common.containers.*;
import train.common.entity.digger.EntityRotativeDigger;
import train.common.entity.zeppelin.AbstractZeppelin;
import train.common.inventory.*;
import train.common.library.GuiIDs;
import train.common.tile.*;

public class CommonProxy implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

            return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

      return null;

    }

    public GuiScreen getCurrentScreen() {
        return null;
    }

    public void registerBookHandler() {}
}
