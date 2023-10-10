package com.javaconcepts;

public class ForLoopTest {
	
	public void forTest() {
		
		for(int i=1;i<=10;i++) {
			
			if(i == 5) {
				continue;
			}
			
			System.out.println(i);
		}
	}
	
	public void whileTest() {
		int i=100;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}
	
	public void doWhileTest() {
		int i =100;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
	}
	
	public static void main(String[] args) {
		ForLoopTest f = new ForLoopTest();
		f.forTest();
//		f.whileTest();
//		f.doWhileTest();
	}

}
