package com.lemon.day007.section3;

public class Investor extends Member{
		public Boolean recharge(double amount){
			Boolean flag=super.recharge(amount);
			if (flag) {
				System.out.println("投资人充值成功，可以去投资了！");
			}
			return flag;
		}
}
