package com.vamporgi.earth38.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import com.vamporgi.earth38.Earth38Mod;
import com.vamporgi.earth38.block.ModBlocks;

public class ItemWaffleSeed extends ItemSeeds {

    public ItemWaffleSeed() {
        super(ModBlocks.cropWaffle, Blocks.FARMLAND);
        setUnlocalizedName("waffle_seed");
        setRegistryName("waffle_seed");
    }

    public void registerItemModel() {
        Earth38Mod.proxy.registerItemRenderer(this, 0, "waffle_seed");
    }

}
