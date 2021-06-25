package com.lemon.day013.section1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterTester {

	public static void main(String[] args) throws IOException {
		File sourceFile=new File("C:\\A\\1.txt");
		File targetFile=new File("C:\\A\\2.txt");
		BufferedReader reader=new BufferedReader(new FileReader(sourceFile));
		BufferedWriter writer=new BufferedWriter(new FileWriter(targetFile));
		
		while(true){
			String line=reader.readLine();
			System.out.println(line);
			if (line==null) {
				break;
			}else {
				writer.write(line);
				writer.newLine();
			}
		}
		reader.close();
		writer.close();
	}

}
