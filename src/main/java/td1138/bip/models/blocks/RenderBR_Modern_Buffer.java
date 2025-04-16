/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package td1138.bip.models.blocks;

import fexcraft.tmt.slim.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import td1138.bip.library.TCBIPInfo;
import td1138.bip.tile.TileBR_Modern_Buffer;
import td1138.bip.models.blocks.ModelBR_Modern_Buffer;
import td1138.bip.tile.switchStand.TileBR_2_Aspect_Signal;
import train.common.tile.TileAmericanStopper;

import static javax.swing.SwingConstants.EAST;
import static javax.swing.SwingConstants.WEST;

public class RenderBR_Modern_Buffer extends TileEntitySpecialRenderer {

    private static final ModelBR_Modern_Buffer modelBR_Modern_Buffer = new ModelBR_Modern_Buffer(1F / 16.0F);
    private static final ResourceLocation texture = new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_Modern_Buffer_Red.png");

    public RenderBR_Modern_Buffer() {
    }

    public void render(TileEntity var1, double x, double y, double z) {
        GL11.glPushMatrix();

        GL11.glTranslated(x, y, z);
        fexcraft.tmt.slim.Tessellator.bindTexture(texture);
        GL11.glTranslatef(0.5F, 0.0F, 0.5F);
        GL11.glRotated(180,0,-1,0);
        modelBR_Modern_Buffer.render(0.0625F, ((TileBR_Modern_Buffer) var1).getFacing());

        GL11.glPopMatrix();
    }

    private void modelBR_Modern_Buffer(float v, Entity facing) {
    }

    @Override
    public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8) {
        render(var1, var2, var4, var6);
    }
}