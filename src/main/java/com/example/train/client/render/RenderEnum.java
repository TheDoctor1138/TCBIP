package com.example.train.client.render;


import com.example.train.common.entity.rollingstock.locomotive.*;
//import com.example.train.common.entity.rollingstock.passenger.*;
//import com.example.train.common.entity.rollingstock.freight.*;
import com.example.train.client.render.models.rollingstock.*;
import train.common.api.EntityRollingStock;
import train.common.api.TrainRenderRecord;
import tmt.ModelBase;
import net.minecraft.util.ResourceLocation;
import com.example.train.common.library.Info;


import java.util.ArrayList;

public enum RenderEnum implements TrainRenderRecord {

	locoHLE18(EntityLocoElectricNMBS_HLE_18.class, new ModelNMBS_HLE_18(), "locomotive/HLE18/hle18_", true, new float[]{-1.5F,0.05F,0}, new float[] {0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),








	;
	private final Class<? extends EntityRollingStock> entityClass;
	private final ModelBase model;
	private final String texture;
	private final boolean multiTexture;
	private final float[] trans;
	private final float[] rotate;
	private final float[] scale;
	private final String smokeType;
	private final ArrayList<double[]> smokeFX;
	private final String explosionType;
	private final ArrayList<double[]> explosionFX;
	private final int smokeIterations;
	private final int explosionFXIterations;
	private final boolean hasSmokeOnSlopes;

	/**
	 * Defines the render @param for a RollingStock
	 *
	 * @param model ModelBase
	 * @param texture String
	 * @param multiTexture boolean
	 * @param trans float[]
	 * @param rotate float[]
	 * @param scale float[]
	 * @param smokeType String
	 * @param smokeFX ArrayList
	 * @param explosionType String
	 * @param explosionFX ArrayList
	 */
	RenderEnum(Class<? extends EntityRollingStock> entityClass, ModelBase model, String texture, boolean multiTexture, float[] trans, float[] rotate, float[] scale, String smokeType, int smokeIterations, ArrayList<double[]> smokeFX, String explosionType, ArrayList<double[]> explosionFX, int explosionFXIterations, boolean hasSmokeOnSlopes) {
		this.entityClass = entityClass;
		this.model = model;
		this.texture = texture;
		this.multiTexture = multiTexture;
		this.trans = trans;
		this.rotate = rotate;
		this.scale = scale;
		this.smokeType = smokeType;
		this.smokeFX = smokeFX;
		this.explosionType = explosionType;
		this.explosionFX = explosionFX;
		this.smokeIterations = smokeIterations;
		this.explosionFXIterations = explosionFXIterations;
		this.hasSmokeOnSlopes = hasSmokeOnSlopes;
	}

    @Override
	public Class<? extends EntityRollingStock> getEntityClass() {
		return entityClass;
	}

    @Override
	public ModelBase getModel() {
		return model;
	}

	public boolean getIsMultiTextured() {
		return multiTexture;
	}

    @Override
	public boolean hasSmoke() {
		return smokeType.length() > 0;
	}

    @Override
	public boolean hasSmokeOnSlopes() {
		return hasSmokeOnSlopes;
	}

    @Override
	public String getSmokeType() {
		return smokeType;
	}

    @Override
	public ArrayList<double[]> getSmokeFX() {
		return smokeFX;
	}

    @Override
	public String getExplosionType() {
		return explosionType;
	}

    @Override
	public boolean hasExplosion() {
		return explosionType.length() > 0;
	}

    @Override
	public ArrayList<double[]> getExplosionFX() {
		return explosionFX;
	}

    @Override
	public float[] getTrans() {
		return trans;
	}

    @Override
	public float[] getRotate() {
		return rotate;
	}

    @Override
	public float[] getScale() {
		return scale;
	}

    @Override
    public ResourceLocation getTextureFile(String colorString) {
		if (multiTexture) {
			return new ResourceLocation(Info.resourceLocation, Info.trainsPrefix + texture + colorString + ".png");
		} else {
			return new ResourceLocation(Info.resourceLocation, Info.trainsPrefix + texture + ".png");
		}
	}

    @Override
	public int getSmokeIterations() {
		return smokeIterations;
	}

    @Override
	public int getExplosionFXIterations() {
		return explosionFXIterations;
	}
}
