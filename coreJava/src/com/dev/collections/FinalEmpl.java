package com.dev.collections;

public class FinalEmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setName("pavani");
		e.setId(556);
		e.setEmail("pavani@gmail.com");
		e.setPassword("jbncjmn");
		
		Employee e1 = new Employee();
		e1.setName("yagna");
		e1.setId(563);
		e1.setEmail("yagna@gmail.com");
		e1.setPassword("jbncjmn");
		
		Employee e2 = new Employee();
		e2.setName("chandu");
		e2.setId(458);
		e2.setEmail("chandu@gmail.com");
		e2.setPassword("jbjkkl';okcjmn");
		
		
		
		EmplImplements ei = new EmplImplements();
		boolean b = ei.putEmployee(e);
		boolean b1 = ei.putEmployee(e1);
		boolean b2 = ei.putEmployee(e2);
		System.out.println(b+" "+ b1+" "+b2);
		boolean b3 = ei.removeEmployee(e2);
		System.out.println(b3);
		ei.displayEmployee();

	}

}
