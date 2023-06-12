package com.IET.dao;

import java.util.Set;

import com.IET.beans.Employee;

public interface EmployeeDao {


	Set<Employee> sortBySal();

	Set<Employee> sortByName ();

	void save(Employee e);

	Set<Employee> getAll();

	Employee SerachById(int id);

	Set<Employee> SearchByName(String n);

}
