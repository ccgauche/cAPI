package com.ccgauche.API.File;

public  class Tantaler {

	public static Tantal TantalJson(Tantal t) {
		TantalPacket tp = t.getTantalPacket();
		tp.setDelimitor("|:!:|");
		t.setTantalPacket(tp);
		return t;
	}
	
	public static Tantal changeFolder(Tantal t,String folder,String ext) {
		TantalPacket tp = t.getTantalPacket();
		tp.setExtention(ext);
		tp.setFolder(folder);
		t.setTantalPacket(tp);
		return t;
	}
	
	public static void TantalDefault(String key,String def,Tantal t) {
		if (!t.ValueContains(key)) {
			t.setValue(key, def);
		}
	}
	
}
