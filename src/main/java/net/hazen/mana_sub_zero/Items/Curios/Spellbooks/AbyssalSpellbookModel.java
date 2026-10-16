package net.hazen.mana_sub_zero.Items.Curios.Spellbooks;

import net.hazen.hazentouvelib.HazentouveLib;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class AbyssalSpellbookModel extends DefaultedItemGeoModel<AbyssalSpellbook> {
    public AbyssalSpellbookModel() {
        super(ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(AbyssalSpellbook animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "geo/item/wing_base.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AbyssalSpellbook animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "textures/item/curios/wings/wing_base.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AbyssalSpellbook animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazentouveLib.MOD_ID, "animations/item/wing_base.animation.json");
    }
}