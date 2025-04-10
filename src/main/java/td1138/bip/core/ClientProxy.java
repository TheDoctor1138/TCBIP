package td1138.bip.core;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;
import org.lwjgl.opengl.GL11;
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
import td1138.bip.models.blocks.ItemRenderBR_Modern_Buffer;
import td1138.bip.models.blocks.RenderBR_Modern_Buffer;
import td1138.bip.models.renderSwitch.*;
import td1138.bip.tile.TileBR_Modern_Buffer;
import td1138.bip.tile.switchStand.TileBR_2_Aspect_Signal;
import td1138.bip.tile.switchStand.TileBR_3_Aspect_Signal;
import td1138.bip.tile.switchStand.TileBR_4_Aspect_Signal;

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
    public Object getTESR(){return specialRenderer;}

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

    private static final Render nullRender = new Render() {
        @Override
        public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {}

        @Override
        protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
            return null;
        }
    };

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

        ClientRegistry.bindTileEntitySpecialRenderer(TileBR_Modern_Buffer.class, new RenderBR_Modern_Buffer());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_Modern_Buffer.block), new ItemRenderBR_Modern_Buffer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBR_2_Aspect_Signal.class, new RenderBR_2_Aspect_Signal());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_2_Aspect_Signal.block), new ItemRenderBR_2_Aspect_Signal());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBR_3_Aspect_Signal.class, new RenderBR_3_Aspect_Signal());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_3_Aspect_Signal.block), new ItemRenderBR_3_Aspect_Signal());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBR_4_Aspect_Signal.class, new RenderBR_4_Aspect_Signal());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_4_Aspect_Signal.block), new ItemRenderBR_4_Aspect_Signal());
    }

    @Override
    public void registerRenderInformation() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileBR_Modern_Buffer.class, new RenderBR_Modern_Buffer());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_Modern_Buffer.block), new ItemRenderBR_Modern_Buffer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBR_2_Aspect_Signal.class, new RenderBR_2_Aspect_Signal());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_2_Aspect_Signal.block), new ItemRenderBR_2_Aspect_Signal());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBR_3_Aspect_Signal.class, new RenderBR_3_Aspect_Signal());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_3_Aspect_Signal.block), new ItemRenderBR_3_Aspect_Signal());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBR_4_Aspect_Signal.class, new RenderBR_4_Aspect_Signal());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_4_Aspect_Signal.block), new ItemRenderBR_4_Aspect_Signal());
    }

}
