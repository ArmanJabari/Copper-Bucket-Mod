package net.armanjabari.copperbucketmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CREAMBUCKET = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .build();

    public static final FoodComponent ICECREAMBUCKET = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .build();

    public static final FoodComponent MILKCOPPERBUCKET = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .build();

    public static final FoodComponent CHOCOLATEICECREAM = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 4200), 1).build();

    public static final FoodComponent CHOCOLATEMILK = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2400), 1).build();

    public static final FoodComponent CARROTICECREAM = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 4200), 1).build();

    public static final FoodComponent CARROTJUICE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 2400), 1).build();

    public static final FoodComponent APPLEICECREAM = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 4200), 1).build();

    public static final FoodComponent APPLEJUICE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400), 1).build();

    public static final FoodComponent SWEETBERRIESICECREAM = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 4200), 1).build();

    public static final FoodComponent SWEETBERRIESJUICE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2400), 1).build();

    public static final FoodComponent GLOWBERRIESICECREAM = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 4200), 1).build();

    public static final FoodComponent GLOWBERRIESJUICE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 2400), 1).build();

    public static final FoodComponent MELONICECREAM = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 4200), 1).build();

    public static final FoodComponent MELONJUICE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 2400), 1).build();


}
