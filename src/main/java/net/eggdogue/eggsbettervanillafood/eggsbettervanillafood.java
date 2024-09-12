package net.eggdogue.eggsbettervanillafood;

import com.mojang.logging.LogUtils;
import net.eggdogue.eggsbettervanillafood.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(eggsbettervanillafood.MOD_ID)
public class eggsbettervanillafood {

    public static final String MOD_ID = "eggsbettervanillafood";

    public static final Logger LOGGER = LogUtils.getLogger();

    public eggsbettervanillafood() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);

        modEventBus.addListener(this::addCreative);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)  {

    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.POTATO_SOUP);
            event.accept(ModItems.CARROT_SOUP);
            event.accept(ModItems.CURED_ROTTEN_FLESH);
            event.accept(ModItems.COOKED_EGG);
            event.accept(ModItems.COOKED_BAMBOO);
            event.accept(ModItems.COOKED_PUFFERFISH);
            event.accept(ModItems.COOKED_TROPICAL_FISH);
            event.accept(ModItems.BAKED_BEETROOT);
            event.accept(ModItems.ROASTED_PUMPKIN_SEEDS);
            event.accept(ModItems.APPLE_PIE);
            event.accept(ModItems.BERRY_PIE);
            event.accept(ModItems.BERRY_COOKIE);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
