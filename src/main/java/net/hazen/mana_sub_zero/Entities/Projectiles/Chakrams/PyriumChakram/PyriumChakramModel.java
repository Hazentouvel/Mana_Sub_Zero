package net.hazen.mana_sub_zero.Entities.Projectiles.Chakrams.PyriumChakram;

import net.hazen.mana_sub_zero.ManaSubZero;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PyriumChakramModel extends GeoModel<PyriumChakram> {

    @Override
    public ResourceLocation getModelResource(PyriumChakram animatable) {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "geo/entities/projectiles/pyrium_chakram.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PyriumChakram animatable) {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "textures/entities/projectiles/pyrium_chakram.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PyriumChakram animatable) {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "animations/entities/projectiles/chakram.animation.json");
    }
}