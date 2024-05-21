package com.thedoctor1138.train.common.library;

import train.common.api.TrainSoundRecord;
import com.thedoctor1138.train.common.entity.rollingStock.*;


public enum TCMLPEnumSounds implements TrainSoundRecord {
	class74(EntitylocodieselClass74.class, "eu07_horn", 1F, "chme3_idle", 0.6F, 4, "chme3_idle", 0.5F, 25, false),
	CstockEngine(EntityLocoElectricCStockEngine.class, "LUwhistle", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	class20(EntitylocodieselClass20.class, "br_horn", 1F, "Class20Thrash", 0.7F, 10, "Class20Thrash", 0.4F, 10, false),
	Class68(EntityLocoDieselClass68.class, "Class88Horn", 1F, "Class68Thrash", 0.8F, 15, "Class68Thrash", 0.4F, 20, false),
	Class88(EntityLocoElectricClass88.class, "Class88Horn", 1F, "Class90Idle", 0.7F, 15, "Class90Idle", 0.3F, 20, false),
	GWRMogul(EntityLocoSteamGWRMogul.class, "GWRWhistle", 1.1F, "steam_run", 0.4F, 20, "steam_run", 0.3F, 20, true),
	DuewagNGT6ERLoco(EntityLocoElectricCStockEngine.class, "tram_bell", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	;

	private Class entityClass;
	private String horn;
	private float hornVolume;
	private String run;
	private String idle;
	private float runVolume;
	private float idleVolume;
	private int runSoundLenght;
	private int idleSoundLenght;
	private boolean soundChangeWithSpeed;

	/**
	 * Defines the sounds for the locomotives Many locomotives have the same sound for run and idle
	 * 
	 * @param entityClass
	 * @param horn
	 * @param hornVolume
	 * @param run
	 * @param runVolume
	 * @param runSoundLenght
	 * @param idle
	 * @param idleVolume
	 * @param idleSoundLenght
	 * @param soundChangeWithSpeed
	 */
	private TCMLPEnumSounds(Class entityClass, String horn, float hornVolume, String run, float runVolume, int runSoundLenght, String idle, float idleVolume, int idleSoundLenght, boolean soundChangeWithSpeed) {
		this.entityClass = entityClass;
		this.horn = horn;
		this.hornVolume = hornVolume;
		this.run = run;
		this.idle = idle;
		this.runVolume = runVolume;
		this.idleVolume = idleVolume;
		this.runSoundLenght = runSoundLenght;
		this.idleSoundLenght = idleSoundLenght;
		this.soundChangeWithSpeed = soundChangeWithSpeed;
	}

    @Override
	public Class getEntityClass() {
		return entityClass;
	}

    @Override
	public String getHornString() {
        if (horn == null || horn.isEmpty() || horn.startsWith(TCMLPInfo.resourceLocation + ":")) return horn;
		return TCMLPInfo.resourceLocation + ":" + horn;
	}

    @Override
	public String getRunString() {
        if (run == null || run.isEmpty() || run.startsWith(TCMLPInfo.resourceLocation + ":")) return run;
		return TCMLPInfo.resourceLocation + ":" + run;
	}

    @Override
	public String getIdleString() {
        if (idle == null || idle.isEmpty() || idle.startsWith(TCMLPInfo.resourceLocation + ":")) return idle;
		return TCMLPInfo.resourceLocation + ":" + idle;
	}

    @Override
	public Float getHornVolume() {
		return hornVolume;
	}

    @Override
	public Float getRunVolume() {
		return runVolume;
	}

    @Override
	public Float getIdleVolume() {
		return idleVolume;
	}

	@Override
	public int getRunSoundLength() {
		return runSoundLenght;
	}

	@Override
	public int getIdleSoundLength() {
		return idleSoundLenght;
	}
    @Override
	public boolean getSoundChangeWithSpeed() {
		return soundChangeWithSpeed;
	}
}
