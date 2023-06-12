package com.IET.dao;

import com.IET.beans.Employee;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class EmployeeDaoImplement implements EmployeeDao {
	
	
	private static Set<Employee> eset;
	static{
		eset=new HashSet<>();
		eset.add(new Employee(117,"Ravi",9));
		eset.add(new Employee(57,"vishal",8));
		eset.add(new Employee(114,"Pankaj",3));
		eset.add(new Employee(92,"Shamim",6));
		eset.add(new Employee(13,"Atharv",5));
			
	}

	@Override
	public void save(Employee e) {
		eset.add(e);
		
	}

	@Override
	public Set<Employee> getAll() {
		
		return eset;
	}

	@Override
	public Employee SerachById(int id) {
		// TODO Auto-generated method stub
		for(Employee ob:eset) {
			if(ob.getEid()==id)
				return ob;
		}
		return null;
	}

	@Override
	public Set<Employee> SearchByName(String n) {
		// TODO Auto-generated method 
		Set<Employee> nset=new HashSet<>();
		for(Employee em:eset) {
			if(em.getEname().equals(n));{
			nset.add(em);
			}
			 return nset;
			 }
		
		return null;
	}

	@Override
	public Set<Employee> sortBySal() {
		// TODO Auto-generated method stub
		Set<Employee> slist=new TreeSet<>();
		for(Employee ob:eset) {
			slist.add(ob);
		}
		return slist;
	}

	@Override
	public Set<Employee> sortByName() {
		// TODO Auto-generated method stub
		return null;
	}

}
