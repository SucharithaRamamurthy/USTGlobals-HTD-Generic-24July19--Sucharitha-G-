package com.dev.contact;
import java.util.HashMap;
import java.util.Scanner;


public class ContactMeth {
	static HashMap<String, ContactIn> hm = new HashMap<String, ContactIn>();
	static Scanner sc = new Scanner(System.in);	
	public static void contacts() {
	ContactIn c1 = new ContactIn();
	c1.setName("suchi");
	c1.setPhnno(94925577);
	c1.setGroup("UST");
	
	ContactIn c2 = new ContactIn();
	c2.setName("Anku");
	c2.setPhnno(56768287);
	c2.setGroup("UST");
	
	ContactIn c3 = new ContactIn();
	c3.setName("praveen");
	c3.setPhnno(9776763);
	c3.setGroup("UST");
	
	ContactIn c4 = new ContactIn();
	c4.setName("lali");
	c4.setPhnno(8754378);
	c4.setGroup("cab");
	
	hm.put("1",c1);
	hm.put("2",c2);
	hm.put("2",c3);
	hm.put("2",c3);
	
	System.out.println(hm);
	
}
	 public static void search() {
		 
		 System.out.println("search name");
		 String search = sc.next();
		 System.out.println("press 1 to call");
		 System.out.println("press 2 to get message");
		 System.out.println("press 3 to go back");
		 int val = sc.nextInt();
		 
		 if(val==1) {
			 System.out.println("calling");
		 }
		 else if(val==2) {
			 System.out.println("HAI Message");
		 }
		 else {
			 search();
		 }
		 
	 }
	 public static void operate() {
		  System.out.println("press 1 to add contact");
		  System.out.println("press 2 to delete contact");
		  System.out.println("press 3 to edit contact");
		  int val = sc.nextInt();
		  
		  if(val ==1) {
			  
			  System.out.println("enter name phoneno and group");
			  String name = sc.next();
			  int phno = sc.nextInt();
			  String group = sc.next();
			  
		  }
		  else if(val == 2) {
			  System.out.println(" detete the contact : "+ romove());
			  
			 
		  }
		  else {
			  System.out.println("edit contact "+ put());
		  }
		  
	 }
	private static String put() {
		// TODO Auto-generated method stub
		
		System.out.println("edit the contact");
		System.out.println("enter the key");
		System.out.println("enter the value");
		String key = sc.next();
		String value = sc.next();
		
		hm.put(key, value);
		
		return null;
	}
	private static String romove() {
		// TODO Auto-generated method stub
		System.out.println(" enter the contact to be removed");
		hm.remove(hm);
		return null;
	}
}
