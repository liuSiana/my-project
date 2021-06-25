package com.lemon.day015.section6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTester {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//     insert();
		query();
	}

	private static void insert() throws ClassNotFoundException, SQLException {
		//		1、注册一个数据库驱动
				Class.forName("com.mysql.jdbc.Driver");
		//		２、创建数据库连接
				String url="jdbc:mysql://10.2.2.15:3306/lxa_test";
				String userName="root";
				String pwd="Tiger2017";
				Connection connection=DriverManager.getConnection(url, userName, pwd);
//				3、创建一个陈述对象
				Statement stmt=connection.createStatement();
		//		4、使用数据库连接进行语句的执行
				String insertSQL="INSERT into member(regName,pwd,mobilephone) VALUES('Lucy','123456','18200000001');";
				stmt.execute(insertSQL);
				stmt.close();
				connection.close();
	}
	private static void query() throws ClassNotFoundException, SQLException {
		//		1、注册一个数据库驱动
				Class.forName("com.mysql.jdbc.Driver");
		//		２、创建数据库连接
				String url="jdbc:mysql://10.2.2.15:3306/lxa_test";
				String userName="root";
				String pwd="Tiger2017";
				Connection connection=DriverManager.getConnection(url, userName, pwd);
//				3、创建一个陈述对象
				Statement stmt=connection.createStatement();
		//		4、使用数据库连接进行语句的执行
				String querySQL="select * from member;";
				ResultSet resultSet=stmt.executeQuery(querySQL);
				while(resultSet.next()){
					int id=resultSet.getInt(1);
					String regName=resultSet.getString(2);
					String password=resultSet.getString(3);
					String mobilePhone=resultSet.getString(4);
					System.out.println(id+","+regName+","+password+","+mobilePhone);
				}
				stmt.close();
				connection.close();
	}

}
