package com.rays.oops;

public class Testbalance {
	public static void main(String[] args) {
Balance b = new Balance();
		
		
		b.setBalance(1000);
		b.setDeposit(2000);
		b.setWithdrawal(500);
		
		System.out.println(b.getBalance());
		System.out.println(b.getDeposit());
		System.out.println(b.getWithdrawal());
		
	}

}
