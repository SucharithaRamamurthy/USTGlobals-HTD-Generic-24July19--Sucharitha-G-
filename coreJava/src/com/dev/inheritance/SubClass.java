package com.dev.inheritance;

public class SubClass extends SuperClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sub = new SubClass();
		SubClass sub1 = new SubClass(10);
		SubClass sub2 = new SubClass(10.00f);
		SubClass sub3 = new SubClass(349.00);
		SubClass sub4 = new SubClass("suchi");
		SubClass sub5 = new SubClass("suchi" , 233);

	}
	public SubClass() {
		super(11);
		System.out.println("const with Zero arguments of subclass");
	}
	public SubClass(int i) {
		System.out.println("const with int as argument in subclass");
	}

	public SubClass(String str) {
		super("suchi");
		System.out.println("const with String as argument in subclass");
	}

	public SubClass(String str,int i) {
		System.out.println("const with string & int as argument in subclass");
	}

	public SubClass(double d) {
		System.out.println("const with double as argument in subclass");
	}

	public SubClass(float f) {
		System.out.println("const with float as argument in subclass");
	}

	public SubClass(double d ,float f) {
		System.out.println("const with double & float as argument in subclass");
	}



}
