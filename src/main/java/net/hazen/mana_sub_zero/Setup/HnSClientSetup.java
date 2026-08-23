package net.hazen.mana_sub_zero.Setup;

import net.hazen.mana_sub_zero.Entities.Projectiles.Chakrams.PyriumChakram.PyriumChakramRenderer;
import net.hazen.mana_sub_zero.ManaSubZero;
import net.hazen.mana_sub_zero.Registries.MsZEntityRegistry;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = ManaSubZero.MOD_ID)
public class HnSClientSetup {

    @SubscribeEvent
    public static void registerRenderer(EntityRenderersEvent.RegisterRenderers event) {

        /*
         *** Spells
         */
        event.registerEntityRenderer(MsZEntityRegistry.PYRIUM_CHAKRAM.get(), PyriumChakramRenderer::new);


    }
}