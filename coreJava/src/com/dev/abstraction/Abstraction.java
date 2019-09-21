package com.dev.abstraction;

public class Abstraction extends AbstractExample {
	public Abstraction() {
		
		System.out.println("const of abstraction class");
	}

	@Override
	void display() {
		System.out.println("This is the implemented abstract method");
		
	}


	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Abstraction a = new Abstraction();
		a.display();
		a.show(); //show method is not overriden in this class
		

	}



}
