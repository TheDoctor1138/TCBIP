package com.thedoctor1138.train.common.library;

import train.common.api.TrainSoundRecord;
import com.thedoctor1138.train.common.entity.rollingStock.*;



public enum TCMLPEnumSounds implements TrainSoundRecord {
	nmbs_hle_18(EntityLocoElectricNMBS_HLE_18.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	class74(EntitylocodieselClass74.class, "eu07_horn", 1F, "chme3_idle", 0.6F, 4, "chem3_idle", 0.5F, 25, false),

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
        if (horn == null || horn.isEmpty() || horn.startsWith(TCMLPAddonInfo.resourceLocation + ":")) return horn;
		return TCMLPAddonInfo.resourceLocation + ":" + horn;
	}

    @Override
	public String getRunString() {
        if (run == null || run.isEmpty() || run.startsWith(TCMLPAddonInfo.resourceLocation + ":")) return run;
		return TCMLPAddonInfo.resourceLocation + ":" + run;
	}

    @Override
	public String getIdleString() {
        if (idle == null || idle.isEmpty() || idle.startsWith(TCMLPAddonInfo.resourceLocation + ":")) return idle;
		return TCMLPAddonInfo.resourceLocation + ":" + idle;
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
