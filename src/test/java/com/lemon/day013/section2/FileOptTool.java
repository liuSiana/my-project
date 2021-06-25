package com.lemon.day013.section2;

import java.io.File;
import java.util.ArrayList;

public class FileOptTool {
	
	public static void deleteFile(String dirPath) {
		File dir=new File(dirPath);
		File[] subFiles=dir.listFiles();
		for (File subFile : subFiles) {
			if (subFile.isDirectory()) {
				deleteFile(subFile.getAbsolutePath());
			}else{
				subFile.delete();
			}
		}
		dir.delete();
	}
	static ArrayList<String> fileList=new ArrayList<String>();
	public static ArrayList<String> searchFile(String dirPath, String keyword) {
		File dir=new File(dirPath);
		File[] subFiles=dir.listFiles();
		for (File subFile : subFiles) {
			if (subFile.isDirectory()) {
				searchFile(subFile.getAbsolutePath(), keyword);
			}else{
				String fileName=subFile.getName();
				if (fileName.contains(keyword)) {
					fileList.add(subFile.getAbsolutePath());
				}
			}
		}
		return fileList;
				
	}


}
