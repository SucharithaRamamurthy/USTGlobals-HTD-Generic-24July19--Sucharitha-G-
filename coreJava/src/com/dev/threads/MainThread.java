package com.dev.threads;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("Main thread started...");
		Thread2 t2 = new Thread2();
		t2.setName("T2 Thread");
		t2.setPriority(4);
		
		new Thread2().start();
		Thread t3 = new Thread();
		Thread t = new Thread(t3);
		t3.setPriority(5);
		
		Thread.currentThread().setName("Main Thread");
//		T3 t3 = new T3();
//		Thread t = new Thread(t3);
//	     t.start();		
     	new Thread(new Thread3()).start();
		
		for ( int i=1;i<= 10;i++)
		{
			System.out.println("i = "+i);
		}
		System.out.println("Thread Name2 : "+t2.getName());
		System.out.println("Thread Name1 : "+Thread.currentThread().getName());
		System.out.println("Thread2 id : "+t2.getId());
		System.out.println("Thread3 id : "+t.getId());
		System.out.println("Main Thread id : "+Thread.currentThread().getId());
		System.out.println("Priority of Thread2 : "+t2.getPriority());
		System.out.println("Priority of Thread3 : "+t3.getPriority());
		System.out.println("Main thread terminated...");

	}

}
