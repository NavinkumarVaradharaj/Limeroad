package com.javaconcepts;

public class Phonepe extends Gpay {
	
	@Override
	public void payment() {
		System.out.println("Pay with additional charges");
	}
	
	public void m() {
		System.out.println("method 2");
	}
	
	public static void main(String[] args) {
		Gpay g = new Phonepe();
		
		g.payment();
		g.m();
		
		
	}

}
