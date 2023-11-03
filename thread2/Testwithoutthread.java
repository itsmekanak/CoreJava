package com.rays.thread2;

public class Testwithoutthread {
	public static void main(String[] args) {
		Withoutthread t1 = new Withoutthread("Dont worry");
		Withoutthread t2 = new Withoutthread("i have fellings");
		
		t1.run();
		t2.run();
	}

}
