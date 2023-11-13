//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.train.common.core.handlers;

import java.io.File;

import com.example.train.common.TC4Addon;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class ConfigHandler {
    public static boolean ENABLE_STEAM;
    public static boolean ENABLE_DIESEL;
    public static boolean ENABLE_ELECTRIC;
    public static boolean ENABLE_TENDER;
    public static boolean SHOW_POSSIBLE_COLORS;
    public static boolean REAL_TRAIN_SPEED;
    public static boolean MAKE_MODPACKS_GREAT_AGAIN;
    public static boolean FORCE_TEXTURE_BINDING;
    public static boolean DISABLE_NEI_RECIPES;
    public static boolean DISABLE_TRAIN_WORKBENCH;
    public static boolean ENABLE_WAGON_REMOVAL_NOTICES;
    public static boolean ENABLE_LOGGING;
    public static boolean ALLOW_ATO_ON_STEAMERS;
    public static boolean SPLIT_CREATIVE;

    public ConfigHandler() {
    }

    public static void init(File configFile) {
        Configuration cf = new Configuration(configFile);

        try {
            cf.load();
            ENABLE_STEAM = cf.get("general", "ENABLE_STEAM_TRAINS", true).getBoolean(true);
            ENABLE_DIESEL = cf.get("general", "ENABLE_DIESEL_TRAINS", true).getBoolean(true);
            ENABLE_ELECTRIC = cf.get("general", "ENABLE_ELECTRIC_TRAINS", true).getBoolean(true);
            ENABLE_TENDER = cf.get("general", "ENABLE_TENDERS", true).getBoolean(true);
            Property SHOW_POSSIBLE_COLORS_PROP = cf.get("general", "SHOW_POSSIBLE_TRAINS_COLORS_IN_CHAT", true);
            SHOW_POSSIBLE_COLORS_PROP.comment = "This will disable the chat messages telling you the possible colors when spawning new trains and when coloring them with dye";
            SHOW_POSSIBLE_COLORS = SHOW_POSSIBLE_COLORS_PROP.getBoolean(true);
            REAL_TRAIN_SPEED = cf.get("general", "REAL_TRAIN_SPEED", false).getBoolean(false);
            MAKE_MODPACKS_GREAT_AGAIN = cf.getBoolean("MAKE_MODPACKS_GREAT_AGAIN", "general", false, "This will disable some of Traincrafts easier recipes to balance Modpacks");
            SPLIT_CREATIVE = cf.getBoolean("SPLIT_CREATIVE_TAB", "general", false, "setting this to true will split the creative tab in 2, one is used for trains, the other for materials and Tracks.");
            FORCE_TEXTURE_BINDING = cf.get("general", "Force_Texture_Binding", true, "Enable this if trains and rollingstock are using block/item textures").getBoolean(false);
            DISABLE_NEI_RECIPES = cf.get("general", "DISABLE_NEI_RECIPES", true, "disables our system of registering recipes with NEI, there are a number of issues registering our recipes with NEI, enable at your own risk").getBoolean(true);
            DISABLE_TRAIN_WORKBENCH = cf.get("general", "DISABLE_TRAIN_WORKBENCH", false, "disables the train workbench, for those of you who want to use a custom part builder").getBoolean(false);
            ENABLE_WAGON_REMOVAL_NOTICES = cf.get("general", "ENABLE_WAGON_REMOVAL_NOTICES", true, "When OP and creative mode, tells you the owner of the train or rollingstock you just removed").getBoolean(true);
            ENABLE_LOGGING = cf.get("general", "ENABLE_TRANSPORT_LOGGING", true, "Logs the data for trains and rollingstock, turning this off will improve performance but break the admin book").getBoolean(true);
            ALLOW_ATO_ON_STEAMERS = cf.get("general", "ALLOW_ATO_ON_STEAMERS", false, "Allows Minecraft Train Control's ATO system to be used on steam trains").getBoolean(true);
        } catch (Exception var6) {
            TC4Addon.tc4AddonLog.fatal("TC4Addon had a problem loading its configuration\n" + var6);
        } finally {
            if (cf.hasChanged()) {
                cf.save();
            }

        }

    }
}
