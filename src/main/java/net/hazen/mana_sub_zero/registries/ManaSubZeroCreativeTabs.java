package net.hazen.mana_sub_zero.registries;

import net.hazen.mana_sub_zero.ManaSubZero;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ManaSubZeroCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ManaSubZero.MODID);

    public static final RegistryObject<CreativeModeTab> MANA_SUB_ZERO_EQUIPMENT = CREATIVE_MODE_TAB.register("mana_sub_zero_equipment",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ManaSubZeroItemRegistries.ABYSSAL_WARLOCK_HELMET.get()))
                    .title(Component.translatable("creativetab.mana_sub_zero.equipment"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ManaSubZeroItemRegistries.ABYSSAL_WARLOCK_HELMET.get());
                        output.accept(ManaSubZeroItemRegistries.ABYSSAL_WARLOCK_CHESTPLATE.get());
                        output.accept(ManaSubZeroItemRegistries.ABYSSAL_WARLOCK_LEGGINGS.get());
                        output.accept(ManaSubZeroItemRegistries.ABYSSAL_WARLOCK_BOOTS.get());
                        output.accept(ManaSubZeroItemRegistries.TERRIBLE_WARLOCK_HELMET.get());
                        output.accept(ManaSubZeroItemRegistries.TERRIBLE_WARLOCK_CHESTPLATE.get());
                        output.accept(ManaSubZeroItemRegistries.TERRIBLE_WARLOCK_LEGGINGS.get());
                        output.accept(ManaSubZeroItemRegistries.TERRIBLE_WARLOCK_BOOTS.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
