package com.user.stream;

public class exceptondemo extends StreamOperations {
	int detail;
	exceptondemo(int a)
	{
		detail=a;
	}
	public string  toString()
	{
		return "detail";
	}
	class output{
		static void compute(int a)throws exceptondemo
		{
			throw new exceptondemo(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			compute(3);
		}
		catch(Exception e)
		{
			System.out.println("exception");
		}
	}

}
