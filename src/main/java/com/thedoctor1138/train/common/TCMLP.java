package com.thedoctor1138.train.common;

import com.thedoctor1138.train.common.core.TCMLPCreativeTabTraincraftTrains;
import com.thedoctor1138.train.common.core.handlers.TCMLPRecipeHandler;
import com.thedoctor1138.train.common.items.TCMLPItems;
import com.thedoctor1138.train.common.library.TCMLPInfo;
import com.thedoctor1138.train.common.library.TCMLPRegistry;
import com.thedoctor1138.train.common.recipes.AssemblyTableRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStoppedEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.thedoctor1138.train.common.core.CommonProxy;
import com.thedoctor1138.train.common.core.handlers.EntityHandler;


@Mod(modid = TCMLPInfo.modID, name = TCMLPInfo.modName, version = TCMLPInfo.modVersion)
public class TCMLP {

	/* TrainCraft instance */
	@Instance(TCMLPInfo.modID)
	public static TCMLP instance;

	@SidedProxy(clientSide = "com.thedoctor1138.train.client.core.ClientProxy", serverSide = "com.thedoctor1138.train.common.core.CommonProxy")
	public static CommonProxy proxy;

	/* TrainCraft Logger */
	public static Logger tcLog = LogManager.getLogger(TCMLPInfo.modName);

//	public static File configDirectory;

	/* Creative tab for Traincraft */
	public static CreativeTabs tcMLPTab;

    private TCMLPRegistry registry;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		tcLog.info("Starting Traincraft MLP Addon " + TCMLPInfo.modVersion + "!");

        /* Config handler */
//		configDirectory= event.getModConfigurationDirectory();

		/* Register Items, Blocks, ... */
		tcLog.info("Initialize Blocks, Items, ...");

        tcMLPTab = new TCMLPCreativeTabTraincraftTrains(CreativeTabs.getNextID(), "TCMLP");


        TCMLPItems.init();
		EntityHandler.init();

		/* Other Proxy init */
		tcLog.info("Initialize Renderer and Events");

        registry = new TCMLPRegistry();
        registry.init();

        tcLog.info("Finished PreInitialization");
	}
    


	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {



		tcLog.info("Initialize Gui");
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);


		tcLog.info("Initialize Recipes");
		TCMLPRecipeHandler.initBlockRecipes();
		TCMLPRecipeHandler.initItemRecipes();
		TCMLPRecipeHandler.initSmeltingRecipes();
		AssemblyTableRecipes.recipes();

		proxy.registerBookHandler();


	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent evt) {
	}

	@EventHandler
	public void serverStop(FMLServerStoppedEvent event) {
	}
}