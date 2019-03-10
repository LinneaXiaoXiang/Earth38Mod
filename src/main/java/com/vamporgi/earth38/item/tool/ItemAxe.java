package com.vamporgi.earth38.item.tool;

import net.minecraft.item.Item;
import com.vamporgi.earth38.Earth38Mod;

public class ItemAxe extends net.minecraft.item.ItemAxe {

    private String name;

    public ItemAxe(ToolMaterial material, String name) {
        super(material, 8f, -3.1f);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;

        setCreativeTab(Earth38Mod.creativeTab);
    }

    public void registerItemModel(Item item) {
        Earth38Mod.proxy.registerItemRenderer(this, 0, name);
    }

}