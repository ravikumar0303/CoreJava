package com.IET.dao;

import java.util.Map;
import java.util.Set;

import com.IET.beans.Student;

public interface StudentDao {

	Map<Integer, Student> getAll();

	void save(Student e);


	Student searchById(int id);

	boolean removeById(int id);

	Set<Student> searchByName(String nm);

	Set<Student> sortByName();

	boolean modifyId(String nm, int newid);
	
	

}
