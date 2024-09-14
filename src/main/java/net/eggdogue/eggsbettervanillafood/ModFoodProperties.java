package net.eggdogue.eggsbettervanillafood;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ModFoodProperties {

    private static MobEffectInstance getAbsorptionEffect() {
        return new MobEffectInstance(MobEffects.ABSORPTION, 100, 0);
    }
    private static MobEffectInstance getRegenerationEffect() {
        return new MobEffectInstance(MobEffects.REGENERATION, 200, 0);
    }
    public static final FoodProperties BERRY_COOKIE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).build();
    public static final FoodProperties COOKED_BAMBOO = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final FoodProperties ROASTED_PUMPKIN_SEEDS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3f).build();
    public static final FoodProperties BAKED_BEETROOT = new FoodProperties.Builder().nutrition(6).saturationModifier(0.5f).build();
    public static final FoodProperties BAKED_CARROT = new FoodProperties.Builder().nutrition(6).saturationModifier(0.5f).build();
    public static final FoodProperties BAKED_APPLE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.5f).build();
    public static final FoodProperties POTATO_SOUP = new FoodProperties.Builder().nutrition(7).saturationModifier(0.3f).usingConvertsTo(Items.BOWL).build();
    public static final FoodProperties PUMPKIN_SOUP = new FoodProperties.Builder().nutrition(7).saturationModifier(0.3f).usingConvertsTo(Items.BOWL).build();
    public static final FoodProperties CARROT_SOUP = new FoodProperties.Builder().nutrition(7).saturationModifier(0.3f).usingConvertsTo(Items.BOWL).build();
    public static final FoodProperties COOKED_EGG = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4f).build();
    public static final FoodProperties COOKED_TROPICAL_FISH = new FoodProperties.Builder().nutrition(6).saturationModifier(0.7f).build();
    public static final FoodProperties CURED_ROTTEN_FLESH = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f).effect(getAbsorptionEffect(), 1.0f).build();
    public static final FoodProperties COOKED_PUFFERFISH = new FoodProperties.Builder().nutrition(8).saturationModifier(0.6f).effect(getRegenerationEffect(), 1.0f).build();
    public static final FoodProperties APPLE_PIE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties BERRY_PIE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties HONEY_PIE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties POTATO_PIE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f).build();
}
