package net.boundedfields.forge;

import dev.architectury.platform.forge.EventBuses;
import net.boundedfields.BoundedFields;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * This is your loading entrypoint on forge, in case you need to initialize
 * something platform-specific.
 */
@Mod(BoundedFields.MOD_ID)
public class BoundedFieldsForge {
    public BoundedFieldsForge() {
        // Submit our event bus to let architectury register our content on the right time
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(BoundedFields.MOD_ID, bus);
        bus.addListener(BoundedFieldsClientForge::init);
        BoundedFields.init();
    }
}
