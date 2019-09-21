package com.dev.encapsulation;

public class PetsData {
	
	public static void main(String args[]) {
		
		Pets p1 = new Pets();
		Pets p2 = new Pets();
		Pets p3 = new Pets();
		Pets p4 = new Pets();
		
		p1.setPetname("Cat");
		p1.setName("tom");
		p1.setColor("White");
		p1.setAge(1);
		
		
		p2.setPetname("Dog");
		p2.setName("Browny");
		p2.setColor("Brown");
		p2.setAge(2);
		
		p3.setPetname("Rabbit");
		p3.setName("seemu");
		p3.setColor("White");
		p3.setAge(1);
		
		p4.setPetname("Parrot");
		p4.setName("susi");
		p4.setColor("Green");
		p4.setAge(1);
		
	    Pets[] p = {p1,p2,p3,p4};
		
		for(int i=0; i<=p.length;i++)
		{
			System.out.println("Pet Type: "+p[i].getPetname());
			System.out.println("Name: "+p[i].getName());
			System.out.println("Color: "+p[i].getColor());
			System.out.println("Age: "+p[i].getAge());
			System.out.println("************************");
		}
		
		
		
		
		
		
		
	
	
	
	}

}
8 