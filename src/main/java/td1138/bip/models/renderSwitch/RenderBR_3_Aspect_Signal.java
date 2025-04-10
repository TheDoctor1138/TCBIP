package td1138.bip.models.renderSwitch;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import fexcraft.tmt.slim.Tessellator;
import td1138.bip.library.TCBIPInfo;
import td1138.bip.models.renderSwitch.models.ModelBR_2_Aspect_Signal;
import td1138.bip.tile.switchStand.TileBR_2_Aspect_Signal;
import train.client.render.renderSwitch.models.ModelsignalSpanish;
import train.common.library.Info;
import train.common.tile.switchStand.TilesignalSpanish;

public class RenderBR_2_Aspect_Signal extends TileEntitySpecialRenderer {
    static final ModelBR_2_Aspect_Signal modelBR_2_Aspect_Signal = new ModelBR_2_Aspect_Signal();
        private static final ResourceLocation texture = new ResourceLocation(TCBIPInfo.resourceLocation,Info.modelTexPrefix + "BR_2_Aspect_Signal_Green.png");
    private static final ResourceLocation texture2 = new ResourceLocation(TCBIPInfo.resourceLocation, Info.modelTexPrefix + "BR_2_Aspect_Signal_Yellow.png");
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        boolean state=((TileBR_2_Aspect_Signal) tileEntity).state == 1;
        GL11.glPushMatrix();
        GL11.glTranslated(x+0.5,y+0.6,z+0.8);
        //GL11.glRotated(180,0,1,0);
        Tessellator.bindTexture(state?texture:texture2);
        boolean skipRender = false;

        switch (((TileBR_2_Aspect_Signal)tileEntity).getFacing()){
            case NORTH:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(90,0,1,0);
                GL11.glTranslated(0.1875,0,0.125);
                break;
            }
            case SOUTH:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(270,0,1,0);
                GL11.glTranslated(0.1875,0,0.125);
                break;
            }
            case EAST:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(180,0,1,0);
                GL11.glTranslated(0.1875,0,0.125);
                break;
            }
            case WEST:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(0,0,1,0);
                GL11.glTranslated(0.1875,0,0.125);
                break;
            }
            default:{
                skipRender = true;
            }
        }

        /**
         Hey! Wanna learn how to code a mod in minecraft, or code Java and OOP?
         Join the Minecraft Java Code Club!
         With your host hariesh, you will learn code strcutres, how java works and
         making a mod in minecraft!

         Contact Mr Taylor or Hariesh in Y13
         15HaJe3644@ichs.org.uk
         **/



        if (!skipRender) {
            // tileEntity.getWorldObj().getBlock(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord).isProvidingWeakPower(tileEntity.getWorldObj(), tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord, 0) > 0
            if (state) {
                modelBR_2_Aspect_Signal.render(null, 0, 0, 0, 0, 0, 0.0625f);
            } else {
                modelBR_2_Aspect_Signal.render(null, 0, 0, 0, 0, 0, 0.0625f);
            }
        }

        GL11.glPopMatrix();
    }


}
