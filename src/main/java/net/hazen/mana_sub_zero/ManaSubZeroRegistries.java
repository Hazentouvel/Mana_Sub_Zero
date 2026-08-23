package net.hazen.mana_sub_zero;

import dev.obscuria.aquamirae.Aquamirae;
import dev.obscuria.aquamirae.api.common.ability.AbilitySet;
import dev.obscuria.aquamirae.common.event.PathDefinition;
import dev.obscuria.aquamirae.common.region.noise.PackedNoise;
import dev.obscuria.fragmentum.content.registry.FragmentumRegistry;
import dev.obscuria.fragmentum.content.registry.Registrar;
import net.hazen.mana_sub_zero.Items.Armor.MsZAbilitySets;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;

public final class ManaSubZeroRegistries {
    public static final Registrar REGISTRAR = FragmentumRegistry.registrar("mana_sub_zero");
    public static final Registry<AbilitySet> ABILITY_SET;

    public ManaSubZeroRegistries() {
    }

    public static void init() {
        MsZAbilitySets.init();
        REGISTRAR.createDataRegistry(ManaSubZeroRegistries.Key.NOISE, () -> PackedNoise.DIRECT_CODEC);
        REGISTRAR.createDataRegistry(ManaSubZeroRegistries.Key.SHIPBREAKER_PATH, () -> PathDefinition.DIRECT_CODEC);
    }

    static {
        ABILITY_SET = REGISTRAR.createVanillaRegistry(ManaSubZeroRegistries.Key.ABILITY_SET);
    }

    public static final class Key {
        public static final ResourceKey<Registry<AbilitySet>> ABILITY_SET = create("ability_set");
        public static final ResourceKey<Registry<PackedNoise>> NOISE = create("noise");
        public static final ResourceKey<Registry<PathDefinition>> SHIPBREAKER_PATH = create("path");

        public Key() {
        }

        private static <T> ResourceKey<Registry<T>> create(String name) {
            return ResourceKey.createRegistryKey(Aquamirae.id(name));
        }
    }
}
