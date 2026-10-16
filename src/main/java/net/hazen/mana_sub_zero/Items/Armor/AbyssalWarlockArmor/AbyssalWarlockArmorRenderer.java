package net.hazen.mana_sub_zero.Items.Armor.AbyssalWarlockArmor;

import io.redspace.ironslib.transmog.client.TransmogArmorRenderer;
import net.hazen.mana_sub_zero.Items.Armor.TerribleWarlockArmor.TerribleWarlockArmorItem;
import net.hazen.mana_sub_zero.Items.Armor.TerribleWarlockArmor.TerribleWarlockArmorModel;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class AbyssalWarlockArmorRenderer extends TransmogArmorRenderer<AbyssalWarlockArmorItem> {

    public AbyssalWarlockArmorRenderer(AbyssalWarlockArmorModel abyssalWarlockArmorModel) {
        super(new AbyssalWarlockArmorModel());

        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }


}