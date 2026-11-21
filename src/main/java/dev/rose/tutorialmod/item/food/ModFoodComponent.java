package dev.rose.tutorialmod.item.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModFoodComponent {

    public static final Consumable METH_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(
                    MobEffects.LEVITATION,
                    6 * 20),
                    1.0f))
            .build();

    public static final FoodProperties METH_FOOD_COMPONENT = new FoodProperties.Builder()
            .alwaysEdible()
            .nutrition(1)
            .saturationModifier(5)
            .build();

}
