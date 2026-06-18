package net.hazen.mana_sub_zero.Registries;

import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.hazen.mana_sub_zero.ManaSubZero;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static io.redspace.ironsspellbooks.api.registry.SpellRegistry.SPELL_REGISTRY_KEY;

public class MsZSpellRegistry {
    public static final DeferredRegister<AbstractSpell> SPELLS = DeferredRegister.create(SPELL_REGISTRY_KEY, ManaSubZero.MOD_ID);


    public static Supplier<AbstractSpell> registerSpell(AbstractSpell spell) {
        return SPELLS.register(spell.getSpellName(), () -> spell);
    }


    public static void register(IEventBus eventBus)
    {
        SPELLS.register(eventBus);
    }
}
