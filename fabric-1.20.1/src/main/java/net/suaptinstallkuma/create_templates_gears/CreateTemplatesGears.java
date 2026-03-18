package net.suaptinstallkuma.create_templates_gears;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.suaptinstallkuma.create_templates_gears.item.ModItems;
import net.suaptinstallkuma.create_templates_gears.item.ModItemsCompact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateTemplatesGears implements ModInitializer {
	public static final String MOD_ID = "create_templates_gears";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		if(FabricLoader.getInstance().isModLoaded("more_armor_trims")) {
			ModItemsCompact.registerModItems();
		}
	}
}