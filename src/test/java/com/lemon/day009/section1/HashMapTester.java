package com.lemon.day009.section1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapTester {

	public static void main(String[] args) {
		HashMap<String, Member> map=new HashMap<String,Member>();
		Member tom=new Member();
		tom.setRegName("tom");
		tom.setId(1);
		tom.setLeaveAmount(100);
		Member jack=new Member();
		jack.setRegName("jack");
		map.put("user1", tom);
		map.put("user2", jack);
		map.put("user3", jack);
		map.put("user4", tom);
		System.out.println(map.get("user1").getRegName());
		System.out.println(map.get("user1").getId());
		System.out.println(map.get("user1").getLeaveAmount());
		System.out.println(map.size());
		
		/*map.remove("user3");
		System.out.println(map.get("user3").getRegName());*/
		
		
		Set<String> keys=map.keySet();
		for (String key : keys) {
			System.out.println("key:"+key+",ֵ"+map.get(key));
		}
		
//		ֵ
//		Collection<Member> memberColl=map.values();
//		for (Member member : memberColl) {
//			System.out.println(member);
//		}
	}

}
