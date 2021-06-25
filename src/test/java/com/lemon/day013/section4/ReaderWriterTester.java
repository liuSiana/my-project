package com.lemon.day013.section4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterTester {
	public static void main(String[] args) {
		File sourceFile=new File("");
		File targetFile=new File("");
		BufferedReader reader=null;
		BufferedWriter writer=null;
		try {
			reader=new BufferedReader(new FileReader(sourceFile));
			writer=new BufferedWriter(new FileWriter(targetFile));
			
			while(true){
				String line=reader.readLine();
				if (line==null) {
					break;
				}else{
					writer.write(line);
					writer.newLine();
				}
			}
		} catch (IOException e) {
			
		}finally {
			try {
				writer.close();
				reader.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
