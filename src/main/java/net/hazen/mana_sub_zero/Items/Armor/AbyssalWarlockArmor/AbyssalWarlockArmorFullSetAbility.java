//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.hazen.mana_sub_zero.Items.Armor.AbyssalWarlockArmor;

import dev.obscuria.aquamirae.api.common.ability.SimpleAbility;
import dev.obscuria.aquamirae.api.common.ability.capability.IDeathHandler;
import dev.obscuria.aquamirae.api.common.ability.variable.Constant;
import dev.obscuria.aquamirae.api.common.ability.variable.VariableMap;
import dev.obscuria.aquamirae.api.common.ability.variable.formatter.DecimalFormatter;
import dev.obscuria.aquamirae.api.common.ability.variable.formatter.PercentageFormatter;
import dev.obscuria.aquamirae.registry.AquamiraeEffects;
import dev.obscuria.aquamirae.registry.references.AquamiraeDamageTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public final class AbyssalWarlockArmorFullSetAbility extends SimpleAbility implements IDeathHandler {
    public static final AbyssalWarlockArmorFullSetAbility SHARED = new AbyssalWarlockArmorFullSetAbility();
    public static final String VAR_DURATION = "duration";
    public static final String VAR_DEBUFF = "debuff";

    private AbyssalWarlockArmorFullSetAbility() {
        super(Component.translatable("ability.aquamirae.abyssal_armor.full_tiara"), VariableMap.builder().define("duration", new Constant(300.0F), DecimalFormatter.SHARED).define("debuff", new Constant(0.8F), PercentageFormatter.SHARED));
    }

    public boolean cancelDeath(LivingEntity entity, DamageSource source) {
        if (source.is(AquamiraeDamageTypes.CRYSTALLIZATION)) {
            return false;
        } else if (entity.hasEffect(AquamiraeEffects.CRYSTALLIZATION.holder())) {
            return false;
        } else {
            int duration = Math.round(20.0F * this.computeVariable("duration", entity));
            entity.level().playSound((Player)null, entity.blockPosition(), SoundEvents.TOTEM_USE, SoundSource.NEUTRAL);
            entity.addEffect(new MobEffectInstance(AquamiraeEffects.CRYSTALLIZATION.holder(), duration));
            entity.setHealth(entity.getMaxHealth());
            return true;
        }
    }
}
