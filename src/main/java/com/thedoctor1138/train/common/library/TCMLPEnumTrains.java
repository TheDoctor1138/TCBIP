package com.thedoctor1138.train.common.library;

import com.thedoctor1138.train.common.entity.rollingStock.*;
import train.common.api.TrainRecord;

public class TCMLPEnumTrains {
	public static TrainRecord[] trains() {
		return new TrainRecord[]{

				TrainRecord.makeEntry("NMBSHLE18", "NMBS_HLE_18", EntityLocoElectricNMBS_HLE_18.class, TCMLPItemIDs.minecartNMBS_HLE_18.item, "electric", 6705, 201, 0, 10, 0, 0, 0.9, 0.79, 0, new String[]{"White", "Grey"}, 10, -3.7, "Pack: B.I.P."),
				TrainRecord.makeEntry("EurofimaPresidentiale", "EuroFimaPresidentiale", EntityPassengerEuroFimaPresidentiale.class, TCMLPItemIDs.minecartEuroFirmaPresidentiale.item, "passenger", 0, 0, 3.0, 0, 0, 0, 0, 0, 0, null, 0, -11, "Pack: WWCP"),
				TrainRecord.makeEntry("Class74", "Class74", EntitylocodieselClass74.class, TCMLPItemIDs.minecartClass74.item, "diesel", 650, 140, 0, 10, 0, 80, 0.9, 0.75, 9000, new String[]{"Black", "Blue", "Green", "Grey", "LightBlue", "Yellow"}, 18, -3, "pack B.I.P."),
				TrainRecord.makeEntry("CStockEngine", "CStockEngine", EntityLocoElectricCStockEngine.class, TCMLPItemIDs.minecartCstockEngine.item, "electric", 200, 80, 0, 10, 0, 0, 0.9, 0.79, 0, new String[]{"Blue"}, 10, -2, "Pack: B.I.P."),
				TrainRecord.makeEntry("CStockPassenger", "CStockPassenger", EntityPassengerCStockPassenger.class, TCMLPItemIDs.minecartCstockPassenger.item, "passenger", 0, 0, 0, 0, 0, 0, 0, 0, 0, new String[]{"Blue"}, 10, -2, "Pack: B.I.P."),
		};

	}
}
	/**
	 * 
	 * @param internalName : Only used by EntityRegistry
	 * @param entityClass
	 * @param item
	 * @param trainType: "steam", "diesel", "freight", "passenger", "special", "flat", "electric"
	 * @param MHP: power of the locomotive
	 * @param maxSpeed
	 * @param mass (will be multiplied by 10 internally. That means putting 0.1 here will create a mass of 1 Ton in game)
	 * @param fuelConsumption: 1 unit is consumed every x ticks
	 * @param waterConsumption: 1 unit is consumed every x ticks
	 * @param heatingTime
	 * @param accelerationRate: generally around 0.45
	 * @param brakeRate: generally around 0.98
	 * @param tankCapacity
	 * @param colors: an array with all possible colors. Index 0 is used as default color when train is first spawned. leave null if no color available
	 * @param guiRenderScale: scale at which the entity will be rendered inside the GUI (crafting GUI)
	 */
