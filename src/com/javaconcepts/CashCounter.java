package com.javaconcepts;

public class CashCounter extends Reliance {

	@Override
	public void homeTheatre() {
		System.out.println("pay by cash");
	}
	
	public void cosmetics() {
		System.out.println("pay by cash");
	}
	
	public static void main(String args[]) {
		CashCounter c = new CashCounter();
		c.homeTheatre();
		c.cosmetics();
		c.dress();
		
		
		Reliance r = new CashCounter();	//upcasting
		r.homeTheatre();
		r.dress();
		
		
		
		
		
		
	}
	

}
