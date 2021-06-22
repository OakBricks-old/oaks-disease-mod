package org.oakbricks.diseasemod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.oakbricks.diseasemod.trinkets.MaskTrinket;

public class DiseaseMod implements ModInitializer {

	public static final String MOD_ID = "diseasemod";
	public static final Logger LOGGER = LogManager.getLogger();
	public static Item FACE_MASK_TRINKET;

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("[DiseaseMod] OakBricks' Disease Mod has initialized, Good Luck!");
		FACE_MASK_TRINKET = Registry.register(Registry.ITEM, identifier("face_mask"), new MaskTrinket(new Item.Settings().maxCount(1).maxDamage(100)));

	}

	private static Identifier identifier(String id) {
		return new Identifier(MOD_ID, id);
	}

}
