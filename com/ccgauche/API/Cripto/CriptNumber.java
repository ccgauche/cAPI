package com.ccgauche.API.Cripto;

public class CriptNumber {
	
	public static int criptInt(Key k,int i) throws Exception{
		return i*k.key+k.key;
	}
	
	public static int uncriptInt(Key k,int i) throws Exception{
		return (i-k.key)/k.key;
	}
	
	public static long criptInt(Key k,long i) throws Exception{
		return i*k.key+k.key;
	}
	
	public static long uncriptInt(Key k,long i) throws Exception{
		return (i-k.key)/k.key;
	}
}
