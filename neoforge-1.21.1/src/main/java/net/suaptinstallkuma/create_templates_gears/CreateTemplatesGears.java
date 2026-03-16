package net.suaptinstallkuma.create_templates_gears;

import net.minecraft.world.item.CreativeModeTabs;
import net.suaptinstallkuma.create_templates_gears.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
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

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.BOLT_SHEET);
            event.accept(ModItems.COAST_SHEET);
            event.accept(ModItems.COAST_CORAL_SHEET);
            event.accept(ModItems.DUNE_SHEET);
            event.accept(ModItems.EYE_SHEET);
            event.accept(ModItems.FLOW_SHEET);
            event.accept(ModItems.RIB_SHEET);
            event.accept(ModItems.STONE_SHEET);
            event.accept(ModItems.SILENCE_SHEET);
            event.accept(ModItems.SPIRE_SHEET);
            event.accept(ModItems.TIDE_SHEET);
            event.accept(ModItems.DEEPSLATE_SHEET);
            event.accept(ModItems.WILD_MOSSY_SHEET);
            event.accept(ModItems.GRANITE_SHEET);
            event.accept(ModItems.NETHERRACK_SHEET);
            event.accept(ModItems.DIAMOND_SHEET);

            event.accept(ModItems.INACTIVE_BOLT_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_COAST_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_DUNE_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_EYE_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_FLOW_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_HOST_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_RAISER_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_RIB_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_SENTRY_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_SHAPER_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_SILENCE_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_SNOUT_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_SPIRE_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_TIDE_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_VEX_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_WARD_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_WAYFINDER_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_WILD_ARMOR_TRIM);
            event.accept(ModItems.INACTIVE_NETHERRACK_SHEET);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
