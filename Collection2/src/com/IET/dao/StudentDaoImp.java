package com.IET.dao;
import java.util.Map;
import java.util.HashMap;

public class StudentDaoImp implements StudentDao {
	
	private static Map<Integer,String> stdset;
	static {
		stdset=new HashMap<>();
		stdset.put(117,"ravi");
		stdset.put(92,"samim");
		stdset.put(57,"vishal");
		stdset.put(114,"Pankaj");
		
		}

}
