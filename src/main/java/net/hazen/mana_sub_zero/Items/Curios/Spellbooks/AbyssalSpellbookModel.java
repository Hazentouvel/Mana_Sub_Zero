package net.hazen.mana_sub_zero.Items.Curios.Spellbooks;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.hazen.hazentouvelib.HazentouveLib;
import net.hazen.mana_sub_zero.Items.Armor.TerribleWarlockArmor.TerribleWarlockArmorItem;
import net.hazen.mana_sub_zero.ManaSubZero;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class AbyssalSpellbookModel extends DefaultedItemGeoModel<AbyssalSpellbook> {
    public AbyssalSpellbookModel() {
        super(ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(AbyssalSpellbook animatable) {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "geo/item/curios/abyssal_spell_book.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AbyssalSpellbook animatable) {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "textures/item/curios/abyssal_spell_book.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AbyssalSpellbook animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}