package com.user.task1;
import java.util.*;

public class Sales {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		String Name=obj.next();
		String Address=obj.next();
		long Phone=obj.nextLong();
		int Sales_Amount=obj.nextInt();
		Commission cc=new Commission();
		cc.setName(Name);
		cc.setAddress(Address);
		cc.setPhone(Phone);
		cc.setSales_Amount(Sales_Amount);
		calculation cl=new calculation();
		cl.demo(cc);

	}

}

