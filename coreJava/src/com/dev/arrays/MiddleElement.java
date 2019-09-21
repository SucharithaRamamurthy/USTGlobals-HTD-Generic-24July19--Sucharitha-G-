package com.dev.arrays;

public class MiddleElement {

	public static void main(String[] args) {
		int[] a= {1,2,3,1,1,0,10};
		if(a.length%2==0)
		{
			System.out.println(a[a.length/2]);
			
			System.out.println(a[(a.length/2)-1]);
		}
		else {
			System.out.println(a[(a.length/2)]);
		}
		System.out.println("last 3rd number is"+a[a.length-2]);

	}

}
