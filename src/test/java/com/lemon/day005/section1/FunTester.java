package com.lemon.day005.section1;

public class FunTester {

	public static void main(String[] args) {
		/*//
		int aInt=20;
		int bInt=10;
		System.out.println(aInt+bInt);
		
		int cInt=1000;
		int dInt=1002;
		System.out.println(cInt+dInt);*/
//		int testResult=sum(10, 20);
//		System.out.println(testResult);
		
//		System.out.println(sum3(1,2,4,5,7));
		int[] arguments={1,2,3,4,5};
		System.out.println(add3(arguments));
		System.out.println("--------------------------------");
		System.out.println(sum4(1,2,3));
		

	}
	//������������ļӷ�����
	public static int sum(int a,int b){
		int result=a+b;
		return result;
	}
	//������ķ��������ȷ�������Ĳ���
	public static int sum2(int[] args) {
		int result=0;
		for (int i : args) {
			result+=i;
			
		}
		return result;
	}
	
	//�ɱ����
	public static int sum3(int...agrs){
		int result=0;
		for (int i : agrs) {
			result+=i;
		}
		
		return result;
		
	}
	public static int add3(int[] args) {
		int sum=0;
		for (int i : args) {
			sum+=i;
		}
		return sum;
	}
	public static int sum4(int ... args) {
		int sum=0;
		for (int i : args) {
			sum+=i;
		}
		return sum;
	}

}
