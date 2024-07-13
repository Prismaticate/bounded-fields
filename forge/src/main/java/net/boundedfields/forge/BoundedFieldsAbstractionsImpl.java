package net.boundedfields.forge;

import net.boundedfields.BoundedFieldsAbstractions;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class BoundedFieldsAbstractionsImpl {
    /**
     * This is the actual implementation of {@link BoundedFieldsAbstractions#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
	
    public static void initPlatformSpecific() {
        BoundedFieldsConfigForge.init();
    }
}
