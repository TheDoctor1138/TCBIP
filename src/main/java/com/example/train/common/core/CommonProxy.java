package com.example.train.common.core;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.MinecraftForge;
import train.common.Traincraft;
import train.common.containers.ContainerTier;
import train.common.core.handlers.ChunkEvents;
import train.common.core.handlers.WorldEvents;
import train.common.core.util.MP3Player;
import train.common.library.GuiIDs;
import train.common.tile.TileCrafterTierI;

import java.util.ArrayList;
import java.util.List;

public class CommonProxy implements IGuiHandler {


    public static List<MP3Player> playerList = new ArrayList<MP3Player>();

    public void registerRenderInformation() {
    }

    public void registerEvents(FMLPreInitializationEvent event) {
        WorldEvents worldEvents = new WorldEvents();
        ChunkEvents chunkEvents = new ChunkEvents();

        registerEvent(worldEvents);
        registerEvent(chunkEvents);
        ForgeChunkManager.setForcedChunkLoadingCallback(Traincraft.instance, chunkEvents);

    }


    public void registerEvent(Object o) {
        FMLCommonHandler.instance().bus().register(o);
        MinecraftForge.EVENT_BUS.register(o);
    }

    public void registerTileEntities() {

        //Guiexample
        //GameRegistry.registerTileEntity(TileCrafterTierI.class, "TileCrafterTierI");

    }


    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity te = world.getTileEntity(x, y, z);
        EntityPlayer riddenByEntity = null;
        Entity entity = player.ridingEntity;

        if (player.ridingEntity != null) {
            riddenByEntity = (EntityPlayer) entity.riddenByEntity;
        }

        Entity entity1 = null;
        if (y == -1) {
            entity1 = getEntity(world, x);
        }

        switch (ID) {
            case (GuiIDs.CRAFTER_TIER_I):
                return te != null && te instanceof TileCrafterTierI ? new ContainerTier(player.inventory, (TileCrafterTierI) te) : null;


            default:
                return null;

        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    public static Entity getEntity(World world, int entityId) {
        if ((world != null) && (world instanceof WorldServer)) {
            return world.getEntityByID(entityId);
        }
        return null;
    }

    public Minecraft getClientInstance() {
        return FMLClientHandler.instance().getClient();
    }

    public GuiScreen getCurrentScreen() {
        return null;
    }

    public void registerTextureFX() {}

    public void registerSounds() {}

    public EntityPlayer getPlayer() {
        return null;
    }
    public void registerBookHandler() {}

    public Minecraft getMinecraft() {
        return null;
    }

    public void registerVillagerSkin(int villagerId, String textureName) {}

    public static void killAllStreams() {
        for (MP3Player p : playerList) {
            p.stop();
        }
    }

    public void registerKeyBindingHandler() {}

    public void setHook() {}
    }




