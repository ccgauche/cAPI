package com.ccgauche.API.Cripto;

import java.util.Random;

public class KeyGenerator extends Key{
	
	public KeyGenerator() {
		Random r = new Random();
		key=r.nextInt(999)*r.nextInt(999);
	}
	
	public int getKey() {
		return key;
	}
	
	public KeyGenerator(SecurityLevel s) {
		int i=993384555;
		Random r = new Random();
		if (s.equals(SecurityLevel.VERY_LOW)) {
			i=r.nextInt(9)*r.nextInt(9);
		} else if (s.equals(SecurityLevel.LOW)) {
			i=r.nextInt(99)*r.nextInt(99);
		} else if (s.equals(SecurityLevel.MEDIUM)) {
			i=r.nextInt(999)*r.nextInt(999);
		} else if (s.equals(SecurityLevel.HIGHT)) {
			while (i>4533840) {
				i=r.nextInt(9999)*r.nextInt(9999);
			}
		} else if (s.equals(SecurityLevel.MEDIUM_DOWN)) {
			i=r.nextInt(450)*r.nextInt(450);
		} else if (s.equals(SecurityLevel.MEDIUM_UP)) {
			while (i>4533840) {
				i=r.nextInt(4500)*r.nextInt(4500);
			}
		} else {
			i=r.nextInt(999)*r.nextInt(999);
		}
		key=i;
		
	}
	
	public KeyGenerator(int l) {
		key=l;
	}
}
