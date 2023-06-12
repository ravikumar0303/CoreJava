package com.IET.services;

import java.util.Set;

import com.IET.beans.Employee;

public interface EmployeeService {

	void addnewEmployee();

	Set<Employee> displayAll();

	Employee displayById(int id);

	Set<Employee> displayByName(String n);

	Set<Employee> SortBysal();

	Set<Employee> SortByName();

}
