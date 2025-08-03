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

import com.kuma.createtemplatesgears.item.WildMossySheetItem;
import com.kuma.createtemplatesgears.item.TideSheetItem;
import com.kuma.createtemplatesgears.item.StoneSheetItem;
import com.kuma.createtemplatesgears.item.SpireSheetItem;
import com.kuma.createtemplatesgears.item.SilenceEchoSheetItem;
import com.kuma.createtemplatesgears.item.RibSheetItem;
import com.kuma.createtemplatesgears.item.NetherrackSheetItem;
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
import com.kuma.createtemplatesgears.item.InactiveNetherrackSheetItem;
import com.kuma.createtemplatesgears.item.InactiveHostArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveEyeArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveDuneArmorTrimItem;
import com.kuma.createtemplatesgears.item.InactiveCoastArmorTrimItem;
import com.kuma.createtemplatesgears.item.GraniteSheetItem;
import com.kuma.createtemplatesgears.item.EyeSheetItem;
import com.kuma.createtemplatesgears.item.DuneSheetItem;
import com.kuma.createtemplatesgears.item.DiamondSheetItem;
import com.kuma.createtemplatesgears.item.DeepslateSheetItem;
import com.kuma.createtemplatesgears.item.CoastSheetItem;
import com.kuma.createtemplatesgears.item.CoastCoralSheetItem;
import com.kuma.createtemplatesgears.CreateTemplatesGearsMod;

public class CreateTemplatesGearsModItems {
	public static Item COAST_SHEET;
	public static Item COAST_CORAL_SHEET;
	public static Item DUNE_SHEET;
	public static Item EYE_SHEET;
	public static Item GRANITE_SHEET;
	public static Item RIB_SHEET;
	public static Item STONE_SHEET;
	public static Item DEEPSLATE_SHEET;
	public static Item SILENCE_ECHO_SHEET;
	public static Item SPIRE_SHEET;
	public static Item TIDE_SHEET;
	public static Item WILD_MOSSY_SHEET;
	public static Item INACTIVE_COAST_ARMOR_TRIM;
	public static Item INACTIVE_DUNE_ARMOR_TRIM;
	public static Item INACTIVE_EYE_ARMOR_TRIM;
	public static Item INACTIVE_HOST_ARMOR_TRIM;
	public static Item INACTIVE_RAISER_ARMOR_TRIM;
	public static Item INACTIVE_RIB_ARMOR_TRIM;
	public static Item INACTIVE_SENTRY_ARMOR_TRIM;
	public static Item INACTIVE_SHAPER_ARMOR_TRIM;
	public static Item INACTIVE_SILENCE_ARMOR_TRIM;
	public static Item INACTIVE_SNOUT_ARMOR_TRIM;
	public static Item INACTIVE_SPIRE_ARMOR_TRIM;
	public static Item INACTIVE_TIDE_ARMOR_TRIM;
	public static Item INACTIVE_VEX_ARMOR_TRIM;
	public static Item INACTIVE_WARD_ARMOR_TRIM;
	public static Item INACTIVE_WAYFINDER_ARMOR_TRIM;
	public static Item INACTIVE_WILD_ARMOR_TRIM;
	public static Item NETHERRACK_SHEET;
	public static Item INACTIVE_NETHERRACK_SHEET;
	public static Item DIAMOND_SHEET;

	public static void load() {
		COAST_SHEET = register("coast_sheet", new CoastSheetItem());
		COAST_CORAL_SHEET = register("coast_coral_sheet", new CoastCoralSheetItem());
		DUNE_SHEET = register("dune_sheet", new DuneSheetItem());
		EYE_SHEET = register("eye_sheet", new EyeSheetItem());
		GRANITE_SHEET = register("granite_sheet", new GraniteSheetItem());
		RIB_SHEET = register("rib_sheet", new RibSheetItem());
		STONE_SHEET = register("stone_sheet", new StoneSheetItem());
		DEEPSLATE_SHEET = register("deepslate_sheet", new DeepslateSheetItem());
		SILENCE_ECHO_SHEET = register("silence_echo_sheet", new SilenceEchoSheetItem());
		SPIRE_SHEET = register("spire_sheet", new SpireSheetItem());
		TIDE_SHEET = register("tide_sheet", new TideSheetItem());
		WILD_MOSSY_SHEET = register("wild_mossy_sheet", new WildMossySheetItem());
		INACTIVE_COAST_ARMOR_TRIM = register("inactive_coast_armor_trim", new InactiveCoastArmorTrimItem());
		INACTIVE_DUNE_ARMOR_TRIM = register("inactive_dune_armor_trim", new InactiveDuneArmorTrimItem());
		INACTIVE_EYE_ARMOR_TRIM = register("inactive_eye_armor_trim", new InactiveEyeArmorTrimItem());
		INACTIVE_HOST_ARMOR_TRIM = register("inactive_host_armor_trim", new InactiveHostArmorTrimItem());
		INACTIVE_RAISER_ARMOR_TRIM = register("inactive_raiser_armor_trim", new InactiveRaiserArmorTrimItem());
		INACTIVE_RIB_ARMOR_TRIM = register("inactive_rib_armor_trim", new InactiveRibArmorTrimItem());
		INACTIVE_SENTRY_ARMOR_TRIM = register("inactive_sentry_armor_trim", new InactiveSentryArmorTrimItem());
		INACTIVE_SHAPER_ARMOR_TRIM = register("inactive_shaper_armor_trim", new InactiveShaperArmorTrimItem());
		INACTIVE_SILENCE_ARMOR_TRIM = register("inactive_silence_armor_trim", new InactiveSilenceArmorTrimItem());
		INACTIVE_SNOUT_ARMOR_TRIM = register("inactive_snout_armor_trim", new InactiveSnoutArmorTrimItem());
		INACTIVE_SPIRE_ARMOR_TRIM = register("inactive_spire_armor_trim", new InactiveSpireArmorTrimItem());
		INACTIVE_TIDE_ARMOR_TRIM = register("inactive_tide_armor_trim", new InactiveTideArmorTrimItem());
		INACTIVE_VEX_ARMOR_TRIM = register("inactive_vex_armor_trim", new InactiveVexArmorTrimItem());
		INACTIVE_WARD_ARMOR_TRIM = register("inactive_ward_armor_trim", new InactiveWardArmorTrimItem());
		INACTIVE_WAYFINDER_ARMOR_TRIM = register("inactive_wayfinder_armor_trim", new InactiveWayfinderArmorTrimItem());
		INACTIVE_WILD_ARMOR_TRIM = register("inactive_wild_armor_trim", new InactiveWildArmorTrimItem());
		NETHERRACK_SHEET = register("netherrack_sheet", new NetherrackSheetItem());
		INACTIVE_NETHERRACK_SHEET = register("inactive_netherrack_sheet", new InactiveNetherrackSheetItem());
		DIAMOND_SHEET = register("diamond_sheet", new DiamondSheetItem());
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