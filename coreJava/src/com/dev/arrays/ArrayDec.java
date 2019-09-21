package com.dev.arrays;

public class ArrayDec {

	public static void main(String[] args) {
		int[] intArr;
		intArr =new int[5];
		
	   byte[] byteArr = new byte[5];
	   
	   char []a = {'a','g','r','y','k'};
//	   System.out.println(a[2]);
	   System.out.println("length of the ARRAY IS "+a.length);
	   
		
		
	
		
		
		intArr[0] = 10;
		intArr[1] = 22;
		intArr[2] = 31;
		intArr[3] = 45;
		intArr[4] = 50;
		
	
		byteArr[0] = 23;
		byteArr[1] = 55;
		byteArr[2] = 123;
		byteArr[3] = 34;
		byteArr[4] = 121;
		
		int res = intArr[0] + 3;
		int res1 = intArr[1] - 20;
		int res2 = intArr[2] / 3;
		int res3 = intArr[3] % 2;
		int res4 = intArr[4] * 3;
		System.out.println("addition ="+res);
		System.out.println("sub = " +res1);
		System.out.println("div = "+ res2);
		System.out.println("mod =" +res3);
		System.out.println("mul ="+res4);
		 
	}
}
