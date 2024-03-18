/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package com.thedoctor1138.train.common.core.handlers;

import com.thedoctor1138.train.common.TCMLP;
import com.thedoctor1138.train.common.library.TCMLPEnumTrains;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import train.common.Traincraft;
import train.common.api.EntityBogie;
import train.common.api.TrainRecord;
import train.common.core.EntityIds;
import train.common.entity.zeppelin.EntityZeppelinOneBalloon;
import train.common.entity.zeppelin.EntityZeppelinTwoBalloons;
import train.common.library.EnumTrains;

public class EntityHandler {
    public static void init() {
        int trainID= 32;
        for(TrainRecord trains : TCMLPEnumTrains.trains()){
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