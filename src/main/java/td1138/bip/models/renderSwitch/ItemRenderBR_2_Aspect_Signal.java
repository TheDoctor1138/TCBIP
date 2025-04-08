package td1138.bip.models.renderSwitch;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import org.lwjgl.opengl.GL11;
import fexcraft.tmt.slim.Tessellator;
import td1138.bip.library.BlockIDs;
import td1138.bip.library.TCBIPInfo;
import td1138.bip.models.renderSwitch.models.ModelBR_2_Aspect_Signal;
import train.client.render.renderSwitch.models.ModelsignalSpanish;
import train.common.library.Info;

public class ItemRenderBR_2_Aspect_Signal implements IItemRenderer {
    private static final ModelBR_2_Aspect_Signal modelSwitch = new ModelBR_2_Aspect_Signal();
    private static final ResourceLocation texture = new ResourceLocation(TCBIPInfo.resourceLocation,Info.modelTexPrefix + "BR_2_Aspect_Signal_Green.png");
    private Object IIconRegister;
    private Object IItemRenderer;
    private IIcon itemIcon;

    public ItemRenderBR_2_Aspect_Signal() {
    }


    @Override
    public boolean handleRenderType(ItemStack item, IItemRenderer.ItemRenderType type) {
            return true;
    }

    @Override
    public boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType type, ItemStack item, IItemRenderer.ItemRendererHelper helper) {
        return true;
    }


    @Override
    public void renderItem(IItemRenderer.ItemRenderType type, ItemStack item, Object... data) {
        Tessellator.bindTexture(new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_2_Aspect_Signal_Green.png"));
        switch (type) {
            case ENTITY: {
                renderSwitch(0f, 0f, 0f, 1f);
                return;
            }
            case EQUIPPED: {
                renderSwitch(0.2f, 1f, 1f, 1f);
                return;
            }
            case EQUIPPED_FIRST_PERSON: {
                renderSwitch(0, 0, 0, 1f);
                return;
            }
            case INVENTORY: {
                MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.BR_2_Aspect_Signal.block), (net.minecraftforge.client.IItemRenderer) IItemRenderer);
                renderSwitch(0f, 0f, 0f, 1f);

                return;
            }
            default:
                break;
        }
    }


    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(TCBIPInfo.modID.toLowerCase() + ":BR_2_Aspect_Signal");
    }

    /*
    public static ResourceLocation getTexture(Entity entity) {
        for (RenderEnum renders : RenderEnum.values()) {
            if (renders.getEntityClass() != null && renders.getEntityClass().equals(entity.getClass())) {
                texture = Info.modID
                return "texture.png";
            }
        }
        return null;
    }

     */

    private void renderSwitch(float x, float y, float z, float scale) {
        Tessellator.bindTexture(texture);
        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_LIGHTING);

        GL11.glTranslatef(x, y, z);
        GL11.glScalef(scale, scale, scale);
        GL11.glRotated(180,0,0,1);
        GL11.glRotated(180,0,1,0);


        modelSwitch.render(null,0,0,0,0,0,0.0625f);

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }


}
