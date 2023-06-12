package com.IET.dao;

import java.util.List;

import com.IET.beans.Employee;

public interface EmployeeDao {
	
	void save (Employee r);
//	List<Employee> getAllEmployee();
	List<Employee> getAllEmployee();
	Employee searchById(int id);
	List<Employee> FindByName(String n);
	List<Employee> SortBySal();

}
