package com.example.train.client.core;

import com.example.train.client.core.handlers.ClientTickHandler;
import com.example.train.common.core.CommonProxy;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import javazoom.jl.decoder.JavaLayerUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import com.example.train.client.core.handlers.RecipeBookHandler;
import train.client.core.handlers.TCKeyHandler;
import train.client.core.helpers.JLayerHook;
import com.example.train.client.gui.GuiRecipeBook;
import com.example.train.common.library.GuiIDs;
import train.client.render.RenderRollingStock;
import train.common.api.EntityRollingStock;
import train.common.core.Traincraft_EventSounds;

import java.util.Calendar;

public class ClientProxy extends CommonProxy {

    public static boolean isHoliday() {
        Calendar cal = Calendar.getInstance();
        return(cal.get(Calendar.MONTH) == Calendar.DECEMBER || (cal.get(Calendar.MONTH) == Calendar.JANUARY) && cal.get(Calendar.DATE) < 7);
    }
    public static boolean isPumpkin() {
        Calendar cal = Calendar.getInstance();
        return(cal.get(Calendar.MONTH) == Calendar.OCTOBER || cal.get(Calendar.MONTH) == Calendar.NOVEMBER && cal.get(Calendar.DATE) < 15);
    }

    @Override
    public void registerEvents(FMLPreInitializationEvent event) {
        super.registerEvents(event);


    }

    @Override
    public void registerRenderInformation() {
        FMLCommonHandler.instance().bus().register(new ClientTickHandler());


        RenderingRegistry.registerEntityRenderingHandler(EntityRollingStock.class, new RenderRollingStock());
		/*
		ClientRegistry.bindTileEntitySpecialRenderer(TileFortyFootContainer.class, new FortyFootContainerRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.FortyFootContainer.block), new ItemRenderFortyFootContainer());
		*/

		/*
		ClientRegistry.bindTileEntitySpecialRenderer(TileFortyFootContainer.class, new FortyFootContainerRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.FortyFootContainer.block), new ItemRenderFortyFootContainer());*/


    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity te = world.getTileEntity(x, y, z);
        EntityPlayer riddenByEntity = null;
        Entity entity = player.ridingEntity;
        if (player.ridingEntity != null) {
            riddenByEntity = (EntityPlayer) entity.riddenByEntity;
        }

        Entity entity1 = null;
        if (y == -1) {
            for (Object ent : world.loadedEntityList) {
                if (((Entity) ent).getEntityId() == x)
                    entity1 = (Entity) ent;
            }
        }
        switch (ID) {
            case (GuiIDs.RECIPE_BOOK):
                return new GuiRecipeBook(player, player.getCurrentEquippedItem());
		    /*case (GuiIDs.RECIPE_BOOK2):
			    return te != null && te instanceof TileBook ? new GuiRecipeBook2(player, player.getCurrentEquippedItem()) : new GuiRecipeBook2(player, player.getCurrentEquippedItem());*/


            default:
                return null;
        }
    }


    @Override
    public GuiScreen getCurrentScreen() {
        return Minecraft.getMinecraft().currentScreen;
    }

    @Override
    public void registerSounds() {
        MinecraftForge.EVENT_BUS.register(new Traincraft_EventSounds());
    }

    @Override
    public void registerBookHandler() {
        RecipeBookHandler recipeBookHandler = new RecipeBookHandler();
    }

    @Override
    public Minecraft getMinecraft() {
        return Minecraft.getMinecraft();
    }

    @Override
    public EntityPlayer getPlayer() {
        return getMinecraft().thePlayer;
    }

    @Override
    public void registerKeyBindingHandler() {
        FMLCommonHandler.instance().bus().register(new TCKeyHandler());
    }

    @Override
    public void setHook() {
        JavaLayerUtils.setHook(new JLayerHook(Minecraft.getMinecraft()));
    }
}
