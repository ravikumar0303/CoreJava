package com.IET.vector;
import java.util.Vector;
public class VectorString {
	
	public static void main(String [] args) {
		
		Vector<String> Ravi_v=new Vector<>();
		
		Ravi_v.add("Hello");
		Ravi_v.add("Welcome");
		Ravi_v.add("To");
		Ravi_v.add("IET");
		Ravi_v.add("Acts");
		Ravi_v.add("Pune");
		
		Ravi_v.add("Hello");
		Ravi_v.add("Welcome");
		Ravi_v.add("To");
		Ravi_v.add("IET");
//		Ravi_v.add("Acts");
		Ravi_v.add("Pune");
	   System.out.println("Vector is:>"+Ravi_v);
	   System.out.println("Vector is:>"+Ravi_v.size());
	   System.out.println("Vector is:>"+Ravi_v.capacity());
		System.out.println("");
	}
		
}
