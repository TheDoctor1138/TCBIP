package td1138.bip;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import td1138.bip.blocks.TCBlocks;
import td1138.bip.core.CommonProxy;
import td1138.bip.entities.rollingstock.*;
import td1138.bip.entities.trains.*;
import td1138.bip.library.TCBIPInfo;
import td1138.bip.recipes.TCBIPRecipeHandler;
import td1138.bip.tile.TileBR_Modern_Buffer;
import td1138.bip.tile.switchStand.TileBR_2_Aspect_Signal;
import td1138.bip.tile.switchStand.TileBR_3_Aspect_Signal;
import td1138.bip.tile.switchStand.TileBR_4_Aspect_Signal;
import td1138.bip.tile.switchStand.TileBR_UK_SpeedSign;
import train.common.api.AbstractTrains;
import train.common.core.CreativeTabTraincraft;
import train.common.core.handlers.CraftingHandler;
import train.common.core.handlers.PacketHandler;
import train.common.items.TCItems;
import train.common.library.TraincraftRegistry;

@Mod(modid = TCBIPInfo.modID, version = TCBIPInfo.modVersion, name = TCBIPInfo.modName ,dependencies = "required-after:tc")
public class TCBIP {

	public static CreativeTabTraincraft tabBIP;


	@Mod.Instance(TCBIPInfo.modID)
	public static TCBIP instance;

	@SidedProxy(clientSide = "td1138.bip.core.ClientProxy", serverSide = "td1138.bip.core.CommonProxy")
	public static CommonProxy proxy;
	private Object FMLPreInitializationEvent;

	@Mod.EventHandler
	public void init(cpw.mods.fml.common.event.FMLPreInitializationEvent event) {

		tabBIP = new CreativeTabTraincraft("B.I.P.", TCBIPInfo.modID, "trains/bipLogo");
		TraincraftRegistry.registerTransports("", listSteamTrains());
		TraincraftRegistry.registerTransports("", listFreight());
		TraincraftRegistry.registerTransports("", listPassenger());
		TraincraftRegistry.registerTransports("", listTanker());
		TraincraftRegistry.registerTransports("", listElectricTrains());
		TraincraftRegistry.registerTransports("", listDieselTrains());
		TraincraftRegistry.registerTransports("", listTender());

		TCBlocks.init();
		TCItems.init();
		TCBIPRecipeHandler.init();

		/* GUI handler initiation */
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
		FMLCommonHandler.instance().bus().register(new CraftingHandler());

		proxy.registerTileEntities();
		GameRegistry.registerTileEntity(TileBR_UK_SpeedSign.class, "TileBR_UK_SpeedSign");
		GameRegistry.registerTileEntity(TileBR_Modern_Buffer.class, "TileBR_Modern_Buffer");
		GameRegistry.registerTileEntity(TileBR_2_Aspect_Signal.class, "TileBR_2_Aspect_Signal");
		GameRegistry.registerTileEntity(TileBR_3_Aspect_Signal.class, "TileBR_3_Aspect_Signal");
		GameRegistry.registerTileEntity(TileBR_4_Aspect_Signal.class, "TileBR_4_Aspect_Signal");
		proxy.registerBookHandler();
		PacketHandler.init();
		proxy.registerRenderInformation();
		proxy.registerEvents(event);

	}

	public static AbstractTrains[] listElectricTrains() {
		return new AbstractTrains[]{
				new EntityLocoElectricCStockEngine(null),
				new EntityLocoElectricDStockEngine(null),
				new EntityLocoElectricClass88(null),
				new EntityLocoElectricHLEClass18(null),
		};
	}

	public static AbstractTrains[] listDieselTrains() {
		return new AbstractTrains[]{
				new EntityLocoDieselClass74(null),
				new EntityLocoDieselClass68(null),
		};
	}

	public static AbstractTrains[] listSteamTrains() {

		return new AbstractTrains[]{
				new EntityLocoGWRMogul(null),
		};
	}

	public static AbstractTrains[] listPassenger() {

		return new AbstractTrains[]{
				new EntityPassengerCStockPassenger(null),
				new EntityPassengerDStockPassenger(null),
				new EntityPassengerBRMk3Sleeper(null),
				new EntityPassengerSNCBM6(null),
				new EntityPassengerSNCBM6Tail(null),
		};
	}

	public static AbstractTrains[] listFreight() {

		return new AbstractTrains[]{
				new EntityFreightLessCoWagon(null),
		};
	}

	public static AbstractTrains[] listTanker() {

		return new AbstractTrains[]{};
	}

	public static AbstractTrains[] listTender() {

		return new AbstractTrains[]{
				new EntityTenderChurchward3500Gal(null),
		};
	}
}
