package com.IET.service;

import java.util.Map;
import java.util.Set;

import com.IET.beans.Student;

public interface StudentService {

	void addnewStudent();

	Map<Integer, Student> displsyAll();

	Student displayById(int id);

	boolean deleteById(int id);

	Set<Student> displayByName(String nm);

	Set<Student> sortByName();

	boolean modifyById(String nm, int newid);

}
