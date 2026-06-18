package net.hazen.mana_sub_zero;

import net.hazen.mana_sub_zero.Registries.MsZArmorMaterials;
import net.hazen.mana_sub_zero.Registries.MsZCreativeTabs;
import net.hazen.mana_sub_zero.Registries.MsZItemRegistry;
import net.hazen.mana_sub_zero.Registries.MsZSpellRegistry;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(ManaSubZero.MOD_ID)
public class ManaSubZero {
    public static final String MOD_ID = "mana_sub_zero";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ManaSubZero(IEventBus modEventBus, ModContainer modContainer) {
        NeoForge.EVENT_BUS.register(this);

        MsZArmorMaterials.register(modEventBus);
        MsZCreativeTabs.register(modEventBus);
        MsZItemRegistry.register(modEventBus);
        MsZSpellRegistry.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @EventBusSubscriber({Dist.CLIENT})
    static class ClientModEvents {
        @SubscribeEvent
        static void onClientSetup(FMLClientSetupEvent event) {

        }
    }

    public static ResourceLocation id(@NotNull String path)
    {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, path);
    }
}
