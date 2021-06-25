package com.lemon.day012.section1;

public class Tester3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.lemon.day012.section1.Tester12");
			System.out.println("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("");
		}

	}

}
