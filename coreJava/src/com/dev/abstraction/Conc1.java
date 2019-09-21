package com.dev.abstraction;

public class Conc1 extends Absp {

		@Override
	void name() {
		
		System.out.println("concreat class one extens of parent name = lion");
	}

	@Override
	void function() {
		System.out.println("concreat class one extens of parent name = hunting");
		
	}
	
		public static void main(String[] args) {
		 Conc1 c1 = new Conc1();
		 
		 c1.name();
		 c1.function();
		 c1.example2();
		 c1.example();
		

	}



}
