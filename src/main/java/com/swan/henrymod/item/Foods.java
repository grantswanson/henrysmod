package com.swan.henrymod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class Foods {
    public static final FoodProperties ACORN =
            new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).fast().effect(() ->
            new MobEffectInstance(MobEffects.CONFUSION, 100, 0), 1.0f).effect(() ->
                    new MobEffectInstance(MobEffects.HUNGER, 100, 0), 0.1f).build();
    public static final FoodProperties COOKED_ACORN =
            new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).fast().build();
}
