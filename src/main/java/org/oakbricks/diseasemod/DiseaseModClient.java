package org.oakbricks.diseasemod;

import dev.emi.trinkets.api.client.TrinketRenderer;
import dev.emi.trinkets.api.client.TrinketRendererRegistry;
import net.fabricmc.api.ClientModInitializer;
import org.oakbricks.diseasemod.client.MaskTrinketModel;

public class DiseaseModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        TrinketRendererRegistry.registerRenderer(DiseaseMod.FACE_MASK_TRINKET, (TrinketRenderer) DiseaseMod.FACE_MASK_TRINKET);
    }

}
