package com.user.collection.comparator;

public class student {
	int rollNo;
	String name,address;
	public student(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}
	

}
