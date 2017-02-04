package com.ccgauche.API.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Item {
	
	private ItemStack s;
	
	public Item(Material m) {
		s = new ItemStack(m);
	}
	
	public Item(Material m,int number) {
		s = new ItemStack(m,number);
	}
	
	public Item(ItemType m) {
		s = new ItemStack(m.getMaterial(),1,m.getByte());
	}
	
	public Item(ItemType m,int number) {
		s = new ItemStack(m.getMaterial(),number,m.getByte());
	}
	
	public Item(ItemStack i) {
		s=i;
	}
	
	public Item(Material m,ItemName i) {
		ItemStack it = new ItemStack(m,1);
		ItemMeta im = it.getItemMeta();
		im.setDisplayName(i.getName());
		im.setLore(i.getLore());
		it.setItemMeta(im);
		s=it;
	}
	
	public Item(Material m,int number,ItemName i) {
		ItemStack it = new ItemStack(m,number);
		ItemMeta im = it.getItemMeta();
		im.setDisplayName(i.getName());
		im.setLore(i.getLore());
		it.setItemMeta(im);
		s=it;
	}
	
	public Item(ItemType m,ItemName i) {
		ItemStack it = new ItemStack(m.getMaterial(),1,m.getByte());
		ItemMeta im = it.getItemMeta();
		im.setDisplayName(i.getName());
		im.setLore(i.getLore());
		it.setItemMeta(im);
		s=it;
	}
	
	public Item(ItemType m,int number,ItemName i) {
		ItemStack it = new ItemStack(m.getMaterial(),number,m.getByte());
		ItemMeta im = it.getItemMeta();
		im.setDisplayName(i.getName());
		im.setLore(i.getLore());
		it.setItemMeta(im);
		s=it;
	}
	
	public Item(Material Material, int i, byte b) {
		s=new ItemStack(Material,i,b);
	}

	public ItemStack getStack() {
		return s;
	}
}
