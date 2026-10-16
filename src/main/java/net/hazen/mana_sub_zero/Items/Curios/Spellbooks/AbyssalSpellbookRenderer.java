package net.hazen.mana_sub_zero.Items.Curios.Spellbooks;

import software.bernie.geckolib.renderer.GeoItemRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class AbyssalSpellbookRenderer extends GeoItemRenderer<AbyssalSpellbook> {
    public AbyssalSpellbookRenderer() {
        super(new AbyssalSpellbookModel());

        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }


}