package com.lemon.day016.section2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readPropertiesFile {

	public static void readFile() throws IOException{
		Properties properties=new Properties();
		//1:
//		InputStream inputStream=new FileInputStream("/src/test/resources/user.properties");
//		properties.load(inputStream);
		//2：
		properties.load(readPropertiesFile.class.getResourceAsStream("/user.properties"));
		String name=properties.getProperty("name");
		String age=properties.getProperty("age");
		String address=properties.getProperty("address");
		System.out.println(name+age+address);
		
	}
	public static void main(String[] args) throws IOException {
		readPropertiesFile.readFile();
	}
}
