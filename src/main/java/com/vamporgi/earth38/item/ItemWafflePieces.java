package com.vamporgi.earth38.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import com.vamporgi.earth38.Earth38Mod;
import com.vamporgi.earth38.block.ModBlocks;

public class ItemWafflePieces extends ItemSeeds {

    public ItemWafflePieces() {
        super(ModBlocks.cropWaffle, Blocks.FARMLAND);

        setUnlocalizedName("waffle_pieces");
        setRegistryName("waffle_pieces");

        setCreativeTab(Earth38Mod.creativeTab);
    }

    public void registerItemModel() {
        Earth38Mod.proxy.registerItemRenderer(this, 0, "waffle_pieces");
    }

}
