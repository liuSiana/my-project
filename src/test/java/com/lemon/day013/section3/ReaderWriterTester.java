package com.lemon.day013.section3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterTester {
	public static void main(String[] args) throws IOException {
		File sourceFile=new File("D:\\1.txt");//资源文件
		File targetFile=new File("D:\\2.txt");//目标文件
		
		BufferedReader reader=new BufferedReader(new FileReader(sourceFile));
		BufferedWriter writer=new BufferedWriter(new FileWriter(targetFile));
		
		while (true) {
			String line=reader.readLine();
			System.out.println(line);
			if (line==null) {
				break;
			}else {
				writer.write(line);
				writer.newLine();
			}
		}
		writer.close();
		reader.close();
	}

}
