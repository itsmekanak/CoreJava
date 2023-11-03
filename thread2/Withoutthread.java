package com.rays.thread2;

public class Withoutthread {
	String name = null ;
	
	public  Withoutthread( String n) {
		name = n;
	}
	public void run() {
		for (int i=1;i<=50; i++) {
			System.out.println(i+ name);
		}
	}

}
