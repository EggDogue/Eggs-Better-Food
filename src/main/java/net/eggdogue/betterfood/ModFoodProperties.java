package net.eggdogue.betterfood;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    private static MobEffectInstance getAbsorptionEffect() {
        return new MobEffectInstance(MobEffects.ABSORPTION, 100, 0);
    }
    private static MobEffectInstance getRegenerationEffect() {
        return new MobEffectInstance(MobEffects.REGENERATION, 200, 0);
    }
    public static final FoodProperties COOKED_EGG = new FoodProperties.Builder().nutrition(4).saturationModifier(0.25f).build();
    public static final FoodProperties APPLE_PIE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.75f).build();
    public static final FoodProperties BERRY_PIE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.75f).build();
    public static final FoodProperties BAKED_BEETROOT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.50f).build();
    public static final FoodProperties ROASTED_PUMPKIN_SEEDS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.10f).build();
    public static final FoodProperties CURED_ROTTEN_FLESH = new FoodProperties.Builder().nutrition(8).saturationModifier(0.80f).effect(getAbsorptionEffect(), 1.0f).build();
    public static final FoodProperties COOKED_BAMBOO = new FoodProperties.Builder().nutrition(2).saturationModifier(0.10f).build();
    public static final FoodProperties COOKED_PUFFERFISH = new FoodProperties.Builder().nutrition(8).saturationModifier(0.50f).effect(getRegenerationEffect(), 1.0f).build();
    public static final FoodProperties COOKED_TROPICAL_FISH = new FoodProperties.Builder().nutrition(2).saturationModifier(0.10f).build();
}
