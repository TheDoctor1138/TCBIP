package com.example.train.common.library;

import com.example.train.client.render.TC4AddonRenderEnum;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import train.common.api.TrainRecord;
import train.common.api.TrainRenderRecord;
import train.common.api.TrainSoundRecord;
import train.common.Traincraft;

public class TC4AddonRegistry {

    public void registerTrainRecords() {
        for (TrainRecord train : TC4AddonEnumTrains.values()) {
            Traincraft.instance.traincraftRegistry.registerTrainRecord(train);
        }
    }

    public void registerRenderRecords() {
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.CLIENT) {
            for (TrainRenderRecord render : TC4AddonRenderEnum.values()) {
                Traincraft.instance.traincraftRegistry.registerTrainRenderRecord(render);
            }
        }
    }

    public void registerSoundRecords() {
        for (TrainSoundRecord sound : TC4AddonEnumSounds.values()) {
            Traincraft.instance.traincraftRegistry.registerTrainSoundRecord(sound);
        }
    }
}
