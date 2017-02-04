package com.ccgauche.API.Cripto;

import org.bukkit.entity.Player;

public class PlayerKey extends Key{
	
	public PlayerKey(Player p) {
		String pf = p.getUniqueId()+"";
		pf=pf.replace("-", "");
		pf=pf.replace("a", "");
		pf=pf.replace("b", "");
		pf=pf.replace("c", "");
		pf=pf.replace("d", "");
		pf=pf.replace("e", "");
		pf=pf.replace("f", "");
		pf=pf.replace("g", "");
		pf=pf.replace("h", "");
		pf=pf.replace("i", "");
		pf=pf.replace("j", "");
		pf=pf.replace("k", "");
		pf=pf.replace("l", "");
		pf=pf.replace("m", "");
		pf=pf.replace("n", "");
		pf=pf.replace("o", "");
		pf=pf.replace("p", "");
		pf=pf.replace("q", "");
		pf=pf.replace("r", "");
		pf=pf.replace("s", "");
		pf=pf.replace("t", "");
		pf=pf.replace("u", "");
		pf=pf.replace("v", "");
		pf=pf.replace("w", "");
		pf=pf.replace("x", "");
		pf=pf.replace("y", "");
		pf=pf.replace("z", "");
		String[] a = pf.split("");
		String g = "";
		if (a.length>=4) {
			g=a[0]+a[1]+a[2]+a[3];
		} else if (a.length==0) {
			g="1201";
		} else if (a.length==1) {
			g="120"+a[0];
		} else if (a.length==2) {
			g="12"+a[0]+a[1];
		} else if (a.length==3) {
			g="1"+a[0]+a[1]+a[2];
		}
		key=Integer.parseInt(g);
	}
}
