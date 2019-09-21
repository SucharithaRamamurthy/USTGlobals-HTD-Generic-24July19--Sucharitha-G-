package com.dev.constructor;

public class ConstructorAss {
	public ConstructorAss() {
		System.out.println("constructor with no arguments");
	}
	public ConstructorAss(int i) {
		System.out.println("constructor with integer as arguments");
	}
	public ConstructorAss(float f) {
		System.out.println("constructor with float as arguments");
	}
	public ConstructorAss(double d) {
		System.out.println("constructor with double as arguments");
	}
	
	public ConstructorAss(String str) {
		System.out.println("constructor with String as arguments");
	}
	public ConstructorAss(int i, String str) {
		System.out.println("constructor with integer & string as arguments");
	}
	public ConstructorAss(String str, int i) {
		System.out.println("constructor with string and integer as arguments");
	}
	public ConstructorAss(double d, String str) {
		System.out.println("constructor with double & string as arguments");
	}
	

	public static void main(String[] args) {
		ConstructorAss cs = new ConstructorAss();
		ConstructorAss cs1 = new ConstructorAss(1);
		ConstructorAss cs2 = new ConstructorAss(3.00f);
		ConstructorAss cs6 = new ConstructorAss(3.0079658);
		ConstructorAss cs3 = new ConstructorAss("a");
		ConstructorAss cs4 = new ConstructorAss(1,"b");
		ConstructorAss cs5 = new ConstructorAss("c",1);
		ConstructorAss cs7 = new ConstructorAss(5678.789,"c");
		

	}

}
