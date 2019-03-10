package com.vamporgi.earth38.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import com.vamporgi.earth38.Earth38Mod;
import com.vamporgi.earth38.block.ModBlocks;

public class ItemBlueberrySeed extends ItemSeeds {

    public ItemBlueberrySeed() {
        super(ModBlocks.cropBlueberry, Blocks.FARMLAND);

        setUnlocalizedName("blueberry_seed");
        setRegistryName("blueberry_seed");

        setCreativeTab(Earth38Mod.creativeTab);
    }

    public void registerItemModel() {
        Earth38Mod.proxy.registerItemRenderer(this, 0, "blueberry_seed");
    }

}
