package td1138.bip.models.renderSwitch;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import fexcraft.tmt.slim.Tessellator;
import td1138.bip.library.TCBIPInfo;
import td1138.bip.models.renderSwitch.models.ModelBR_2_Aspect_Signal;
import td1138.bip.tile.switchStand.TileBR_2_Aspect_Signal;
import td1138.bip.tile.switchStand.TileBR_3_Aspect_Signal;
import train.client.render.renderSwitch.models.ModelsignalSpanish;
import train.common.library.Info;
import train.common.tile.switchStand.TilesignalSpanish;

public class RenderBR_2_Aspect_Signal extends TileEntitySpecialRenderer {
    static final ModelBR_2_Aspect_Signal modelBR_2_Aspect_Signal = new ModelBR_2_Aspect_Signal();
    private ResourceLocation[] textures = {new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_3_Aspect_Signal_Yellow.png"), new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_3_Aspect_Signal_Green.png")};


    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        Tessellator.bindTexture(textures[((TileBR_2_Aspect_Signal) tileEntity).getSkinstate()]);
        GL11.glPushMatrix();
        GL11.glTranslated(x+0.5,y+0.6,z+0.125);
        GL11.glRotated(180,0,1,0);
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
                GL11.glTranslated(-0.3875,0,0.125);
                break;
            }
            case EAST:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(180,0,1,0);
                GL11.glTranslated(-0.1875,0,0.425);
                break;
            }
            case WEST:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(0,0,1,0);
                GL11.glTranslated(-0.1875,0,-0.225);
                break;
            }
            default:{
                skipRender = true;
            }
        }

        if (!skipRender) {
            modelBR_2_Aspect_Signal.render(null, 0, 0, 0, 0, 0, 0.0625f);
        }
        GL11.glPopMatrix();
    }


}
