package com.dev.collections;

import java.util.ArrayList;

import com.dev.encapsulation.Dog;


public class C4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dog> arl  = new ArrayList<Dog>();
		Dog d = new Dog();
		d.setAge(13);
		d.setBread("D M");
		d.setName("seemu");
		d.setColor("white");

		Dog d1 = new Dog();
		d1.setAge(2);
		d1.setBread("Dalmation");
		d1.setName("jule");
		d1.setColor("black");

		Dog d2 = new Dog();
		d2.setAge(14);
		d2.setBread("street dog");
		d2.setName("browny");
		d2.setColor("brown");
		
		arl.add(d);
		arl.add(d1);
		arl.add(d2);
     	System.out.println(arl);
     	arl.trimToSize();
     	System.out.println("Size of array after trimToSize(): "+ arl.size());
     	


	}

}
