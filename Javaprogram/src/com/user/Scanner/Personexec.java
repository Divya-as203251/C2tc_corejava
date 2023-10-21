package com.user.Scanner;
import java.util.Scanner;
public class Personexec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		String name;
		System.out.println("Enter person name:");
		name=obj.next();
		int income;
		System.out.println("Enter the income:");
		income=obj.nextInt();
		//int tax;
		//System.out.println("Enter the tax");
		//tax=obj.nextInt();
		Person pp=new Person();
		pp.setName(name);
		pp.setIncome(income);
		Taxcalculation cal=new Taxcalculation();
		cal.calculatetax(pp);
		System.out.println("After calculation tax");
		System.out.println(pp);

	}

}
