package net.hazen.mana_sub_zero.Registries;

import net.hazen.mana_sub_zero.Entities.Projectiles.Chakrams.PyriumChakram.PyriumChakram;
import net.hazen.mana_sub_zero.ManaSubZero;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MsZEntityRegistry {
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister
            .create(Registries.ENTITY_TYPE, ManaSubZero.MOD_ID);

    /*
    *** Spells
     */

    // Soulflame Bolt
    public static final DeferredHolder<EntityType<?>, EntityType<PyriumChakram>> PYRIUM_CHAKRAM =
            ENTITIES.register("pyrium_chakram", () -> EntityType.Builder.<PyriumChakram>of(PyriumChakram::new, MobCategory.MISC)
                    .sized(1.2F, 0.6F)
                    .clientTrackingRange(64)
                    .build(ResourceLocation.fromNamespaceAndPath(ManaSubZero.MOD_ID, "pyrium_chakram").toString()));


    public static void register(IEventBus eventBus)
    {
        ENTITIES.register(eventBus);
    }
}