package com.ccgauche.API.nmsHelper;

import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;

public class ActionBar {
	
	private String Message;
	
	public ActionBar(String msg) {Message=msg;}
	
	public void sendActionBar(Player p) {
		IChatBaseComponent cbc = ChatSerializer.a("{\"text\": \"" + Message + "\"}");
        PacketPlayOutChat ppoc = new PacketPlayOutChat(cbc, (byte) 2);
        ((CraftPlayer)p).getHandle().playerConnection.sendPacket(ppoc);
	}

	public String getMessage() {return Message;}
	public void setMessage(String message) {Message = message;}
}
