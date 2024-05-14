package com.thedoctor1138.train.client.render;




import com.thedoctor1138.train.common.entity.rollingStock.*;
import com.thedoctor1138.train.common.library.TCMLPAddonInfo;
import com.thedoctor1138.train.client.render.models.*;

import fexcraft.tmt.slim.ModelBase;
import train.common.api.EntityRollingStock;
import train.common.api.TrainRenderRecord;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;

public enum TCMLPRenderEnum implements TrainRenderRecord {

	locoHLE18(EntityLocoElectricNMBS_HLE_18.class, new ModelNMBS_HLE_18(), "hle18_", true, new float[]{-1.5F, 0.05F, 0F}, new float[] {0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	euroFimaPresidentiale(EntityPassengerEuroFimaPresidentiale.class, new ModelEurofimaPresidentiale(), "EuroFima", false, new float[]{-5.5F, 0.05F, 0F}, new float[] {0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	class74(EntitylocodieselClass74.class, new ModelClass74(), "Class_74_", true, new float[]{-1.5F, 0.15F, 0F}, new float[] {0F, 180F, 180F}, null, "smoke", 1, new ArrayList<double[]>() {
		{
			add(new double[]{2D, 1.25D, 0D});
		}
	}, "", null, 0, false),
	CstockEngine(EntityLocoElectricCStockEngine.class, new ModelCstockEngine(), "C_stock_", true, new float[]{-1F, 0.16F, 0F}, new float[] {0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	CstockPassenger(EntityPassengerCStockPassenger.class, new ModelCstockPassenger(), "C_stock_", true, new float[]{-1F, 0.16F, 0F}, new float[] {0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),

	;
	private Class<? extends EntityRollingStock> entityClass;
	private final ModelBase model;
	private String texture;
	private boolean multiTexture;
	private float[] trans;
	private float[] rotate;
	private float[] scale;
	private String smokeType;
	private ArrayList<double[]> smokeFX;
	private String explosionType;
	private ArrayList<double[]> explosionFX;
	private int smokeIterations;
	private int explosionFXIterations;
	private boolean hasSmokeOnSlopes;

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
	TCMLPRenderEnum(Class<? extends EntityRollingStock> entityClass, ModelBase model, String texture, boolean multiTexture, float[] trans, float[] rotate, float[] scale, String smokeType, int smokeIterations, ArrayList<double[]> smokeFX, String explosionType, ArrayList<double[]> explosionFX, int explosionFXIterations, boolean hasSmokeOnSlopes) {
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
			return new ResourceLocation(TCMLPAddonInfo.resourceLocation, TCMLPAddonInfo.trainsPrefix + texture + colorString + ".png");
		} else {
			return new ResourceLocation(TCMLPAddonInfo.resourceLocation, TCMLPAddonInfo.trainsPrefix + texture + ".png");
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
