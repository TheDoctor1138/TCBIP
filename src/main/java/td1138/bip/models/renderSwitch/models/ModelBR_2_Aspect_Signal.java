//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 11.11.2024 - 20:29:42
// Last changed on: 11.11.2024 - 20:29:42

package td1138.bip.models.renderSwitch.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelBR_2_Aspect_Signal extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBR_2_Aspect_Signal() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[24];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY, "Lamp"); // Lamp
		bodyModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		bodyModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		bodyModel[8] = new ModelRendererTurbo(this, 57, 1, textureX, textureY, "Lamp"); // Lamp
		bodyModel[9] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 4
		bodyModel[10] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
		bodyModel[11] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 4
		bodyModel[12] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 27
		bodyModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 28
		bodyModel[15] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 28
		bodyModel[17] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 2
		bodyModel[22] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 2
		bodyModel[23] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 27

		bodyModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 9F, -1F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 37, 1, 0F,0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(1F, -28F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Box 2
		bodyModel[2].setRotationPoint(0F, -27F, -2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Box 2
		bodyModel[3].setRotationPoint(0F, -28F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0.4F, 0.2F, -0.2F, 0.4F, 0.2F, -0.2F, 0.4F, 0.2F, -0.6F, 0.4F, 0.2F); // Lamp
		bodyModel[4].setRotationPoint(0F, -25.7F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.7F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0.7F, 0F, -0.2F, -0.3F, 0.1F, -0.7F, 0F, 0.1F, -0.7F, 0F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F); // Box 4
		bodyModel[5].setRotationPoint(0F, -25.7F, -1F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.7F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, 0.7F, 0F, -0.7F, -0.3F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.7F, -0.3F, 0.1F, -0.7F); // Box 4
		bodyModel[6].setRotationPoint(0F, -25.7F, 1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.7F, -0.9F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.9F, 0.2F, 0.7F, -0.9F, 0.2F, 0.7F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.7F, 0F, 0.3F); // Box 4
		bodyModel[7].setRotationPoint(0F, -26.7F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0.4F, 0.2F, -0.2F, 0.4F, 0.2F, -0.2F, 0.4F, 0.2F, -0.6F, 0.4F, 0.2F); // Lamp
		bodyModel[8].setRotationPoint(0F, -23.4F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.7F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0.7F, 0F, -0.2F, -0.3F, 0.1F, -0.7F, 0F, 0.1F, -0.7F, 0F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F); // Box 4
		bodyModel[9].setRotationPoint(0F, -23.4F, -1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.7F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, 0.7F, 0F, -0.7F, -0.3F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.7F, -0.3F, 0.1F, -0.7F); // Box 4
		bodyModel[10].setRotationPoint(0F, -23.4F, 1F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.7F, -0.9F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.9F, 0.2F, 0.7F, -0.9F, 0.2F, 0.7F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.7F, 0F, 0.3F); // Box 4
		bodyModel[11].setRotationPoint(0F, -24.4F, 0F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 2
		bodyModel[12].setRotationPoint(0F, -19F, -1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 27
		bodyModel[13].setRotationPoint(1F, -20F, -1.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.8F, -0.8F, -0.1F, -0.8F); // Box 28
		bodyModel[14].setRotationPoint(3F, -23.5F, -1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, -0.8F, -0.1F, 0F); // Box 28
		bodyModel[15].setRotationPoint(3F, -23.5F, 1.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 28
		bodyModel[16].setRotationPoint(1F, -23.7F, -1.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 28
		bodyModel[17].setRotationPoint(1F, -23.7F, 1.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 46, 3, 0F,0F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -3F, -15.5F, -0.2F, 2.3F, -15.5F, -0.2F, 2.3F, -15.5F, -0.2F, -3F, -15.5F, -0.2F); // Box 22
		bodyModel[18].setRotationPoint(4F, -20F, -1F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 46, 1, 0F,0F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, -3F, -15.5F, 0F, 2.3F, -15.5F, 0F, 2.3F, -15.5F, -0.8F, -3F, -15.5F, -0.8F); // Box 22
		bodyModel[19].setRotationPoint(4F, -20F, -1F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 46, 1, 0F,0F, -0.1F, -0.8F, -0.7F, -0.1F, -0.8F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -15.5F, -0.8F, 2.3F, -15.5F, -0.8F, 2.3F, -15.5F, 0F, -3F, -15.5F, 0F); // Box 22
		bodyModel[20].setRotationPoint(4F, -20F, 1F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -0.8F, 0F, -7F, -0.8F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -7F, -0.8F, -4F, -7F); // Box 2
		bodyModel[21].setRotationPoint(-0.05F, -18.5F, -0.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 5, 13, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -0.8F, 0F, -11F, -0.8F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -11F, -0.8F, -4F, -11F); // Box 2
		bodyModel[22].setRotationPoint(-0.05F, -17F, -0.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, 0F, 0F, 0F); // Box 27
		bodyModel[23].setRotationPoint(1F, -26.5F, -1F);
	}
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for (int i = 0; i < 24; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("Lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}
}