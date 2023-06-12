package com.IET.beans;

public class Student {
	private int id;
	private String sname;
	private String prn;
	
	
	
	public Student() {
		super();
	}
	
	public Student(int id,String sname,String prn) {
		this.id=id;
		this.sname=sname;
		this.prn=prn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getPrn() {
		return prn;
	}

	public void setPrn(String prn) {
		this.prn = prn;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", prn=" + prn + "]";
	}
	
	

}
