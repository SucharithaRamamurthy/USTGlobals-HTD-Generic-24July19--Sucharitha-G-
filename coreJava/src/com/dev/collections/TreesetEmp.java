package com.dev.collections;
import java.util.TreeSet;


public class TreesetEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> ts = new TreeSet<Employee>();
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
		
		ts.add(e);
		ts.add(e1);
		ts.add(e2);
		
		System.out.println(ts);
		

	}

}
