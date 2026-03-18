package net.suaptinstallkuma.create_templates_gears.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.suaptinstallkuma.create_templates_gears.CreateTemplatesGears;

public class ModItems {

    // Base Sheet
    public static final Item DEEPSLATE_SHEET = registerItem("deepslate_sheet", new Item(new FabricItemSettings()));
    public static final Item END_SHEET = registerItem("end_sheet", new Item(new FabricItemSettings()));
    public static final Item GRANITE_SHEET = registerItem("granite_sheet", new Item(new FabricItemSettings()));
    public static final Item NETHERRACK_SHEET = registerItem("netherrack_sheet", new Item(new FabricItemSettings()));
    public static final Item SAND_SHEET = registerItem("sand_sheet", new Item(new FabricItemSettings()));
    public static final Item STONE_SHEET = registerItem("stone_sheet", new Item(new FabricItemSettings()));

    // Trim Sheet
    public static final Item COAST_SHEET = registerItem("coast_sheet", new Item(new FabricItemSettings()));
    public static final Item COAST_CORAL_SHEET = registerItem("coast_coral_sheet", new Item(new FabricItemSettings()));
    public static final Item MOSSY_STONE_SHEET = registerItem("mossy_stone_sheet", new Item(new FabricItemSettings()));
    public static final Item RIB_SHEET = registerItem("rib_sheet", new Item(new FabricItemSettings()));
    public static final Item SILENCE_SHEET = registerItem("silence_echo_sheet", new Item(new FabricItemSettings()));
    public static final Item SPIRE_SHEET = registerItem("spire_sheet", new Item(new FabricItemSettings()));
    public static final Item TIDE_SHEET = registerItem("tide_sheet", new Item(new FabricItemSettings()));

    // Inactive Armor Trims
    public static final Item INACTIVE_COAST_ARMOR_TRIM = registerItem("inactive_coast_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_DUNE_ARMOR_TRIM = registerItem("inactive_dune_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_EYE_ARMOR_TRIM = registerItem("inactive_eye_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_HOST_ARMOR_TRIM = registerItem("inactive_host_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_RAISER_ARMOR_TRIM = registerItem("inactive_raiser_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_RIB_ARMOR_TRIM = registerItem("inactive_rib_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_SENTRY_ARMOR_TRIM = registerItem("inactive_sentry_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_SHAPER_ARMOR_TRIM = registerItem("inactive_shaper_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_SILENCE_ARMOR_TRIM = registerItem("inactive_silence_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_SNOUT_ARMOR_TRIM = registerItem("inactive_snout_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_SPIRE_ARMOR_TRIM = registerItem("inactive_spire_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_TIDE_ARMOR_TRIM = registerItem("inactive_tide_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_VEX_ARMOR_TRIM = registerItem("inactive_vex_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_WARD_ARMOR_TRIM = registerItem("inactive_ward_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_WAYFINDER_ARMOR_TRIM = registerItem("inactive_wayfinder_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_WILD_ARMOR_TRIM = registerItem("inactive_wild_armor_trim", new Item(new FabricItemSettings().maxCount(1)));

    public static final Item INACTIVE_NETHERRACK_ARMOR_TRIM = registerItem("inactive_netherrack_sheet", new Item(new FabricItemSettings().maxCount(1)));

    public static final Item DIAMOND_SHEET = registerItem("diamond_sheet", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(COAST_SHEET);
        entries.add(COAST_CORAL_SHEET);
        entries.add(DEEPSLATE_SHEET);
        entries.add(SAND_SHEET);
        entries.add(END_SHEET);
        entries.add(GRANITE_SHEET);
        entries.add(MOSSY_STONE_SHEET);
        entries.add(NETHERRACK_SHEET);
        entries.add(RIB_SHEET);
        entries.add(SILENCE_SHEET);
        entries.add(SPIRE_SHEET);
        entries.add(STONE_SHEET);
        entries.add(TIDE_SHEET);

        entries.add(DIAMOND_SHEET);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateTemplatesGears.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
