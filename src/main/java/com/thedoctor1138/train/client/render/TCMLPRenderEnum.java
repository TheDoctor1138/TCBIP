package com.thedoctor1138.train.client.render;




import com.flansmod.client.model.YourPackage.ModelNGT6ER_Loco;
import com.flansmod.client.model.YourPackage.ModelNGT6ER_Tail;
import com.thedoctor1138.train.common.entity.rollingStock.*;
import com.thedoctor1138.train.common.library.TCMLPInfo;
import com.thedoctor1138.train.client.render.models.*;

import fexcraft.tmt.slim.ModelBase;
import train.common.api.EntityRollingStock;
import train.common.api.TrainRenderRecord;
import net.minecraft.util.ResourceLocation;


import java.util.ArrayList;

public enum TCMLPRenderEnum implements TrainRenderRecord {

	class74(EntitylocodieselClass74.class, new ModelClass74(), "Class_74_", true, new float[]{-1.5F, 0.15F, 0F}, new float[] {0F, 180F, 180F}, null, "smoke", 1, new ArrayList<double[]>() {
		{
			add(new double[]{2D, 1.25D, 0D});
		}
	}, "", null, 0, false),
	CstockEngine(EntityLocoElectricCStockEngine.class, new ModelCstockEngine(), "C_stock_", true, new float[]{-1F, 0.16F, 0F}, new float[] {0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	CstockPassenger(EntityPassengerCStockPassenger.class, new ModelCstockPassenger(), "C_stock_", true, new float[]{-1F, 0.16F, 0F}, new float[] {0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	class20(EntitylocodieselClass20.class, new ModelClass20(), "Class_20_", true, new float[]{-1.75F, 0.15F, 0F}, new float[] {0F, 180F, 180F}, null, "smoke", 1, new ArrayList<double[]>() {
		{
			add(new double[]{2D, 1.25D, 0D});
		}
	}, "", null, 0, false),
	Class68(EntityLocoDieselClass68.class, new ModelClass68(), "Class_68_", true, new float[]{-1.8F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 1, null, "", null, 0, false),
	Class88(EntityLocoElectricClass88.class, new ModelClass88(), "Class_88_", true, new float[]{-1.8F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	LessCoWagon(EntityFreightLessCoWagon.class, new ModelLessCoWagon(), "Less_Co2_", true, new float[]{0F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	GWRMogul(EntityLocoSteamGWRMogul.class, new ModelGWRMogul(), "GWR_Mogul_", true, new float[]{-1.4f, -0.03f, 0}, new float[]{0, 180, 180}, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{2.67D, 1.3D, 0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{2.92D, -0.2D, 0.65D});
		}
	}, 2, true),
	Churchward3500GalTender(EntityTenderChurchward3500Gal.class, new ModelChurchward3500GalTender(), "Churchward_3500_Gal_", true, new float[]{-0.05f, -0.03f, 0f,}, new float[]{0F, 180f, 180F}, null, "", 0, null, "", null, 0, false),
	DuewagNGT6ERLoco(EntityElectricDuewagNGT6ERLoco.class, new ModelNGT6ER_Loco(), "Duewag_NGT6ER_", true, new float[]{-0.85F, 0.2F, 0F}, new float[] {0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	DuewagNGT6ERTail(EntityPassengerDuewagNGT6ERTail.class, new ModelNGT6ER_Tail(), "Duewag_NGT6ER_", true, new float[]{-0.85F, 0.2F, 0F}, new float[] {0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),

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
			return new ResourceLocation(TCMLPInfo.resourceLocation, TCMLPInfo.trainsPrefix + texture + colorString + ".png");
		} else {
			return new ResourceLocation(TCMLPInfo.resourceLocation, TCMLPInfo.trainsPrefix + texture + ".png");
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
