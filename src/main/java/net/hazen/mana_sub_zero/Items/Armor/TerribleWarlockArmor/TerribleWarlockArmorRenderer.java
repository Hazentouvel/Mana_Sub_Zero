package net.hazen.mana_sub_zero.Items.Armor.TerribleWarlockArmor;

import io.redspace.ironslib.transmog.client.TransmogArmorRenderer;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class TerribleWarlockArmorRenderer extends TransmogArmorRenderer<TerribleWarlockArmorItem> {

    public TerribleWarlockArmorRenderer(TerribleWarlockArmorModel terribleWarlockArmorModel) {
        super(new TerribleWarlockArmorModel());

        this.withCapeBone(new CapeBone("cape", new Vec3(0.5F, 0.5F, 0.5F)));
    }


}