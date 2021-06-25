package com.lemon.day015.section2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTester {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		insert("Lucy","12345678","13211111111");
//		update();
//		select();
//		delete();
	}
	

	private static void insert(String regName,String pwd,String mobilephone) throws ClassNotFoundException, SQLException {
		//
		Class.forName("com.mysql.jdbc.Driver");
		
		//
		String url="jdbc:mysql://120.78.128.25:3306/future";
		String user="futurevistor";
		String password="123456";
		Connection conn=DriverManager.getConnection(url, user, password);
		
		//
		String sql="INSERT into member (regName,pwd,mobilePhone) VALUE(?,?,?)";
		
		//
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, regName);
		pstmt.setString(2,pwd);
		pstmt.setString(3, mobilephone);
		
		//
		pstmt.execute();
		
		
		pstmt.close();
		conn.close();
	}
	private static void update() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		String url="jdbc:mysql://120.78.128.25:3306/future";
		String user="futurevistor";
		String password="123456";
		Connection conn=DriverManager.getConnection(url, user, password);
		
		
		String sql="UPDATE member SET leaveAmount='3000.00' WHERE regName='lily'";
		
		
		Statement stmt=conn.createStatement();
		
		
		stmt.execute(sql);
		
		
		stmt.close();
		conn.close();
	}
	private static void select() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		String url="jdbc:mysql://120.78.128.25:3306/future";
		String user="futurevistor";
		String password="123456";
		Connection conn=DriverManager.getConnection(url, user, password);
		
		//
		String sql="select * from member";
		
		
		Statement stmt=conn.createStatement();
		
		
		ResultSet resultSet=stmt.executeQuery(sql);
		while(resultSet.next()){
			int id=resultSet.getInt(1);
			String regName=resultSet.getString(2);
			String pwd=resultSet.getString(3);
			String mobilePhone=resultSet.getString(4);
			System.out.println(id+","+regName+","+pwd+","+mobilePhone);
			
		}
		
		
		stmt.close();
		conn.close();
	}
	private static void delete() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		String url="jdbc:mysql://120.78.128.25:3306/future";
		String user="futurevistor";
		String password="123456";
		Connection conn=DriverManager.getConnection(url, user, password);
		
		
		String sql="delete from member where regName='lily'";
		
		
		Statement stmt=conn.createStatement();
		
		
		stmt.execute(sql);
					
		
		stmt.close();
		conn.close();
	}


}
