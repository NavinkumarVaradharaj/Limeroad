package com.javaconcepts;

public class StringMethods {

	public static void main(String[] args) {

		String s = "java";

		String s1 = "java";

		String s2 = "java selenium james gosling";
		
		

		System.out.println(s.length());

		int length = s.length(); // int a = 4; ctrl+2 ,l //return type

		System.out.println(length);

		boolean equals = s.equals(s1);
		System.out.println(equals);

		char charAt = s1.charAt(2);
		System.out.println(charAt);

		String replace = s1.replace("av", "qwert");
		System.out.println(replace);

		String substring = s2.substring(3);
		System.out.println(substring);

		String substring2 = s2.substring(2, 8);
		System.out.println(substring2);
		
		System.out.println(s1);

		String[] split = s2.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

		System.out.println("=================================");

		String s3 = new String("selenium"); // non-literal

		System.out.println(" =========================== ");
		
		
		StringBuffer sb = new StringBuffer("java");

		StringBuilder sb1 = new StringBuilder("java");

		 sb.reverse();
		System.out.println(sb);

		sb1.append("selenium ");

		System.out.println(sb1);

	}
}
