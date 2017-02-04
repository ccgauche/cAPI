package com.ccgauche.API.item;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Menu {
	
	private Inventory inv;
	private String name;
	private int rows;
	
	public Menu(String Name,int Rows) {
		name=Name;
		rows=Rows;
		inv = Bukkit.createInventory(null, rows*9, name);
	}
	
	public String getName() {
		return name;
	}
	
	public int getRows() {
		return rows;
	}
	
	public void addVerticallineItem(Item i,int lineBase) {
		int slot = lineBase;
		int limit = getRows()*9;
		while (slot<limit) {
			addItem(i, slot);
			slot=slot+9;
		}	
	}
	
	public void addLineItem(Item i,int Row) {
		if (Row>rows) {
			System.out.println("Error Rows greater than rows menu contains");
		} else {
			int slot = (Row-1)*9;
			int number1=0;
			while (number1<9) {
				addItem(i, slot);
				slot++;
				number1++;
			}
		}
	}
	
	public void addItem(ItemStack i,int Slot) {
		inv.setItem(Slot, i); 
	}
	
	public void addItem(Item i,int Slot) {
		inv.setItem(Slot, i.getStack()); 
	}
	
	public void addBMineItem(Material m,int slot,String Mine) {
		addItem(new Item(m,new ItemName("§c§l"+Mine, "§c§lBloquée")), slot);
	}
	
	public void addNMineItem(Material m,int slot,String Mine) {
		addItem(new Item(m,new ItemName("§a§l"+Mine, "§a§lDébloquée")), slot);
	}
		
	public void displayMenu(Player p) {
		p.openInventory(inv);
	}
	
	public void closeMenu(Player p) {
		p.closeInventory();
	}
	
	public void resetInventory() {
		inv = null;
		name = null;
		rows = 0;
	}
}

