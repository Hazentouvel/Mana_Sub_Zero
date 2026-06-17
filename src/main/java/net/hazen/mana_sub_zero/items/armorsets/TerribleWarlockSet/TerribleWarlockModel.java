package net.hazen.mana_sub_zero.items.armorsets.TerribleWarlockSet;

import net.hazen.mana_sub_zero.ManaSubZero;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TerribleWarlockModel extends GeoModel<TerribleWarlockItem> {
    public TerribleWarlockModel() {
    }

    public ResourceLocation getModelResource(TerribleWarlockItem object) {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MODID, "geo/armor/terrible_warlock_armor.geo.json");
    }

    public ResourceLocation getTextureResource(TerribleWarlockItem object) {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MODID, "textures/armor/terrible_warlock_armor.png");
    }

    public ResourceLocation getAnimationResource(TerribleWarlockItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MODID, "animations/armor/abyssal_warlock_armor.animation.json");
    }
}