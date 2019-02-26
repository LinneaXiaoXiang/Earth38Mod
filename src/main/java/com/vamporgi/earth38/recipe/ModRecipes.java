package com.vamporgi.earth38.recipe;

import com.vamporgi.earth38.block.ModBlocks;
import com.vamporgi.earth38.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        GameRegistry.addSmelting(ModBlocks.oreViolet, new ItemStack(ModItems.ingotViolet), 0.7f);
    }

}
