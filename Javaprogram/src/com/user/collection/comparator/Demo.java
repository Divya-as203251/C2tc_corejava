package com.user.collection.comparator;
import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student> ar=new ArrayList<student>();
		ar.add(new student(222,"ccc","chennai"));
		ar.add(new student(333,"aaa","bangalore"));
		ar.add(new student(111,"ddd","delhi"));
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		System.out.println("*****************");
		Collections.sort(ar,new sortByRoll());
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		System.out.println("*****************");
		Collections.sort(ar,new sortByName());
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));

		

	}

}
