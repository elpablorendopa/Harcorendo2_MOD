package net.elpablorendopa.harcorendo.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties COOKIETOTEM = new FoodProperties.Builder().nutrition(3).saturationMod(0.25f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3000, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3000, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 2), 1.0F)
            .alwaysEat()
            .build();
    public static final FoodProperties SOULFOOD = new FoodProperties.Builder().alwaysEat().build();

}
