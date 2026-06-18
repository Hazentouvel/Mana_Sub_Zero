package net.hazen.mana_sub_zero.Items.Armor.AbyssalWarlockArmor;

import net.hazen.mana_sub_zero.ManaSubZero;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class AbyssalWarlockArmorModel extends DefaultedEntityGeoModel<AbyssalWarlockArmorItem> {
    public AbyssalWarlockArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(AbyssalWarlockArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "geo/armor/abyssal_warlock_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AbyssalWarlockArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "textures/armor/abyssal_warlock_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AbyssalWarlockArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "animations/armor/abyssal_warlock_armor.animation.json");
    }
}
