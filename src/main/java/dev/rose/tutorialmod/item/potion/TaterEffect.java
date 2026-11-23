package dev.rose.tutorialmod.item.potion;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class TaterEffect extends MobEffect {
    public TaterEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xe9b8b3);

    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifer) {
        // In our case, we just make it return true so that it applies the effect every tick
        return true;
    }

    // Called when the effect is applied.
    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
        if(entity instanceof Player) {
            ((Player) entity).giveExperiencePoints(1 << amplifier); // Higher amplifier gives you experience faster
        }
         return super.applyEffectTick(level, entity, amplifier);
    }

}
