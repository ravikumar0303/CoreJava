package com.IET.dao;

import java.util.Map;
import java.util.Set;
import java.util.Comparator;
import java.util.HashMap;
import com.IET.beans.Student;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.HashSet;
import com.IET.beans.Student;

public class StudentDaoImp implements StudentDao {

	private static Map<Integer, Student> std;
	static {
//		std = new HashMap<>();
		//used sorted order ID print
		std=new TreeMap<>();
		std.put(117, new Student(117,"ravi","r@124","789456"));
		std.put(57, new Student(57,"vishal","v@125","369"));
		std.put(92, new Student(92,"Shamim","s@126","852"));
		std.put(114, new Student(114,"pankaj","p@123","741"));
		std.put(111, new Student(111, "Ashu", "a@123", "45899"));
		std.put(112, new Student(112, "Deepa", "d@123", "456789"));
		std.put(113, new Student(113, "Babita", "b@123", "123456"));
	}

	@Override
	public void save(Student s) {

		std.put(s.getSid(), s);

	}

	@Override
	public Map<Integer, Student> getAll() {
		// TODO Auto-generated method stub
		return std;
	}

	
	@Override
	public Student searchById(int id) {
		
		return std.get(id);
	}

	@Override
	public boolean removeById(int id) {
		if(std.remove(id)!=null)
			return true;
		else {
			System.out.println("Id is not delete"); 
		}
		return true;
	}

	@Override
	public Set<Student> searchByName(String nm) {
		// TODO Auto-generated method stub
		Set<Student> s1=new HashSet();
		for(Integer ob:std.keySet()) {
			if(std.get(ob).getSname().equals(nm))
				s1.add(std.get(ob));
		}
		if(s1.size()>0) {
			return s1;
		}
		return null;
	}

	@Override
	public Set<Student> sortByName() {
		Comparator<Student> s=(s1,s2)->{
			return s1.getSname().compareTo(s2.getSname());
		};
		TreeSet<Student> tname=new TreeSet(s);
		for(Integer ob:std.keySet()) {
			tname.add(std.get(ob));
		}
		return tname;
	}

	@Override
	public boolean modifyId(String nm, int newid) {
		Student s2=std.get(nm);
		if(s2!=null) {
			s2.setSid(newid);
			return true;
		}
		return false;
	}

}
