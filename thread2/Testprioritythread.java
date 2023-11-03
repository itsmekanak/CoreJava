package com.rays.thread2;

public class Testprioritythread {
	public static void main(String[] args) {
		
		Prioritythread t1 = new Prioritythread(" bharti") ;
		Prioritythread t2 = new Prioritythread("muskan");
		
		
		t1.setPriority(9);
		
	
		t1.start();
		t2.start();
		
	}

}
