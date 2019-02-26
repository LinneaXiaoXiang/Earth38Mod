package com.vamporgi.earth38.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockOre oreViolet = new BlockOre("ore_violet");
    public static BlockCropWaffle cropWaffle = new BlockCropWaffle();
    public static BlockCropBlueberry cropBlueberry = new BlockCropBlueberry();

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreViolet,
                cropWaffle,
                cropBlueberry
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreViolet.createItemBlock()
        );
    }

    public static void registerModels() {
        oreViolet.registerItemModel(Item.getItemFromBlock(oreViolet));
    }

}
