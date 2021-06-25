package com.lemon.day009.section1;

import java.util.HashMap;
import java.util.Set;

public class FreeTest {
	int id;
	String name;
	String mobilePhone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	
	
	@Override
	public String toString() {
		return "FreeTest [getId()=" + getId() + ", getName()=" + getName() + ", getMobilePhone()=" + getMobilePhone()
				+ "]";
	}
	public static void main(String[] args) {
		FreeTest user1=new FreeTest();
		user1.setId(1);
		user1.setName("tom");
		user1.setMobilePhone("13000000000");
		
		FreeTest user2=new FreeTest();
		user2.setId(2);
		user2.setName("lucy");
		user2.setMobilePhone("13000000001");
		
		HashMap<String, FreeTest> user=new HashMap<String, FreeTest>();
		user.put("tom", user1);
		user.put("lucy", user2);
		
		Set<String> keys=user.keySet();
		for (String string : keys) {
			System.out.println(string+","+user.get(string));
		}
 		
	}

}
