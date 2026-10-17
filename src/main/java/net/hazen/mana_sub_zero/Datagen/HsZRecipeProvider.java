package net.hazen.mana_sub_zero.Datagen;

import dev.obscuria.aquamirae.registry.AquamiraeItems;
import io.redspace.ironsspellbooks.registries.ItemRegistry;
import io.redspace.ironsspellbooks.util.ModTags;
import net.hazen.hazentouvelib.Datagen.HLTags;
import net.hazen.mana_sub_zero.ManaSubZero;
import net.hazen.mana_sub_zero.Registries.MsZItemRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SmithingTransformRecipe;

import java.util.concurrent.CompletableFuture;

public class HsZRecipeProvider extends RecipeProvider {
    public HsZRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        /*
        *** Curios
         */
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, MsZItemRegistry.ABYSSAL_SPELLBOOK.get())
                .pattern("CMC")
                .pattern("ARA")
                .pattern("CNC")
                .define('N', Items.NETHERITE_INGOT)
                .define('R', ItemRegistry.RUINED_BOOK.get())
                .define('C', ItemRegistry.MAGIC_CLOTH.get())
                .define('M', ItemRegistry.MITHRIL_SCRAP.get())
                .define('A', AquamiraeItems.ABYSSAL_AMETHYST.get())
                .unlockedBy("has_abyssal_amethyst", has(AquamiraeItems.ABYSSAL_AMETHYST.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "crafting/spellbooks/abyssal_spell_book"));

        /*
        *** Weapons
         */

        // Pyrium Chakram
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, MsZItemRegistry.PYRIUM_CHAKRAM.get())
                .pattern("SWS")
                .pattern("MPM")
                .pattern("SMS")
                .define('S', Items.NETHERITE_SCRAP)
                .define('W', ItemRegistry.WEAPON_PARTS.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('M', ItemRegistry.MITHRIL_SCRAP.get())
                .unlockedBy("has_pyrium_ingot", has(ItemRegistry.PYRIUM_INGOT.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "crafting/weapons/pyrium_chakram"));

        // Pyrium Chakram Duplicate Recipe
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, MsZItemRegistry.PYRIUM_CHAKRAM.get(), 2)
                .pattern("SWS")
                .pattern("MPM")
                .pattern("MTM")
                .define('S', Items.NETHERITE_SCRAP)
                .define('W', ItemRegistry.WEAPON_PARTS.get())
                .define('T', ItemRegistry.TIMELESS_SLURRY.get())
                .define('P', MsZItemRegistry.PYRIUM_CHAKRAM.get())
                .define('M', ItemRegistry.MITHRIL_SCRAP.get())
                .unlockedBy("has_pyrium_ingot", has(ItemRegistry.PYRIUM_INGOT.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "crafting/weapons/pyrium_chakram_duplicate"));

        /*
        *** Armor
         */

        // Terrible Warlock
        // Abyssal Warlock
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(AquamiraeItems.TERRIBLE_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ModTags.BASE_WIZARD_HELMET),
                        Ingredient.of(AquamiraeItems.FIN.get()),
                        RecipeCategory.COMBAT,
                        MsZItemRegistry.TERRIBLE_WARLOCK_HELMET.get())
                .unlocks("has_fin", has(AquamiraeItems.FIN.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "smithing/armor/terrible_warlock/terrible_warlock_helmet"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(AquamiraeItems.TERRIBLE_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ModTags.BASE_WIZARD_CHESTPLATE),
                        Ingredient.of(AquamiraeItems.FIN.get()),
                        RecipeCategory.COMBAT,
                        MsZItemRegistry.TERRIBLE_WARLOCK_CHESTPLATE.get())
                .unlocks("has_fin", has(AquamiraeItems.FIN.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "smithing/armor/terrible_warlock/terrible_warlock_chestplate"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(AquamiraeItems.TERRIBLE_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ModTags.BASE_WIZARD_LEGGINGS),
                        Ingredient.of(AquamiraeItems.FIN.get()),
                        RecipeCategory.COMBAT,
                        MsZItemRegistry.TERRIBLE_WARLOCK_LEGGINGS.get())
                .unlocks("has_fin", has(AquamiraeItems.FIN.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "smithing/armor/terrible_warlock/terrible_warlock_leggings"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(AquamiraeItems.TERRIBLE_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ModTags.BASE_WIZARD_BOOTS),
                        Ingredient.of(AquamiraeItems.FIN.get()),
                        RecipeCategory.COMBAT,
                        MsZItemRegistry.TERRIBLE_WARLOCK_BOOTS.get())
                .unlocks("has_fin", has(AquamiraeItems.FIN.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "smithing/armor/terrible_warlock/terrible_warlock_boots"));

        // Abyssal Warlock
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(AquamiraeItems.ABYSSAL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(HLTags.NETHERITE_BATTLEMAGE_HELMET),
                        Ingredient.of(AquamiraeItems.ABYSSAL_AMETHYST.get()),
                        RecipeCategory.COMBAT,
                        MsZItemRegistry.ABYSSAL_WARLOCK_HELMET.get())
                .unlocks("has_abyssal_amethyst", has(AquamiraeItems.ABYSSAL_AMETHYST.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "smithing/armor/abyssal_warlock/abyssal_warlock_helmet"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(AquamiraeItems.ABYSSAL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(HLTags.NETHERITE_BATTLEMAGE_CHESTPLATE),
                        Ingredient.of(AquamiraeItems.ABYSSAL_AMETHYST.get()),
                        RecipeCategory.COMBAT,
                        MsZItemRegistry.ABYSSAL_WARLOCK_CHESTPLATE.get())
                .unlocks("has_abyssal_amethyst", has(AquamiraeItems.ABYSSAL_AMETHYST.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "smithing/armor/abyssal_warlock/abyssal_warlock_chestplate"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(AquamiraeItems.ABYSSAL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(HLTags.NETHERITE_BATTLEMAGE_LEGGINGS),
                        Ingredient.of(AquamiraeItems.ABYSSAL_AMETHYST.get()),
                        RecipeCategory.COMBAT,
                        MsZItemRegistry.ABYSSAL_WARLOCK_LEGGINGS.get())
                .unlocks("has_abyssal_amethyst", has(AquamiraeItems.ABYSSAL_AMETHYST.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "smithing/armor/abyssal_warlock/abyssal_warlock_leggings"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(AquamiraeItems.ABYSSAL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(HLTags.NETHERITE_BATTLEMAGE_BOOTS),
                        Ingredient.of(AquamiraeItems.ABYSSAL_AMETHYST.get()),
                        RecipeCategory.COMBAT,
                        MsZItemRegistry.ABYSSAL_WARLOCK_BOOTS.get())
                .unlocks("has_abyssal_amethyst", has(AquamiraeItems.ABYSSAL_AMETHYST.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "smithing/armor/abyssal_warlock/abyssal_warlock_boots"));

    }

}