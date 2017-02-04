package com.ccgauche.API.item;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Chest;
import org.bukkit.inventory.Inventory;

public class ChestStorage {
	
	private Random r = new Random();
	private ArrayList<MetaChest> c = new ArrayList<MetaChest>();
	
	public ChestStorage() {
		
	}

	public void addItem(Item e,int pourcentage,int slot) {
		MetaChest m = new MetaChest(e.getStack(),slot,pourcentage);
		c.add(m);
	}
	
	public void addItem(Item e,int slot) {
		MetaChest m = new MetaChest(e.getStack(),slot,100);
		c.add(m);
	}
	
	public void createChest(World w,double x,double y,double z) {
		Location l = new Location(w,x,y,z);
		l.getBlock().setType(Material.CHEST);
		Chest chest = (Chest)l.getBlock().getState();
		generate(chest.getInventory());
	}
	
	public void createChest(Location l) {
		l.getBlock().setType(Material.CHEST);
		Chest chest = (Chest)l.getBlock().getState();
		generate(chest.getInventory());
	}
	
	private void generate(Inventory e) {
		for (MetaChest m : c) {
			if (m.getP()<r.nextInt(100)) {
				e.setItem(m.getSlot(), m.getI());
			}
		}
	}
	
}
