package com.user.collection;

public class GenricDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genricClass<String>stringobj=new genricClass<String>();
		stringobj.set("hello");
		System.out.println(stringobj.get());
		genricClass<Integer>intobj=new genricClass<Integer>();
		intobj.set(10);
		System.out.println(intobj.get());


	}

}
