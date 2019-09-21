package com.dev.collections;
import java.util.HashSet;
import com.dev.encapsulation.Dog;

public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Dog> hs = new HashSet<Dog>();
		Dog d = new Dog();
		d.setAge(1);
		d.setBread("D M");
		d.setName("seemu");
		d.setColor("white");

		Dog d1 = new Dog();
		d1.setAge(2);
		d1.setBread("Dalmation");
		d1.setName("jule");
		d1.setColor("black");

		Dog d2 = new Dog();
		d2.setAge(3);
		d2.setBread("street dog");
		d2.setName("browny");
		d2.setColor("brown");



		boolean b = hs.add(d);
		boolean b1 = hs.add(d1);
		boolean b2 = hs.add(d2);


		System.out.println("output of add() : "+b+" "+b1+" "+b2);
	
		for (Dog dog : hs)  //for each loop
		{
			System.out.println(dog);
		}
//		System.out.println(hs);
//		boolean b3 = hs.remove(d);
//		System.out.println("output of remove() : "+b3);
//		System.out.println(hs);
//
    	System.out.println("output of contines : "+hs.contains(d));
		System.out.println("output of contines : "+hs.size());
		hs.clear();
		System.out.println("output of contines : "+hs.size());


	}

}
