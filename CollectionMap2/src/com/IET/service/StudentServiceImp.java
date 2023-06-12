package com.IET.service;

import com.IET.beans.Student;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.IET.dao.StudentDao;
import com.IET.dao.StudentDaoImp;

public class StudentServiceImp implements StudentService {

	private StudentDao edao;

	public StudentServiceImp() {
		super();
		this.edao = new StudentDaoImp();

	}

	@Override
	public void addnewStudent() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter Sid");
		int sid = sc.nextInt();
		System.out.println("enter sname");
		String nm = sc.next();
		System.out.println("enter email");
		String email = sc.next();
		System.out.println("enter mobile");
		String m = sc.next();
		Student e = new Student(sid, nm, email, m);
		edao.save(e);

	}

	@Override
	public Map<Integer, Student> displsyAll() {
		// TODO Auto-generated method stub
		return edao.getAll();
	}

	@Override
	public Student displayById(int id) {

		return edao.searchById(id);
	}

	@Override
	public boolean deleteById(int id) {

		Scanner sc = new Scanner(System.in);
		Student s2 = edao.searchById(id);
		if (s2 != null) {
			System.out.println("Do you want to Delete= " + s2.getSid() + "," + s2.getSname());
			System.out.println("choose y/n");
			String ans = sc.next();

			if (ans.equals("y")) {
				return edao.removeById(id);

			} else if (ans.equals("n"));
						
			return true;
		}

		return false;
	}

	@Override
	public Set<Student> displayByName(String nm) {
		// TODO Auto-generated method stub
		return edao.searchByName(nm);
	}

	@Override
	public Set<Student> sortByName() {
		// TODO Auto-generated method stub
		return edao.sortByName();
	}

	@Override
	public boolean modifyById(String nm, int newid) {
		
		return edao.modifyId(nm,newid);
	}

}
