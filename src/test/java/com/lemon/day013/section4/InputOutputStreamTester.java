package com.lemon.day013.section4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreamTester {

	public static void main(String[] args) throws IOException {
		File sourceFile=new File("D:\\11.png");
		File targetFile=new File("D:\\22.png");
		
		FileInputStream iStream=new FileInputStream(sourceFile);
		FileOutputStream outputStream=new FileOutputStream(targetFile);
		
		while(true){
			byte[] b=new byte[1024];
			int lenth=iStream.read(b);
			if(lenth==-1){
				break;
			}else{
				outputStream.write(b, 0, lenth);
			}
		}
		outputStream.close();
		iStream.close();

	}

}
