package net.boundedfields.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.boundedfields.BoundedFieldsClient;

/**
 * Fabric client loading entrypoint.
 */
public class BoundedFieldsClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BoundedFieldsClient.init();
    }
}
