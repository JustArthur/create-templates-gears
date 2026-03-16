package net.suaptinstallkuma.create_templates_gears;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = CreateTemplatesGears.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = CreateTemplatesGears.MOD_ID, value = Dist.CLIENT)
public class CreateTemplatesGearsClient {
    public CreateTemplatesGearsClient(ModContainer container) {

    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {

    }
}
