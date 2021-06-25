package com.lemon.day009.section1;

import java.util.ArrayList;
import java.util.Iterator;

public class Tester {
	public static void main(String[] args) {
//		basicApi();
		ArrayList<Integer> ageList=new ArrayList<Integer>();
		
		ageList.add(20);
		ageList.add(25);
		ageList.add(30);
		
	/*	for (Integer age : ageList) {
			System.out.println(age);
		}*/
		
	/*	for (int i = 0; i < ageList.size(); i++) {
			System.out.println(ageList.get(i));
		}
		*/
		
		System.out.println("----------for-----------");
		for (int i = 0; i < ageList.size(); i++) {
			if (i!=1) {
				System.out.println(ageList.get(i));
			}
		}
		
		System.out.println("-----------foreach--------------");
		int i=0;
		for (Integer age : ageList) {
			if (i!=1) {
				System.out.println(age);
			}
			i++;
		}
		
		Iterator<Integer> iterator=ageList.iterator();
		
		System.out.println("-------------------------");
		while(iterator.hasNext()){
			Integer age=iterator.next();
			System.out.println(age);
		}
		
		
	}
	public static void basicApi() {
		
		ArrayList<Integer> ageList=new ArrayList<Integer>();
		
		ageList.add(20);
		ageList.add(25);
		ageList.add(30);
		
		//ageList.remove(0);
		
		int FirstAge=ageList.get(0);
		System.out.println(FirstAge);
		
		int size=ageList.size();
		System.out.println(size);
		
		boolean flag=ageList.isEmpty();
		System.out.println(flag);
		
		flag=ageList.contains(50);
		System.out.println(flag);
		
		System.out.println(ageList.set(0, 5));
		
		
		Member jack=new Borrower();
		jack.setId(1);
		jack.recharge(1000);
		ArrayList<Borrower> memberList=new ArrayList<Borrower>();
		memberList.add((Borrower)jack);
		for (Borrower borrower : memberList) {
			System.out.println(borrower);
		}
		
		
		
	}
}
