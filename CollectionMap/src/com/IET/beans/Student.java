package com.IET.beans;

public class Student {
	
	int sprn;
	String sname;
	String mobile;
	
	public Student(int sprn, String sname, String mobile) {
		super();
		this.sprn = sprn;
		this.sname = sname;
		this.mobile = mobile;
	}

	public Student() {
		super();
	}

	public int getSprn() {
		return sprn;
	}

	public void setSprn(int sprn) {
		this.sprn = sprn;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [sprn= " + sprn + ", sname= " + sname + ", mobile= " + mobile + "]";
	}
	
	

}
