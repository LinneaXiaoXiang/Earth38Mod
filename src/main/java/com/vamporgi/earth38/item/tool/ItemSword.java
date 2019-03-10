package com.vamporgi.earth38.item.tool;

import net.minecraft.item.Item;
import com.vamporgi.earth38.Earth38Mod;

public class ItemSword extends net.minecraft.item.ItemSword {

    private String name;

    public ItemSword(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    public void registerItemModel (Item item) {
        Earth38Mod.proxy.registerItemRenderer(this, 0, name);
    }

}
