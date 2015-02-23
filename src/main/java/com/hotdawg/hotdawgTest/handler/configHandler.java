package com.hotdawg.hotdawgTest.handler;

import com.hotdawg.hotdawgTest.reference.reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class configHandler {
    public static Configuration config;
    public static boolean testValue = false;

    public static void init(File configFile){
        if(config == null) {
            config = new Configuration(configFile);
            loadConfig();
        }
    }

    @SubscribeEvent
    public void OnConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if(event.modID.equalsIgnoreCase(reference.MOD_ID)){
            loadConfig();
        }
    }

    private static void loadConfig(){
        testValue = config.getBoolean("testValue", Configuration.CATEGORY_GENERAL, false, "This Is An Example Config Value");

        if(config.hasChanged()){
            config.save();
        }
    }
}