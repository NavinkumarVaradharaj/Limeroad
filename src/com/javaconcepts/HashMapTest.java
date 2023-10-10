package com.javaconcepts;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTest {
	
	public static void mapTest() {
		Map<Object, Object> stu_map = new HashMap<>();
		
		stu_map.put("CSE001", "james");
		stu_map.put("csd", "james");
		stu_map.put("CSE002", "jason");
		stu_map.put(987.678, "james");
		stu_map.put(false, "java");
		stu_map.put("CSE001", "selenium");
		
		System.out.println(stu_map);
		
		System.out.println(stu_map.size());
		
		System.out.println(stu_map.get("null"));
		
		System.out.println(stu_map.containsKey("CSE009"));
		
		System.out.println(stu_map.containsValue("java"));
		
		Set<Object> keySet = stu_map.keySet();
		System.out.println(keySet);
		
		Collection<Object> values = stu_map.values();
		System.out.println(values);
		
		Set<Entry<Object, Object>> entrySet = stu_map.entrySet();
		System.out.println(entrySet);
		
		System.out.println(stu_map);
		
		
		
	}
	
	public static void main(String[] args) {
		mapTest();
	}

}
