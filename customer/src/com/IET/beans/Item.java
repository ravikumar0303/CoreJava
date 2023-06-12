package com.IET.beans;

public class Item {
	private int Iid;
	private String Iname;
	
	public Item() {
		super();
	}

	public int getIid() {
		return Iid;
	}

	public void setIid(int iid) {
		Iid = iid;
	}

	public String getIname() {
		return Iname;
	}

	public void setIname(String iname) {
		Iname = iname;
	}

	public Item(int iid, String iname) {
		super();
		Iid = iid;
		Iname = iname;
	}

	@Override
	public String toString() {
		return "Item [Iid=" + Iid + ", Iname=" + Iname + "]";
	}

	 
}
