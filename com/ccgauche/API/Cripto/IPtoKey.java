package com.ccgauche.API.Cripto;

public class IPtoKey extends Key{
	
	public IPtoKey(String ip) {
		ip=ip.replace("/", "").replace(" ", "");
		String[] a = ip.split(".");
		int i = a.length-1;
		int l=0;
		while (i>0) {
			l=l+Integer.parseInt(a[i]);
			i--;
		}
		key=l;
	}
}
