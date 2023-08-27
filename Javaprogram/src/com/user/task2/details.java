package com.user.task2;
import java.util.*;
public class details {

	public static void main(String[] args) {
		try (Scanner a = new Scanner(System.in)) {
			System.out.println("Enter the Radius of the circle");
			int Ra=a.nextInt();
			System.out.println("Enter the colour of the circle");
			String Col=a.next();
			Circle cr=new Circle();
			cr.setRadius(Ra);
			cr.setColour(Col);
			calculation d=new calculation();
			d.calc(cr);
		}

	}

}
