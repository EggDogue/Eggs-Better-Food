package net.eggdogue.eggsbettervanillafood;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.item.Food;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.Items;
import net.minecraftforge.fml.common.Mod;
import net.eggdogue.eggsbettervanillafood.item.ModItemGroup;

@Mod.EventBusSubscriber
public class ModFoodProperties {

    private static EffectInstance getAbsorptionEffect() {
        return new EffectInstance(Effects.ABSORPTION, 100, 0);
    }

    private static EffectInstance getRegenerationEffect() {
        return new EffectInstance(Effects.REGENERATION, 200, 0);
    }

    public static final Food BERRY_COOKIE = new Food.Builder().nutrition(2).saturationMod(0.1f).build();
    public static final Food HONEY_COOKIE = new Food.Builder().nutrition(2).saturationMod(0.1f).build();
    public static final Food COOKED_BAMBOO = new Food.Builder().nutrition(2).saturationMod(0.2f).build();
    public static final Food ROASTED_PUMPKIN_SEEDS = new Food.Builder().nutrition(2).saturationMod(0.3f).build();
    public static final Food BAKED_BEETROOT = new Food.Builder().nutrition(6).saturationMod(0.5f).build();
    public static final Food BAKED_CARROT = new Food.Builder().nutrition(6).saturationMod(0.5f).build();
    public static final Food BAKED_APPLE = new Food.Builder().nutrition(6).saturationMod(0.5f).build();
    public static final Food POTATO_SOUP = new Food.Builder().nutrition(7).saturationMod(0.3f).build();
    public static final Food PUMPKIN_SOUP = new Food.Builder().nutrition(7).saturationMod(0.3f).build();
    public static final Food CARROT_SOUP = new Food.Builder().nutrition(7).saturationMod(0.3f).build();
    public static final Food COOKED_MUSHROOM = new Food.Builder().nutrition(3).saturationMod(0.1f).build();
    public static final Food COOKED_EGG = new Food.Builder().nutrition(4).saturationMod(0.4f).build();
    public static final Food COOKED_TROPICAL_FISH = new Food.Builder().nutrition(6).saturationMod(0.7f).build();
    public static final Food CURED_ROTTEN_FLESH = new Food.Builder().nutrition(8).saturationMod(0.8f).effect(ModFoodProperties::getAbsorptionEffect, 1.0f).build();
    public static final Food COOKED_PUFFERFISH = new Food.Builder().nutrition(8).saturationMod(0.6f).effect(ModFoodProperties::getRegenerationEffect, 1.0f).build();
    public static final Food APPLE_PIE = new Food.Builder().nutrition(8).saturationMod(0.8f).build();
    public static final Food BERRY_PIE = new Food.Builder().nutrition(8).saturationMod(0.8f).build();
    public static final Food HONEY_PIE = new Food.Builder().nutrition(8).saturationMod(0.8f).build();
    public static final Food POTATO_PIE = new Food.Builder().nutrition(8).saturationMod(0.8f).build();
}
