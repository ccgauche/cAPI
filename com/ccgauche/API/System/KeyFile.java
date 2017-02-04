package com.ccgauche.API.System;

import java.io.IOException;
import java.util.Random;

import com.ccgauche.API.Cripto.Key;
import com.ccgauche.API.Cripto.KeyGenerator;
import com.ccgauche.API.File.Fichier;

public class KeyFile {
	
	public static Key getKeyFile(String s) throws IOException {
		Fichier f = new Fichier(s);
		String fichier="";
		for(String ligne : f.readAllLines()) {
			fichier=fichier+ligne;
		}
		fichier.replace("a", "0").replace("G", "1").replace("c", "2").replace("q", "3").replace("R", "4")
		.replace("s", "5").replace("P", "6").replace("n", "7").replace("l", "8").replace("M", "9");
		String[] b = fichier.split("k");
		int l = Integer.parseInt(b[0]) / Integer.parseInt(b[1]);
		return new KeyGenerator(l);
	}
	
	public static void saveKeyFile(String s,String path) throws IOException {
		Fichier f = new Fichier(path);
		Random r = new Random();
		int r1 = r.nextInt(25);
		long l = Integer.parseInt(s) * r1;
		s=l+"k"+r1;
		s.replace("0", "a").replace("1", "G").replace("2", "c").replace("3", "q").replace("4", "R")
		.replace("5", "s").replace("6", "P").replace("7", "n").replace("8", "l").replace("9", "M");
		if (!f.exists()) {
			f.createFile();
		} else {
			f.delette();
			f.createFile();
		}
		f.WriteFile("s");
		
	}
}
