package td1138.bip.models.renderSwitch;

import fexcraft.tmt.slim.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import td1138.bip.library.TCBIPInfo;
import td1138.bip.models.renderSwitch.models.ModelBR_3_Aspect_Signal;
import td1138.bip.models.renderSwitch.models.ModelBR_UK_SpeedSign;
import td1138.bip.tile.switchStand.TileBR_3_Aspect_Signal;
import td1138.bip.tile.switchStand.TileBR_UK_SpeedSign;

public class RenderBR_UK_SpeedSign extends TileEntitySpecialRenderer {
	static final ModelBR_UK_SpeedSign modelBR_UK_SpeedSign = new ModelBR_UK_SpeedSign();
	/*
	private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "speedSign.png");
	private static final ResourceLocation texture2 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "speedSign2.png");
	private static final ResourceLocation texture3 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "speedSign3.png");
	private static final ResourceLocation texture4 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "speedSign4.png");

	 */

	private ResourceLocation[] textures = {new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_10.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_15.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_20.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_25.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_30.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_35.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_40.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_45.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_50.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_60.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_70.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_80.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_90.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_100.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_110.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_120.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_125.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_130.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_140.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_150.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_160.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_170.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_180.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_190.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_200.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_210.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_225.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_230.png"),
			                               new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_240.png"),
	                                       new ResourceLocation(TCBIPInfo.resourceLocation, TCBIPInfo.modelTexPrefix + "BR_UK_SpeedSign_250.png")};


	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
		Tessellator.bindTexture(textures[((TileBR_UK_SpeedSign) tileEntity).getSkinstate()]);
		GL11.glPushMatrix();
		GL11.glTranslated(x +0.5 , y+0.625, z +0.125);
		GL11.glRotated(180, 0, 1, 0);
		boolean skipRender = false;

		switch (((TileBR_UK_SpeedSign) tileEntity).getFacing()) {
			case NORTH: {
				GL11.glRotated(180, 0, 0, 1);
				GL11.glRotated(90, 0, 1, 0);
				GL11.glTranslated(0.3, 0f, 0);
				//System.out.println("N");

				break;
			}
			case SOUTH: {
				GL11.glRotated(180, 0, 0, 1);
				GL11.glRotated(270, 0, 1, 0);
				GL11.glTranslated(-0.45, 0f, 0);
				//GL11.glTranslated(0.5, 0f, 0.5);
				//System.out.println("S");

				//GL11.glTranslated(0.1875, -1, 0.125);
				break;
			}
			case EAST: {
				GL11.glRotated(180, 0, 0, 1);
				GL11.glRotated(180, 0, 1, 0);
				GL11.glTranslated(-0.1, 0f, 0.4);
				//System.out.println("E");

				//GL11.glTranslated(0.1875, -1, 0.125);
				break;
			}
			case WEST: {
				GL11.glRotated(180, 0, 0, 1);
				GL11.glRotated(0, 0, 1, 0);
				GL11.glTranslatef(-0.05f,0f, -0.35f);
				//System.out.println("W");
				//GL11.glTranslated(0.1875, -1, 0.125);
				break;
			}
			default: {
				skipRender = true;
			}
		}


		if (!skipRender) {

			// tileEntity.getWorldObj().getBlock(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord).isProvidingWeakPower(tileEntity.getWorldObj(), tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord, 0) > 0

			/*
			if (((TileSpeedSign) tileEntity).getSkinstate() == 0) {
				Tessellator.bindTexture(texture);
			} else if (((TileSpeedSign) tileEntity).getSkinstate() == 1){
				Tessellator.bindTexture(texture2);
			} else if (((TileSpeedSign) tileEntity).getSkinstate() == 2){
				Tessellator.bindTexture(texture3);
			} else if (((TileSpeedSign) tileEntity).getSkinstate() == 3) {
				Tessellator.bindTexture(texture4);
			}

			 */

			modelBR_UK_SpeedSign.render(null, 0, 0, 0, 0, 0, 0.0625f);



		}
		GL11.glPopMatrix();
	}
}

