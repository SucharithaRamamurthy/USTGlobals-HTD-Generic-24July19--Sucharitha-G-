package com.dev.encapsulation;

public class StudentData {
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setRegno(769849);
		s.setName("suchi");
		s.setEmail("suchi@gamil.com");
		s.setPassword("1234");
		
			System.out.println("Regno: "+s.getRegno());
			System.out.println("Name: "+s.getName());
			System.out.println("Email: "+s.getEmail());

	}


}
