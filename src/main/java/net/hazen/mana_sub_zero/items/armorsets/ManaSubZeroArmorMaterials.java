package net.hazen.mana_sub_zero.items.armorsets;

import com.obscuria.aquamirae.registry.AquamiraeItems;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.armor.IronsExtendedArmorMaterial;
import net.hazen.mana_sub_zero.ManaSubZero;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import static io.redspace.ironsspellbooks.item.armor.ExtendedArmorMaterials.makeArmorMap;

public enum ManaSubZeroArmorMaterials implements IronsExtendedArmorMaterial {

    ABYSSAL_WARLOCK_ARMOR("abyssal_warlock_armor", 45, AbyssalWarlockArmorMap(), 18, SoundEvents.ARMOR_EQUIP_NETHERITE, 7.5f, 0,
            () -> Ingredient.of(AquamiraeItems.ABYSSAL_AMETHYST.get()), Map.of(
            Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier("Knockback Resistance", 0.25, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", 350,AttributeModifier.Operation.ADDITION),
            AttributeRegistry.NATURE_SPELL_POWER.get(), new AttributeModifier("Nature Power", 0.15, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.HOLY_SPELL_POWER.get(), new AttributeModifier("Holy Power", 0.4, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_RESIST.get(), new AttributeModifier("Spell Resist", 0.15, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_POWER.get(), new AttributeModifier("Base Power", 0.1, AttributeModifier.Operation.MULTIPLY_BASE)
    )),
    TERRIBLE_WARLOCK_ARMOR("terrible_warlock_armor", 45, TerribleWarlockArmorMap(), 18, SoundEvents.ARMOR_EQUIP_NETHERITE, 7.5f, 0,
            () -> Ingredient.of(AquamiraeItems.ABYSSAL_AMETHYST.get()), Map.of(
    Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier("Knockback Resistance", 0.25, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", 350,AttributeModifier.Operation.ADDITION),
            AttributeRegistry.NATURE_SPELL_POWER.get(), new AttributeModifier("Nature Power", 0.15, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.HOLY_SPELL_POWER.get(), new AttributeModifier("Holy Power", 0.4, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_RESIST.get(), new AttributeModifier("Spell Resist", 0.15, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_POWER.get(), new AttributeModifier("Base Power", 0.1, AttributeModifier.Operation.MULTIPLY_BASE)
    ));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;
    private final Map<Attribute, AttributeModifier> additionalAttributes;

    private static final int[] BASE_DURABILITY = {11, 16, 16, 13};

    ManaSubZeroArmorMaterials(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionMap, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient, Map<Attribute, AttributeModifier> additionalAttributes) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionFunctionForType = protectionMap;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
        this.additionalAttributes = additionalAttributes;
    }

    @Override
    public Map<Attribute, AttributeModifier> getAdditionalAttributes() {
        return additionalAttributes;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type p_266745_) {
        return HEALTH_FUNCTION_FOR_TYPE.get(p_266745_) * this.durabilityMultiplier;
    }

    private static EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE =
            Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266653_) -> {
                p_266653_.put(ArmorItem.Type.BOOTS, 13);
                p_266653_.put(ArmorItem.Type.LEGGINGS, 15);
                p_266653_.put(ArmorItem.Type.CHESTPLATE, 16);
                p_266653_.put(ArmorItem.Type.HELMET, 11);
            });

    static public EnumMap<ArmorItem.Type, Integer> AbyssalWarlockArmorMap() {
        return makeArmorMap(10, 14, 11, 9);
    }
    static public EnumMap<ArmorItem.Type, Integer> TerribleWarlockArmorMap() {
        return makeArmorMap(10, 14, 11, 9);
    }


    @Override
    public int getDefenseForType(ArmorItem.Type p_266752_) {
        return this.protectionFunctionForType.get(p_266752_);
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }


    @Override
    public String getName() {
        return ManaSubZero.MODID + "" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}