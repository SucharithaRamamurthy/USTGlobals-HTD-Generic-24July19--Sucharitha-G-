package com.dev.inheritance;

public class Daughter extends Father {
	static Daughter d = new Daughter();
	String name = "sansa";
	

	public static void main(String[] args) {
		d.printName();

	}
	@Override
	public void printName(){
		
		System.out.println(name+ " " + f.name  + " " + d.lastName);
		
	}

}
