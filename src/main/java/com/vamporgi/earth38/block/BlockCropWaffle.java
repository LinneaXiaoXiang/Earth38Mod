package com.vamporgi.earth38.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import com.vamporgi.earth38.item.ModItems;

public class BlockCropWaffle extends BlockCrops {

    public BlockCropWaffle() {
        setUnlocalizedName("crop_waffle");
        setRegistryName("crop_waffle");
    }

    @Override
    protected Item getSeed() {
        return ModItems.waffleSeed;
    }

    @Override
    protected Item getCrop() {
        return ModItems.waffle;
    }
}
