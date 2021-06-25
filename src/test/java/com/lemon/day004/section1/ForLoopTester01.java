package com.lemon.day004.section1;

public class ForLoopTester01 {
	public static void main(String[] args) {
	/*	for (int i = 0; i <= 100; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}*/
		for (int i = 0; i <= 100; i++) {
			if (i%2==1) {
				continue;
			}
			System.out.println(i);
		}
	}

}
