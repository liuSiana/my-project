package com.lemon.day009.section1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTester {
	public static void main(String[] args) {
		basicApi();
	}

	private static void basicApi() {
		HashSet<String> set=new HashSet<String>();
		set.add("tom");
		set.add("tom");
		set.add("jack");
		set.add("lily");
		set.add("lucy");
		set.add("tommy");
		
		
//		set.remove("tommy");  
		
		for (String name : set) {
			System.out.println(name);
		}
		
//		set.clear();  
		if (set.isEmpty()) {
			System.out.println("");
		}else {
			System.out.println("");
		}
		
		if (set.contains("tommy")) {
			System.out.println("");
		}
		
		System.out.println(set.size());
		
	/*	Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()){
			String name=iterator.next();
			System.out.println(name);
		}*/
		//
		Object[] objects=set.toArray();
		for (Object object : objects) {
			String string=(String)object;
			System.out.println(string);
		}
		
	}

}
