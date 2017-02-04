package com.ccgauche.API.File;

public class MetaValue {
	
	private String name;
	private String arg;
	private String Container;
	
	public MetaValue(String name,String arg,String Container) {
		this.Container=Container;
		this.name=name;
		this.arg=arg;
	}
	
	public String getContainer() {
		return Container;
	}

	public void setContainer(String container) {
		Container = container;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArg() {
		return arg;
	}

	public void setArg(String arg) {
		this.arg = arg;
	}
}
