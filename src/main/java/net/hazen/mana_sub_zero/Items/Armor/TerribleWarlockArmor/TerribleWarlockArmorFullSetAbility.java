package net.hazen.mana_sub_zero.Items.Armor.TerribleWarlockArmor;

import dev.obscuria.aquamirae.api.common.ability.SimpleAbility;
import dev.obscuria.aquamirae.api.common.ability.variable.VariableMap;
import dev.obscuria.aquamirae.api.common.ability.capability.IDamageHandler;
import dev.obscuria.aquamirae.api.common.ability.variable.Constant;
import dev.obscuria.aquamirae.common.ability.variable.DepthsFuryVariable;
import dev.obscuria.aquamirae.api.common.ability.variable.formatter.DecimalFormatter;
import dev.obscuria.aquamirae.api.common.ability.variable.formatter.PotencyFormatter;
import net.minecraft.network.chat.Component;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public final class TerribleWarlockArmorFullSetAbility extends SimpleAbility implements IDamageHandler {

    public static final TerribleWarlockArmorFullSetAbility SHARED = new TerribleWarlockArmorFullSetAbility();

    public static final String VAR_AMPLIFIER = "amplifier";
    public static final String VAR_DURATION = "duration";

    private TerribleWarlockArmorFullSetAbility() {
        super(Component.translatable("ability.mana_sub_zero.terrible_warlock_armor.full"), VariableMap.builder()
                .define(VAR_AMPLIFIER, new DepthsFuryVariable(1.0f, 3.0f, true), PotencyFormatter.SHARED)
                .define(VAR_DURATION, new Constant(6.0f), DecimalFormatter.SHARED));
    }

    @Override
    public void onDamageTaken(LivingEntity self, DamageSource source) {
        if (!self.isInWaterOrBubble()) return;
        var amplifier = Math.round(computeVariable(VAR_AMPLIFIER, self));
        var duration = Math.round(20 * computeVariable(VAR_DURATION, self));
        self.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, duration, amplifier));
    }
}