package com.thedoctor1138.train.common.library;

import com.thedoctor1138.train.client.render.TCMLPRenderEnum;
import com.thedoctor1138.train.common.library.TCMLPEnumSounds;
import com.thedoctor1138.train.common.library.TCMLPEnumTrains;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import train.common.api.TrainRecord;
import train.common.api.TrainRenderRecord;
import train.common.api.TrainSoundRecord;
import train.common.Traincraft;

public class TCMLPRegistry {

    public void registerTrainRecords() {
        for (TrainRecord train : TCMLPEnumTrains.values()) {
            Traincraft.instance.traincraftRegistry.registerTrainRecord(train);
        }
    }

    public void registerRenderRecords() {
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.CLIENT) {
            for (TrainRenderRecord render : TCMLPRenderEnum.values()) {
                Traincraft.instance.traincraftRegistry.registerTrainRenderRecord(render);
            }
        }
    }

    public void registerSoundRecords() {
        for (TrainSoundRecord sound : TCMLPEnumSounds.values()) {
            Traincraft.instance.traincraftRegistry.registerTrainSoundRecord(sound);
        }
    }
}
