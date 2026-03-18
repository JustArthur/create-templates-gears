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

public class ModItemsCompact {

    // Base Sheet
    public static final Item OBSIDIAN_SHEET = registerItem("obsidian_sheet", new Item(new FabricItemSettings()));
    public static final Item MOSS_SHEET = registerItem("moss_sheet", new Item(new FabricItemSettings()));
    public static final Item SOUL_SAND_SHEET = registerItem("soul_sand_sheet", new Item(new FabricItemSettings()));

    // Trim Sheet
    public static final Item GREED_SHEET = registerItem("greed_sheet", new Item(new FabricItemSettings()));
    public static final Item WITNESS_SHEET = registerItem("witness_sheet", new Item(new FabricItemSettings()));

    // Inactive Trim Sheet
    public static final Item INACTIVE_BEAST_ARMOR_TRIM = registerItem("inactive_beast_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_FEVER_ARMOR_TRIM = registerItem("inactive_fever_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_GREED_ARMOR_TRIM = registerItem("inactive_greed_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_HORIZON_ARMOR_TRIM = registerItem("inactive_horizon_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_MYTH_ARMOR_TRIM = registerItem("inactive_myth_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_NIHILITY_ARMOR_TRIM = registerItem("inactive_nihility_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_ORIGIN_ARMOR_TRIM = registerItem("inactive_origin_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_PARASITE_ARMOR_TRIM = registerItem("inactive_parasite_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_RAM_ARMOR_TRIM = registerItem("inactive_ram_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_STORM_ARMOR_TRIM = registerItem("inactive_storm_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_TWILIGHT_ARMOR_TRIM = registerItem("inactive_twilight_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_WITNESS_ARMOR_TRIM = registerItem("inactive_witness_armor_trim", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item INACTIVE_WRAITH_ARMOR_TRIM = registerItem("inactive_wraith_armor_trim", new Item(new FabricItemSettings().maxCount(1)));

    // FAIRE TOUTE LES TRIM DU MOD (recettes compris)
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(OBSIDIAN_SHEET);
        entries.add(MOSS_SHEET);
        entries.add(SOUL_SAND_SHEET);

        entries.add(GREED_SHEET);
        entries.add(WITNESS_SHEET);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateTemplatesGears.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItemsCompact::addItemsToIngredientItemGroup);
    }
}
