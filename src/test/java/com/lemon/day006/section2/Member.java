package com.lemon.day006.section2;

public class Member {
	// 1：类的属性/全局变量
	public int id;
	
	public String regName;
	
	public String mobilePhone;
	
	public String password;
	
	
	public Member(int id, String regName, String mobilePhone, String password) {
		super();
		this.id = id;
		this.regName = regName;
		this.mobilePhone = mobilePhone;
		this.password = password;
	}
	// 2：功能--》方法
	public static void register(String mobilePhoe,String pwd){

		if (mobilePhoe.length()!=11||(pwd.length()<6||pwd.length()>16)){
			System.out.println("手机号或密码格式不正确");
		}else {
			System.out.println("注册成功！");
		}
		
	}

	public void login(String mobilePhoe, String pwd) {
		// 登录方法

	}

	// 无参构造函数
	public Member() {

	}

	// 有参构造函数，方便在创建对象的时候对类的属性进行初始化
	public Member(String phone, String pwd) {
		// 将形式参数赋值给类的属性（全局变量）
			mobilePhone=phone;
			password=pwd;
		}
	public static void main(String[] args) {
		//使用带参构造方法创建一个对象
		Member bamboo=new Member("1821034252", "111111");
		//打印对象的属性，是完成赋值的ֵ
		System.out.println(bamboo.mobilePhone);
		System.out.println(bamboo.password);
//		bamboo.register("", "");//对象调用注册方法
		Member.register("", "");//如果所要调用的方法是静态的，可以使用类直接调用方法

		
	}

}
