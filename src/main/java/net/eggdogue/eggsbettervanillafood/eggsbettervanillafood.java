package net.eggdogue.eggsbettervanillafood;

import net.eggdogue.eggsbettervanillafood.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.core.registries.Registries;

@Mod(eggsbettervanillafood.MOD_ID)
public class eggsbettervanillafood {

    public static final String MOD_ID = "eggsbettervanillafood";

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final RegistryObject<CreativeModeTab> CUSTOM_TAB = CREATIVE_MODE_TABS.register("custom_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.CURED_ROTTEN_FLESH.get()))
                    .title(Component.translatable("eggsbettervanillafood"))
                    .build());

    public eggsbettervanillafood() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);

        CREATIVE_MODE_TABS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        ModItems.register(modEventBus);

        modEventBus.addListener(this::addItemsToCreativeTab);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addItemsToCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == CUSTOM_TAB.get()) {
            event.accept(ModItems.CURED_ROTTEN_FLESH);
            event.accept(ModItems.COOKED_MUSHROOM);
            event.accept(ModItems.COOKED_EGG);
            event.accept(ModItems.COOKED_BAMBOO);
            event.accept(ModItems.COOKED_PUFFERFISH);
            event.accept(ModItems.COOKED_TROPICAL_FISH);
            event.accept(ModItems.BAKED_APPLE);
            event.accept(ModItems.BAKED_BEETROOT);
            event.accept(ModItems.BAKED_CARROT);
            event.accept(ModItems.ROASTED_PUMPKIN_SEEDS);
            event.accept(ModItems.APPLE_PIE);
            event.accept(ModItems.BERRY_PIE);
            event.accept(ModItems.HONEY_PIE);
            event.accept(ModItems.POTATO_PIE);
            event.accept(ModItems.BERRY_COOKIE);
            event.accept(ModItems.HONEY_COOKIE);
            event.accept(ModItems.POTATO_SOUP);
            event.accept(ModItems.PUMPKIN_SOUP);
            event.accept(ModItems.CARROT_SOUP);
        }
    }

}
