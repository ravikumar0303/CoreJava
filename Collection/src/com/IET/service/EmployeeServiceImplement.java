package com.IET.service;

import java.util.List;
import java.util.Scanner;
import com.IET.beans.Employee;
import com.IET.dao.EmployeeDao;
import com.IET.dao.EmployeeDaoImplement;

public class EmployeeServiceImplement implements EmployeeService {

	private EmployeeDao edao;

	public EmployeeServiceImplement() {
		super();
		this.edao = new EmployeeDaoImplement();
	}

	@Override
	public void addnewEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter empid");
		int empid = sc.nextInt();
		System.out.println("enter ename");
		String nm = sc.next();
		System.out.println("enter designation");
		String desg = sc.next();
		System.out.println("enter Salary");
		double s = sc.nextDouble();
		Employee e = new Employee(empid, nm, desg, s);
		edao.save(e);

	}

	@Override
	public List<Employee> displayAll() {
		return edao.getAllEmployee();
	}

	@Override
	public Employee SearchByID(int id) {
		return edao.searchById(id);
	}

	@Override
	public List<Employee> SearchByName(String n) {
  
		return edao.FindByName(n);
	}

	@Override
	public List<Employee> SortBySal() {
		
		return edao.SortBySal();
	}

	
}