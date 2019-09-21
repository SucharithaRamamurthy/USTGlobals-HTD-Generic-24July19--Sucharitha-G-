package com.dev.polimorphism;

public class SubPoli extends SupPoli {
	static SubPoli sb = new SubPoli();
	 
	public void add(int i,int j) {
		int add = i+j;
		System.out.println("sub class addition : add = " +add );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sp.add(1,3);
		sb.add(2,7);
		

	}

}
