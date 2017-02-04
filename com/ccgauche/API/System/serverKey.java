package com.ccgauche.API.System;

import java.io.File;
import java.io.IOException;

import com.ccgauche.API.Cripto.Key;
import com.ccgauche.API.Cripto.KeyGenerator;
import com.ccgauche.API.Cripto.SecurityLevel;

public class serverKey extends Key{
	
	public serverKey() {
		if (!new File("plugins/cAPI/server.key").exists()) {
			int i = new KeyGenerator(SecurityLevel.MEDIUM_DOWN).key;
			try {
				KeyFile.saveKeyFile(i+"","plugins/cAPI/server.key");
			} catch (IOException e) {
				e.printStackTrace();
			}
			key=i;
		} else {
			try {
				key=KeyFile.getKeyFile("plugins/cAPI/server.key").key;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
