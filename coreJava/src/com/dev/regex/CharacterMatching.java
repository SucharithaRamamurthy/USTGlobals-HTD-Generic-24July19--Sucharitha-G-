package com.dev.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pat = Pattern.compile("\\w+\\@\\w+\\.\\w+");// for email id's
		Matcher mat = pat.matcher("qwerty@email.com");
		System.out.println(mat.matches());
		
		pat = Pattern.compile("\\w+\\s\\w+\\s\\w+");//for first,middle,and last name;
		mat = pat.matcher("A B C");
		System.out.println(mat.matches());
		
		pat = Pattern.compile("[A-Za-z]{1,25}\\s[A-Za-z]{1,25}"); //for names with limited;
		mat = pat.matcher("ravi kona");
		System.out.println(mat.matches());

		
		pat = Pattern.compile("\\w+\\W+\\w+"); //for alphanumeric passwords;
		mat = pat.matcher("Ijkhj#2hc");
		System.out.println(mat.matches());



	}

}
