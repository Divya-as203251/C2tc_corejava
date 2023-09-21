package com.user.Threadprog;

public class ExtendingThread extends Thread {
	public void run()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendingThread t=new ExtendingThread();
		t.start();
		

	}

}
