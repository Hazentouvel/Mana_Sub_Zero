package net.hazen.mana_sub_zero.Entities.Projectiles.Chakrams.PyriumChakram;

import io.redspace.ironsspellbooks.registries.MobEffectRegistry;
import net.acetheeldritchking.aces_spell_utils.utils.RibbonHandler;
import net.acetheeldritchking.aces_spell_utils.vfx.ribbon.ColorRamp;
import net.acetheeldritchking.aces_spell_utils.vfx.ribbon.Curve;
import net.acetheeldritchking.aces_spell_utils.vfx.ribbon.Easing;
import net.acetheeldritchking.aces_spell_utils.vfx.ribbon.RibbonConfig;
import net.hazen.mana_sub_zero.Entities.Projectiles.Chakrams.GeckolibChakram;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import software.bernie.geckolib.animatable.GeoEntity;

public class PyriumChakram extends GeckolibChakram implements GeoEntity {

    public PyriumChakram(EntityType<? extends PyriumChakram> type, Level level) {
        super(type, level, 20);
    }

    @Override
    public void tick() {
        super.tick();

        if (!level.isClientSide) {
            if (tickCount == 1) {
                trail();
            }
        }
    }

    private void trail() {
        if (!level.isClientSide && !RibbonHandler.isAttached(this)) {
            RibbonHandler.attach(this, new RibbonConfig(
                    new ColorRamp(
                            new int[]{0xe8e895, 0xd6af39, 0x9c5e2c},
                            Easing.LINEAR
                    ),
                    new Curve(0.18F, 0.0F, Easing.EASE_OUT_QUAD),
                    new Curve(1.0F, 0.0F, Easing.LINEAR),
                    24,
                    true
            ));
        }
    }

    protected void onHurtEntity(EntityHitResult result) {
        Entity var3 = result.getEntity();
        if (var3 instanceof LivingEntity entity) {
            entity.addEffect(new MobEffectInstance(MobEffectRegistry.SOUL_BURN, 60, 0));
        }
    }

}