package com.hotdawg.hotdawgTest.init;

import com.hotdawg.hotdawgTest.item.itemEagle;
import com.hotdawg.hotdawgTest.item.itemHotdawgTest;
import com.hotdawg.hotdawgTest.reference.reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(reference.MOD_ID)
public class modItems
{
    public static final itemHotdawgTest eagle = new itemEagle();

    public static void init()
    {
        GameRegistry.registerItem(eagle, "eagle");
    }
}