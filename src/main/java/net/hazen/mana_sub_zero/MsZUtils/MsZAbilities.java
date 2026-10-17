package net.hazen.mana_sub_zero.MsZUtils;


import dev.obscuria.aquamirae.Aquamirae;
import dev.obscuria.aquamirae.api.common.ability.AbilitySet;
import dev.obscuria.aquamirae.api.common.ability.AbilityStyles;
import dev.obscuria.aquamirae.api.common.ability.resolver.EquipmentAbilitySetResolver;
import dev.obscuria.aquamirae.common.ability.armor.AbyssalArmorHalfSetAbility;
import dev.obscuria.aquamirae.common.ability.armor.TerribleArmorHalfSetAbility;
import dev.obscuria.aquamirae.registry.AquamiraeRegistries;
import dev.obscuria.fragmentum.api.registry.Deferred;
import dev.obscuria.fragmentum.api.registry.FragmentumRegistry;
import net.hazen.mana_sub_zero.Items.Armor.AbyssalWarlockArmor.AbyssalWarlockArmorFullSetHelmetAbility;
import net.hazen.mana_sub_zero.Items.Armor.TerribleWarlockArmor.TerribleWarlockArmorFullSetAbility;
import net.hazen.mana_sub_zero.ManaSubZero;
import net.hazen.mana_sub_zero.Registries.MsZItemRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.function.Consumer;

public class MsZAbilities {
    public static final Deferred<AbilitySet> TERRIBLE_WARLOCK_ARMOR;
    public static final Deferred<AbilitySet> ABYSSAL_WARLOCK_ARMOR;

    static {
        var terribleSetName = Component.translatable("ability_set.aquamirae.terrible");
        var abyssalSetName = Component.translatable("ability_set.aquamirae.abyssal");

        TERRIBLE_WARLOCK_ARMOR = register("terrible_warlock_armor",
                builder -> builder
                        .displayName(terribleSetName)
                        .style(MsZAbilityStyles.ARCANE_STAR)
                        .resolver(EquipmentAbilitySetResolver.anyArmorSlot())
                        .addTier(2, TerribleArmorHalfSetAbility.SHARED)
                        .addTier(4, TerribleWarlockArmorFullSetAbility.SHARED)
        );

        ABYSSAL_WARLOCK_ARMOR = register("abyssal_warlock_armor",
                builder -> builder
                        .displayName(abyssalSetName)
                        .style(MsZAbilityStyles.PURPLE_STAR)
                        .resolver(EquipmentAbilitySetResolver.anyArmorSlot())
                        .addTier(2, AbyssalArmorHalfSetAbility.SHARED)
                        .addVariantTier(4, AbyssalWarlockArmorFullSetHelmetAbility.SHARED, EquipmentSlot.HEAD, () -> MsZItemRegistry.ABYSSAL_WARLOCK_HELMET.get())
        );
    }

    private static Deferred<AbilitySet> register(String name, Consumer<AbilitySet.Builder> consumer) {
        var registrar = FragmentumRegistry.INSTANCE.registrar(ManaSubZero.MOD_ID);
        return registrar.register(AquamiraeRegistries.Key.ABILITY_SET, Aquamirae.id(name), () -> {
            var builder = AbilitySet.builder();
            consumer.accept(builder);
            return builder.build();
        });
    }

    static void init() {}

}
