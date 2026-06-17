package net.hazen.mana_sub_zero.items.armorsets.AbyssalWarlockSet;

import net.hazen.mana_sub_zero.ManaSubZero;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AbyssalWarlockModel extends GeoModel<AbyssalWarlockItem> {
    public AbyssalWarlockModel() {
    }

    public ResourceLocation getModelResource(AbyssalWarlockItem object) {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MODID, "geo/armor/abyssal_warlock_armor.geo.json");
    }

    public ResourceLocation getTextureResource(AbyssalWarlockItem object) {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MODID, "textures/armor/abyssal_warlock_armor.png");
    }

    public ResourceLocation getAnimationResource(AbyssalWarlockItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MODID, "animations/armor/abyssal_warlock_armor.animation.json");
    }
}