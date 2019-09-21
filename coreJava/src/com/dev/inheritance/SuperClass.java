package com.dev.inheritance;

public class SuperClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	SuperClass s = new SuperClass();
		
	}
	public SuperClass() {
		System.out.println("const with Zero arguments of superclass");
	}
	public SuperClass(int i) {
		System.out.println("const with int as argument in superclass");
	}

	public SuperClass(String str) {
		System.out.println("const with String as argument in superclass");
	}

	public SuperClass(String str,int i) {
		System.out.println("const with string & int as argument in superclass");
	}

	public SuperClass(double d) {
		System.out.println("const with double as argument in superclass");
	}

	public SuperClass(float f) {
		System.out.println("const with float as argument in superclass");
	}

	public SuperClass(double d ,float f) {
		System.out.println("const with double & float as argument in superclass");
	}


}
