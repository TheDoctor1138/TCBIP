package td1138.bip.core;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import ebf.tim.entities.EntitySeat;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.opengl.GL11;
import td1138.bip.gui.GuiRecipeBook;
import td1138.bip.library.BlockIDs;
import td1138.bip.library.GuiIDs;
import td1138.bip.models.blocks.ItemRenderBR_Modern_Buffer;
import td1138.bip.models.blocks.RenderBR_Modern_Buffer;
import td1138.bip.models.renderSwitch.*;
import td1138.bip.tile.TileBR_Modern_Buffer;
import td1138.bip.tile.switchStand.*;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.core.handlers.ChunkEvents;
import train.common.core.handlers.WorldEvents;
import train.common.entity.digger.EntityRotativeDigger;
import train.common.entity.zeppelin.AbstractZeppelin;

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
        ClientRegistry.bindTileEntitySpecialRenderer(TileBR_UK_SpeedSign.class, new RenderBR_UK_SpeedSign());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_UK_SpeedSign.block), new ItemRenderBR_UK_SpeedSign());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBR_UK_SpeedSign_EPS.class, new RenderBR_UK_SpeedSign_EPS());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_UK_SpeedSign_EPS.block), new ItemRenderBR_UK_SpeedSign_EPS());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBR_Modern_Buffer.class, new RenderBR_Modern_Buffer());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_Modern_Buffer.block), new ItemRenderBR_Modern_Buffer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBR_2_Aspect_Signal.class, new RenderBR_2_Aspect_Signal());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_2_Aspect_Signal.block), new ItemRenderBR_2_Aspect_Signal());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBR_3_Aspect_Signal.class, new RenderBR_3_Aspect_Signal());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_3_Aspect_Signal.block), new ItemRenderBR_3_Aspect_Signal());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBR_4_Aspect_Signal.class, new RenderBR_4_Aspect_Signal());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_4_Aspect_Signal.block), new ItemRenderBR_4_Aspect_Signal());
    }

    public void registerTileEntities() {
        //    GameRegistry.registerTileEntity(TileBR_UK_SpeedSign.class, "TileBR_UK_SpeedSign");
        //    GameRegistry.registerTileEntity(TileBR_UK_SpeedSign_EPS.class, "TileBR_UK_SpeedSign_EPS");
        //    GameRegistry.registerTileEntity(TileBR_Modern_Buffer.class, "TileBR_Modern_Buffer");
        //    GameRegistry.registerTileEntity(TileBR_2_Aspect_Signal.class, "TileBR_2_Aspect_Signal");
        //    GameRegistry.registerTileEntity(TileBR_3_Aspect_Signal.class, "TileBR_3_Aspect_Signal");
        //    GameRegistry.registerTileEntity(TileBR_4_Aspect_Signal.class, "TileBR_4_Aspect_Signal");
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
}
