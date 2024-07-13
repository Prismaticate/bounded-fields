package net.boundedfields.forge;

import net.boundedfields.BoundedFieldsClient;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * Forge client loading entrypoint.
 */
public class BoundedFieldsClientForge {
    public static void init(FMLClientSetupEvent event) {
        BoundedFieldsClient.init();
    }
}
