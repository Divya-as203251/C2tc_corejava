package com.user.task1;

public class calculation {
	int percentage;
	int com;

	public void demo(Commission cc)
	{
		if(cc.getSales_Amount()>=100000)
		{
			percentage=(cc.getSales_Amount()/100)*10;
			com=cc.setSales_Amount(percentage);
			System.out.println("The commission Amount is:"+com);
		}
		else if(50000 <=cc.getSales_Amount()&&cc.getSales_Amount()<100000)
		{
			percentage=(cc.getSales_Amount()/100)*5;
			com=cc.setSales_Amount(percentage);
			System.out.println("The commission amount for this will be:"+com);
		}
		else if(30000<=cc.getSales_Amount()&&cc.getSales_Amount()<50000)
		{
			percentage=(cc.getSales_Amount()/100)*3;
		com=cc.setSales_Amount(percentage);
		System.out.println("The commission Amount for this will be: "+com);
		}
		else
		{
			com=(int) cc.setSales_Amount(0);
			System.out.println("The commission amount for this will be:"+com);
		}
	}

}
