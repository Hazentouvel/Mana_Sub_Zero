package net.hazen.mana_sub_zero.Items.Armor.TerribleWarlockArmor;

import net.hazen.mana_sub_zero.ManaSubZero;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class TerribleWarlockArmorModel extends DefaultedEntityGeoModel<TerribleWarlockArmorItem> {
    public TerribleWarlockArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(TerribleWarlockArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "geo/armor/terrible_warlock_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TerribleWarlockArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "textures/armor/terrible_warlock_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TerribleWarlockArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath("irons_spellbooks", "animations/wizard_armor_animation.json");
    }
}
