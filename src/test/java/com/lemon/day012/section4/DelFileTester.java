package com.lemon.day012.section4;

import java.util.ArrayList;

import com.lemon.day012.util.FileUtil;

public class DelFileTester {
	public static void main(String[] args) {
//		FileUtil.delDir("D:\\maven3.5");
		ArrayList<String> fileList=FileUtil.findFile("D:\\maven3.5",".txt");
		for (String file : fileList) {
			System.out.println(file);
		}
	}



}
