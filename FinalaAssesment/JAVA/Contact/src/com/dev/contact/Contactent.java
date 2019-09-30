package com.dev.contact;
import java.util.Scanner;

public class Contactent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner("System.in");
		
		
		System.out.println("press 1 to show contacts");
		System.out.println("press 2 to for search contacts");
		System.out.println("press 3 to for operAate on contacts");
		int enterValue = sc.nextInt();

		enterValueProcess(enterValue);

	}
	
	static public void enterValueProcess(int value) {
		
		if(value==1) {
			ContactMeth.contacts();
		}
		else if(value==2) {
                       ContactMeth.search();

			
		}
		else {
                       ContactMeth.operate();
			
		}
	}

}
