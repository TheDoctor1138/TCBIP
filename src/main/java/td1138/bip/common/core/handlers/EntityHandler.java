/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package td1138.bip.common.core.handlers;

import td1138.bip.common.library.TCBIPEnumTrains;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import train.common.Traincraft;
import train.common.api.TrainRecord;

public class EntityHandler {
    public static void init() {
        int trainID= 32;
        for(TrainRecord trains : TCBIPEnumTrains.trains()){
            EntityRegistry.registerModEntity(trains.getEntityClass(), trains.getInternalName(), trainID, Traincraft.instance, 512, 1, true);
            trainID++;
            if(trainID== 112 || trainID==51){
                trainID++;
            }
        }
    }

    public static Entity getEntityServer(World world, int entityId) {
        if ((world instanceof WorldServer)) {
            return world.getEntityByID(entityId);
        }
        return null;
    }
}