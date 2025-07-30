package com.kuma.createtemplatesgears.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class InactiveHostArmorTrimItem extends Item {
	public InactiveHostArmorTrimItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}