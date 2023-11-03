package com.rays.basic;

public class Testperson {
	public static void main(String[] args) {
		Person p = null;
		p = new Person ();
		
		
		p.setAddress("nagin nagar");
		p.setName("kanak soni");
		p.setDob(2/8/2023);
		
				
	
		System.out.println("Address:"+ p.getAddress());
		System.out.println("Name:"+ p.getName());
		System.out.println("dob:"+ p.getDob());
		
	}

}
