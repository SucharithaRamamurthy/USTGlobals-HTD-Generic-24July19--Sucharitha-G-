package com.dev.threads;

public class Thread3 implements Runnable {

	
	public static void main(String[] args) {
		

	}

	@Override
	public void run() {
		System.out.println("Thread 3 started");
		for(int k=0;k<=5;k++)
		{
			System.out.println("k ="+k);
		}
		System.out.println("Thread 3 terminated");
	}

}
