package com.dev.inheritance;

public class Class2 extends Class1{
	static Class2 c2 = new Class2();
	String  operation = "sub";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c2.oper();

	}
	public void oper() {
		int a=10,b=20,s;
		s=a-b;
		System.out.println(c2.operation+ " =  " + s+ c1.operation);
	}
}
