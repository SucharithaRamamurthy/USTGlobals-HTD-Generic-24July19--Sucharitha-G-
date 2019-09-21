package com.dev.lambdaexp;

public class Test {

	public static void main(String[] args) {
		FunInt f = () -> {
			try {
				int i = 10/5;
				System.out.println(i);
			} catch (Exception e) {
				System.out.println("Exception..");	
			}
		};
		Thread
		
		FunInt2 f2 = (int i) -> {
			for ( int j = 1; j<= i; j++) {
				System.out.println(j);
			}
		};
         f.printVal();
         f2.printVal2(5);
	}

}
