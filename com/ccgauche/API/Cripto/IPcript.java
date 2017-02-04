package com.ccgauche.API.Cripto;

public class IPcript {
	
	public static String cript(Key k,String ip) {
		ip=ip.replace(".", "xPmB").replace("/", "").replace(" ", "");
		String[] a = ip.split("xPmB");
		int i = a.length-1;
		String l="nnL";
		while (i>=0) {
			l=l+"."+(Integer.parseInt(a[i])*k.key+(k.key));
			i--;
		}
		l=l.replace("nnL.","");
		return l;
	}
	
	public static String uncript(Key k,String cripted) {
		cripted=cripted.replace(".", "xPmB").replace("/", "").replace(" ", "");
		String[] a = cripted.split("xPmB");
		int i = a.length-1;
		String l="nnL";
		while (i>=0) {
			l=l+"."+((Integer.parseInt(a[i])-(k.key))/k.key);
			i--;
		}
		l=l.replace("nnL.","");
		return l;
	}
}
