package com.javaconcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {

	public static void setTest() {
		Set<String> mail_id = new HashSet<>();
		mail_id.add("qwe@123");
		mail_id.add("qwe@1234");
		mail_id.add("qwert@123");
		mail_id.add("abc@123");
		mail_id.add("qwe@123");
		mail_id.add(null);
		
		
		System.out.println("Mail id "+mail_id);
		
		boolean remove = mail_id.remove("qwe@123");
		System.out.println(remove);
		System.out.println("Mail id "+mail_id);
		
		List<String> marks = new ArrayList<>();
		marks.addAll(mail_id);
		marks.add("kjhgf@123");
		mail_id.add("vfr@134");
		System.out.println("Marks List :"+marks);
		System.out.println("Mail id "+mail_id);
		
//		mail_id.removeAll(marks);
//		System.out.println("Mail id "+mail_id);
//		
		mail_id.retainAll(marks);
		System.out.println("Mail id "+mail_id);
		System.out.println("==============================");
		Iterator<String> itr = marks.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	public static void main(String[] args) {
		setTest();
	}
	
	
}
