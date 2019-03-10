package com.vamporgi.earth38.item;

import com.vamporgi.earth38.Earth38Mod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public class ItemBlueberryWaffle extends ItemFood {

    public ItemBlueberryWaffle() {
        super(5, 0.8f, false);
        setUnlocalizedName("blueberry_waffle");
        setRegistryName("blueberry_waffle");
        setCreativeTab(Earth38Mod.creativeTab);
    }

    public void registerItemModel (Item item) {
        Earth38Mod.proxy.registerItemRenderer(this, 0, "blueberry_waffle");
    }

}
