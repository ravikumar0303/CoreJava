package com.iet.beans;

public abstract class Shape {
 
	private int id;
	private String color;
	private static int cnt;
	static {
		cnt=1;
	}
	
	public Shape() {
		super();
		id=cnt++;
	}
	
	public Shape(String color) {
		super();
		//this.id=id;
		id=cnt++;
		this.color=color;
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getColor() {
		return color;
	}
	
	public void  setColor(String color) {
		
		this.color=color;
	}
	
	public abstract float calculateArea();
	public abstract float calculatePerimeter();
	
	public String toString() {
		return "Id:> "+id+",Color:> "+color;
	}
}

