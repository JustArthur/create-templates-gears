/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.kuma.createtemplatesgears.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import com.kuma.createtemplatesgears.item.WildSheetItem;
import com.kuma.createtemplatesgears.item.WildMossySheetItem;
import com.kuma.createtemplatesgears.item.WayfinderSheetItem;
import com.kuma.createtemplatesgears.item.WardSheetItem;
import com.kuma.createtemplatesgears.item.VexSheetItem;
import com.kuma.createtemplatesgears.item.TideSheetItem;
import com.kuma.createtemplatesgears.item.SpireSheetItem;
import com.kuma.createtemplatesgears.item.SnoutSheetItem;
import com.kuma.createtemplatesgears.item.SilenceSheetItem;
import com.kuma.createtemplatesgears.item.SilenceEchoSheetItem;
import com.kuma.createtemplatesgears.item.ShaperSheetItem;
import com.kuma.createtemplatesgears.item.SentrySheetItem;
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
import com.kuma.createtemplatesgears.item.InactiveHostArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveEyeArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveDuneArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveCoastArmorTrimItem;
import com.kuma.createtemplatesgears.item.HostSheetItem;
import com.kuma.createtemplatesgears.item.EyeSheetItem;
import com.kuma.createtemplatesgears.item.DuneSheetItem;
import com.kuma.createtemplatesgears.item.CoastSheetItem;
import com.kuma.createtemplatesgears.item.CoastCoralSheetItem;
import com.kuma.createtemplatesgears.CreateTemplatesGearsMod;

public class CreateTemplatesGearsModItems {
	public static Item COAST_SHEET;
	public static Item COAST_CORAL_SHEET;
	public static Item INACTIVE_COAST_ARMOR_TRIM;
	public static Item DUNE_SHEET;
	public static Item INACTIVE_DUNE_ARMOR_TRIM;
	public static Item EYE_SHEET;
	public static Item HOST_SHEET;
	public static Item INACTIVE_HOST_ARMOR_TRIM;
	public static Item RIB_SHEET;
	public static Item INACTIVE_RIB_ARMOR_TRIM;
	public static Item SENTRY_SHEET;
	public static Item INACTIVE_SENTRY_ARMOR_TRIM;
	public static Item SHAPER_SHEET;
	public static Item INACTIVE_SHAPER_ARMOR_TRIM;
	public static Item SILENCE_SHEET;
	public static Item SILENCE_ECHO_SHEET;
	public static Item INACTIVE_SILENCE_ARMOR_TRIM;
	public static Item SNOUT_SHEET;
	public static Item INACTIVE_SNOUT_ARMOR_TRIM;
	public static Item SPIRE_SHEET;
	public static Item INACTIVE_SPIRE_ARMOR_TRIM;
	public static Item TIDE_SHEET;
	public static Item INACTIVE_TIDE_ARMOR_TRIM;
	public static Item VEX_SHEET;
	public static Item INACTIVE_VEX_ARMOR_TRIM;
	public static Item WARD_SHEET;
	public static Item INACTIVE_WARD_ARMOR_TRIM;
	public static Item WAYFINDER_SHEET;
	public static Item INACTIVE_WAYFINDER_ARMOR_TRIM;
	public static Item WILD_SHEET;
	public static Item WILD_MOSSY_SHEET;
	public static Item INACTIVE_WILD_ARMOR_TRIM;
	public static Item INACTIVE_EYE_ARMOR_TRIM;

	public static void load() {
		COAST_SHEET = register("coast_sheet", new CoastSheetItem());
		COAST_CORAL_SHEET = register("coast_coral_sheet", new CoastCoralSheetItem());
		INACTIVE_COAST_ARMOR_TRIM = register("inactive_coast_armor_trim", new InactiveCoastArmorTrimItem());
		DUNE_SHEET = register("dune_sheet", new DuneSheetItem());
		INACTIVE_DUNE_ARMOR_TRIM = register("inactive_dune_armor_trim", new InactiveDuneArmorTrimItem());
		EYE_SHEET = register("eye_sheet", new EyeSheetItem());
		HOST_SHEET = register("host_sheet", new HostSheetItem());
		INACTIVE_HOST_ARMOR_TRIM = register("inactive_host_armor_trim", new InactiveHostArmorTrimItem());
		RIB_SHEET = register("rib_sheet", new RibSheetItem());
		INACTIVE_RIB_ARMOR_TRIM = register("inactive_rib_armor_trim", new InactiveRibArmorTrimItem());
		SENTRY_SHEET = register("sentry_sheet", new SentrySheetItem());
		INACTIVE_SENTRY_ARMOR_TRIM = register("inactive_sentry_armor_trim", new InactiveSentryArmorTrimItem());
		SHAPER_SHEET = register("shaper_sheet", new ShaperSheetItem());
		INACTIVE_SHAPER_ARMOR_TRIM = register("inactive_shaper_armor_trim", new InactiveShaperArmorTrimItem());
		SILENCE_SHEET = register("silence_sheet", new SilenceSheetItem());
		SILENCE_ECHO_SHEET = register("silence_echo_sheet", new SilenceEchoSheetItem());
		INACTIVE_SILENCE_ARMOR_TRIM = register("inactive_silence_armor_trim", new InactiveSilenceArmorTrimItem());
		SNOUT_SHEET = register("snout_sheet", new SnoutSheetItem());
		INACTIVE_SNOUT_ARMOR_TRIM = register("inactive_snout_armor_trim", new InactiveSnoutArmorTrimItem());
		SPIRE_SHEET = register("spire_sheet", new SpireSheetItem());
		INACTIVE_SPIRE_ARMOR_TRIM = register("inactive_spire_armor_trim", new InactiveSpireArmorTrimItem());
		TIDE_SHEET = register("tide_sheet", new TideSheetItem());
		INACTIVE_TIDE_ARMOR_TRIM = register("inactive_tide_armor_trim", new InactiveTideArmorTrimItem());
		VEX_SHEET = register("vex_sheet", new VexSheetItem());
		INACTIVE_VEX_ARMOR_TRIM = register("inactive_vex_armor_trim", new InactiveVexArmorTrimItem());
		WARD_SHEET = register("ward_sheet", new WardSheetItem());
		INACTIVE_WARD_ARMOR_TRIM = register("inactive_ward_armor_trim", new InactiveWardArmorTrimItem());
		WAYFINDER_SHEET = register("wayfinder_sheet", new WayfinderSheetItem());
		INACTIVE_WAYFINDER_ARMOR_TRIM = register("inactive_wayfinder_armor_trim", new InactiveWayfinderArmorTrimItem());
		WILD_SHEET = register("wild_sheet", new WildSheetItem());
		WILD_MOSSY_SHEET = register("wild_mossy_sheet", new WildMossySheetItem());
		INACTIVE_WILD_ARMOR_TRIM = register("inactive_wild_armor_trim", new InactiveWildArmorTrimItem());
		INACTIVE_EYE_ARMOR_TRIM = register("inactive_eye_armor_trim", new InactiveEyeArmorTrimItem());
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CreateTemplatesGearsMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}