package net.hazen.mana_sub_zero.items.armorsets.TerribleWarlockSet;

import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import io.redspace.ironsspellbooks.item.armor.ImbuableChestplateArmorItem;
import net.hazen.mana_sub_zero.items.armorsets.ManaSubZeroArmorMaterials;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class TerribleWarlockItem extends ImbuableChestplateArmorItem {
    public TerribleWarlockItem(Type type, Properties settings) {
        super(ManaSubZeroArmorMaterials.TERRIBLE_WARLOCK_ARMOR, type, settings, withManaAndSpellPowerAttribute(125, 0.05));
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new TerribleWarlockModel());
    }

    @Override
    public boolean isDamageable(ItemStack stack) {
        return false;
    }
}
