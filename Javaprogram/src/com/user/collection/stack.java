package com.user.collection;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<Integer>();
		s.push(2);
		s.push(22);
		s.push(32);
		s.add(11);
		System.out.println("Stack elements"+s);
		s.pop();
		s.pop();
		System.out.println("Stack elements"+s);
		System.out.println(" last Stack elements:"+s.peek());
		if(s.isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Stack is not empty");
		}
		System.out.println(s.search(22));
		System.out.println(s.search(55));
		
		

	}

}
