/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.kuma.createtemplatesgears.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import com.kuma.createtemplatesgears.CreateTemplatesGearsMod;

public class CreateTemplatesGearsModTabs {
	public static ResourceKey<CreativeModeTab> TAB_CREATE_TEMPLATE_GEARS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(CreateTemplatesGearsMod.MODID, "create_template_gears"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_CREATE_TEMPLATE_GEARS,
				FabricItemGroup.builder().title(Component.translatable("item_group." + CreateTemplatesGearsMod.MODID + ".create_template_gears")).icon(() -> new ItemStack(Items.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE)).build());
	}
}