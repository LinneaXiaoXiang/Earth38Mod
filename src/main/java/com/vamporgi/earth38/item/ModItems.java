package com.vamporgi.earth38.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemBase ingotViolet = new ItemBase("ingot_violet");
    public static ItemWaffleSeed waffleSeed = new ItemWaffleSeed();
    public static ItemBase waffle = new ItemBase("waffle");
    public static ItemBlueberrySeed blueberrySeed = new ItemBlueberrySeed();
    public static ItemBase blueberry = new ItemBase("blueberry");

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotViolet,
                waffleSeed,
                waffle,
                blueberrySeed,
                blueberry
        );
    }

    public static void registerModels() {
        ingotViolet.registerItemModel();
        waffleSeed.registerItemModel();
        waffle.registerItemModel();
        blueberrySeed.registerItemModel();
        blueberry.registerItemModel();
    }

}
