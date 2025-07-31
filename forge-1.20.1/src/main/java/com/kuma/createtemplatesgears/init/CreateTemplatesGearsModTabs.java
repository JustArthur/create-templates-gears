/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.kuma.createtemplatesgears.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.kuma.createtemplatesgears.CreateTemplatesGearsMod;

public class CreateTemplatesGearsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateTemplatesGearsMod.MODID);
	public static final RegistryObject<CreativeModeTab> CREATE_TEMPLATES_GEARS = REGISTRY.register("create_templates_gears",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.create_templates_gears.create_templates_gears")).icon(() -> new ItemStack(Items.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE)).displayItems((parameters, tabData) -> {
				tabData.accept(CreateTemplatesGearsModItems.COAST_SHEET.get());
				tabData.accept(CreateTemplatesGearsModItems.COAST_CORAL_SHEET.get());
				tabData.accept(CreateTemplatesGearsModItems.DUNE_SHEET.get());
				tabData.accept(CreateTemplatesGearsModItems.EYE_SHEET.get());
				tabData.accept(CreateTemplatesGearsModItems.GRANITE_SHEET.get());
				tabData.accept(CreateTemplatesGearsModItems.RIB_SHEET.get());
				tabData.accept(CreateTemplatesGearsModItems.STONE_SHEET.get());
				tabData.accept(CreateTemplatesGearsModItems.DEEPSLATE_SHEET.get());
				tabData.accept(CreateTemplatesGearsModItems.SILENCE_ECHO_SHEET.get());
				tabData.accept(CreateTemplatesGearsModItems.SPIRE_SHEET.get());
				tabData.accept(CreateTemplatesGearsModItems.TIDE_SHEET.get());
				tabData.accept(CreateTemplatesGearsModItems.WILD_MOSSY_SHEET.get());
				tabData.accept(CreateTemplatesGearsModItems.INACTIVE_COAST_ARMOR_TRIM.get());
				tabData.accept(CreateTemplatesGearsModItems.INACTIVE_DUNE_ARMOR_TRIM.get());
				tabData.accept(CreateTemplatesGearsModItems.INACTIVE_EYE_ARMOR_TRIM.get());
				tabData.accept(CreateTemplatesGearsModItems.INACTIVE_HOST_ARMOR_TRIM.get());
				tabData.accept(CreateTemplatesGearsModItems.INACTIVE_RAISER_ARMOR_TRIM.get());
				tabData.accept(CreateTemplatesGearsModItems.INACTIVE_RIB_ARMOR_TRIM.get());
				tabData.accept(CreateTemplatesGearsModItems.INACTIVE_SENTRY_ARMOR_TRIM.get());
				tabData.accept(CreateTemplatesGearsModItems.INACTIVE_SHAPER_ARMOR_TRIM.get());
				tabData.accept(CreateTemplatesGearsModItems.INACTIVE_SILENCE_ARMOR_TRIM.get());
				tabData.accept(CreateTemplatesGearsModItems.INACTIVE_SNOUT_ARMOR_TRIM.get());
				tabData.accept(CreateTemplatesGearsModItems.INACTIVE_SPIRE_ARMOR_TRIM.get());
				tabData.accept(CreateTemplatesGearsModItems.INACTIVE_TIDE_ARMOR_TRIM.get());
				tabData.accept(CreateTemplatesGearsModItems.INACTIVE_VEX_ARMOR_TRIM.get());
				tabData.accept(CreateTemplatesGearsModItems.INACTIVE_WARD_ARMOR_TRIM.get());
				tabData.accept(CreateTemplatesGearsModItems.INACTIVE_WAYFINDER_ARMOR_TRIM.get());
				tabData.accept(CreateTemplatesGearsModItems.INACTIVE_WILD_ARMOR_TRIM.get());
			}).build());
}