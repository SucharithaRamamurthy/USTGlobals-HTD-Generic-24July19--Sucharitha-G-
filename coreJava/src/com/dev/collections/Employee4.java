package com.dev.collections;

public class Employee4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setName("hema");
		e.setId(455);
		e.setEmail("hema@gmail.com");
		e.setPassword("jkjc");
		
		Employee e1 = new Employee();
		e1.setName("uday");
		e1.setId(788);
		e1.setEmail("uday@gmail.com");
		e1.setPassword("hjknjdkn");
		
		
	EmployeeDetailes ed = new EmployeeDetailes();
	

	boolean b=	ed.addEmployee(e);
	boolean b1 = ed.addEmployee(e1);
	boolean b2 = ed.removeEmploye(e1);
	System.out.println(b2);
	System.out.println(b);
	ed.updateEmployee();

}

}
