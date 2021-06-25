package com.lemon.day006.section1;


public class Member {
	
	public int id;
	
	public String regName;
	
	public String mobilePhone;
	
	public String password;
	
	
	
	public void register(String mobilePhoe,String pwd){
		
		if (mobilePhoe.length()!=11||(pwd.length()<6||pwd.length()>16)){
			System.out.println("");
		}else {
			System.out.println("");
		}
		
	}
	public void login(String mobilePhoe,String pwd){
		
		
	}
	public static void main(String[] args) {
		
		
		Member action=new Member();
		
		Member member =null;
		member = new Member();
		
		
//		action.mobilePhone;
		
		
	
		String phone=action.mobilePhone="18210342582";
		int id=action.id=1;
		String pwd=action.password="123456";
		
		
		action.register(phone, pwd);
	}

}
