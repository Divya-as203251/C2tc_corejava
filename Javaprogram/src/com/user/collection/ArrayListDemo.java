package com.user.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1=new ArrayList();
		System.out.println("check the list is empty or not"+list1.isEmpty());
		System.out.println("Sizeof arraylist"+list1.size());
		list1.add(2);// adding the elements to the list
		list1.add('A');
		list1.add(22.5);
		System.out.println("Sizeof arraylist"+list1.size());
		System.out.println(list1);
		System.out.println(list1.contains(55));
		System.out.println("element at the position"+list1.get(1));
		System.out.println("removing the element"+list1.remove(1));
		System.out.println(list1);
		list1.add(22);
		list1.add(25);
		System.out.println(list1);
		System.out.println("removing the element"+list1.remove(list1.indexOf(2)));
		System.out.println(list1);
	//Collections.sort(list1);
		ArrayList <String>ob=new ArrayList<String>();
		ob.add("suma");
		ob.add("manu");
		ob.add("ragu");
		//traverse a list
		Iterator<String>i=ob.iterator();
		while(i.hasNext()) {
			String nm=i.next();
			System.out.println(nm);

		}

	}

}
