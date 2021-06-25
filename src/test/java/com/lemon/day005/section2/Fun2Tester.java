package com.lemon.day005.section2;

public class Fun2Tester {
	public static void main(String[] args) {
		
		say("");
		
		int momey=parrotThing(5);
		System.out.println(momey);
	}
	public static void say(String world){
		System.out.println(world);
	}
	
	
/*	public static int parrotThing(int money){
		if (money<=5) {
			System.out.println("");
			return 0;
		}
		else{
			System.out.print("");
			return money;
		}
	}*/
	public static int parrotThing(int money) {
		
		boolean flag=validata(money);
		if (flag) {
			return money;
		}
		else {
			return 0;
		}
	}
	public static boolean validata(int money){
		if (money<5) {
			System.out.println("");
			return false;
		}
		else {
			System.out.println("");
			return true;
		}
	}

}
