package com.IET.dao;

import java.util.List;
import java.util.ArrayList;
import com.IET.beans.Employee;

public class EmployeeDaoImplement implements EmployeeDao {
	private static List<Employee> rlist;
	static {
		rlist=new ArrayList<>();
		rlist.add(new Employee(1,"Rajan","game designer",88888));
		rlist.add(new Employee(2,"revati","ux designer",99999));
		rlist.add(new Employee(3,"Rajan","Analyst",7777));
		rlist.add(new Employee(4,"Ravi","FullStack Developer",999999));
	}
	
	@Override
	public void save(Employee e) {
		rlist.add(e);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		return rlist;
	}

	@Override
	public Employee searchById(int id) {
       int pos=rlist.indexOf(new Employee(id));
       if(pos!=-1) {
    	return rlist.get(pos); 
       } 

		return null;
	}

	@Override
	public List<Employee> FindByName(String n) {
		List<Employee> Findlist=new ArrayList<>();
		for(Employee R_V:rlist) {
			if(R_V.getEname().equals(n)) {
				Findlist.add(R_V);
			}
		}
		if(Findlist.size()>0){
			return Findlist;
		}
		return null;
	}

	@Override
	public List<Employee> SortBySal() {		
		List<Employee> vlist=new ArrayList<>();
		 for(Employee e:rlist) {
			 vlist.add(e);
			 }
		 vlist.sort(null);
		return vlist;
	}
	

}