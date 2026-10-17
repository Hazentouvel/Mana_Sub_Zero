package net.hazen.mana_sub_zero.Items.Armor.TerribleWarlockArmor;

import dev.obscuria.aquamirae.registry.AquamiraeAttributes;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import io.redspace.ironsspellbooks.item.armor.IDisableJacket;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.acetheeldritchking.aces_spell_utils.items.example.items.armor.ImbuableExtendedGeoArmorItem;
import net.acetheeldritchking.aces_spell_utils.registries.ASAttributeRegistry;
import net.hazen.hazentouvelib.Rarities.HLRarities;
import net.hazen.mana_sub_zero.Registries.MsZArmorMaterials;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Rarity;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class TerribleWarlockArmorItem extends ImbuableExtendedGeoArmorItem implements IDisableJacket {
    public TerribleWarlockArmorItem(Type slot, Properties settings) {
        super(MsZArmorMaterials.TERRIBLE_WARLOCK, slot, settings
                        .rarity(Rarity.RARE)
                        .stacksTo(1)
                ,
                new AttributeContainer(AquamiraeAttributes.DEPTHS_RESILIENCE.holder(), 0.15, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.ICE_SPELL_POWER,0.10, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(ASAttributeRegistry.HYDRO_MAGIC_POWER, 0.10, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, 125, AttributeModifier.Operation.ADD_VALUE)
        );
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new TerribleWarlockArmorRenderer(new TerribleWarlockArmorModel());
    }
}
