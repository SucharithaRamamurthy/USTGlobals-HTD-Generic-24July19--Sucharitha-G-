package com.dev.abstraction;
import java.io.Serializable;
import java.rmi.Remote;

public interface Abs1 extends Cloneable,Serializable,Remote{
	
	
	static void display() {
		System.out.println("A");
	}

}

