package com.vamporgi.earth38.item;

import com.vamporgi.earth38.Earth38Mod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public class ItemWaffle extends ItemFood {

    public ItemWaffle() {
        super(3, 0.6f, false);
        setUnlocalizedName("waffle");
        setRegistryName("waffle");
        setCreativeTab(Earth38Mod.creativeTab);
    }

    public void registerItemModel (Item item) {
        Earth38Mod.proxy.registerItemRenderer(this, 0, "waffle");
    }

    public void initOreDict() {
        OreDictionary.registerOre("cropWaffle", this);
    }

}
