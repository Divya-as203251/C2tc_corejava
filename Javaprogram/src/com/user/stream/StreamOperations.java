package com.user.stream;


public class StreamOperations {

	public static void main(String[] args) {
		try {
			int i,sum;
			sum=10;
			for(int i=-1;i<3;++i)
			{
				sum=(sum/i);
				System.out.println(i);
			}
		
		}
			catch(ArithmeticException e)
			{
				System.out.println("0");
			}
				
		}
	}

