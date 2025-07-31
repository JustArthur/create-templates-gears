/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.kuma.createtemplatesgears.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import com.kuma.createtemplatesgears.item.WildMossySheetItem;
import com.kuma.createtemplatesgears.item.TideSheetItem;
import com.kuma.createtemplatesgears.item.StoneSheetItem;
import com.kuma.createtemplatesgears.item.SpireSheetItem;
import com.kuma.createtemplatesgears.item.SilenceEchoSheetItem;
import com.kuma.createtemplatesgears.item.RibSheetItem;
import com.kuma.createtemplatesgears.item.InactiveWildArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveWayfinderArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveWardArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveVexArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveTideArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveSpireArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveSnoutArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveSilenceArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveShaperArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveSentryArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveRibArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveRaiserArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveHostArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveEyeArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveDuneArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveCoastArmorTrimItem;
import com.kuma.createtemplatesgears.item.GraniteSheetItem;
import com.kuma.createtemplatesgears.item.EyeSheetItem;
import com.kuma.createtemplatesgears.item.DuneSheetItem;
import com.kuma.createtemplatesgears.item.DeepslateSheetItem;
import com.kuma.createtemplatesgears.item.CoastSheetItem;
import com.kuma.createtemplatesgears.item.CoastCoralSheetItem;
import com.kuma.createtemplatesgears.CreateTemplatesGearsMod;

public class CreateTemplatesGearsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreateTemplatesGearsMod.MODID);
	public static final RegistryObject<Item> COAST_SHEET = REGISTRY.register("coast_sheet", () -> new CoastSheetItem());
	public static final RegistryObject<Item> COAST_CORAL_SHEET = REGISTRY.register("coast_coral_sheet", () -> new CoastCoralSheetItem());
	public static final RegistryObject<Item> DUNE_SHEET = REGISTRY.register("dune_sheet", () -> new DuneSheetItem());
	public static final RegistryObject<Item> EYE_SHEET = REGISTRY.register("eye_sheet", () -> new EyeSheetItem());
	public static final RegistryObject<Item> GRANITE_SHEET = REGISTRY.register("granite_sheet", () -> new GraniteSheetItem());
	public static final RegistryObject<Item> RIB_SHEET = REGISTRY.register("rib_sheet", () -> new RibSheetItem());
	public static final RegistryObject<Item> STONE_SHEET = REGISTRY.register("stone_sheet", () -> new StoneSheetItem());
	public static final RegistryObject<Item> DEEPSLATE_SHEET = REGISTRY.register("deepslate_sheet", () -> new DeepslateSheetItem());
	public static final RegistryObject<Item> SILENCE_ECHO_SHEET = REGISTRY.register("silence_echo_sheet", () -> new SilenceEchoSheetItem());
	public static final RegistryObject<Item> SPIRE_SHEET = REGISTRY.register("spire_sheet", () -> new SpireSheetItem());
	public static final RegistryObject<Item> TIDE_SHEET = REGISTRY.register("tide_sheet", () -> new TideSheetItem());
	public static final RegistryObject<Item> WILD_MOSSY_SHEET = REGISTRY.register("wild_mossy_sheet", () -> new WildMossySheetItem());
	public static final RegistryObject<Item> INACTIVE_COAST_ARMOR_TRIM = REGISTRY.register("inactive_coast_armor_trim", () -> new InactiveCoastArmorTrimItem());
	public static final RegistryObject<Item> INACTIVE_DUNE_ARMOR_TRIM = REGISTRY.register("inactive_dune_armor_trim", () -> new InactiveDuneArmorTrimItem());
	public static final RegistryObject<Item> INACTIVE_EYE_ARMOR_TRIM = REGISTRY.register("inactive_eye_armor_trim", () -> new InactiveEyeArmorTrimItem());
	public static final RegistryObject<Item> INACTIVE_HOST_ARMOR_TRIM = REGISTRY.register("inactive_host_armor_trim", () -> new InactiveHostArmorTrimItem());
	public static final RegistryObject<Item> INACTIVE_RAISER_ARMOR_TRIM = REGISTRY.register("inactive_raiser_armor_trim", () -> new InactiveRaiserArmorTrimItem());
	public static final RegistryObject<Item> INACTIVE_RIB_ARMOR_TRIM = REGISTRY.register("inactive_rib_armor_trim", () -> new InactiveRibArmorTrimItem());
	public static final RegistryObject<Item> INACTIVE_SENTRY_ARMOR_TRIM = REGISTRY.register("inactive_sentry_armor_trim", () -> new InactiveSentryArmorTrimItem());
	public static final RegistryObject<Item> INACTIVE_SHAPER_ARMOR_TRIM = REGISTRY.register("inactive_shaper_armor_trim", () -> new InactiveShaperArmorTrimItem());
	public static final RegistryObject<Item> INACTIVE_SILENCE_ARMOR_TRIM = REGISTRY.register("inactive_silence_armor_trim", () -> new InactiveSilenceArmorTrimItem());
	public static final RegistryObject<Item> INACTIVE_SNOUT_ARMOR_TRIM = REGISTRY.register("inactive_snout_armor_trim", () -> new InactiveSnoutArmorTrimItem());
	public static final RegistryObject<Item> INACTIVE_SPIRE_ARMOR_TRIM = REGISTRY.register("inactive_spire_armor_trim", () -> new InactiveSpireArmorTrimItem());
	public static final RegistryObject<Item> INACTIVE_TIDE_ARMOR_TRIM = REGISTRY.register("inactive_tide_armor_trim", () -> new InactiveTideArmorTrimItem());
	public static final RegistryObject<Item> INACTIVE_VEX_ARMOR_TRIM = REGISTRY.register("inactive_vex_armor_trim", () -> new InactiveVexArmorTrimItem());
	public static final RegistryObject<Item> INACTIVE_WARD_ARMOR_TRIM = REGISTRY.register("inactive_ward_armor_trim", () -> new InactiveWardArmorTrimItem());
	public static final RegistryObject<Item> INACTIVE_WAYFINDER_ARMOR_TRIM = REGISTRY.register("inactive_wayfinder_armor_trim", () -> new InactiveWayfinderArmorTrimItem());
	public static final RegistryObject<Item> INACTIVE_WILD_ARMOR_TRIM = REGISTRY.register("inactive_wild_armor_trim", () -> new InactiveWildArmorTrimItem());
	// Start of user code block custom items
	// End of user code block custom items
}