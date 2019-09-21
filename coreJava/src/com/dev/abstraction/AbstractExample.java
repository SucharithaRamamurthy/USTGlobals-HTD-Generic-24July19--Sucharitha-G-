package com.dev.abstraction;

public abstract class AbstractExample {
	abstract void display(); //abstract method
	abstract void print(); //abstract method
	
	
	public AbstractExample () {
		System.out.println("Constructor method of abstract class");
	}  //constructor

	public void show() {
		System.out.println("Concrete method of abstract class");
	} //concreat method

	
}
