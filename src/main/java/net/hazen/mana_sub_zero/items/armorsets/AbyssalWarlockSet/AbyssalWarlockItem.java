package net.hazen.mana_sub_zero.items.armorsets.AbyssalWarlockSet;

import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import io.redspace.ironsspellbooks.item.armor.ImbuableChestplateArmorItem;
import net.hazen.mana_sub_zero.items.armorsets.ManaSubZeroArmorMaterials;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AbyssalWarlockItem extends ImbuableChestplateArmorItem {
    public AbyssalWarlockItem(Type type, Properties settings) {
        super(ManaSubZeroArmorMaterials.ABYSSAL_WARLOCK_ARMOR, type, settings, withManaAndSpellPowerAttribute(125, 0.05));
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new AbyssalWarlockModel());
    }

    @Override
    public boolean isDamageable(ItemStack stack) {
        return false;
    }
}