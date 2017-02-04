package com.ccgauche.API.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.ArrayList;

public class SDtable {
	
	private String path;
	private ArrayList<String> lignes = new ArrayList<String>();
	private ArrayList<MetaValue> value = new ArrayList<MetaValue>();
	
	public SDtable(String path) {this.path=path;open();}
	public SDtable(File file) {path=file.getPath();open();}
	public SDtable(Path path) {this.path=path.toFile().getPath();open();}
	
	public void open() {
		File f = new File(path);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		BufferedReader br; String ligne;
		try {
			br = new BufferedReader(new FileReader(new File(path)));
			while((ligne = br.readLine()) != null){
				if (ligne.contains("SD.")) {
					lignes.add(ligne);
				}
			}
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		analyser();
	}
	
	private void analyser() {
		for (String s : lignes) {
			String[] a = s.split(":");
			String[] b = a[1].split("-");
			MetaValue m = new MetaValue(a[0].replace("SD.", ""),b[1],b[0]);
			value.add(m);
		}
	}
	
	public void save() {
		File f = new File(path);
		if (f.exists()) {
			f.delete();
		}
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File(path)));
			PrintWriter out;
			writer.write(""); writer.close();
			out = new PrintWriter(new BufferedWriter(new FileWriter(f, true)));
			for (MetaValue ligne : value) {
			    out.println("SD."+ligne.getName()+":"+ligne.getContainer()+"-"+ligne.getArg());
			}
			out.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public String getValue(String name,String arg) {
		for (MetaValue m : value) {
			if (m.getName().equals(name)) {
				if (m.getArg().equals(arg)) {
					return m.getContainer();
				}
			}
		}
		return "not found";
	}
	
	public void setValue(String name,String arg,String contain) {
		for (MetaValue m : value) {
			if (m.getName().equals(name)) {
				if (m.getArg().equals(arg)) {
					m.setContainer(contain);
					return;
				}
			}
		}
		MetaValue m = new MetaValue(name,arg,contain);
		value.add(m);
	}
	
	public String getValue(String name) {
		for (MetaValue m : value) {
			if (m.getName().equals(name)) {
				if (m.getArg().equals("default")) {
					return m.getContainer();
				}
			}
		}
		return "not found";
	}
	
	public void setValue(String name,String contain) {
		for (MetaValue m : value) {
			if (m.getName().equals(name)) {
				if (m.getArg().equals("default")) {
					m.setContainer(contain);
					return;
				}
			}
		}
		MetaValue m = new MetaValue(name,"default",contain);
		value.add(m);
	}
}
