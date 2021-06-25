package com.lemon.day008.section2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.lemon.day007.section3.Member;

public class ArrayListTester {

	public static void main(String[] args) {
//		basicApi();
		ArrayList<Integer> ageList=new ArrayList<Integer>();
		ageList.add(20);
		ageList.add(21);
		ageList.add(23);
		ageList.add(26);
		//for循环进行打印
		System.out.println("-----for循环-------");
		for(int i=0;i<ageList.size();i++){
			if (i!=2) {
				System.out.println(ageList.get(i));				
			}
		}
		
		int i = 0;
		System.out.println("-----foreach循环-------");
		for (Integer age : ageList) {
			if (i != 2) {
				System.out.println(age);
			}
			i++;
		}
		Iterator<Integer> iterator=ageList.iterator();
		System.out.println("----------迭代器iterator-----------");
		while (iterator.hasNext()) {
				System.out.println(iterator.next());				
			}
		//HashSet
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.add("tom");
		hashSet.add("jack");
		hashSet.add("tom");
		hashSet.add("lucy");
		for (String set : hashSet) {
			System.out.println(set);
		}
		
		
		HashMap<String, Member> memberSet=new HashMap<String, Member>();
		Member tom=new Member();
		tom.setId(1);
		tom.recharge(100.0);
		Member jack=new Member();
		jack.setId(2);
		jack.setLeaveAmout(500.0);
		memberSet.put("user1", tom);
		memberSet.put("user2", jack);
		//使用Set集合进行存储
		Set<String> sets=memberSet.keySet();
		//遍历Set集合，取出对应的值
		for (String member : sets) {
			System.out.println(member+":"+memberSet.get(member));
		}
		Collection<Member> members=memberSet.values();
		for (Member member : members) {
			System.out.println(member);
		}
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("tom", 20);
		map.put("jack", 22);
		map.put("sam", 23);
		
		Set<String> mapSet=map.keySet();
		for (String name : mapSet) {
			System.out.println(name+":"+map.get(name));
		}
		Collection<Integer> collection=map.values();
		for (Integer integer : collection) {
			System.out.println(integer);
		}
		
	}
	public static void basicApi(){
		ArrayList<Integer> ageList=new ArrayList<Integer>();
		ageList.add(20);
		ageList.add(21);
		ageList.add(23);
	}
}
