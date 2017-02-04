package com.ccgauche.API.item;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Kit {
	
	private Material Icon;
	private String Name;
	private ItemStack a1;
	private ItemStack a2;
	private ItemStack a3;
	private ItemStack a4;
	private boolean A1 = false;
	private boolean A2 = false;
	private boolean A3 = false;
	private boolean A4 = false;
	private ArrayList<ItemStack> ItemList = new ArrayList<>();
	private ArrayList<String> Lorelist = new ArrayList<>();
	
	public Kit(String name,Material icon) {
		Name=name;
		Icon=icon;
	}
	
	public Material getIcon() {
		return Icon;
	}
	
	public String getName() {
		return Name;
	}
	
	public void ArmorItemStack(ItemStack i , ArmorTag e) {
		ArmorItem(new Item(i),e);
	}
	
	public void ArmorItem(Item a,ArmorTag e) {
		if (e.equals(ArmorTag.HELMET)) {
			Lorelist.add("§7"+a.getStack().getItemMeta().getDisplayName() + " x 1");
			a1=a.getStack();
			A1=true;
		} else if (e.equals(ArmorTag.CHESTPLATE)) {
			Lorelist.add("§7"+a.getStack().getItemMeta().getDisplayName() + " x 1");
			a2=a.getStack();
			A2=true;
		} else if (e.equals(ArmorTag.LEGGINS)) {
			Lorelist.add("§7"+a.getStack().getItemMeta().getDisplayName() + " x 1");
			a3=a.getStack();
			A3=true;
		} else if (e.equals(ArmorTag.BOOTS)) {
			Lorelist.add("§7"+a.getStack().getItemMeta().getDisplayName() + " x 1");
			a4=a.getStack();
			A4=true;
		}
	}
	
	public List<String> getlore() {
		return Lorelist;
	}
	
	public void addItem(Item i) {
		ItemStack item = i.getStack();
		ItemList.add(item);
		Lorelist.add("§7"+item.getItemMeta().getDisplayName() + " x " + item.getAmount());
	}
	
	public void addItemStack(ItemStack a) {
		ItemList.add(a);
		Lorelist.add("§7"+a.getItemMeta().getDisplayName() + " x " + a.getAmount());
	}
	
	public void giveKit(Player p) {
		for (ItemStack j : ItemList) {
			p.getInventory().addItem(j);
		    p.updateInventory();
		}
		if (A1==true) {
			p.getInventory().setHelmet(a1);
		    p.updateInventory();
		}
		if (A2==true) {
			p.getInventory().setChestplate(a2);
		    p.updateInventory();
		}
		if (A3==true) {
			p.getInventory().setLeggings(a3);
		    p.updateInventory();
		}
		if (A4==true) {
			p.getInventory().setBoots(a4);
		    p.updateInventory();
		}
	}
}
