package com.ccgauche.API;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import com.ccgauche.API.menu.CraftMenu;

public class API extends JavaPlugin implements Listener{
	
	public static ArrayList<CraftMenu> menus = new ArrayList<CraftMenu>();

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		Bukkit.getPluginManager().registerEvents((Listener)this, (Plugin)this);
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		for (CraftMenu m : menus) {
			if (e.getInventory().getName().equals(m.menu().getName())) {
				m.onClick(e);
			}
		}
	}
}
