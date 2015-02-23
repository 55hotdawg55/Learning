package com.hotdawg.hotdawgTest;

import com.hotdawg.hotdawgTest.handler.configHandler;
import com.hotdawg.hotdawgTest.init.modItems;
import com.hotdawg.hotdawgTest.proxy.iProxy;
import com.hotdawg.hotdawgTest.reference.reference;
import com.hotdawg.hotdawgTest.util.logHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = reference.MOD_ID, name = reference.MOD_NAME, version=reference.VERSION, guiFactory = reference.GUI_FACTORY)
public class hotdawgTest {
    @Mod.Instance(reference.MOD_ID)
    public static hotdawgTest instance;

    @SidedProxy(clientSide = reference.CLIENT_PROXY, serverSide = reference.SERVER_PROXY)
    public static iProxy proxy;

    @Mod.EventHandler
    //Load Network: Handler and Mod Config. Initialize Blocks and Items.
    public void preInit(FMLPreInitializationEvent event){
        configHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new configHandler());

        modItems.init();

        logHelper.info("Pre Initialization Complete!");
    }
    //Initialize: GUIs, Tile Entities, Crafting Recipes...
    public void Init(FMLInitializationEvent event){


        logHelper.info("Initialization Complete!");
    }
    //Load all your Fancy Mod Specific stuff
    public void postInit(FMLPostInitializationEvent event){


        logHelper.info("Post Initialization Complete!");
    }

}