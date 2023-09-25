package com.user.collection;
import java.util.Vector;
import java.util.ArrayList;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> a=new Vector<String>();
		a.add("Red");
		a.add("Yellow");
		a.add("Orange");
		a.add("Blue");
		System.out.println("Vector elemnts:"+a);
		int size=a.size();
		System.out.println("Size of the element"+size);
		int cap=a.capacity();
		System.out.println("Default capacity"+cap);
		a.addElement(null);
		a.add(5,"pink");
		a.add("Blue");//Duplicate elements are allowed and null elements are also allowed
		int newsize=a.size();
		System.out.println("Size of the element"+newsize);
		System.out.println("Vector elemnts:"+a);
		ArrayList<String> al=new ArrayList<String>();
		al.add("red");
		al.add("black");
		al.add("ramya");
		al.add("manju");
		al.add("sonu");
		al.add("venba");
		a.addAll(al);
		System.out.println(" added Array list elements"+a);
		int cp=a.capacity();
		System.out.println("Default capacity"+cp);
		int alsize=a.size();
		System.out.println("Size of the element"+alsize);
		
		

	}

}
