package org.oakbricks.diseasemod;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DiseaseMod implements ModInitializer {

	public static final String MOD_ID = "diseasemod";
	public static final Logger LOGGER = LogManager.getLogger();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("[DiseaseMod] OakBricks' Disease Mod has initialized, Good Luck!");
	}
}
