package com.dev.collections;
import java.util.HashMap;

public class EmplImplements implements EmpInterface{

		HashMap<String, Employee> hs = new HashMap<String, Employee>();


	@Override
	public boolean putEmployee(Employee employee) {
		if(employee !=null) {
			hs.put("",employee);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean removeEmployee(Employee employee) {
		// TODO Auto-generated method stub
		if(employee !=null) {
			hs.remove("",employee);
			
			return true;
		}
		return false;
	}

	@Override
	public void displayEmployee() {
		// TODO Auto-generated method stub
		System.out.println(hs);
	}

}

