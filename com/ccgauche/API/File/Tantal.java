package com.ccgauche.API.File;

import java.io.File;
import java.io.IOException;

public class Tantal {
	
	
	private String File;
	private String Delimitor = ":";
	private String TantalPath = "plugins/Tantal";
	private String ExtentionFile = "tnl";
	private String keyFile = null;
	
	private File f = new File(TantalPath);
	
	public Tantal(String file) {
		if (!f.exists()) {
			f.mkdir();
		}
		keyFile=file;
		File=TantalPath+"/"+file+"."+ExtentionFile;
	}
	
	public void changeFile(String File) {
		this.File=TantalPath+"/"+File+"."+ExtentionFile;
	}
	
	public TantalPacket getTantalPacket() {
		TantalPacket p = new TantalPacket(Delimitor, ExtentionFile, TantalPath ,keyFile);
		return p;
	}
	
	public void setTantalPacket(TantalPacket p) {
		Delimitor = p.getDelimitor();
		TantalPath = p.getFolder();
		ExtentionFile = p.getExtention();
		keyFile=p.getKeyFile();
		File=TantalPath+"/"+keyFile+"."+ExtentionFile;
		f = new File(TantalPath);
		if (!f.exists()) {
			f.mkdir();
		}
	}
	
	public void setValue(String name,String Value) {
		if (exists()) {
			if (ValueContains(name)) {
				changeValue(name,Value);
			} else {
				WriteFile(name+Delimitor+Value);
			}
		} else {
			createFile();
			WriteFile(name+Delimitor+Value);
		}
	}
	
	public String[] getArgValue(String name,String spilter) {
		return getValue(name).split(spilter);
	}
	
	public String getValue(String name) {
		if (exists()) {
			if (ValueContains(name)) {
				return getValues(name);
			} else {
				System.out.println("[ERREUR] Tantal ne pas la clée "+name+" dans "+File);
				return "ERREUR2";
			}
		} else {
			System.out.println("[ERREUR] Tantal ne trouve pas le fichier "+File);
			return "ERREUR1";
		}
	}
	
	public boolean ValueContains(String Value) {
		if (!exists()) {
			createFile();
			return false;
		}
		try {
			return new Fichier(File).fileConstainWord(Value+Delimitor);
		}catch(IOException e){
			e.printStackTrace();
			return false;
		}
	}
	
	private void createFile() {
		try {
			new File(File).createNewFile();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	private void WriteFile(String mess){
		try {
			new Fichier(File).WriteFile(mess);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private boolean exists() {
		File n = new File(File);
		if (n.exists()) {
			return true;
		} else {
			return false;
		}
	}
	
	private String getValues(String chemin) {
		try {
			return new Fichier(File).getLineContains(chemin+Delimitor).replace(chemin+Delimitor, "");
		}catch(IOException e){
			e.printStackTrace();
			return "not found";
		}
	}
	
	private void changeValue(String chemin,String newValue) {
		try {
		    new Fichier(File).replaceInFile(chemin+Delimitor+getValue(chemin), chemin+Delimitor+newValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}