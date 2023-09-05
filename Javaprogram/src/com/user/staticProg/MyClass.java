package com.user.staticProg;

public class MyClass {
	
	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}
	private int section;
	private static int srNo;
	static {
		System.out.println("static block");//static block
		srNo=1000;
	}
MyClass()
{
	System.out.println("Default constructor");
	section++;
}
static void display()
{
	//static method
	System.out.println("Serial number"+srNo);
}
}
