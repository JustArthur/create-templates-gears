package net.suaptinstallkuma.create_templates_gears;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.fml.ModList;
import net.suaptinstallkuma.create_templates_gears.item.ModItems;
import net.suaptinstallkuma.create_templates_gears.item.ModItemsCompat;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(CreateTemplatesGears.MOD_ID)
public class CreateTemplatesGears {

    public static final String MOD_ID = "create_templates_gears";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CreateTemplatesGears(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);

        if(ModList.get().isLoaded("more_armor_trims")) {
            ModItemsCompat.registerItemsCompat(modEventBus);
        }

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.DEEPSLATE_SHEET);
            event.accept(ModItems.GRANITE_SHEET);
            event.accept(ModItems.NETHERRACK_SHEET);
            event.accept(ModItems.STONE_SHEET);

            event.accept(ModItems.DIAMOND_SHEET);

            event.accept(ModItems.BOLT_SHEET);
            event.accept(ModItems.COAST_SHEET);
            event.accept(ModItems.COAST_CORAL_SHEET);
            event.accept(ModItems.SAND_SHEET);
            event.accept(ModItems.END_SHEET);
            event.accept(ModItems.FLOW_SHEET);
            event.accept(ModItems.RIB_SHEET);
            event.accept(ModItems.SILENCE_SHEET);
            event.accept(ModItems.SPIRE_SHEET);
            event.accept(ModItems.TIDE_SHEET);
            event.accept(ModItems.MOSSY_STONE_SHEET);

            if(ModList.get().isLoaded("more_armor_trims")) {
                event.accept(ModItemsCompat.MOSS_SHEET);
                event.accept(ModItemsCompat.OBSIDIAN_SHEET);
                event.accept(ModItemsCompat.SOUL_SAND_SHEET);

                event.accept(ModItemsCompat.GREED_SHEET);
                event.accept(ModItemsCompat.WITNESS_SHEET);
            }
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
