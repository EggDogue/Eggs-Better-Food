package net.eggdogue.betterfood.item;

import net.eggdogue.betterfood.ModFoodProperties;
import net.eggdogue.betterfood.betterfood;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, betterfood.MOD_ID);

    public static final RegistryObject<Item> COOKED_EGG = ITEMS.register("cooked_egg",
            ()-> new Item(new Item.Properties().food(ModFoodProperties.COOKED_EGG)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
