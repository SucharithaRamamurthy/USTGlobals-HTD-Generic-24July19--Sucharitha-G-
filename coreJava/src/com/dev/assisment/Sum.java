package com.dev.assisment;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7};
		int mid = (a.length/2)+1;
//		int first = a.length-6;
//		int second = a.length-5;
		System.out.println("mid element : "+ mid);
		System.out.println("first element : " +a[0]);
		System.out.println("second element : " +a[1]);
		
		System.out.println(a[0]+a[1]+mid);
		

	}

}