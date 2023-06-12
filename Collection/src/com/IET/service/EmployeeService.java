package com.IET.service;

import java.util.List;

import com.IET.beans.Employee;

public interface EmployeeService {
	
	void addnewEmployee();
	List<Employee> displayAll();
	Employee SearchByID(int id);
	List<Employee> SearchByName(String n);
	List<Employee> SortBySal();
	
	
}
