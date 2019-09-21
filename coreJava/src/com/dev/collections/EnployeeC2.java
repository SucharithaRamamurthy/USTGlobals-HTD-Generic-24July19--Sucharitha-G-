package com.dev.collections;
import java.util.HashSet;


public class EnployeeC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> hs = new HashSet<Employee>();
		Employee e = new Employee();
		e.setName("suchi");
		e.setId(55);
		e.setEmail("sucharitha1201@gmail.com");
		e.setPassword("hello");
		
		Employee e1 = new Employee();
		e1.setName("Raj");
		e1.setId(01);
		e1.setEmail("raju@gmail.com");
		e1.setPassword("hkjncmnmx");
		
		Employee e2 = new Employee();
		e2.setName("hema");
		e2.setId(505);
		e2.setEmail("hema@gmail.com");
		e2.setPassword("hemu");
		
		
		boolean b = hs.add(e);
		boolean b1 = hs.add(e1);
		boolean b2 = hs.add(e2);
		System.out.println("output of add() : "+e+" "+e1+" "+e2);
		System.out.println(hs);

		e1.setName("Raju");
		
		
		System.out.println("output of add() : "+e+" "+e1+" "+e2);
		System.out.println(hs);
		
		boolean b3 = hs.remove(e1);
		System.out.println("output of remove() : "+e1);
		System.out.println(hs);
		
		
	System.out.println("size of the employee detiles : "+hs.size());
	
	
	hs.clear();
	System.out.println("after clearing the size is : "+hs.size());

		
		



	}

}
