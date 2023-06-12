package com.IET.services;

import java.util.Scanner;
import java.util.Set;

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
		System.out.println("enter eid");
		int eid = sc.nextInt();
		System.out.println("enter ename");
		String nm = sc.next();		
		System.out.println("enter Salary");
		double sal= sc.nextDouble();
		Employee  e = new Employee(eid,nm,sal);
		edao.save(e);

		
	}

	@Override
	public Set<Employee> displayAll() {
	
		return edao.getAll();
	}

	@Override
	public Employee displayById(int id) {
		// TODO Auto-generated method stub
		return edao.SerachById(id);
	}

	@Override
	public Set<Employee> displayByName(String n) {
		// TODO Auto-generated method stub
		return edao.SearchByName(n);
	}

	@Override
	public Set<Employee> SortBysal() {
		// TODO Auto-generated method stub
		return edao.sortBySal();
	}

	@Override
	public Set<Employee> SortByName() {
		// TODO Auto-generated method stub
		return edao.sortByName();
	}

}
