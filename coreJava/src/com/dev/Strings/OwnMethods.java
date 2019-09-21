package com.dev.Strings;

public class OwnMethods {

	public static void main(String[] args) {
		 
		String str="Hello World";
		String str1="How Are You";
		String str2="how are you";
		String str4="doing well";
	
		
		
		int length = str4.length();
		System.out.println("length of string str "+length);
		
		
		char[] ch = str.toCharArray();
		System.out.println(ch[10]);
		
		
		char c=str.charAt(4);
		System.out.println(c);
		
		boolean b = str.equals(str1);
		System.out.println(b);
		
		boolean b1 = str1.equalsIgnoreCase(str2);
		System.out.println(b1);
		


	}

}
