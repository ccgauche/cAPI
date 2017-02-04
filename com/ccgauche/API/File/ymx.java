package com.ccgauche.API.File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public class ymx {
	
	private File f;
	private ArrayList<ymxData> v = new ArrayList<ymxData>();
	
	public ymx(File f) {
		this.f=f;
	}
	
	public ymx(String f) throws IOException {
		this.f=new File(f);
		if (!this.f.exists()) {
			this.f.createNewFile();
		}
	}
	
	public ymx(Path f) throws IOException {
		this.f=f.toFile();
		if (!this.f.exists()) {
			this.f.createNewFile();
		}
	}
	
	public File getFile() {
		return f;
	}
	
	public Path getPath() {
		return f.toPath();
	}
	
	public String getFileString() {
		return f+"";
	}
	
	public void load() throws IOException {
		Fichier f=new Fichier(this.f+"");
		for (String l : f.readAllLines()) {
			String[] g = l.split(":");
			if (g.length==2) {
				v.add(new ymxData(g[0],g[1]));
			}
		}
	}
	
	public void save() throws IOException {
		Fichier f=new Fichier(this.f+"");
		if (this.f.exists()) {
			this.f.delete();
			this.f.createNewFile();
		} else {
			this.f.createNewFile();
		}
		for (ymxData d : v) {
			f.WriteFile(d.getValue()+d.getContains());
		}
	}
	
	public void changeValue(String Key,String newValue) {
		for (ymxData d : v) {
			if (d.getValue().equals(Key)) {
				d.setValue(newValue);
			}
		}
	}
	
	public boolean containsValue(String Key) {
		for (ymxData d : v) {
			if (d.getValue().equals(Key)) {
				return true;
			}
		}
		return false;
	}
	
	public void addValue(String Key,String Value) {
		v.add(new ymxData(Key,Value));
	}
	
	public void setValue(String Key,String value) {
		if (containsValue(Key)) {
			changeValue(Key, value);
		} else {
			v.add(new ymxData(Key,value));
		}
	}
	
	public String getValue(String Key) {
		for (ymxData d : v) {
			if (d.getValue().equals(Key)) {
				return d.getContains();
			}
		}
		return "Error : not found value : "+Key;
	}
	
	public String getValue(String Key,String defaultValue) {
		for (ymxData d : v) {
			if (d.getValue().equals(Key)) {
				return d.getContains();
			}
		}
		v.add(new ymxData(Key,defaultValue));
		return defaultValue;
	}
	
	public void removeValue(String Key) {
		for (ymxData d : v) {
			if (d.getValue().equals(Key)) {
				v.remove(d);
			}
		}
	}
}
