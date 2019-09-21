package com.dev.collections;

import java.util.HashMap;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Employee> hm = new HashMap<String, Employee>();
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
		
		e1.setName("raji");
		hm.put("1", e);
		hm.put("2", e1);
		hm.put("3", e2);
		
		System.out.println(hm);
		
		Employee f = hm.remove("2");
		System.out.println(f);
		System.out.println(hm);
		
		System.out.println("output of containsKey() : "+ hm.containsKey("3"));
		System.out.println("output of containsValue() : "+ hm.containsValue(e));
		System.out.println("output of size() : "+ hm.size());
		}

}
