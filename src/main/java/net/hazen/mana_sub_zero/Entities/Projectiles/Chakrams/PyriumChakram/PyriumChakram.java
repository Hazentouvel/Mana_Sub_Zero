package net.hazen.mana_sub_zero.Entities.Projectiles.Chakrams.PyriumChakram;

import dev.obscuria.aquamirae.common.entity.projectile.AbstractChakram;
import io.redspace.ironsspellbooks.registries.MobEffectRegistry;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class PyriumChakram extends AbstractChakram {
    public PyriumChakram(EntityType<? extends PyriumChakram> type, Level level) {
        super(type, level, 20);
    }

    protected void onHurtEntity(EntityHitResult result) {
        Entity var3 = result.getEntity();
        if (var3 instanceof LivingEntity entity) {
            entity.addEffect(new MobEffectInstance(MobEffectRegistry.SOUL_BURN, 60, 0));
        }
    }
}
