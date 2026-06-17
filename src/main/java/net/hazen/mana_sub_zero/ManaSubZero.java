package net.hazen.mana_sub_zero;

import com.mojang.logging.LogUtils;
import net.hazen.mana_sub_zero.registries.ManaSubZeroCreativeTabs;
import net.hazen.mana_sub_zero.registries.ManaSubZeroItemRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ManaSubZero.MODID)
public class ManaSubZero {

    public static final String MODID = "mana_sub_zero";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ManaSubZero() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ManaSubZeroItemRegistries.register(modEventBus);
        ManaSubZeroCreativeTabs.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }


    public static ResourceLocation id(@NotNull String path) {
        return ResourceLocation.fromNamespaceAndPath(ManaSubZero.MODID, path);
    }
}
