package com.vamporgi.earth38;

import com.vamporgi.earth38.block.ModBlocks;
import com.vamporgi.earth38.client.Earth38Tab;
import com.vamporgi.earth38.item.ModItems;
import com.vamporgi.earth38.proxy.CommonProxy;
import com.vamporgi.earth38.recipe.ModRecipes;
import com.vamporgi.earth38.world.ModWorldGen;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Earth38Mod.modId, name = Earth38Mod.name, version = Earth38Mod.version)
public class Earth38Mod {

    public static final String modId = "earth38";
    public static final String name = "Earth 38 Mod";
    public static final String version = "1.0.0";
    public static final Earth38Tab creativeTab = new Earth38Tab();
    public static final Item.ToolMaterial violetToolMaterial = EnumHelper.addToolMaterial("VIOLET", 2, 500, 6, 5, 14);

    @Mod.Instance(modId)
    public static Earth38Mod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @SidedProxy(serverSide = "com.vamporgi.earth38.proxy.CommonProxy", clientSide = "com.vamporgi.earth38.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            ModItems.registerModels();
            ModBlocks.registerModels();
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ModBlocks.register(event.getRegistry());
        }

    }

}
