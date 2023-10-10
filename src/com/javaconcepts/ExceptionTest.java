package com.javaconcepts;

import java.awt.AWTException;
import java.awt.Robot;

public class ExceptionTest {
	static String s ;
	public static void excepTest() throws InterruptedException, AWTException {
		Thread.sleep(6000);
		Robot r = new Robot();
	}
	
	public static void nullExcepTest() {
	
		try {
			s.length();
		}catch(Exception e) {
			System.out.println("Variable should not be zero");
		}
		
	}
	
	public static void indexExcepTest() {
		s = "james";
		try {
			
			System.out.println(s.charAt(2));
		}finally {
			System.out.println("finally");
		}
		
		
	}

	public static void main(String[] args) throws Throwable {
		
		
		System.out.println(indexExcepTest());
		
	}
}
