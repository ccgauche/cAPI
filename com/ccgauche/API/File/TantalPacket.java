package com.ccgauche.API.File;

public class TantalPacket {
	
	private String Delimitor = null;
	private String TantalPath = null;
	private String ExtentionFile = null;
	private String StringSeparator = null;
	private String nativeFile = null;
	
	public TantalPacket(String Delim,String Ext,String Path ,String File) {
		Delimitor=Delim;
		TantalPath=Path;
		ExtentionFile=Ext;
		nativeFile=File;
	}
	
	public void setErrorMessage(String Error) {
		
	}
	
	public void setKeyFile(String f) {
		nativeFile=f;
	}
	
	public String getKeyFile() {
		return nativeFile;
	}
	
	public void setExtention(String Ext) {
		ExtentionFile=Ext;
	}
	
	public String getExtention() {
		return ExtentionFile;
	}
	
	public void setFolder(String Folder) {
		TantalPath=Folder;
	}
	
	public String getFolder() {
		return TantalPath;
	}
	
	public void setDelimitor(String Delim) {
		Delimitor=Delim;
	}
	
	public String getDelimitor() {
		return Delimitor;
	}
	
	public void setStringSeparator(String s) {
		StringSeparator=s;
	}
	
	public String getStringSeparator() {
		return StringSeparator;
	}
	
}
