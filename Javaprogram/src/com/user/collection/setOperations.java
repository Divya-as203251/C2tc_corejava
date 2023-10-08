package com.user.collection;
import java.util.HashSet;
public class setOperations {

	public static void main(String[] args) {
		HashSet<Integer>s1=new HashSet<Integer>();
		HashSet<Integer>s2=new HashSet<Integer>();
		HashSet<Integer>s3=new HashSet<Integer>();
		//Adding the set1 elements
		s1.add(11);
		s1.add(22);
		s1.add(33);
		System.out.println("Set 1 Elements:"+s1);
		//Adding the set2 elements
		s2.add(22);
		s2.add(44);
		s2.add(55);
		System.out.println("Set 2 Elements:"+s2);
		//Adding the set3 elements
		s3.add(33);
		s3.add(44);
		s3.add(66);
		System.out.println("Set 3 Elements:"+s3);
		//Performing intersection operation
		
		HashSet<Integer>intersection=new HashSet<Integer>(s1);
		intersection.retainAll(s2);
		System.out.println("SET INTERSECTION"+intersection);
		//performing union operation
		
		HashSet<Integer>union=new HashSet<Integer>(s1);
		union.addAll(s3);
		System.out.println("SET INTERSECTION"+union);
		//performing difference operation
		HashSet<Integer>difference=new HashSet<Integer>(s1);
		difference.removeAll(s2);
		System.out.println("SET INTERSECTION"+difference);

	}

}
