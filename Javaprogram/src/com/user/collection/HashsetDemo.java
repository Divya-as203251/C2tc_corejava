package com.user.collection;
import java.util.HashSet;
public class HashsetDemo {
	static void addElements(HashSet<Integer> numberHashSet)
	{
		numberHashSet.add(61);
		numberHashSet.add(51);
		numberHashSet.add(41);
		numberHashSet.add(91);
		numberHashSet.add(11);
		System.out.println(numberHashSet.add(61));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>numberHashSet=new HashSet<Integer>();
		HashSet<Integer>numberHashSet1=new HashSet<Integer>();
		numberHashSet1.add(20);
		numberHashSet1.add(80);
		numberHashSet1.add(11);
		System.out.println(numberHashSet);
		System.out.println(numberHashSet1);
		HashSet<Integer>numberHashSet2=new HashSet<Integer>();
		addElements(numberHashSet2);
		//union
		numberHashSet2.addAll(numberHashSet1);
		System.out.println("Result set"+numberHashSet2);
		numberHashSet2.clear();
		System.out.println("Result set"+numberHashSet2);
		
		//intersection of 2 sets
		numberHashSet2.retainAll(numberHashSet1);
		System.out.println("Result set"+numberHashSet2);
		
		//difference
		
		numberHashSet2.removeAll(numberHashSet1);
		System.out.println("resultset"+numberHashSet1);
	}

}
