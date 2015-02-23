package com.hotdawg.hotdawgTest.client.gui;

import com.hotdawg.hotdawgTest.handler.configHandler;
import com.hotdawg.hotdawgTest.reference.reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

public class modGuiConfig extends GuiConfig {
    public modGuiConfig(GuiScreen guiScreen){
        super(guiScreen,
                new ConfigElement(configHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(configHandler.config.toString()));
    }

}