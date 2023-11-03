package com.rays.thread2;

public class Withthread extends Thread {
	String name = null ;
	public Withthread(String n) {
		name = n;
	}
	public void run () {
		for (int i = 0; i <=50; i++) {
			System.out.println(i+ name); 
			
		}
	}

}
