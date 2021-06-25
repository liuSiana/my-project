package com.lemon.day015.section4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class JDBCTester {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String sql="INSERT INTO member (RegName,Pwd,MobilePhone) VALUE(?,?,?)";
//		excute(sql,"Tom","12121212","13100000000");
		List<Map<String, Object>> list=query("select * from member;");
		for (Map<String, Object> map : list) {
			for (Entry<String, Object> result : map.entrySet()) {
				System.out.print("["+result.getKey()+result.getValue()+"]");
			}
			System.out.println();
		}
	}

	public static void excute(String sql,Object ...params) throws ClassNotFoundException, SQLException {
		//1：注册数据库驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2：建立数据库连接
		String url="JDBC:mysql://120.78.128.25:3306/future";
		String user="futurevistor";
		String password="123456";
		Connection conn=DriverManager.getConnection(url, user, password);
		//进行数据库与预编译
		PreparedStatement pstmt=conn.prepareStatement(sql);
		//对sql语句进行预设值
		for (int i = 0; i < params.length; i++) {
			pstmt.setObject(i+1, params[i]);
		}
		//执行
		pstmt.execute();
		
		pstmt.close();
		conn.close();
	}
	public static List<Map<String, Object>> query(String sql,Object ...params) throws ClassNotFoundException, SQLException {
		//1：注册数据库驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2：建立数据库连接
		String url="JDBC:mysql://120.78.128.25:3306/future";
		String user="futurevistor";
		String password="123456";
		Connection conn=DriverManager.getConnection(url, user, password);
		//进行数据库与预编译
		PreparedStatement pstmt=conn.prepareStatement(sql);
		//对sql语句进行预设值
		for (int i = 0; i < params.length; i++) {
			pstmt.setObject(i+1, params[i]);
		}
		//执行
		ResultSet resultSet=pstmt.executeQuery();
		//执行结果是一个用list的数据载体进行接收
		List<Map<String, Object>> resultList=new ArrayList<Map<String,Object>>();
		//得到数据库的原数据
		ResultSetMetaData metaData=pstmt.getMetaData();
		//得到原数据的列数
		int columnCount=metaData.getColumnCount();
		while(resultSet.next()){
			Map<String, Object> resultMap=new HashMap<String, Object>();
			for (int i = 1; i <= columnCount; i++) {
				String columnName=metaData.getColumnName(i);
				Object columnValue=resultSet.getObject(i);
				resultMap.put(columnName, columnValue);
			}
			resultList.add(resultMap);
		}
		
		pstmt.close();
		conn.close();
		
		return resultList;
	}

}
