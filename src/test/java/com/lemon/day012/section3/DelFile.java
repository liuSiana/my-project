package com.lemon.day012.section3;

import java.io.File;

public class DelFile {
	public static void main(String[] args) {
		delDir("D:\\maven3.5");
	}

	public static void delDir(String fileDir) {
		File file=new File(fileDir);
		File[] files=file.listFiles();
		for (File subFile : files) {
			if (subFile.isDirectory()) {//判断是否是文件夹
				//如果是文件夹则返回到方法处
				delDir(subFile.getAbsolutePath());//获取该目录的绝对路径
				System.out.println(subFile.getAbsolutePath());
			}else{
				subFile.delete();
			}
		}
		file.delete();
	}
	

}
