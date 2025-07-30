package com.kuma.createtemplatesgears.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SilenceSheetItem extends Item {
	public SilenceSheetItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}