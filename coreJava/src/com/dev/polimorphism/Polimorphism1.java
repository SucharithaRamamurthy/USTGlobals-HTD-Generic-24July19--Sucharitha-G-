package com.dev.polimorphism;
//overloading i.e compile time polimo

public class Polimorphism1 {
   static Polimorphism1 p = new Polimorphism1();
   
   public void add(int i, int j)
   {
	   int a = i+j;
	   System.out.println("addition of 2 values : a = "+ a);
   }
   public void add(int i, int j, int k)
   {
	   int a = i+j+k;
	   System.out.println("addition of 3 values : a = "+ a);
   }

   public void add(int i, float j)
   {
	   j += i;
	   System.out.println("addition of 2 values using assignment : j = "+ j);
   }

	public static void main(String[] args) {
		p.add(1,2);
		p.add(1,2.00f);
		p.add(1, 2,3);
		
	}

}
