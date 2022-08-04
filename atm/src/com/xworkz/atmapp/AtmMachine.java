package com.xworkz.atmapp;

public class AtmMachine {
	
	public void check(int amount) throws AtmException {
		System.out.println("Check method started");
		
		if(amount>=5000 || amount%100!=0) {
			System.out.println("Withdraw your amount");
			
		}
		else {
			
			throw new AtmException();
		}
		System.out.println("check method ended");
	}

}
