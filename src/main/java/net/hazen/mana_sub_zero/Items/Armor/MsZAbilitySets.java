package net.hazen.mana_sub_zero.Items.Armor;

import dev.obscuria.aquamirae.Aquamirae;
import dev.obscuria.aquamirae.api.common.ability.AbilityConditions;
import dev.obscuria.aquamirae.api.common.ability.AbilityCounters;
import dev.obscuria.aquamirae.api.common.ability.AbilitySet;
import dev.obscuria.aquamirae.api.common.ability.AbilityStyles;
import dev.obscuria.aquamirae.api.common.ability.resolver.ComponentAbilitySetResolver;
import dev.obscuria.aquamirae.api.common.ability.resolver.CompositeAbilitySetResolver;
import dev.obscuria.aquamirae.api.common.ability.resolver.EquipmentAbilitySetResolver;
import dev.obscuria.aquamirae.common.ability.armor.*;
import dev.obscuria.aquamirae.common.ability.weapon.*;
import dev.obscuria.aquamirae.registry.AquamiraeDataComponents;
import dev.obscuria.aquamirae.registry.AquamiraeItems;
import dev.obscuria.aquamirae.registry.AquamiraeRegistries;
import dev.obscuria.fragmentum.content.registry.Deferred;
import net.hazen.mana_sub_zero.Items.Armor.AbyssalWarlockArmor.AbyssalWarlockArmorFullSetAbility;
import net.hazen.mana_sub_zero.Items.Armor.AbyssalWarlockArmor.AbyssalWarlockArmorHalfSetAbility;
import net.hazen.mana_sub_zero.ManaSubZero;
import net.hazen.mana_sub_zero.ManaSubZeroRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.Objects;
import java.util.function.Consumer;

public class MsZAbilitySets {
    public static final Deferred<AbilitySet, AbilitySet> TERRIBLE_ARMOR;
    public static final Deferred<AbilitySet, AbilitySet> ABYSSAL_ARMOR;

    public MsZAbilitySets() {
    }

    public static void init() {
    }

    private static Deferred<AbilitySet, AbilitySet> register(String name, Consumer<AbilitySet.Builder> consumer) {
        return ManaSubZeroRegistries.REGISTRAR.register(AquamiraeRegistries.Key.ABILITY_SET, ManaSubZero.id(name), () -> {
            AbilitySet.Builder builder = AbilitySet.builder();
            consumer.accept(builder);
            return builder.build();
        });
    }

    static {
        MutableComponent abyssalSetName = Component.translatable("ability_set.aquamirae.abyssal");
        MutableComponent terribleSetName = Component.translatable("ability_set.aquamirae.terrible");

        TERRIBLE_ARMOR = register("terrible_warlock_armor", (builder) -> builder
                .displayName(terribleSetName)
                .resolver(EquipmentAbilitySetResolver.anyArmorSlot())
                .addTier(2, TerribleArmorHalfSetAbility.SHARED)
                .addTier(4, TerribleArmorFullSetAbility.SHARED));
        ABYSSAL_ARMOR = register("abyssal_warlock_armor", (builder) -> builder
                .displayName(abyssalSetName)
                .style(AbilityStyles.PURPLE_GEM)
                .resolver(EquipmentAbilitySetResolver.anyArmorSlot())
                .addTier(2, AbyssalWarlockArmorHalfSetAbility.SHARED)
                .addTier(4, AbyssalWarlockArmorFullSetAbility.SHARED));
    }

}
