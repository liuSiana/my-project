package com.lemon.day012.section2;

public class FactorialTester {

	public static void main(String[] args) {
		System.out.println(factorial(3));

	}
	
	public static int factorial(int num){
		//num!=num*(num-1)!;
		if (num==0) {
			return 1;
		}else{
			num=num*factorial(num-1);
		}
		return num;
	}

}
