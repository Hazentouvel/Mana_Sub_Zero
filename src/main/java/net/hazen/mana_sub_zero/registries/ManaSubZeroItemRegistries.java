package net.hazen.mana_sub_zero.registries;

import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.hazen.mana_sub_zero.ManaSubZero;
import net.hazen.mana_sub_zero.items.armorsets.AbyssalWarlockSet.AbyssalWarlockItem;
import net.hazen.mana_sub_zero.items.armorsets.TerribleWarlockSet.TerribleWarlockItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collection;

public class ManaSubZeroItemRegistries {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ManaSubZero.MODID);

    // Armor Sets
    public static final RegistryObject<Item> ABYSSAL_WARLOCK_HELMET = ITEMS.register("abyssal_warlock_helmet", () -> new AbyssalWarlockItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment().rarity(Rarity.EPIC).fireResistant()));
    public static final RegistryObject<Item> ABYSSAL_WARLOCK_CHESTPLATE = ITEMS.register("abyssal_warlock_chestplate", () -> new AbyssalWarlockItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment().rarity(Rarity.EPIC).fireResistant()));
    public static final RegistryObject<Item> ABYSSAL_WARLOCK_LEGGINGS = ITEMS.register("abyssal_warlock_leggings", () -> new AbyssalWarlockItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment().rarity(Rarity.EPIC).fireResistant()));
    public static final RegistryObject<Item> ABYSSAL_WARLOCK_BOOTS = ITEMS.register("abyssal_warlock_boots", () -> new AbyssalWarlockItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment().rarity(Rarity.EPIC).fireResistant()));

    public static final RegistryObject<Item> TERRIBLE_WARLOCK_HELMET = ITEMS.register("terrible_warlock_helmet", () -> new TerribleWarlockItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment().rarity(Rarity.EPIC).fireResistant()));
    public static final RegistryObject<Item> TERRIBLE_WARLOCK_CHESTPLATE = ITEMS.register("terrible_warlock_chestplate", () -> new TerribleWarlockItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment().rarity(Rarity.EPIC).fireResistant()));
    public static final RegistryObject<Item> TERRIBLE_WARLOCK_LEGGINGS = ITEMS.register("terrible_warlock_leggings", () -> new TerribleWarlockItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment().rarity(Rarity.EPIC).fireResistant()));
    public static final RegistryObject<Item> TERRIBLE_WARLOCK_BOOTS = ITEMS.register("terrible_warlock_boots", () -> new TerribleWarlockItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment().rarity(Rarity.EPIC).fireResistant()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static Collection<RegistryObject<Item>> getManaSubZeroItems() {
        return ITEMS.getEntries();
    }
}

