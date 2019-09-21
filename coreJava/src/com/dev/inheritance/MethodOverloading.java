package com.dev.inheritance;

public class MethodOverloading {
    static	MethodOverloading mo = new MethodOverloading();
    
    
    public void print() {
    	System.out.println("method with no-arg");
    }
    public int print(int i) {
    	System.out.println("method with int arg");
    	return 1;
    }
    public String print(String str) {
    	System.out.println("method with string arg");
    	return "a";
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	mo.print("aa");
    	mo.print();
    	mo.print(1);
	
		

	}

}
