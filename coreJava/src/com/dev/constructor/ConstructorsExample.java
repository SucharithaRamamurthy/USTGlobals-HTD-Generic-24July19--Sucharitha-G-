package com.dev.constructor;

public class ConstructorsExample {
	public ConstructorsExample(int i){
		
		System.out.println("the constructor is working ");
	}
	public ConstructorsExample() {
		System.out.println("no argument constructor");
	}
	public ConstructorsExample(String s) {
		System.out.println("constuctor with string");
	}
	public ConstructorsExample(String str ,int j) {
		System.out.println("constuctor with string & integer");
	}


	public static void main(String[] args) {
		ConstructorsExample ce = new ConstructorsExample(1);
		ConstructorsExample ce1 = new ConstructorsExample("a");
		ConstructorsExample ce2 = new ConstructorsExample();
		ConstructorsExample ce3 = new ConstructorsExample("c",4);





	}

}
