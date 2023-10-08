package com.user.Threadprog;

public class RunnableInterface implements Runnable {
	public void run()
	{
		System.out.println("Implementing Runnable Interfcae");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableInterface i=new RunnableInterface();
		Thread t1=new Thread(t);
		t1.start();

	}

}
