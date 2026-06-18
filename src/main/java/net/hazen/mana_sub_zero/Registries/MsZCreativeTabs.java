package net.hazen.mana_sub_zero.Registries;

import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.hazen.mana_sub_zero.ManaSubZero;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MsZCreativeTabs {
    public static final DeferredRegister<CreativeModeTab>CREATIVE_MODE_TAB=
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ManaSubZero.MOD_ID);


    public static final Supplier<CreativeModeTab> MANA_SUB_ZERO_MATERIALS = CREATIVE_MODE_TAB.register("mana_sub_zero_materials",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemRegistry.MITHRIL_WEAVE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "mana_sub_zero_gear"))
                    .title(Component.translatable("creativetab.mana_sub_zero.mana_sub_zero_materials"))
                    .displayItems((itemDisplayParameters, output) -> {



                    }).build());

    public static final Supplier<CreativeModeTab> MANA_SUB_ZERO_GEAR = CREATIVE_MODE_TAB.register("mana_sub_zero_gear",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MsZItemRegistry.ABYSSAL_WARLOCK_HELMET.get()))
                    .title(Component.translatable("creativetab.mana_sub_zero.mana_sub_zero_gear"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(MsZItemRegistry.TERRIBLE_WARLOCK_HELMET.get());
                        output.accept(MsZItemRegistry.TERRIBLE_WARLOCK_CHESTPLATE.get());
                        output.accept(MsZItemRegistry.TERRIBLE_WARLOCK_LEGGINGS.get());
                        output.accept(MsZItemRegistry.TERRIBLE_WARLOCK_BOOTS.get());

                        output.accept(MsZItemRegistry.ABYSSAL_WARLOCK_HELMET.get());
                        output.accept(MsZItemRegistry.ABYSSAL_WARLOCK_CHESTPLATE.get());
                        output.accept(MsZItemRegistry.ABYSSAL_WARLOCK_LEGGINGS.get());
                        output.accept(MsZItemRegistry.ABYSSAL_WARLOCK_BOOTS.get());
                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
