package net.suaptinstallkuma.create_templates_gears.item;

import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.suaptinstallkuma.create_templates_gears.CreateTemplatesGears;

public class ModItemsCompat {
    public static final DeferredRegister.Items ITEMS_COMPAT = DeferredRegister.createItems(CreateTemplatesGears.MOD_ID);

    // Base Sheet
    public static final DeferredItem<Item> OBSIDIAN_SHEET = ITEMS_COMPAT.register("obsidian_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOSS_SHEET = ITEMS_COMPAT.register("moss_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SOUL_SAND_SHEET = ITEMS_COMPAT.register("soul_sand_sheet", () -> new Item(new Item.Properties()));

    // Trim Sheet
    public static final DeferredItem<Item> GREED_SHEET = ITEMS_COMPAT.register("greed_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WITNESS_SHEET = ITEMS_COMPAT.register("witness_sheet", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> INACTIVE_BEAST_ARMOR_TRIM = ITEMS_COMPAT.register("inactive_beast_armor_trim", () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_FEVER_ARMOR_TRIM = ITEMS_COMPAT.register("inactive_fever_armor_trim", () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_GREED_ARMOR_TRIM = ITEMS_COMPAT.register("inactive_greed_armor_trim", () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_HORIZON_ARMOR_TRIM = ITEMS_COMPAT.register("inactive_horizon_armor_trim", () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_MYTH_ARMOR_TRIM = ITEMS_COMPAT.register("inactive_myth_armor_trim", () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_NIHILITY_ARMOR_TRIM = ITEMS_COMPAT.register("inactive_nihility_armor_trim", () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_ORIGIN_ARMOR_TRIM = ITEMS_COMPAT.register("inactive_origin_armor_trim", () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_PARASITE_ARMOR_TRIM = ITEMS_COMPAT.register("inactive_parasite_armor_trim", () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_RAM_ARMOR_TRIM = ITEMS_COMPAT.register("inactive_ram_armor_trim", () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_STORM_ARMOR_TRIM = ITEMS_COMPAT.register("inactive_storm_armor_trim", () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_TWILIGHT_ARMOR_TRIM = ITEMS_COMPAT.register("inactive_twilight_armor_trim", () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_WITNESS_ARMOR_TRIM = ITEMS_COMPAT.register("inactive_witness_armor_trim", () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> INACTIVE_WRAITH_ARMOR_TRIM = ITEMS_COMPAT.register("inactive_wraith_armor_trim", () -> new SequencedAssemblyItem(new Item.Properties()));

    public static void registerItemsCompat(IEventBus eventBus) {
        ITEMS_COMPAT.register(eventBus);
    }
}
