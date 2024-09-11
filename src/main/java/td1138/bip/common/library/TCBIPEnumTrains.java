package td1138.bip.common.library;

import td1138.bip.common.entity.rollingStock.*;
import train.common.api.TrainRecord;


public class TCBIPEnumTrains {
	public static TrainRecord[] trains() {
		return new TrainRecord[]{

				TrainRecord.makeEntry("Class74", "Class74", EntitylocodieselClass74.class, TCBIPItemIDs.minecartClass74.item, "diesel", 650, 140, 0, 10, 0, 80, 0.9, 0.75, 9000, new String[]{"Black", "Blue", "Green", "Grey", "LightBlue", "Yellow"}, 18, -3, "pack B.I.P."),
				TrainRecord.makeEntry("CStockEngine", "CStockEngine", EntityLocoElectricCStockEngine.class, TCBIPItemIDs.minecartCstockEngine.item, "electric", 200, 80, 0, 10, 0, 0, 0.9, 0.79, 0, new String[]{"Blue", "Grey"}, 10, -2),
				TrainRecord.makeEntry("CStockPassenger", "CStockPassenger", EntityPassengerCStockPassenger.class, TCBIPItemIDs.minecartCstockPassenger.item, "passenger", 0, 0, 0, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Grey"}, 10, -2),
				TrainRecord.makeEntry("Class20Diesel", "Class20", EntitylocodieselClass20.class, TCBIPItemIDs.minecartClass20.item, "diesel", 1000, 121, 0, 10, 0, 75, 0.6, 0.67, 17000, new String[]{"Black", "Blue", "Brown", "Cyan", "Green", "Grey", "LightBlue", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Purple", "Red", "White", "Yellow","Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27"}, 9, -3.5),
				TrainRecord.makeEntry("Class68", "Class68", EntityLocoDieselClass68.class, TCBIPItemIDs.minecartClass68.item, "diesel", 3800, 161, 0, 10, 0, 75, 0.7, 0.8, 17000, new String[]{"Blue", "Cyan", "Grey", "LightBlue", "Purple"}, 10, -3.6),
				TrainRecord.makeEntry("Class88", "Class88", EntityLocoElectricClass88.class, TCBIPItemIDs.minecartClass88.item, "electric", 5400, 161, 0, 10, 0, 0, 0.9, 0.8, 0, new String[]{"Blue", "Cyan", "Magenta", "Purple"}, 10, -3.6),
				TrainRecord.makeEntry("LessCoWagon", "LessCoWagon", EntityFreightLessCoWagon.class, TCBIPItemIDs.minecartLessCoWagon.item, "freight",0,0,2.1,0,0,0,0,0,0,56, new String[]{"Blue", "Brown", "Cyan", "Grey", "LightBlue", "Red", "Yellow"}, 18, 0, null  ),
				TrainRecord.makeEntry("GWRMogul", "GWRMogul", EntityLocoSteamGWRMogul.class, TCBIPItemIDs.minecartGWRMogul.item, "steam", 1150, 121, 3, 10, 10, 100, 0.7, 0.8, 6000, new String[]{"Green", "Brown", "Black", "Grey", "LightBlue", "Lime", "Orange", "Red", "Yellow", "Magenta"}, 18, -3.14f),
				TrainRecord.makeEntry("Churchward3500GalTender", "Churchward3500GalTender", EntityTenderChurchward3500Gal.class, TCBIPItemIDs.minecartChurchward3500GalTender.item, "tender", 0, 0, 0.6, 0, 0, 0, 0, 0, 16000, new String[]{"Green", "Blue", "Brown", "Black", "Grey", "LightBlue", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Purple", "White", "Yellow"}, 18, 0, "Pack: B.I.P \nWater capacity: 16000mb"),
				TrainRecord.makeEntry("DuewagNGT6ERLoco", "DuewagNGT6ERLoco", EntityElectricDuewagNGT6ERLoco.class, TCBIPItemIDs.minecartNGT6ERLoco.item, "electric", 250, 80, 0, 10, 0, 0, 0.9, 0.8, 0, new String[]{"Red", "Grey", "Green", "Magenta"}, 10, -2, "Pack: TramsIM"),
				TrainRecord.makeEntry("DuewagNGT6ERTail", "DuewagNGT6ERTail", EntityPassengerDuewagNGT6ERTail.class, TCBIPItemIDs.minecartNGT6ERTail.item, "passenger", 0, 0, 0, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Grey","Green","Magenta"}, 10, -1.65, "Pack: TramsIM"),
				TrainRecord.makeEntry("BR_MK3_Sleeper", "BR_MK3_Sleeper", EntityPassengerBR_MK3_Sleeper.class, TCBIPItemIDs.minecartBR_MK3_Sleeper.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "White", "Pink", "Cyan", "Green", "Brown", "Red"}, 0, 0),
				TrainRecord.makeEntry("Hornby040E2", "Hornby040E2", EntityLocoSteamHornby040E2.class, TCBIPItemIDs.minecartHornby040E2.item, "steam", 550, 121, 3, 10, 10, 100, 0.7, 0.8, 6000, new String[]{"Black", "Grey", "Red", "Magenta", "Yellow", "Blue", "Green"}, 18, -2.5f),
				TrainRecord.makeEntry("Hornby060E2", "Hornby060E2", EntityLocoSteamHornby060E2.class, TCBIPItemIDs.minecartHornby060E2.item, "steam", 550, 121, 3, 10, 10, 100, 0.71, 0.8, 6000, new String[]{"Brown", "Black", "Blue"}, 18, -2.5f),
				TrainRecord.makeEntry("4WheeledCoach", "4WheeledCoach", EntityPassenger4WheeledCoach.class, TCBIPItemIDs.minecart4WheeledCoach.item, "passenger", 0, 0, 2.2, 0, 0, 0, 0, 0, 0, new String[]{"Orange", "Red", "LightBlue", "Green", "Brown", "Blue"}, 0, 0),
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
