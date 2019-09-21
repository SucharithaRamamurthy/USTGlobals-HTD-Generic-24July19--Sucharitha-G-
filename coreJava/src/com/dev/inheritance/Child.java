package com.dev.inheritance;

public class Child extends Parent {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.display(3);
		Child c = new Child();
		c.display(5);
		// TODO Auto-generated method stub

	}
	@Override
	public void display(int i)
	{
		System.out.println("overriding");
		for(int j=1;j<i;j++)
		{
			
			System.out.println(j);
		}
	}
	


}
