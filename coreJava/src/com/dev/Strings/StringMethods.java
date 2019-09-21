package com.dev.Strings;

public class StringMethods {

	public static void main(String[] args) {
	String str = "Some String";
	String str1 = "SOME STRING";
	
	int length = str.length();
	System.out.println(length);
	
	
	char[] ch = str.toCharArray();
	System.out.println("Output of toCharArray : "+ch[10]);
	
	
	char c=str.charAt(5);
	System.out.println("Output of charAt method :"+c);
	
	
	boolean b = str.equals(str1);
	System.out.println("Output of equals method : " +b);
	
	boolean b1 = str.equalsIgnoreCase(str1);
	System.out.println("Output of equalIgnoreCase : "+b1);
	
	
	boolean v = str.contains("some");
	System.out.println("contains method output : "+v);
	
	
	String g = str.replace('S', 'V');
	System.out.println("Output of Replace('S','V') :"+g);
	
	
	int f = str.indexOf('o');
	System.out.println("Output of indexOf('o') : "+ f);
	
	
	String s = str.toUpperCase();
	System.out.println("Output of toUpperCase : "+ s);
	
	String l= str.toLowerCase();
	System.out.println("Output of toLowerCase : "+ l);
	
	
	String a= str.substring(3);
	System.out.println("Output of subString(): " +a);
	
	
	
	String q= str.substring(3,8);
	System.out.println("Output of subString(int,int): " +q);
	
	
	
	

	}
    
} 
