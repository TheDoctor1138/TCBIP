package com.thedoctor1138.train.common;

import com.thedoctor1138.train.common.core.TCMLPCreativeTabTraincraftTrains;
import com.thedoctor1138.train.common.items.TCMLPItems;
import com.thedoctor1138.train.common.library.TCMLPAddonInfo;
import com.thedoctor1138.train.common.library.TCMLPEnumTrains;
import com.thedoctor1138.train.common.library.TCMLPRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStoppedEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = TCMLPAddonInfo.modID, name = TCMLPAddonInfo.modName, version = TCMLPAddonInfo.modVersion)
public class TCMLP {

	/* TrainCraft instance */
	@Instance(TCMLPAddonInfo.modID)
	public static TCMLP instance;

	/* TrainCraft Logger */
	public static Logger tcLog = LogManager.getLogger(TCMLPAddonInfo.modName);

//	public static File configDirectory;

	/* Creative tab for Traincraft */
	public static CreativeTabs tcAddonTab;

    private TCMLPRegistry registry;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		tcLog.info("Starting Traincraft MLP Addon " + TCMLPAddonInfo.modVersion + "!");

        /* Config handler */
//		configDirectory= event.getModConfigurationDirectory();

		/* Register Items, Blocks, ... */
		tcLog.info("Initialize Blocks, Items, ...");

        tcAddonTab = new TCMLPCreativeTabTraincraftTrains(CreativeTabs.getNextID(), "Trains");

        TCMLPItems.init();
        registerEntityHandlers();

		/* Other Proxy init */
		tcLog.info("Initialize Renderer and Events");

        registry = new TCMLPRegistry();
        registry.registerTrainRecords();
        registry.registerRenderRecords();
        registry.registerSoundRecords();

        tcLog.info("Finished PreInitialization");
	}
    
    private void registerEntityHandlers() {
		int trainID = 1;
		for(TCMLPEnumTrains train : TCMLPEnumTrains.values()){
			EntityRegistry.registerModEntity(train.getEntityClass(), train.getInternalName(), trainID, TCMLP.instance, 512, 1, true);
			trainID++;
		}
    } 

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent evt) {
	}

	@EventHandler
	public void serverStop(FMLServerStoppedEvent event) {
	}
}