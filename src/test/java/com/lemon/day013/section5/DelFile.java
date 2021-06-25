package com.lemon.day013.section5;

import java.io.File;

public class DelFile {
	public static void main(String[] args) {
		delDir("D:\\maven3.5");
	}

	public static void delDir(String path) {
		File file=new File(path);
		File[] subFiles=file.listFiles();
		for (File subFile : subFiles) {
			if (subFile.isDirectory()) {
				delDir(subFile.getAbsolutePath());
			}else {
				subFile.delete();
			}
		}
		file.delete();
	}

}
