/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package td1138.bip.models.blocks;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import td1138.bip.library.TCBIPInfo;
import td1138.bip.models.blocks.ModelBR_Modern_Buffer;
import train.client.render.models.blocks.ModelAmericanStopper;
import train.common.library.Info;

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
                renderBR_Modern_Buffer(0F, 0.4F, 0F, 0.0F);
                break;
            }
            case EQUIPPED_FIRST_PERSON: {
                renderBR_Modern_Buffer(0F, 0.4F, 0F, 0.0F);
                return;
            }
            case INVENTORY: {
                renderBR_Modern_Buffer(1F, 0.65F, 1F, 0.0F);
                break;
            }
            default:
                break;
        }
    }

    private void renderBR_Modern_Buffer(float f, float g, float h, float rotation) {
        fexcraft.tmt.slim.Tessellator.bindTexture(texture);
        GL11.glPushMatrix(); //start
        GL11.glTranslatef(f, g, h); //size
        GL11.glRotatef(rotation, f, g, h);
        BR_Modern_Buffer.render();
        GL11.glPopMatrix(); //end
    }
}
