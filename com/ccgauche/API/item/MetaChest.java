package com.ccgauche.API.item;

import org.bukkit.inventory.ItemStack;

public class MetaChest {
	
	private ItemStack i;
	private int Slot;
	private int p;
	
	public MetaChest(ItemStack i,int Slot,int pourcentage) {
		this.setI(i);
		this.setSlot(Slot);
		setP(pourcentage);
	}

	public int getSlot() {
		return Slot;
	}

	public void setSlot(int slot) {
		Slot = slot;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public ItemStack getI() {
		return i;
	}

	public void setI(ItemStack i) {
		this.i = i;
	}
}
