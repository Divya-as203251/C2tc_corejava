package com.user.inheritance;
//child class
public class student extends citizen {
	private int rollNo;
	private String college;
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public student() {
		super();
	}


	public student(int rollNo, String college) {
		super();
		this.rollNo = rollNo;
		this.college = college;
	}
	
	

}
