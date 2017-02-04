package com.ccgauche.API.File;

public class ymxData {
	
	private String v;
	private String c;
	
	public ymxData(String v,String c) {
		setValue(v);
		setContains(c);
	}

	public String getValue() {
		return v;
	}

	public void setValue(String v) {
		this.v = v;
	}

	public String getContains() {
		return c;
	}

	public void setContains(String c) {
		this.c = c;
	}
}
