package com.lemon.day012.section4;

public class Factorial {
	public static void main(String[] args) {
		int num=factorial(-4);
		System.out.println(num);
	}

	public static int factorial(int num) {
		if (num >=0) {
			if (num==0) {
				return 1;
			}else {
				return num*factorial(num-1);
			}
			
		}else {
			return 0;
		}
	
	}
	

}
