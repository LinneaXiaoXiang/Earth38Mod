package com.vamporgi.earth38.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemBase ingotViolet = new ItemBase("ingot_violet").setCreativeTab(CreativeTabs.MATERIALS);

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotViolet
        );
    }

    public static void registerModels() {
        ingotViolet.registerItemModel();
    }

}
