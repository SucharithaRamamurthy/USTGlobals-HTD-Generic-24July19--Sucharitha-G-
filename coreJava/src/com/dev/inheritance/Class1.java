package com.dev.inheritance;

public class Class1 {
	static Class1 c1 = new Class1();
	String operation ="add";

	public static void main(String[] args) {
		c1.oper();

	}
	public void oper()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println("c = "+c + " "+" is "+c1.operation);
	}
}
