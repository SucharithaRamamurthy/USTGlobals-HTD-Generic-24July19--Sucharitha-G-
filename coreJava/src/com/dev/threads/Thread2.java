package com.dev.threads;

public class Thread2 extends Thread {
@Override
 public void run() {
	System.out.println("Thread 2 started...");
	
	for(int j=1; j<=10; j++) {
		System.out.println("j ="+j);
	}
	
	System.out.println("Thread 2 terminated...");
	 
 }
 
}
