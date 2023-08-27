package com.user.task2;

public class calculation {
	double pi,rad,area;
	String colour;
	public void calc(Circle cl)
	{
		pi=3.14;
		rad=cl.getRadius();
		area=pi*rad*rad;
		System.out.println("The Area of Circle is:"+area);
		System.out.println("The colour of the circle is:"+colour);
	}

}
