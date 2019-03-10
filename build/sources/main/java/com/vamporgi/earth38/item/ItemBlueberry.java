package com.vamporgi.earth38.item;

import com.vamporgi.earth38.Earth38Mod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public class ItemBlueberry extends ItemFood {

    public ItemBlueberry() {
        super(1, 0.3f, false);
        setUnlocalizedName("blueberry");
        setRegistryName("blueberry");
        setCreativeTab(Earth38Mod.creativeTab);
    }

    public void registerItemModel (Item item) {
        Earth38Mod.proxy.registerItemRenderer(this, 0, "blueberry");
    }

    public void initOreDict() {
        OreDictionary.registerOre("cropBlueberry", this);
    }

}
