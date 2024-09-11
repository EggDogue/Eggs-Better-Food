package net.eggdogue.betterfood;

import net.minecraft.world.food.FoodProperties;


public class ModFoodProperties {
    public static final FoodProperties COOKED_EGG = new FoodProperties.Builder().nutrition(4).saturationModifier(0.25f).build();
    public static final FoodProperties APPLE_PIE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.75f).build();
    public static final FoodProperties BERRY_PIE = new FoodProperties.Builder().nutrition(7).saturationModifier(0.75f).build();
    public static final FoodProperties BAKED_BEETROOT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.50f).build();
    public static final FoodProperties ROASTED_PUMPKIN_SEEDS = new FoodProperties.Builder().nutrition(1).saturationModifier(0.10f).build();
}
