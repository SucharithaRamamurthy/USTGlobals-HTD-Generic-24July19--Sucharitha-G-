package com.dev.abstraction;

public class conc2 extends Absc{

	@Override
	void name() {
		System.out.println("overriden method of child abstract class name = human");
	}

	@Override
	void function() {
		System.out.println("overriden method of child abstract class functions = working");


	}
	@Override
	void man() {
		System.out.println("overriden method of child abstract class functions : man = HumanBeing");

	}

	@Override
	void gender() {
		System.out.println("overriden method of child abstract class functions : gender = female ");


	}

	



	public static void main(String[] args) {
		conc2 c2 = new conc2();
		c2.name();
		c2.function();
		c2.man();
		c2.gender();
		c2.suchi();

	}


}
