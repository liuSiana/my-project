package com.lemon.day015.section2;

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


public class JDBCUtil {

	public static void excute(String sql,Object ...params ) throws ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.jdbc.Driver");
		
		
		String url="jdbc:mysql://120.78.128.25:3306/future";
		String user="futurevistor";
		String password="123456";
		Connection conn=DriverManager.getConnection(url, user, password);
		
		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		int length=params.length;
		for(int i=0;i<length;i++){
			Object object=params[i];
			pstmt.setObject(i+1, object);
		}
		
		
		pstmt.execute();
		
		
		pstmt.close();
		conn.close();
	}

	public static List<Map<String, Object>> query(String sql,Object ...params) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		String url="jdbc:mysql://120.78.128.25:3306/future";
		String user="futurevistor";
		String password="123456";
		Connection conn=DriverManager.getConnection(url, user, password);
		
		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		int length=params.length;
		for(int i=0;i<length;i++){
			Object object=params[i];
			pstmt.setObject(i+1, object);
		}
		
		
		ResultSet resultSet=pstmt.executeQuery(sql);
		
		//excel中的一行=数据库中的一行=hashMap=json=xml
		List<Map<String, Object>> recordsList=new ArrayList<Map<String, Object>>();
		
		while(resultSet.next()){
			Map<String, Object> redordsMap=new HashMap<String, Object>();
			ResultSetMetaData metaData=resultSet.getMetaData();
			int columnCount=metaData.getColumnCount();
			for (int i = 1; i <= columnCount; i++) {
				String columnName=metaData.getColumnName(i);
				Object columnValue=resultSet.getObject(i);
				redordsMap.put(columnName, columnValue);
			}
			recordsList.add(redordsMap);
			
		}
		
		
		pstmt.close();
		conn.close();
		
		return recordsList;
	}
	
}
