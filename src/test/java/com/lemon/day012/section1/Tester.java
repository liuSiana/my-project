package com.lemon.day012.section1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getStringLength(null);

	}
	public static void getStringLength(String str){
		try {
			System.out.println(str.length());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("");
		}
	}

}
