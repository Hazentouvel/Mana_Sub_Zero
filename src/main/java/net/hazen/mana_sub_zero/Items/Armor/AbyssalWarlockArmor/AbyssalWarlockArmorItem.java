package net.hazen.mana_sub_zero.Items.Armor.AbyssalWarlockArmor;

import dev.obscuria.aquamirae.registry.AquamiraeAttributes;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.armor.IDisableJacket;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.acetheeldritchking.aces_spell_utils.entity.render.armor.EmissiveGenericCustomArmorRenderer;
import net.acetheeldritchking.aces_spell_utils.items.example.items.armor.ImbuableExtendedGeoArmorItem;
import net.acetheeldritchking.aces_spell_utils.registries.ASAttributeRegistry;
import net.hazen.hazentouvelib.Rarities.HLRarities;
import net.hazen.mana_sub_zero.Items.Armor.TerribleWarlockArmor.TerribleWarlockArmorModel;
import net.hazen.mana_sub_zero.Items.Armor.TerribleWarlockArmor.TerribleWarlockArmorRenderer;
import net.hazen.mana_sub_zero.ManaSubZero;
import net.hazen.mana_sub_zero.Registries.MsZArmorMaterials;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AbyssalWarlockArmorItem extends ImbuableExtendedGeoArmorItem implements IDisableJacket {
    public AbyssalWarlockArmorItem(Type slot, Properties settings) {
        super(MsZArmorMaterials.ABYSSAL_WARLOCK, slot, settings
                        .rarity(HLRarities.HYDRO_RARITY.getValue())
                        .stacksTo(1)
                ,
                new AttributeContainer(AquamiraeAttributes.DEPTHS_RESILIENCE.holder(), 0.2, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.ELDRITCH_SPELL_POWER,0.10, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(ASAttributeRegistry.HYDRO_MAGIC_POWER, 0.10, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, 125, AttributeModifier.Operation.ADD_VALUE)
        );
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new AbyssalWarlockArmorRenderer(new AbyssalWarlockArmorModel());
    }

}
