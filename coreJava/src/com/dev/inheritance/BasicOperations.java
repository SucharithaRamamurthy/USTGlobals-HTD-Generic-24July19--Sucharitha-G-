package com.dev.inheritance;

public class  BasicOperations {
	static  BasicOperations b = new  BasicOperations();

	public void operations(int a, int b) {

		int add= a+b;
		System.out.println("add operation with 2 arguments :"+add);
	}
	
	//final method can be overloaded,private method can also be overloaded
	final void operations(int a, int b ,int f) {

		int add= a+b+f;
		System.out.println("add operation with 3 .arguments :"+add);
	}

	public void operations(int a, int b ,int f ,int d) {

		int add= a+b+f+d;
		System.out.println("add operation with 4 arguments :"+add);

	}


	public void operations(float f, float b) {

		float sub= f-b;
		System.out.println("sub operation with 2 arguments: "+sub);
	

	}
	public void operations(float f, int b,float f2) {
		
		float sub= f-b-f2;
		System.out.println("sub operation with 3 arguments : "+sub);
		
		
	}
	
	public void operations(float f, int b ,int d , int a) {

		float sub= f-b-d-a;
		System.out.println("sub operation with 4 arguments : "+sub);
	

	}

	public double operations(double d1, double d2) {

		double	mul = d1*d2;

		System.out.println("mul operation with 2 arguments :"+mul);
		return 1;

	}
	public void operations(double d1, double d2 ,double d3) {

		double	mul = d1*d2*d3;

		System.out.println("mul  operation with 3 arguments  :"+mul);
		

	}
	public void operations(double d1, double d2,double d3, double d4) {

		double	mul = d1*d2*d3*d4;

		System.out.println("mul operation with 4 arguments :"+mul);
	

	}

	
	

	public void operations(double d1, int d2) {

		double	div = d1/d2;

		System.out.println("div operation with 2 arguments :"+div);
		

	}
	public void operations(double d1, int d2 ,int d3) {

		double	div = (d1/d2)/d3;

		System.out.println("div operation with 3 arguments :"+div);


	}

	

	public void operations(double d1, int d2,int d3 ,int d4) {

		double	div = (d1/d2)/(d3/d4);

		System.out.println("div operation with 4 arguments  :"+div);
	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b.operations(1,2);
		b.operations(1.3333f,2);
		b.operations(1.5,2);
		b.operations(1.66,2.56,67.88,77.4);
		b.operations(1.0,1,3,5);
		b.operations(1.0,2);
		b.operations(1,2,3.4);
		b.operations(1,2.9f);
		b.operations(10.00,2,1,3);













	}

}
