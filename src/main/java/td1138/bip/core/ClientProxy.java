package td1138.bip.core;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import ebf.tim.entities.EntitySeat;
import net.minecraft.item.Item;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import td1138.bip.core.handlers.RecipeBookHandler;
import td1138.bip.gui.GuiRecipeBook;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import td1138.bip.library.BlockIDs;
import td1138.bip.library.GuiIDs;
import td1138.bip.models.renderSwitch.ItemRenderBR_2_Aspect_Signal;
import td1138.bip.models.renderSwitch.RenderBR_2_Aspect_Signal;
import td1138.bip.tile.switchStand.TileBR_2_Aspect_Signal;
import train.client.core.handlers.ClientTickHandler;
import train.client.render.*;
import train.client.render.renderSwitch.*;
import train.common.api.EntityBogie;
import train.common.api.EntityRollingStock;
import train.common.blocks.TCBlocks;
import train.common.entity.CollisionBox;
import train.common.entity.digger.EntityRotativeDigger;
import train.common.entity.digger.EntityRotativeWheel;
import train.common.entity.zeppelin.EntityZeppelinOneBalloon;
import train.common.entity.zeppelin.EntityZeppelinTwoBalloons;
import train.common.tile.*;
import train.common.tile.switchStand.*;

import java.util.Calendar;

public class ClientProxy extends CommonProxy {

    public static boolean preRenderModels = false;

    public static boolean isHoliday() {
        Calendar cal = Calendar.getInstance();
        return (cal.get(Calendar.MONTH) == Calendar.DECEMBER || (cal.get(Calendar.MONTH) == Calendar.JANUARY) && cal.get(Calendar.DATE) < 7);
    }

    public static boolean isPumpkin() {
        Calendar cal = Calendar.getInstance();
        return (cal.get(Calendar.MONTH) == Calendar.OCTOBER || cal.get(Calendar.MONTH) == Calendar.NOVEMBER && cal.get(Calendar.DATE) < 15);
    }

    public static boolean isAnniversary() {
        Calendar cal = Calendar.getInstance();
        return (cal.get(Calendar.MONTH) == Calendar.AUGUST && cal.get(Calendar.DATE) == 29);
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


            default:
                return null;
        }
    }

    @Override
    public GuiScreen getCurrentScreen() {
        return Minecraft.getMinecraft().currentScreen;
    }

    @Override
    public void registerBookHandler() {
        RecipeBookHandler recipeBookHandler = new RecipeBookHandler();
    }

    @Override
    public void registerTileEntities() {

        ClientRegistry.bindTileEntitySpecialRenderer(TileBR_2_Aspect_Signal.class, new RenderBR_2_Aspect_Signal());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_2_Aspect_Signal.block), new ItemRenderBR_2_Aspect_Signal());
    }

    @Override
    public void registerRenderInformation() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileBR_2_Aspect_Signal.class, new RenderBR_2_Aspect_Signal());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_2_Aspect_Signal.block), new ItemRenderBR_2_Aspect_Signal());
    }

}
