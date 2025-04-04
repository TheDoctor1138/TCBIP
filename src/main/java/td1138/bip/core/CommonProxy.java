package td1138.bip.core;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import ebf.tim.entities.EntitySeat;
import ebf.tim.gui.GUISeatManager;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import org.lwjgl.opengl.GL11;
import td1138.bip.blocks.blockSwitch.BlockBR_2_Aspect_Signal;
import td1138.bip.gui.GuiRecipeBook;
import td1138.bip.library.BlockIDs;
import td1138.bip.library.GuiIDs;
import td1138.bip.models.renderSwitch.ItemRenderBR_2_Aspect_Signal;
import td1138.bip.models.renderSwitch.RenderBR_2_Aspect_Signal;
import td1138.bip.tile.switchStand.TileBR_2_Aspect_Signal;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.api.Freight;
import train.common.api.LiquidTank;
import train.common.api.Tender;
import train.common.containers.*;
import train.common.entity.digger.EntityRotativeDigger;
import train.common.entity.rollingStockOld.EntityJukeBoxCart;
import train.common.entity.rollingStockOld.EntityTracksBuilder;
import train.common.entity.zeppelin.AbstractZeppelin;
import train.common.inventory.*;
import train.common.mtc.*;
import train.common.tile.*;
import train.common.tile.switchStand.*;

public class CommonProxy implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity te = world.getTileEntity(x, y, z);
        EntityPlayer riddenByEntity = null;
        Entity entity = null;

        if (player.ridingEntity instanceof EntityRollingStock || player.ridingEntity instanceof AbstractZeppelin
                || player.ridingEntity instanceof EntityRotativeDigger) {
            entity = player.ridingEntity;
            if (entity.riddenByEntity instanceof EntityPlayer) {
                riddenByEntity = (EntityPlayer) entity.riddenByEntity;
            }
        }
        if (player.ridingEntity instanceof EntitySeat) {
            entity = ((EntitySeat) player.ridingEntity).parent;
            if (((EntityRollingStock)entity).seats.get(0).getPassenger() instanceof EntityPlayer) {
                riddenByEntity = (EntityPlayer) ((EntityRollingStock)entity).seats.get(0).getPassenger();
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
    public Object getTESR(){return null;}
    public boolean isClient(){
        return false;
    }
    public GuiScreen getCurrentScreen() {
        return null;
    }

    public void registerBookHandler() {}

    public void registerRenderInformation() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileBR_2_Aspect_Signal.class, new RenderBR_2_Aspect_Signal());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_2_Aspect_Signal.block), new ItemRenderBR_2_Aspect_Signal());
    }

    public void registerTileEntities() {
        GameRegistry.registerTileEntity(TileBR_2_Aspect_Signal.class, "TileBR_2_Aspect_Signal");
    }

    public static final TileEntitySpecialRenderer specialRenderer = new TileEntitySpecialRenderer() {
        @Override
        public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float p_147500_8_) {
            GL11.glPushMatrix();
            GL11.glTranslated(x,y, z);
            tileEntity.func_145828_a(null);
            GL11.glPopMatrix();
        }

        @Override
        protected void bindTexture(ResourceLocation p_147499_1_){}
    };
}
