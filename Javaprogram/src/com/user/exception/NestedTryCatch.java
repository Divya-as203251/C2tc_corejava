package com.user.exception;

public class NestedTryCatch {
	public static void check() {
		String str="TNS";
		int slength=str.length();
		System.out.println("String length"+slength);
		String anotherString="hello";
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("Index out of bound"+e.getMessage());
			}
			System.out.println(" Another String length"+anotherString.length());
		}
		catch(NullPointerException n)
		{
			System.out.println("Exception is thrown"+n.getMessage());
		}
		}

}
