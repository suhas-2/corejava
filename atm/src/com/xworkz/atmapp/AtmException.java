package com.xworkz.atmapp;

public class AtmException  extends Exception{
	
	@Override
	public String toString() {
		
		return "Entered amount cannot be withdrawn";
	}

}
