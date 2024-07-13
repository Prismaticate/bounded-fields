package net.boundedfields;

import net.boundedfields.registry.BoundedFieldsIotaTypeRegistry;
import net.boundedfields.registry.BoundedFieldsItemRegistry;
import net.boundedfields.registry.BoundedFieldsPatternRegistry;
import net.boundedfields.networking.BoundedFieldsNetworking;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This is effectively the loading entrypoint for most of your code, at least
 * if you are using Architectury as intended.
 */
public class BoundedFields {
    public static final String MOD_ID = "boundedfields";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);


    public static void init() {
        LOGGER.info("Bounded Fields says hello!");

        BoundedFieldsAbstractions.initPlatformSpecific();
        BoundedFieldsItemRegistry.init();
        BoundedFieldsIotaTypeRegistry.init();
        BoundedFieldsPatternRegistry.init();
		BoundedFieldsNetworking.init();

        LOGGER.info(BoundedFieldsAbstractions.getConfigDirectory().toAbsolutePath().normalize().toString());
    }

    /**
     * Shortcut for identifiers specific to this mod.
     */
    public static ResourceLocation id(String string) {
        return new ResourceLocation(MOD_ID, string);
    }
}
