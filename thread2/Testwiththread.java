package com.rays.thread2;

public class Testwiththread {
	public static void main(String[] args) {
		
		
		Withthread t1 = new Withthread("uday");
		Withthread t2 = new Withthread("kanak");
		
		t1.start();
		t2.start();
		
		for (int i = 0; i <=50; i++) {
			System.out.println(i+"mahi");
			
		}
	}

}
