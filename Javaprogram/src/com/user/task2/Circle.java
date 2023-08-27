package com.user.task2;

public class Circle {
	int Radius;
	String Colour;
	public int getRadius() {
		return Radius;
	}
	public void setRadius(int radius) {
		Radius = radius;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	@Override
	public String toString() {
		return "Circle [Radius=" + Radius + ", Colour=" + Colour + "]";
	}

}
