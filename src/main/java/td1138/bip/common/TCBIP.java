package td1138.bip.common;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStoppedEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import ebf.tim.utility.DebugUtil;
import net.minecraft.launchwrapper.Launch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import td1138.bip.common.core.CommonProxy;
import td1138.bip.common.core.CreativeTabBIP;
import td1138.bip.common.core.handlers.EntityHandler;
import td1138.bip.common.core.handlers.TCBIPRecipeHandler;
import td1138.bip.common.items.TCBIPItems;
import td1138.bip.common.library.TCBIPInfo;
import td1138.bip.common.library.TCBIPRegistry;
import td1138.bip.common.recipes.AssemblyTableRecipes;
import train.common.core.handlers.ConfigHandler;


@Mod(modid = TCBIPInfo.modID, name = TCBIPInfo.modName, version = TCBIPInfo.modVersion)
public class TCBIP {

	/* TrainCraft instance */
	@Instance(TCBIPInfo.modID)
	public static TCBIP instance;

	@SidedProxy(clientSide = "td1138.bip.client.core.ClientProxy", serverSide = "td1138.bip.common.core.CommonProxy")
	public static CommonProxy proxy;

	/* TrainCraft Logger */
	public static Logger bipLog = LogManager.getLogger(TCBIPInfo.modName);

	public static CreativeTabBIP tabBIP, tabBIPTrains;

    private TCBIPRegistry registry;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		DebugUtil.dev = (Boolean) Launch.blackboard.get("fml.deobfuscatedEnvironment");
		bipLog.info("Starting PreInitialization");
		bipLog.info("Starting British International Pack: " + TCBIPInfo.modVersion + "!");

		if (!Loader.isModLoaded("tc")) {
			bipLog.error("Traincraft is not installed!");
		}

		/* Register Items, Blocks, ... */

		bipLog.info("Initialising Entities.");
		EntityHandler.init();;
		bipLog.info("Initialising Renderer and Events");
		registry = new TCBIPRegistry();

		tabBIP = new CreativeTabBIP("B.I.P.", TCBIPInfo.modID, "trains/bipLogo");
		if (ConfigHandler.SPLIT_CREATIVE) {
			tabBIPTrains = new CreativeTabBIP("B.I.P. Trains",  TCBIPInfo.modID,"trains/bipLogo");
		}

		bipLog.info("Finished PreInitialization");





	}
    


	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		bipLog.info("Start Initialization.");
		bipLog.info("Initialising Blocks, Items, ...");
		TCBIPItems.init();
		bipLog.info("Initialising Gui");
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);


		bipLog.info("Initialising Recipes");
		TCBIPRecipeHandler.initBlockRecipes();
		TCBIPRecipeHandler.initItemRecipes();
		TCBIPRecipeHandler.initSmeltingRecipes();
		AssemblyTableRecipes.recipes();
		registry.init();
		proxy.registerBookHandler();
		bipLog.info("Finished Initialization.");
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {






	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent evt) {
		bipLog.info("Start to PostInitialize");
		TCBIPRegistry.endRegistration();
		bipLog.info("Finished PostInitialization");
	}

	@EventHandler
	public void serverStop(FMLServerStoppedEvent event) {
	}
}