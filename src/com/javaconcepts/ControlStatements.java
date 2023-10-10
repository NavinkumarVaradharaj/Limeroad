package com.javaconcepts;

public class ControlStatements {
	
	public void forTest() {
		for(int i=1;i<=5;i--) {
			System.out.print(i+" ");
		}
		
		
	}
	
	public void nestedFor() {
		for(int i=5;i>=1;i--) {
			for(int j=3;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		ControlStatements cs = new ControlStatements();
		cs.forTest();
		//cs.nestedFor();
	}

}
//123
//123
//123

//321
//321
//321