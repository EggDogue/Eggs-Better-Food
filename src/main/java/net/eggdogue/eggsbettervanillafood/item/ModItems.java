package net.eggdogue.eggsbettervanillafood.item;

import net.eggdogue.eggsbettervanillafood.ModFoodProperties;
import net.eggdogue.eggsbettervanillafood.eggsbettervanillafood;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, eggsbettervanillafood.MOD_ID);

    public static final RegistryObject<Item> COOKED_EGG = ITEMS.register("cooked_egg",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.COOKED_EGG)
                    .stacksTo(16)
            ));

    public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("apple_pie",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.APPLE_PIE)
                    .stacksTo(64)
            ));
    public static final RegistryObject<Item> BAKED_BEETROOT = ITEMS.register("baked_beetroot",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.BAKED_BEETROOT)
                    .stacksTo(64)
            ));
    public static final RegistryObject<Item> ROASTED_PUMPKIN_SEEDS = ITEMS.register("roasted_pumpkin_seed",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.ROASTED_PUMPKIN_SEEDS)
                    .stacksTo(64)
            ));
    public static final RegistryObject<Item> BERRY_PIE = ITEMS.register("berry_pie",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.BERRY_PIE)
                    .stacksTo(64)
            ));
    public static final RegistryObject<Item> CURED_ROTTEN_FLESH = ITEMS.register("cured_rotten_flesh",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.CURED_ROTTEN_FLESH)
                    .stacksTo(64)
            ));
    public static final RegistryObject<Item> COOKED_BAMBOO = ITEMS.register("cooked_bamboo",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.COOKED_BAMBOO)
                    .stacksTo(64)
            ));
    public static final RegistryObject<Item> COOKED_PUFFERFISH = ITEMS.register("cooked_pufferfish",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.COOKED_PUFFERFISH)
                    .stacksTo(64)
            ));
    public static final RegistryObject<Item> COOKED_TROPICAL_FISH = ITEMS.register("cooked_tropical_fish",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.COOKED_TROPICAL_FISH)
                    .stacksTo(64)
            ));
    public static final RegistryObject<Item> BERRY_COOKIE = ITEMS.register("berry_cookie",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.BERRY_COOKIE)
                    .stacksTo(64)
            ));
    public static final RegistryObject<Item> HONEY_COOKIE = ITEMS.register("honey_cookie",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.BERRY_COOKIE)
                    .stacksTo(64)
            ));
    public static final RegistryObject<Item> POTATO_SOUP = ITEMS.register("potato_soup",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.POTATO_SOUP)
                    .stacksTo(1)
            ));
    public static final RegistryObject<Item> CARROT_SOUP = ITEMS.register("carrot_soup",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.CARROT_SOUP)
                    .stacksTo(1)
            ));

    public static final RegistryObject<Item> PUMPKIN_SOUP = ITEMS.register("pumpkin_soup",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.PUMPKIN_SOUP)
                    .stacksTo(1)
            ));
    public static final RegistryObject<Item> BAKED_CARROT = ITEMS.register("baked_carrot",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.BAKED_CARROT)
                    .stacksTo(64)
            ));
    public static final RegistryObject<Item> BAKED_APPLE = ITEMS.register("baked_apple",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.BAKED_APPLE)
                    .stacksTo(64)
            ));
    public static final RegistryObject<Item> HONEY_PIE = ITEMS.register("honey_pie",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.HONEY_PIE)
                    .stacksTo(64)
            ));
    public static final RegistryObject<Item> POTATO_PIE = ITEMS.register("potato_pie",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.POTATO_PIE)
                    .stacksTo(64)
            ));
    public static final RegistryObject<Item> COOKED_MUSHROOM = ITEMS.register("cooked_mushroom",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.COOKED_MUSHROOM)
                    .stacksTo(64)
            ));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
