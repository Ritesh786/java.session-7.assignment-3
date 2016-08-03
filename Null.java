package com.Ritesh.tools;

public class Null {
	public static void main(String[] args) {
		String srg=null;
		NumberForm fm=null;
		
		try{
			fm.hashCode();
		System.out.println(srg.toString()); }
		catch(NullPointerException nme){
			System.out.println("Null pointer exception handled");
		}

	}

}
