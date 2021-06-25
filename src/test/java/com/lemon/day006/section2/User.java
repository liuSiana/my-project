package com.lemon.day006.section2;


public class User {
public int id;
public String name;
public String phone;
public String pwd;

public void register(String phone,String pwd){
	if (phone.length()!=11||(pwd.length()<6||pwd.length()>16)){
		System.out.println("手机号或密码格式不正确！");
	}else {
		System.out.println("注册成功！");
	}
}

public User(int id, String name, String phone, String pwd) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
	this.pwd = pwd;
}

public static void main(String[] args) {
	User bamboo=new User(1, "Lily","1355555555","123456");
//	Member.register("135", "123");
	System.out.println(bamboo.id);
	
}

}
