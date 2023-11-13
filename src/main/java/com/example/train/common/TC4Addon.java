package com.example.train.common;

import com.example.train.common.blocks.TC4AddonBlocks;
import com.example.train.common.core.CommonProxy;
import com.example.train.common.core.TC4AddonsTab;
import com.example.train.common.core.handlers.ConfigHandler;
import com.example.train.common.items.TC4AddonItems;
import com.example.train.common.library.EnumTrains;
import com.example.train.common.library.Info;
import com.example.train.common.library.TC4AddonRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStoppedEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import train.common.api.LiquidManager;
import train.common.core.TrainModCore;
import train.common.core.handlers.CraftingHandler;
import com.example.train.common.core.handlers.RecipeHandler;
import com.example.train.common.recipes.AssemblyTableRecipes;

import java.io.File;


@Mod(modid = Info.modID, name = Info.modName, version = Info.modVersion)
public class TC4Addon {

	/* TrainCraft instance */
	@Instance(Info.modID)
	public static TC4Addon instance;

	/* TrainCraft proxy files */
	@SidedProxy(clientSide = "com.example.train.client.core.ClientProxy", serverSide = "com.example.train.common.core.CommonProxy")
	public static CommonProxy proxy;

	/* TrainCraft Logger */
	public static Logger tc4AddonLog = LogManager.getLogger(Info.modName);

    //	public static File configDirectory;

	/** Network Channel to send packets on */
	public static SimpleNetworkWrapper modChannel;
	public static SimpleNetworkWrapper keyChannel;
	public static SimpleNetworkWrapper rotationChannel;


	public static SimpleNetworkWrapper slotschannel;
	public static SimpleNetworkWrapper ignitionChannel;
	public static SimpleNetworkWrapper brakeChannel;
	public static SimpleNetworkWrapper lockChannel;
	public static SimpleNetworkWrapper builderChannel;
	public static SimpleNetworkWrapper updateTrainIDChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TrainIDChannel");
	public static SimpleNetworkWrapper updateDestinationChannel = NetworkRegistry.INSTANCE.newSimpleChannel("updateDestnChannel");


	public static final SimpleNetworkWrapper itaChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TransmitterAspect");
	public static  SimpleNetworkWrapper itsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TransmitterSpeed");
	//public static  SimpleNetworkWrapper mtcsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCSysSetSpeed");
	public static  SimpleNetworkWrapper itnsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TransmitterNextSpeed");
	public static final SimpleNetworkWrapper mtlChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCLevelUpdater");
	public static final SimpleNetworkWrapper msChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCStatus");
	public static final SimpleNetworkWrapper mscChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCStatusToClient");
	public static final SimpleNetworkWrapper atoChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ATOPacket");
	public static final SimpleNetworkWrapper atoDoSlowDownChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ATODoSlowDown");
	public static final SimpleNetworkWrapper atoDoAccelChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ATODoAccel");
	public static final SimpleNetworkWrapper atoSetStopPoint = NetworkRegistry.INSTANCE.newSimpleChannel("ATOSetStopPoint");
	public static final SimpleNetworkWrapper NCSlowDownChannel = NetworkRegistry.INSTANCE.newSimpleChannel("NCDoSlowDown");
	//public static final SimpleNetworkWrapper ctChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ctmChannel");
	public static final SimpleNetworkWrapper gsfsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("gsfsChannel");
	public static final SimpleNetworkWrapper gsfsrChannel = NetworkRegistry.INSTANCE.newSimpleChannel("gsfsReturnChannel");

	private TC4AddonRegistry registry = new TC4AddonRegistry();



	public static File configDirectory;


	public static CreativeTabs tc4AddonTab;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		tc4AddonLog.info("Starting TC4 Addon " + Info.modVersion + "!");

        /* Config handler */
		configDirectory= event.getModConfigurationDirectory();
		ConfigHandler.init(new File(event.getModConfigurationDirectory(), train.common.library.Info.modName + ".cfg"));

		/* Register the KeyBinding Handler */
		proxy.registerKeyBindingHandler();

		/* Register Items, Blocks, ... */
		tc4AddonLog.info("Initialize Blocks, Items, ...");
        tc4AddonTab = new TC4AddonsTab(CreativeTabs.getNextID(), "TC4 Addon");
		TC4AddonBlocks.init();
		TC4AddonItems.init();
		//EntityHandler.init();

		proxy.registerTileEntities();
		proxy.registerSounds();
		proxy.setHook(); // Moved file needed to run JLayer, we need to set a hook in order to retrieve it

		/* Other Proxy init */
		tc4AddonLog.info("Initialize Renderer and Events");

        registry = new TC4AddonRegistry();
        registry.registerTrainRecords();
        registry.registerRenderRecords();
        registry.registerSoundRecords();

        tc4AddonLog.info("Finished PreInitialization");
	}
    
    private void registerEntityHandlers() {
		int trainID = 1;
		for(EnumTrains train : EnumTrains.values()){
			EntityRegistry.registerModEntity(train.getEntityClass(), train.getInternalName(), trainID, TC4Addon.instance, 512, 1, true);
			trainID++;
		}
    } 

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		tc4AddonLog.info("Start Initialization");

		tc4AddonLog.info("Initialize Gui");
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
		FMLCommonHandler.instance().bus().register(new CraftingHandler());


		tc4AddonLog.info("Initialize Recipes");
		RecipeHandler.initBlockRecipes();
		RecipeHandler.initItemRecipes();
		RecipeHandler.initSmeltingRecipes();
		AssemblyTableRecipes.recipes();


		/* Liquid FX */
		proxy.registerTextureFX();
		/* Book Handler */
		proxy.registerBookHandler();
		tc4AddonLog.info("Finished Initialization");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent evt) {
		tc4AddonLog.info("Start to PostInitialize");
		tc4AddonLog.info("Register ChunkHandler");

		tc4AddonLog.info("Finished PostInitialization");
	}

	@EventHandler
	public void serverStop(FMLServerStoppedEvent event) {
		proxy.killAllStreams();
	}

}