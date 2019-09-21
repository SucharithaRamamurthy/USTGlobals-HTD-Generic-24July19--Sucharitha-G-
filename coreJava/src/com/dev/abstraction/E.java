package com.dev.abstraction;

public class E implements Abs,Abs1 {

	public static void main(String[] args) {
	  E e = new E();
	  e.display();
	  Abs.print();
	  Abs1.display();

	}

	@Override
	public void display() {
		System.out.println("overriden method in class");
		
	}

}
