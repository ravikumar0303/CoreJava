package com.IET.beans;

import java.util.Objects;

public class Student  {

	private int sid;
	private String sname;
	private String email;
	private String mobile;

	public Student() {
		super();

	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Student(int sid, String sname, String email, String mobile) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.mobile = mobile;
	}
	
	public Student(String snsme) {
		this.sid = 0;
		this.sname = sname;
		this.email = null;
		this.mobile = null;
		
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", mobile=" + mobile + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, mobile, sid, sname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(email, other.email) && Objects.equals(mobile, other.mobile) && sid == other.sid
				&& Objects.equals(sname, other.sname);
	}

//	@Override
//	public int compareTo(Student o) {
//		
//		System.out.println("Is CompateTo"+);
//		return 0;
//	}
//	

}
