package com.lemon.day013.section1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTester {

	public static void main(String[] args) throws IOException {
		File sourceFile=new File("C:\\A\\11.png");
		File targetFile=new File("C:\\A\\22.png");
		
		FileInputStream is=new FileInputStream(sourceFile);
		FileOutputStream os=new FileOutputStream(targetFile);
		
		while (true) {
			byte[] data=new byte[1024];
			int length=is.read(data);
			System.out.println(length);
			if (length==-1) {//
				break;
			}else {
				os.write(data, 0, length);
			}
		}
		os.close();
		is.close();

	}

}
