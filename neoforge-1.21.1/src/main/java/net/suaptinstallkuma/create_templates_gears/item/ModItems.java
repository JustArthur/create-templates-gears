package net.suaptinstallkuma.create_templates_gears.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.suaptinstallkuma.create_templates_gears.CreateTemplatesGears;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateTemplatesGears.MOD_ID);

    // Base Sheet
    public static final DeferredItem<Item> STONE_SHEET = ITEMS.register("stone_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRANITE_SHEET = ITEMS.register("granite_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERRACK_SHEET = ITEMS.register("netherrack_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEEPSLATE_SHEET = ITEMS.register("deepslate_sheet", () -> new Item(new Item.Properties()));

    // Trims Sheet
    public static final DeferredItem<Item> COAST_SHEET = ITEMS.register("coast_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COAST_CORAL_SHEET = ITEMS.register("coast_coral_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DUNE_SHEET = ITEMS.register("dune_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EYE_SHEET = ITEMS.register("eye_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RIB_SHEET = ITEMS.register("rib_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILENCE_SHEET = ITEMS.register("silence_echo_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPIRE_SHEET = ITEMS.register("spire_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIDE_SHEET = ITEMS.register("tide_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WILD_MOSSY_SHEET = ITEMS.register("wild_mossy_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLOW_SHEET = ITEMS.register("flow_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOLT_SHEET = ITEMS.register("bolt_sheet", () -> new Item(new Item.Properties()));

    // Item for processing
    public static final DeferredItem<Item> DIAMOND_SHEET = ITEMS.register("diamond_sheet", () -> new Item(new Item.Properties()));

    // Inactive Trims
    public static final DeferredItem<Item> INACTIVE_COAST_ARMOR_TRIM = ITEMS.register("inactive_coast_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_DUNE_ARMOR_TRIM = ITEMS.register("inactive_dune_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_EYE_ARMOR_TRIM = ITEMS.register("inactive_eye_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_HOST_ARMOR_TRIM = ITEMS.register("inactive_host_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_RAISER_ARMOR_TRIM = ITEMS.register("inactive_raiser_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_RIB_ARMOR_TRIM = ITEMS.register("inactive_rib_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_SENTRY_ARMOR_TRIM = ITEMS.register("inactive_sentry_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_SHAPER_ARMOR_TRIM = ITEMS.register("inactive_shaper_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_SILENCE_ARMOR_TRIM = ITEMS.register("inactive_silence_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_SNOUT_ARMOR_TRIM = ITEMS.register("inactive_snout_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_SPIRE_ARMOR_TRIM = ITEMS.register("inactive_spire_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_TIDE_ARMOR_TRIM = ITEMS.register("inactive_tide_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_VEX_ARMOR_TRIM = ITEMS.register("inactive_vex_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_WARD_ARMOR_TRIM = ITEMS.register("inactive_ward_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_WAYFINDER_ARMOR_TRIM = ITEMS.register("inactive_wayfinder_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_WILD_ARMOR_TRIM = ITEMS.register("inactive_wild_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_FLOW_ARMOR_TRIM = ITEMS.register("inactive_flow_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_BOLT_ARMOR_TRIM = ITEMS.register("inactive_bolt_armor_trim", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_NETHERRACK_SHEET = ITEMS.register("inactive_netherrack_sheet", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
