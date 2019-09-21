package com.dev.inheritance;

public class GrandFather {
	static GrandFather g = new GrandFather();
	String lastName = "stark";

	public static void main(String[] args) {
		g.printName();


	}
	public void printName() {
		String Name = "Torrhen";
		System.out.println(Name+ " "+ g.lastName );
	}

}
