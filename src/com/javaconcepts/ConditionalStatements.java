package com.javaconcepts;

import java.util.Scanner;

public class ConditionalStatements {
	
	public void major() {
		int age = 258;
		
		if((age >= 18)&&(age<=100)) {
			System.out.println("major");
		}
		else if((age>=1)&&(age<18)) {
			System.out.println("minor");
		}
		else {
			System.out.println("Minor");
		}
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		char charAt = sc.next().charAt(0);
		ConditionalStatements c = new ConditionalStatements();
		c.major();
	}

}
