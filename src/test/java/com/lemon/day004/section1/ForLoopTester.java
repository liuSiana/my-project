package com.lemon.day004.section1;

public class ForLoopTester {

	public static void main(String[] args) {
		
		for (int i = 1; i < 101; i++) {
			if(i%2==1){
				continue;
			}
			else{
				System.out.println(i);
			}
		}

	}

}
