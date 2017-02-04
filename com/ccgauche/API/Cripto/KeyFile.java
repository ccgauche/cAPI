package com.ccgauche.API.Cripto;

import java.io.IOException;

import com.ccgauche.API.File.Fichier;

public class KeyFile {
	
	public static void saveKey(Key k,String path) throws IOException {
		Fichier f = new Fichier(path);
		if (!f.exists()) {
			f.createFile();
		} else {
			f.delette();
			f.WriteFile("");
		}
	}
	
	
}
