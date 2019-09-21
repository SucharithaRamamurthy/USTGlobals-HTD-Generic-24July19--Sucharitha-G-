package com.dev.inheritance;

public class Son extends Father {
	static Son s = new Son();
	String name = "Robb";

	public static void main(String[] args) {
		s.printName();

	}
	@Override
	public void printName() {
		System.out.println(s.name+ " " +super.name+ " " + s.lastName);
		
	}

}
