package com.vamporgi.earth38.item.tool;

import net.minecraft.item.Item;
import com.vamporgi.earth38.Earth38Mod;

public class ItemPickaxe extends net.minecraft.item.ItemPickaxe {

    private String name;

    public ItemPickaxe (ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;

        setCreativeTab(Earth38Mod.creativeTab);
    }

    public void registerItemModel (Item item) {
        Earth38Mod.proxy.registerItemRenderer(this, 0, name);
    }

}
