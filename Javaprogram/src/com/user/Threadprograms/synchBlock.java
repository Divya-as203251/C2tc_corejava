package com.user.Threadprograms;

public class synchBlock implements Runnable {
	int token=1;
	public void run()
	{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(token+"...alloted to"+name);
		token++;
	}

}
