package com.javaconcepts;

public class SwitchStatement {
	
	public static void main(String[] args) {
		
		int error_code = 401;
		
		switch(error_code) {
		
		case 400 :
			System.out.println("bad request");
			break;
		case 401 :
			System.out.println("Unauthourized");
			break;
			
		case 404 :
			System.out.println("Not found");
			break;
			
		case 500 :
			System.out.println("Server error");
			break;
			
			default :
				System.out.println("not an error code");
			
		
		
		}
		
		
	}

}
