package com.vamporgi.earth38.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import com.vamporgi.earth38.Earth38Mod;
import com.vamporgi.earth38.item.ModItems;

public class Earth38Tab extends CreativeTabs {

    public Earth38Tab() {
        super(Earth38Mod.modId);
        setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ingotViolet);
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

}
