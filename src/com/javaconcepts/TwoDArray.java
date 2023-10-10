package com.javaconcepts;

public class TwoDArray {
	
	public static void twoArrayData() {
		
		String name[][] = new String[4][5];
		name[0][1] = "java";
		name[2][1] = "Selenium";
		name[3][1] = "java";
		name[2][3] = "API";
		name[3][2] = "java";
		name[0][4] = "GIT";
		
		//System.out.println(name[3][3]);
		
		for(int i=0;i<name.length;i++) {
			for(int j=0;j<name[i].length;j++) {
				if(j < name[i].length-1) {
				System.out.print(name[i][j]+",");
				}
				else {
					System.out.print(name[i][j]);
				}
			}
			System.out.println();
		}
		
		
		
		for(String n[] : name) {
			for(String names : n) {
				System.out.print(names+" ");
			}
			System.out.println();
		}
		
	
	}
	public static void main(String[] args) {
		twoArrayData();
	}
	

}
