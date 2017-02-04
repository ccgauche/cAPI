package com.ccgauche.API.Cripto;

public class UpKey extends Key{
	
	public UpKey(Key k) {
		double i = k.key*1.25+k.key/10;
		int l = (int)i;
		this.key=l;
	}
}
