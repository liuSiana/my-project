package com.lemon.day012.section2;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		deleteFile("C:\\A");

	}

	public static void deleteFile(String dirPath) {
		File dir=new File(dirPath);
		File[] subFiles=dir.listFiles();
		for (File subFile : subFiles) {
			if (subFile.isDirectory()) {
				deleteFile(subFile.getAbsolutePath());//
			}else{
				
				subFile.delete();
			}
		}
		
		dir.delete();
	}

}
