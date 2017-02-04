package com.ccgauche.API.menu;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.ccgauche.API.API;
import com.ccgauche.API.item.Menu;

public abstract class CraftMenu {
	
	private Menu Menu;
	
	public void newMenu(String name , int rows) {
		Menu=new Menu(name, rows);
	}
	
	public void ActionListener() {
		API.menus.add(this);
	}
	
	public Menu getMenu() {
		return Menu;
	}
	
	public Menu menu() {
		return Menu;
	}
	
	public void displayMenu(Player p) {
		Menu.displayMenu(p);
	}
	
	public abstract void onClick(InventoryClickEvent e);
}
