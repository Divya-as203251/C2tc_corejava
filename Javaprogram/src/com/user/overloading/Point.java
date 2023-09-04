package com.user.overloading;

public class Point {
	
	private float x;
	private float y;
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public Point()
	//constructor overloading
	{
		x=0.0f;
		y=0.0f;
		
	}
	public Point(float x)
	{
		this.x=x;
	}
	public Point(float x,float y)
	{
		this.x=x;
		this.y=y;
	}

}
