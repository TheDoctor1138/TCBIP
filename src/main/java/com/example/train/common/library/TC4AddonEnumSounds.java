package com.example.train.common.library;

import train.common.api.TrainSoundRecord;
import train.common.library.Info;


public enum TC4AddonEnumSounds implements TrainSoundRecord {

	;

	private final Class entityClass;
	private final String horn;
	private final float hornVolume;
	private final String run;
	private final String idle;
	private final float runVolume;
	private final float idleVolume;
	private final int runSoundLenght;
	private final int idleSoundLenght;
	private final boolean soundChangeWithSpeed;

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
	TC4AddonEnumSounds(Class entityClass, String horn, float hornVolume, String run, float runVolume, int runSoundLenght, String idle, float idleVolume, int idleSoundLenght, boolean soundChangeWithSpeed) {
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
        if (horn == null || horn.isEmpty() || horn.startsWith(TC4AddonInfo.resourceLocation + ":")) return horn;
		return Info.resourceLocation + ":" + horn;
	}

    @Override
	public String getRunString() {
        if (run == null || run.isEmpty() || run.startsWith(TC4AddonInfo.resourceLocation + ":")) return run;
		return Info.resourceLocation + ":" + run;
	}

    @Override
	public String getIdleString() {
        if (idle == null || idle.isEmpty() || idle.startsWith(TC4AddonInfo.resourceLocation + ":")) return idle;
		return Info.resourceLocation + ":" + idle;
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
	public int getRunSoundLenght() {
		return runSoundLenght;
	}

    @Override
	public int getIdleSoundLenght() {
		return idleSoundLenght;
	}

    @Override
	public boolean getSoundChangeWithSpeed() {
		return soundChangeWithSpeed;
	}
}
