package com.lemon.day013.section2;

import java.util.ArrayList;

public class Tester {
	public static void main(String[] args) {
	
		FileOptTool.deleteFile("C:\\B");
		
		
		ArrayList<String> fileList=FileOptTool.searchFile("C:\\C",".txt");
		for (String file : fileList) {
			System.out.println(file);
		}
	}
}
