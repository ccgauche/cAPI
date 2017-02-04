package com.ccgauche.API.item;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.enchantments.Enchantment;

public class ItemName {
	
	private List<String> lore=new ArrayList<String>();
	private String name;
	public ArrayList<Enchantment> a = new ArrayList<Enchantment>();
	public boolean unbreakable=false;
	
	public ItemName(String name,List<String> lore) {
		this.name=name;
		this.lore=lore;
	}
	
	public ItemName(List<String> lore) {
		this.lore=lore;
	}
	
	public ItemName(String name) {
		this.name=name;
	}
	
	public ItemName(String name,String lore) {
		this.name=name;
		this.lore.add(lore);
	}

	public List<String> getLore() {
		return lore;
	}

	public String getName() {
		return name;
	}

}
