package filehandling;

import java.util.Objects;

public class Employee{
	private int empid;
	private String name;
	private double sal;
	
	public Employee(int empid, String name, double sal) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", sal=" + sal + "]";
	}

//	@Override
//	public int hashCode() {
//		return empid;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		return this.empid == ((Employee)obj).getEmpid();
//	}


//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return (int) (this.sal-o.getSal());
//	}
	
}
