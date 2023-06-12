package com.IET.beans;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class Treemap {

   @SuppressWarnings("removal")
	public static void main(String[] args) {
		
		TreeMap<String, Double> tm=new TreeMap();
		
		tm.put("Ravi",new Double (5456.11) );
		tm.put("Vishal",new Double (5965.1) );
		tm.put("Shamim",new Double (2548.4) );
		tm.put("Pankaj",new Double (7989.48) );
		tm.put("Revati",new Double (5456.51) );
		tm.put("Neekhil",new Double (9969.45) );
		
		//get set Entries
		Set set=tm.entrySet();
		
		//get an Iterator	
		Iterator i=set.iterator();
		
//		System.out.println(tm);
		
		//display Element
		while(i.hasNext()){
			Map.Entry ravi=(Map.Entry)i.next();
			System.out.print("\nName And sal--> "+ravi.getKey()+": ");
			System.out.println(ravi.getValue());
			
		}
	}

}
