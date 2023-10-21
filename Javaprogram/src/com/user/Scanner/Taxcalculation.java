package com.user.Scanner;

public class Taxcalculation {
	public void calculatetax(Person p)
	{
		if(p.getIncome()<=16000)
		{
			p.setTax(0);
		}
		else if(p.getIncome()>16000&&p.getIncome()<=500000)
		{
			p.setTax(5);
		}
		else {
			p.setTax(10);
		}
	}

}
