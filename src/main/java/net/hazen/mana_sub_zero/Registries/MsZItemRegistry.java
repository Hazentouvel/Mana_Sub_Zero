package net.hazen.mana_sub_zero.Registries;

import dev.obscuria.aquamirae.api.common.ability.AbilitySetComponent;
import dev.obscuria.aquamirae.common.component.ItemTooltip;
import dev.obscuria.aquamirae.common.item.TerribleChakramItem;
import dev.obscuria.aquamirae.registry.AquamiraeDataComponents;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.hazen.hazentouvelib.Rarities.HLRarities;
import net.hazen.mana_sub_zero.Items.Armor.AbyssalWarlockArmor.AbyssalWarlockArmorItem;
import net.hazen.mana_sub_zero.Items.Armor.MsZAbilitySets;
import net.hazen.mana_sub_zero.Items.Armor.TerribleWarlockArmor.TerribleWarlockArmorItem;
import net.hazen.mana_sub_zero.Items.Weapons.Chakrams.PyriumChakram.PyriumChakramItem;
import net.hazen.mana_sub_zero.ManaSubZero;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.component.Unbreakable;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MsZItemRegistry {
    public static final DeferredRegister.Items ITEMS= DeferredRegister.createItems(ManaSubZero.MOD_ID);

    /*
    *** Weapons
     */
    public static final DeferredItem<Item> PYRIUM_CHAKRAM = ITEMS.register("pyrium_chakram",
            () -> new PyriumChakramItem(new Item.Properties()
                    .rarity(HLRarities.ICE_RARITY.getValue())
                    .stacksTo(5).rarity(Rarity.UNCOMMON)
                    .component(DataComponents.UNBREAKABLE, new Unbreakable(true))
                    .component(AquamiraeDataComponents.TOOLTIP, ItemTooltip.translate("tooltip.aquamirae.chakram"))
    ));


    /*
    *** Armor
     */

    public static final DeferredHolder<Item, Item> TERRIBLE_WARLOCK_HELMET = ITEMS.register("terrible_warlock_helmet", () ->
            new TerribleWarlockArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1)
                    .rarity(HLRarities.ICE_RARITY.getValue())
                    .durability(ArmorItem.Type.HELMET.getDurability(37))
                    .component(AquamiraeDataComponents.ABILITY_SET, AbilitySetComponent.of(MsZAbilitySets.TERRIBLE_ARMOR))
            ));

    public static final DeferredHolder<Item, Item> TERRIBLE_WARLOCK_CHESTPLATE = ITEMS.register("terrible_warlock_chestplate", () ->
            new TerribleWarlockArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1)
                    .rarity(HLRarities.ICE_RARITY.getValue())
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(37))
                    .component(AquamiraeDataComponents.ABILITY_SET, AbilitySetComponent.of(MsZAbilitySets.TERRIBLE_ARMOR))
            ));

    public static final DeferredHolder<Item, Item> TERRIBLE_WARLOCK_LEGGINGS = ITEMS.register("terrible_warlock_leggings", () ->
            new TerribleWarlockArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1)
                    .rarity(HLRarities.ICE_RARITY.getValue())
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(37))
                    .component(AquamiraeDataComponents.ABILITY_SET, AbilitySetComponent.of(MsZAbilitySets.TERRIBLE_ARMOR))
            ));

    public static final DeferredHolder<Item, Item> TERRIBLE_WARLOCK_BOOTS = ITEMS.register("terrible_warlock_boots", () ->
            new TerribleWarlockArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1)
                    .rarity(HLRarities.HYDRO_RARITY.getValue())
                    .durability(ArmorItem.Type.BOOTS.getDurability(37))
                    .component(AquamiraeDataComponents.ABILITY_SET, AbilitySetComponent.of(MsZAbilitySets.TERRIBLE_ARMOR))
            ));


    public static final DeferredHolder<Item, Item> ABYSSAL_WARLOCK_HELMET = ITEMS.register("abyssal_warlock_helmet", () ->
            new AbyssalWarlockArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1)
                    .rarity(HLRarities.HYDRO_RARITY.getValue())
                    .durability(ArmorItem.Type.HELMET.getDurability(37))
                    .component(AquamiraeDataComponents.ABILITY_SET, AbilitySetComponent.of(MsZAbilitySets.ABYSSAL_ARMOR))
            ));
    public static final DeferredHolder<Item, Item> ABYSSAL_WARLOCK_CHESTPLATE = ITEMS.register("abyssal_warlock_chestplate", () ->
            new AbyssalWarlockArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1)
                    .rarity(HLRarities.HYDRO_RARITY.getValue())
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(37))
                    .component(AquamiraeDataComponents.ABILITY_SET, AbilitySetComponent.of(MsZAbilitySets.ABYSSAL_ARMOR))
            ));
    public static final DeferredHolder<Item, Item> ABYSSAL_WARLOCK_LEGGINGS = ITEMS.register("abyssal_warlock_leggings", () ->
            new AbyssalWarlockArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1)
                    .rarity(HLRarities.HYDRO_RARITY.getValue())
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(37))
                    .component(AquamiraeDataComponents.ABILITY_SET, AbilitySetComponent.of(MsZAbilitySets.ABYSSAL_ARMOR))
            ));
    public static final DeferredHolder<Item, Item> ABYSSAL_WARLOCK_BOOTS = ITEMS.register("abyssal_warlock_boots", () ->
            new AbyssalWarlockArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1)
                    .rarity(HLRarities.HYDRO_RARITY.getValue())
                    .durability(ArmorItem.Type.BOOTS.getDurability(37))
                    .component(AquamiraeDataComponents.ABILITY_SET, AbilitySetComponent.of(MsZAbilitySets.ABYSSAL_ARMOR))
            ));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
