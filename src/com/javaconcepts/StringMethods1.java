package com.javaconcepts;

import java.util.Arrays;

public class StringMethods1 {

	static String s = "abc";
	
	public static void arrayTest()
	{
	String name [] = new String [5];
	name [0] = "a";
	name [3] = "b";
	name [4] = "c";
	System.out.println(Arrays.toString(name));
	}

	public static void main(String[] args) {
		arrayTest();
		
		
		
		
		
		String str=s.toUpperCase();
		for(int i=0;i<str.length();i++) {
		System.out.println(str.charAt(i));
		}

	}



}