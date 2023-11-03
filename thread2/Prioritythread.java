package com.rays.thread2;

public class Prioritythread  extends Thread{
	
	
	public Prioritythread(String name) {
		super(name);
		
		
	}
	public void run () {
		for (int i = 0; i <=50; i++) {
			System.out.println( i +getName());
			
		}
	}
	

}
