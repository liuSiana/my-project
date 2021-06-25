package com.lemon.day016.section4;

import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) {
		
		readPropertiesFile();
	}
	public static void readPropertiesFile(){
		try {
			Properties properties=new Properties();
			properties.load(ReadPropertiesFile.class.getResourceAsStream("/user.properties"));
			String name=properties.getProperty("name");
			String age=properties.getProperty("age");
			String address=properties.getProperty("address");
			System.out.println(name+age+address);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
