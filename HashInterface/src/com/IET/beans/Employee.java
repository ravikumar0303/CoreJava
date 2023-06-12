package com.IET.beans;

public class Employee implements Comparable<Employee> {

	private int eid;
	private String ename;
		private double sal;

	public Employee() {
		super();
	}
//	
//	public Employee(int eid) {
//
//		this.eid = eid;
//		this.ename = null;
//		this.sal =null;
//		
//	}

	public Employee(int eid, String ename,double sal) {

		this.eid = eid;
		this.ename = ename;
		this.sal =sal ;

	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [Eid=> " + eid + ", Ename=> " + ename + ", Sal=> " + sal + "]";
	}
	

	@Override
	public int compareTo(Employee o) {
		System.out.println("Salary Compare is. "+this.sal+",To "+o.sal);
		if(this.sal>o.sal) {
			return -1;
		}
		else if(this.sal==o.sal) {
			return 0;
		}
		
		else
			
		return 1;
	}

	

}
