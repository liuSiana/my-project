package com.lemon.day009.section1;

import java.util.ArrayList;

public class ContainerTester {
	public static void main(String[] args) {
		Member member=new Member();
		member.setId(1);
		member.setRegName("tom");
		ArrayList<Member> users=new ArrayList<Member>();
		users.add(member);
		for (Member member2 : users) {
			System.out.println(member2);
		}
	}

}
