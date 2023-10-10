package com.javaconcepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class ArrayListTest{
	
	public static void listTest() {
		List<Integer> marks = new ArrayList<>();
		
		marks.add(23);
		marks.add(56);
		marks.add(23);
		marks.add(45);
		marks.add(null);
		
		System.out.println(marks);
		
		int size = marks.size();
		System.out.println(size);
		
		Integer integer = marks.get(2);
		System.out.println(integer);
		
		boolean contains = marks.contains(56);
		System.out.println(contains);
		
		Integer remove = marks.remove(1);
		System.out.println(remove);
		
		System.out.println(marks);
		
//		marks.clear();
//		System.out.println(marks);
		System.out.println("============================");
		
		for(int i =0;i<marks.size();i++) {
			if(i<3) {
			System.out.println(marks.get(i));//for loop(List)
			}
		}
		System.out.println("============================");
		for(Integer i : marks) {
			System.out.println(i);//for each (List & set)
		}
		System.out.println("=========================");
		ListIterator<Integer> itr = marks.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("_________________________________");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		
		List<String> ll = new LinkedList<>();
		
	}
	
	
	public static void l1() {
		List<String> l = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			Scanner sc = new Scanner(System.in);
			
			String values = sc.next();
			l.add(values);
		}
		
		for(int i=0;i<l.size();i++) {
			int length = l.get(i).length();
			
			
			Random r = new Random();
			
			int nextInt = r.nextInt(length);
			int nextInt2 = r.nextInt(length-1);
			
			
			
			char c1 = l.get(i).charAt(nextInt);
			char c2 = l.get(i).charAt(nextInt2);
			
			String res = l.get(i).replace(c1, c2);
			String replace = res.replace(c2, c1);
			System.out.println(replace);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		//listTest();
		l1();
	}

}
