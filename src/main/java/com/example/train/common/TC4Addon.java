package com.example.train.common;

import com.example.train.common.core.TC4AddonsTab;
import com.example.train.common.items.TC4AddonItems;
import com.example.train.common.library.TC4AddonEnumTrains;
import com.example.train.common.library.TC4AddonInfo;
import com.example.train.common.library.TC4AddonRegistry;
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


@Mod(modid = TC4AddonInfo.modID, name = TC4AddonInfo.modName, version = TC4AddonInfo.modVersion)
public class TC4Addon {

	/* TrainCraft instance */
	@Instance(TC4AddonInfo.modID)
	public static TC4Addon instance;

	/* TrainCraft Logger */
	public static Logger tcLog = LogManager.getLogger(TC4AddonInfo.modName);

//	public static File configDirectory;

	/* Creative tab for Traincraft */
	public static CreativeTabs tcAddonTab;

    private TC4AddonRegistry registry;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		tcLog.info("Starting TC4 Addon " + TC4AddonInfo.modVersion + "!");

        /* Config handler */
//		configDirectory= event.getModConfigurationDirectory();

		/* Register Items, Blocks, ... */
		tcLog.info("Initialize Blocks, Items, ...");

        tcAddonTab = new TC4AddonsTab(CreativeTabs.getNextID(), "TC4 Addon");

       TC4AddonItems.init();
        registerEntityHandlers();

		/* Other Proxy init */
		tcLog.info("Initialize Renderer and Events");

        registry = new TC4AddonRegistry();
        registry.registerTrainRecords();
        registry.registerRenderRecords();
        registry.registerSoundRecords();

        tcLog.info("Finished PreInitialization");
	}
    
    private void registerEntityHandlers() {
		int trainID = 1;
		for(TC4AddonEnumTrains train : TC4AddonEnumTrains.values()){
			EntityRegistry.registerModEntity(train.getEntityClass(), train.getInternalName(), trainID, TC4Addon.instance, 512, 1, true);
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