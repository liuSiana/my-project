package com.lemon.day011.section6;

public class Tester {
	public static void main(String[] args) {
		//九九乘法表
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"X"+i+"="+i*j+",");
			}
			System.out.println();
		}
	}

}
