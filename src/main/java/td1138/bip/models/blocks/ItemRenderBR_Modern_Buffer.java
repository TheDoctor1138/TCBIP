/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package td1138.bip.models.blocks;

import fexcraft.tmt.slim.Tessellator;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import td1138.bip.library.TCBIPInfo;

public class ItemRenderBR_Modern_Buffer implements IItemRenderer {
    private static final ResourceLocation texture = new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_Modern_Buffer_Red.png");
    private static final ModelBR_Modern_Buffer BR_Modern_Buffer = new ModelBR_Modern_Buffer(1F);

    public ItemRenderBR_Modern_Buffer() {
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch (type) {
            case ENTITY: {
                renderBR_Modern_Buffer(0.0F, 0F, 0.0F, 0.0F);
                break;
            }
            case EQUIPPED: {
                GL11.glPushMatrix();
                GL11.glRotatef(180,3f,0f,0f);
                GL11.glRotatef(0,0f,-1f,0f);
                renderBR_Modern_Buffer(0.5F, -1.25F, -0.5F, 0.0F);
                GL11.glPopMatrix();
                break;
            }
            case EQUIPPED_FIRST_PERSON: {
                GL11.glPushMatrix();
                GL11.glRotatef(180,3f,0f,0f);
                GL11.glRotatef(0,0f,-1f,0f);
                renderBR_Modern_Buffer(0.1F, -1.25F, -0.5F, 0.0F);
                GL11.glPopMatrix();
                return;
            }
            case INVENTORY: {
                GL11.glPushMatrix();
                GL11.glRotatef(180,3f,0f,0f);
                GL11.glRotatef(90,0f,-1f,0f);
                renderBR_Modern_Buffer(1F, 0.65F, 1F, 0.0F);
                GL11.glPopMatrix();
                break;
            }
            default:
                break;
        }
    }

    private void renderBR_Modern_Buffer(float f, float g, float h, float rotation) {
        fexcraft.tmt.slim.Tessellator.bindTexture(texture);
        GL11.glPushMatrix(); //start
        BR_Modern_Buffer.render(0.0625F);
        GL11.glTranslatef(f, g, h); //size
        GL11.glRotatef(rotation, f, g, h);
        GL11.glPopMatrix(); //end
    }
}
