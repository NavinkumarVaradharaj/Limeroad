package com.javaconcepts;

public class Test extends CashCounter {
	
	public void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		CashCounter t = new Test();	//upcasting
		
		Test t1 = (Test) new CashCounter();	//Downcasting not possible
		
		t1.add();
		
	}

}
