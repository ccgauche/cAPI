package com.ccgauche.API.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.apache.commons.io.IOUtils;

public class Fichier {
	
	private String path;
	
	public Fichier(String path) {
		this.path=path;
	}
	
	public void createFile() throws IOException {
		new File(path).createNewFile();
	}
	
	public void WriteFile(String mess) throws IOException{
		PrintWriter out;
		out = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
	    out.println(mess);
	      out.close();
	}
	
	public void delette(){
		new File(path).delete();
	}
	
	public boolean exists() {
		if (new File(path).exists()) {
			return true;
		} else {
			return false;
		}
	}
	
	public ArrayList<String> readAllLines() throws IOException {
		ArrayList<String> s = new ArrayList<String>();
		BufferedReader br;
		String ligne;
		br = new BufferedReader(new FileReader(new File(path)));
		while((ligne = br.readLine()) != null){
			s.add(ligne);
		}
		br.close();
		return s;
	}
	
	public boolean fileConstainLine(String ligne) throws IOException {
		for (String ligne1 : readAllLines()) {
			if (ligne1.equals(ligne)) return true;
		}
		return false;
	}
	
	public boolean fileConstainWord(String word) throws IOException {
		for (String ligne1 : readAllLines()) {
			if (ligne1.contains(word)) return true;
		}
		return false;
	}
	
	public String getLineContains(String toShearch) throws IOException {
		for (String ligne : readAllLines()) {
			if (ligne.contains(toShearch)) return ligne;
		}
		return "not found";
	}
	
	public void replaceInFile(String ligne,String newLigne) throws IOException {
		File tmp = new File(path);
	    FileInputStream br = new FileInputStream(path);
	    String s;
		s = IOUtils.toString(br, Charset.defaultCharset());
	    s = s.replaceAll(ligne, newLigne);
	    FileOutputStream out;
		out = new FileOutputStream(tmp);
	    IOUtils.write(s, new FileOutputStream(tmp), Charset.defaultCharset());
	    br.close();
	    out.close();
	}
}
