package com.lemon.day012.section3;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(-100));

	}
	/**
	 * 求一个数的阶乘
	 * 5!=5X4X3X2X1
	 * 4!=4X3X2X1
	 * 3!=3X2X1
	 * 那么 5!=5X4!
	 */
	public static int factorial(int num){
		if (num>=0) {
			if (num==0) {
				return 1;
			}else{
				return num*factorial(num-1);
			}
		}else{
			return 0;
		}
		
	}

}
