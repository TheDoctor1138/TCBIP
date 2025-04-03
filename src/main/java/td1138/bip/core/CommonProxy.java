package td1138.bip.core;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import td1138.bip.tile.switchStand.TileBR_2_Aspect_Signal;
import train.common.Traincraft;
import train.common.mtc.*;
import train.common.tile.*;
import train.common.tile.switchStand.*;

public class CommonProxy implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

            return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

      return null;

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
    }

    public void registerTileEntities() {
        GameRegistry.registerTileEntity(TileBR_2_Aspect_Signal.class, "tileBR_2_Aspect_Signal");
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
