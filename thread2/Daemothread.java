package com.rays.thread2;

public class Daemothread extends Thread {
  
	
	public void run () {
		System.out.println("mistu"+ Thread.currentThread());
		
	while(true) {
		try {
			Thread.sleep(600);
			System.out.println("khushi");
			
		} catch (InterruptedException e) {
		}
	}
	}

}
