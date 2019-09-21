package com.dev.collections;
import java.util.HashSet;

public class EmployeeDetailes implements Emp{

	HashSet<Employee> hs = new HashSet<Employee>();
	@Override
	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		if(employee != null)
		{
			hs.add(employee);
			
			
			return true;
		}
		return false;
	}
	@Override
	public boolean removeEmploye(Employee employee) {
		// TODO Auto-generated method stub
		if(employee !=null)
		{
			hs.remove(employee);
		}
		return false;
	}
	@Override
	public void updateEmployee() {
		
		System.out.println(hs);
	}


	
}
