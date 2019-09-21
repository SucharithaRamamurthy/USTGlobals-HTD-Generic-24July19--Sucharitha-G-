package com.dev.encapsulation;

public class DogData {


	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();

		d1.setAge(1);
		d1.setBread("Dober man");
		d1.setColor("black");
		d1.setName("simu");

		d2.setAge(3);
		d2.setBread("German Shephed");
		d2.setColor("brown");
		d2.setName("shiro");

		d3.setAge(1);
		d3.setBread("Pug");
		d3.setColor("Black & White");
		d3.setName("Browny");
		Dog [] d = {d1,d2,d3};


		for ( int i = 0;i<=d.length;i++ )
		{
					System.out.println("Age: "+d[i].getAge());
					System.out.println("Bread: "+d[i].getBread());
					System.out.println("Color: "+d[i].getColor());
					System.out.println("Name: "+d[i].getName());

//			System.out.println(d[i]);
		}

	}


}
