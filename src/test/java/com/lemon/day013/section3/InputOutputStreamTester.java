package com.lemon.day013.section3;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreamTester {
	public static void main(String[] args) throws IOException {
		File sourceFile=new File("D:\\11.png");
		File targetFile=new File("D:\\22.png");
		
		FileInputStream is=new FileInputStream(sourceFile);
		FileOutputStream os=new FileOutputStream(targetFile);
		
		while(true){
			byte[] b=new byte[100];
			int lenth=is.read(b);
			System.out.println(lenth);
			if (lenth==-1) {
				break;
			}else {
				os.write(b);
			}
		}
		os.close();
		is.close();
		
	}

}
