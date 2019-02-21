package com.vamporgi.earth38.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.vamporgi.earth38.Earth38Mod;

public class ItemBase extends Item{

    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        Earth38Mod.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
