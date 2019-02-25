package com.vamporgi.earth38.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemBase ingotViolet = new ItemBase("ingot_violet");
    public static ItemWaffleSeed waffleSeed = new ItemWaffleSeed();
    public static ItemBase waffle = new ItemBase("waffle");

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotViolet,
                waffleSeed,
                waffle
        );
    }

    public static void registerModels() {
        ingotViolet.registerItemModel();
        waffleSeed.registerItemModel();
        waffle.registerItemModel();
    }

}
