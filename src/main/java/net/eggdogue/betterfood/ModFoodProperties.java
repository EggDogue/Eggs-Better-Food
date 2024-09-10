package net.eggdogue.betterfood;

import net.minecraft.world.food.FoodProperties;


public class ModFoodProperties {
    public static final FoodProperties COOKED_EGG = new FoodProperties.Builder().nutrition(4).saturationModifier(0.25f).build();
    public static final FoodProperties APPLE_PIE = new FoodProperties.Builder().nutrition(7).saturationModifier(0.75f).build();
}
