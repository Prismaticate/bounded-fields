package net.boundedfields.fabric;

import net.fabricmc.loader.api.FabricLoader;
import net.boundedfields.BoundedFieldsAbstractions;

import java.nio.file.Path;

public class BoundedFieldsAbstractionsImpl {
    /**
     * This is the actual implementation of {@link BoundedFieldsAbstractions#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
	
    public static void initPlatformSpecific() {
        BoundedFieldsConfigFabric.init();
    }
}
