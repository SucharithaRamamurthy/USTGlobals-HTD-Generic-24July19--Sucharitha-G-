package com.div.methods;

public class MethodExample {
	static int  j=0;
	static MethodExample me= new MethodExample();

	public static void main(String[] args) {
		j =calcArea(5);
		System.out.println("area of square : "+j);
		
		int B = me.areaRec(2,3);
		System.out.println("Area of rectangle : "+B);
		


	}
	public static int calcArea(int side)
	{
	    
		int t =side*side;
		int n = me.areaRec(4,10);
		System.out.println("area of rec : "+ n);
		return t;
	}
	public int areaRec(int length,int width) //non static method
	{
		int area=length*width;
		return area;
	}

}
