package com.vamporgi.earth38.item;

import com.vamporgi.earth38.Earth38Mod;
import com.vamporgi.earth38.item.tool.*;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemOre ingotViolet = new ItemOre("ingot_violet", "ingotViolet");
    public static ItemWafflePieces wafflePieces = new ItemWafflePieces();
    public static ItemWaffle waffle = new ItemWaffle();
    public static ItemBlueberrySeed blueberrySeed = new ItemBlueberrySeed();
    public static ItemBlueberry blueberry = new ItemBlueberry();
    public static ItemBlueberryWaffle blueberryWaffle = new ItemBlueberryWaffle();
    public static ItemSword violetSword = new ItemSword(Earth38Mod.violetToolMaterial, "violet_sword");
    public static ItemPickaxe violetPickaxe = new ItemPickaxe(Earth38Mod.violetToolMaterial, "violet_pickaxe");
    public static ItemAxe violetAxe = new ItemAxe(Earth38Mod.violetToolMaterial, "violet_axe");
    public static ItemShovel violetShovel = new ItemShovel(Earth38Mod.violetToolMaterial, "violet_shovel");
    public static ItemHoe violetHoe = new ItemHoe(Earth38Mod.violetToolMaterial, "violet_hoe");

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotViolet,
                wafflePieces,
                waffle,
                blueberrySeed,
                blueberry,
                blueberryWaffle,
                violetSword,
                violetPickaxe,
                violetAxe,
                violetShovel,
                violetHoe
        );
    }

    public static void registerModels() {
        ingotViolet.registerItemModel();
        wafflePieces.registerItemModel();
        waffle.registerItemModel(waffle);
        blueberrySeed.registerItemModel();
        blueberry.registerItemModel(blueberry);
        blueberryWaffle.registerItemModel(blueberryWaffle);
        violetSword.registerItemModel(violetSword);
        violetPickaxe.registerItemModel(violetPickaxe);
        violetAxe.registerItemModel(violetAxe);
        violetShovel.registerItemModel(violetShovel);
        violetHoe.registerItemModel(violetHoe);
    }

}
