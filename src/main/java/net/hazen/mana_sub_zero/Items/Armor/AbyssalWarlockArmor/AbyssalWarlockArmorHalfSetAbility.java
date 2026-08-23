package net.hazen.mana_sub_zero.Items.Armor.AbyssalWarlockArmor;

import dev.obscuria.aquamirae.api.common.ability.SimpleAbility;
import dev.obscuria.aquamirae.api.common.ability.capability.IEffectHandler;
import dev.obscuria.aquamirae.api.common.ability.variable.Constant;
import dev.obscuria.aquamirae.api.common.ability.variable.VariableMap;
import dev.obscuria.aquamirae.api.common.ability.variable.formatter.DecimalFormatter;
import dev.obscuria.aquamirae.api.common.ability.variable.formatter.PotencyFormatter;
import dev.obscuria.aquamirae.common.ability.variable.DepthsFuryVariable;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public final class AbyssalWarlockArmorHalfSetAbility extends SimpleAbility implements IEffectHandler {
    public static final AbyssalWarlockArmorHalfSetAbility SHARED = new AbyssalWarlockArmorHalfSetAbility();
    public static final String VAR_DURATION = "duration";
    public static final String VAR_MAX_STACKS = "max_stacks";

    private AbyssalWarlockArmorHalfSetAbility() {
        super(Component.translatable("ability.aquamirae.abyssal_armor.half"), VariableMap.builder()
                .define("duration", new DepthsFuryVariable(30.0F, 30.0F), DecimalFormatter.SHARED)
                .define("max_stacks", new Constant(2.0F), PotencyFormatter.SHARED));
    }

    public void onEffectAdded(LivingEntity entity, MobEffectInstance effectInstance) {
        if (((MobEffect)effectInstance.getEffect().value()).getCategory() == MobEffectCategory.HARMFUL) {
            int duration = Math.round(20.0F * this.computeVariable("duration", entity));
            int amplifier = this.selectAmplifier(entity);
            entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, duration, amplifier));
        }
    }

    private int selectAmplifier(LivingEntity entity) {
        MobEffectInstance current = entity.getEffect(MobEffects.DAMAGE_BOOST);
        int maxStacks = Math.round(this.computeVariable("max_stacks", entity));
        return Math.min(maxStacks, current == null ? 0 : current.getAmplifier() + 1);
    }
}
