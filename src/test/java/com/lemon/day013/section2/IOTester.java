package com.lemon.day013.section2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

public class IOTester {
	private static Logger logger=Logger.getLogger(IOTester.class);

	public static void main(String[] args) {
		FileInputStream is=null;
		FileOutputStream os=null;
		try {
			File sourceFile=new File("C:\\A\\11.png");
			File targetFile=new File("C:\\A\\22.png");
			
			is=new FileInputStream(sourceFile);
			os=new FileOutputStream(targetFile);
			
			while (true) {
				byte[] data=new byte[1024];
				int length=is.read(data);
				if (length==-1) {
					break;
				}else {
					logger.info("");
					os.write(data, 0, length);
				}
			}

			
		} catch (Exception e) {
			logger.error("");
		}
		finally {	
			try {
				os.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
		
	}

}
