package com.javaconcepts;

public class Payment implements InternetBanking,PayTm {

	
	
	public static void main(String[] args) {
		Payment p = new Payment();
		
//		PayTm p1 = (PayTm) new Payment(); //upcasting
//		p1.offers();
//		p1.transfer();
//		
//		Payment p2 = (Payment) new PayTm(); //not possible
		
		
	}

	@Override
	public void offers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}
	
	
}
