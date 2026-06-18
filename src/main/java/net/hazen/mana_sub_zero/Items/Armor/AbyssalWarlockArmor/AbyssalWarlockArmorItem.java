package net.hazen.mana_sub_zero.Items.Armor.AbyssalWarlockArmor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.armor.IDisableJacket;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.acetheeldritchking.aces_spell_utils.entity.render.armor.EmissiveGenericCustomArmorRenderer;
import net.acetheeldritchking.aces_spell_utils.items.example.items.armor.ImbuableExtendedGeoArmorItem;
import net.acetheeldritchking.aces_spell_utils.registries.ASAttributeRegistry;
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
        super(MsZArmorMaterials.ABYSSAL_WARLOCK, slot, settings,
                new AttributeContainer(AttributeRegistry.ELDRITCH_SPELL_POWER,0.10, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(ASAttributeRegistry.HYDRO_MAGIC_POWER, 0.10, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, 125, AttributeModifier.Operation.ADD_VALUE)
        );
    }

    private static final ResourceLocation LAYER = ResourceLocation.fromNamespaceAndPath(
            ManaSubZero.MOD_ID,
            "textures/armor/abyssal_warlock_armor_glowmask.png");

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        RenderType GLOW_RENDER_TYPE = RenderType.eyes(LAYER);

        return new EmissiveGenericCustomArmorRenderer<>(new AbyssalWarlockArmorModel(), LAYER, GLOW_RENDER_TYPE);
    }
}
