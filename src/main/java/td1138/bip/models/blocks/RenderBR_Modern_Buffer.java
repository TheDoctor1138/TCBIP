/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package td1138.bip.models.blocks;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import td1138.bip.library.TCBIPInfo;
import td1138.bip.tile.TileBR_Modern_Buffer;

public class RenderBR_Modern_Buffer extends TileEntitySpecialRenderer {

    private static final ModelBR_Modern_Buffer modelBR_Modern_Buffer = new ModelBR_Modern_Buffer(1F);
    private static final ResourceLocation texture = new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_Modern_Buffer_Red.png");

    public RenderBR_Modern_Buffer() {
    }

    public void render(TileEntity tile, double x, double y, double z) {
        fexcraft.tmt.slim.Tessellator.bindTexture(texture);
        GL11.glPushMatrix();

        GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);
        modelBR_Modern_Buffer.render(0.0625F, ((TileBR_Modern_Buffer) tile).getFacing());

        GL11.glPopMatrix();
    }

    @Override
    public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float var8) {
        render(tile, x, y, z);
    }
}
