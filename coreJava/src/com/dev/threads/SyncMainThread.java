package com.dev.threads;

public class SyncMainThread {

	public static void main(String[] args) {
		System.out.println("SyncMain Thread Started...");
		
		Printer p = new Printer();
		Printer1 p1 =new Printer1();
		Thread t4 = new Thread4(p);
		t4.start();
		//t4.join();
	
		new Thread5(p).start(); 
		
		
		
		
		System.out.println("SyncMain Thread terminated...");
	}

}
