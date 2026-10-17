package net.hazen.mana_sub_zero.MsZUtils;

import dev.obscuria.aquamirae.Aquamirae;
import dev.obscuria.aquamirae.api.common.ability.AbilityStyle;
import net.hazen.mana_sub_zero.ManaSubZero;
import net.minecraft.resources.ResourceLocation;

public enum MsZAbilityStyles implements AbilityStyle {
    ARCANE_STAR(ManaSubZero.id("textures/gui/ability/arcane_star.png")),
    PURPLE_STAR(ManaSubZero.id("textures/gui/ability/purple_star.png"));

    private final ResourceLocation texture;

    private MsZAbilityStyles(ResourceLocation texture) {
        this.texture = texture;
    }

    public ResourceLocation texture() {
        return this.texture;
    }
}
