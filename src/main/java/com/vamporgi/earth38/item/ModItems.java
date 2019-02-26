package com.vamporgi.earth38.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemOre ingotViolet = new ItemOre("ingot_violet", "ingotViolet");
    public static ItemWafflePieces wafflePieces = new ItemWafflePieces();
    public static ItemWaffle waffle = new ItemWaffle();
    public static ItemBlueberrySeed blueberrySeed = new ItemBlueberrySeed();
    public static ItemBase blueberry = new ItemBase("blueberry");
    public static ItemBase blueberryWaffle = new ItemBase("blueberry_waffle");

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotViolet,
                wafflePieces,
                waffle,
                blueberrySeed,
                blueberry,
                blueberryWaffle
        );
    }

    public static void registerModels() {
        ingotViolet.registerItemModel();
        wafflePieces.registerItemModel();
        waffle.registerItemModel(waffle);
        blueberrySeed.registerItemModel();
        blueberry.registerItemModel();
        blueberryWaffle.registerItemModel();
    }

}
