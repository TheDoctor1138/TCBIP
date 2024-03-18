package com.thedoctor1138.train.common.library;

import com.thedoctor1138.train.client.render.TCMLPRenderEnum;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.item.Item;
import train.common.api.TrainRecord;
import train.common.Traincraft;
import train.common.api.TrainRenderRecord;
import train.common.api.TrainSoundRecord;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TCMLPRegistry {

    private List<TrainRecord> trainRecords = new ArrayList<>();
    private Map<Item, TrainRecord> trainRecordsByItem = new HashMap<>();
    private Map<Class<?>, TrainRenderRecord> trainRenderRecords = new HashMap<>();
    private List<TrainSoundRecord> trainSoundRecords = new ArrayList<>();

    public void init() {
        for (TrainRecord train : TCMLPEnumTrains.trains()) {
            Traincraft.instance.traincraftRegistry.registerTrainRecord(train);
        }

        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.CLIENT) {
            for (TCMLPRenderEnum render : TCMLPRenderEnum.values()) {
                Traincraft.instance.traincraftRegistry.registerTrainRenderRecord(render);
            }
        }

        for (TrainSoundRecord sound : TCMLPEnumSounds.values()) {
            Traincraft.instance.traincraftRegistry.registerTrainSoundRecord(sound);
        }
    }

    public TrainRecord getTrainRecord(Class<?> entityClass) {
        if (entityClass == null) return null;

        for (TrainRecord record : trainRecords) {
            if (entityClass.equals(record.getEntityClass())) {
                return record;
            }
        }
        return null;
    }


    public void registerTrainRecord(TrainRecord record) {
        trainRecords.add(record);
        trainRecordsByItem.put(record.getItem(), record);
    }

    public void registerTrainRenderRecord(TrainRenderRecord record) {
        trainRenderRecords.put(record.getEntityClass(), record);
        addLivery(train.common.entity.rollingStock.EntityBoxCartUS.class, "burple");
    }

    public void addLivery(Class<?> entityClass, String name){
        for (TrainRecord record : trainRecords) {
            if (entityClass.equals(record.getEntityClass())) {
                record.skins.add(name);
            }
        }
    }


    public void registerTrainSoundRecord(TrainSoundRecord sound) {
        trainSoundRecords.add(sound);
    }

}
