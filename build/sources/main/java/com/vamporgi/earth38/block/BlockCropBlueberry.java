package com.vamporgi.earth38.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import com.vamporgi.earth38.item.ModItems;

public class BlockCropBlueberry extends BlockCrops  {

    public BlockCropBlueberry() {
        setUnlocalizedName("crop_blueberry");
        setRegistryName("crop_blueberry");
    }

    @Override
    protected Item getSeed() {
        return ModItems.blueberrySeed;
    }

    @Override
    protected Item getCrop() {
        return ModItems.blueberry;
    }

}
