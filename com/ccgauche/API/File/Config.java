package com.ccgauche.API.File;

import java.io.File;
import java.io.IOException;

public class Config {
	
	private String file;
	
	public Config(String File) {
		file=File;
	}
	
	public boolean ValueContains(String Value) {
		try {
			return new Fichier(file).fileConstainWord(Value);
		}catch(IOException e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean createFile() {
		try {
			new File(file).createNewFile();
			return true;
		} catch (IOException e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean WriteFile(String mess){
		try {
			new Fichier(file).WriteFile(mess);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void changeFile(String File) {
		file=File;
	}
	
	public File getFile() {
		File n = new File(file);
		return n;
	}
	
	public boolean exists() {
		File n = new File(file);
		if (n.exists()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getValue(String chemin) {
		String Value = "27";
		try {
			Value = new Fichier(file).getLineContains(chemin+":");
			Value = Value.replace(chemin+":", "");
		}catch(IOException e){
			e.printStackTrace();
		}
		return Value;
	}
	
	public boolean changeValue(String chemin,String newValue) {
		try {
			new Fichier(file).replaceInFile(chemin+":"+getValue(chemin), chemin+":"+newValue);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean addValue(String chemin,long value) {
		try {
			Long i = Long.parseLong(getValue(chemin)) + value;
		    new Fichier(file).replaceInFile(chemin+":"+getValue(chemin), chemin+":"+i);
		    return true;
		} catch(IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean removeValue(String chemin,long value) {
		try {
			if (!(Long.parseLong(getValue(chemin))<value)) {
				return false;
			} else {
				Long i = Long.parseLong(getValue(chemin)) - value;
			    new Fichier(file).replaceInFile(chemin+":"+getValue(chemin), chemin+":"+i);
			    return true;
			}
		} catch(IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
