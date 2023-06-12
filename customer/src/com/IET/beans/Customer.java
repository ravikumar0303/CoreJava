package com.IET.beans;

import java.util.Objects;

public class Customer {
	
	private int cid;
	private String cname;
	
	public Customer() {
		super();
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Customer(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("In hashcode-->" + this.cid+" Customer Name-->" +this.cname);
		
		return cid+cname.hashCode();
	}

//	@Override
//	public boolean equals(Object obj) {
//		Customer r = (Customer) obj;
//		System.out.println("In equals" + this.cid+"--" +this.cname+","+r.cid+"-"+r.cname);
//		
//		
//		return this.cid == r.cid && this.cname.equals(r.cname);
//	}
//	
    
}
