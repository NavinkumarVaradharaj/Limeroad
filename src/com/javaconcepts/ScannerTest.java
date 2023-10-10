package com.javaconcepts;

import java.util.Scanner;

public class ScannerTest {
	
	
	public ScannerTest(String s) {
		
	}
	
	
	
	
	Scanner sc = new Scanner(System.in);
	public void primitive() {
		
		
		System.out.println("Enter the Integer value : ");
		int a = sc.nextInt();
		System.out.println(a);
	}
	
	public void stringInput() {
		System.out.println("Enter String value :");
		String s1 = sc.next();
		System.out.println(s1);
	}
	
	public void stringInput1() {
		System.out.println("Enter String value :");
		String s2 = sc.nextLine();
		System.out.println(s2);
	}
	
	public void charTest() {
		stringInput();
		System.out.println("Enter char value : ");
		char c = sc.next().charAt(2);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		ScannerTest s = new ScannerTest("qwer");
//		s.stringInput1();
//		s.primitive();
//		s.stringInput();
		s.charTest();
		
		
		
	}

}
