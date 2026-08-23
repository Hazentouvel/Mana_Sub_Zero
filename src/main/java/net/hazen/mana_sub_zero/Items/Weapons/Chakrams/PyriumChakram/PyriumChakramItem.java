//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.hazen.mana_sub_zero.Items.Weapons.Chakrams.PyriumChakram;

import dev.obscuria.aquamirae.common.entity.projectile.TerribleChakram;
import dev.obscuria.aquamirae.registry.AquamiraeEntityTypes;
import net.hazen.mana_sub_zero.Registries.MsZEntityRegistry;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class PyriumChakramItem extends Item {
    public PyriumChakramItem(Item.Properties properties) {
        super(properties);
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        ItemStack stack = player.getItemInHand(usedHand);
        if (!level.isClientSide) {
            TerribleChakram projectile = new TerribleChakram((EntityType) MsZEntityRegistry.PYRIUM_CHAKRAM.get(), level);
            projectile.setOwner(player);
            projectile.setPos(player.position().lerp(player.getEyePosition(), (double)0.5F));
            projectile.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 0.5F);
            level.addFreshEntity(projectile);
            player.getCooldowns().addCooldown(this, 50 / stack.getCount());
        }

        level.playSound((Player)null, player.blockPosition(), (SoundEvent)SoundEvents.TRIDENT_THROW.value(), player.getSoundSource(), 1.0F, (float)level.getRandom().triangle((double)1.0F, (double)0.2F));
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
    }
}
