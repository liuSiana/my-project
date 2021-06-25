package com.lemon.day015.section5;

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

/**
 * 1：增删改查数据库
 * 2：查询数据库
 * @author liuxinai
 *
 */
public class JDBCTester {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		excute("INSERT INTO member (RegName,Pwd,MobilePhone) VALUE(?,?,?)", "Summer","111111","13100000000");
		String sql="select RegName from member where id=?;";
		List<Map<String, Object>> resultList=query(sql,"111");
		for (Map<String, Object > map : resultList) {
			for (Entry<String, Object> entry : map.entrySet()) {
				System.out.print("["+entry.getKey()+":"+entry.getValue()+"]");
			}
			System.out.println();
		}
	}
	/**
	 * 对数据库进行增、删、改
	 * @param sql sql语句
	 * @param params 对sql进行参数化的参数
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void excute(String sql,Object ...params) throws ClassNotFoundException, SQLException{
		//1：注册驱动类
		Class.forName("com.mysql.jdbc.Driver");
		//2:创建数据库连接
		String url="jdbc:mysql://120.78.128.25:3306/future";
		String user="futurevistor";
		String password="123456";
		Connection conn=DriverManager.getConnection(url, user, password);
		
		//3：得到预编译的陈述对象
		PreparedStatement pstmt=conn.prepareStatement(sql);
		//4：给sql语句中的参数设值
		for (int i = 0; i < params.length; i++) {
			pstmt.setObject(i+1, params[i]);			
		}
		//5:执行
		pstmt.execute();
		//6：关闭资源
		pstmt.close();
		conn.close();
		
	}
	public static List<Map<String, Object>> query(String sql,Object ...params) throws ClassNotFoundException, SQLException{
		//1：注册驱动类
		Class.forName("com.mysql.jdbc.Driver");
		//2:创建数据库连接
		String url="jdbc:mysql://120.78.128.25:3306/future";
		String user="futurevistor";
		String password="123456";
		Connection conn=DriverManager.getConnection(url, user, password);
		
		//3：得到预编译的陈述对象
		PreparedStatement pstmt=conn.prepareStatement(sql);
		//4：给sql语句中的参数设值
		for (int i = 0; i < params.length; i++) {
			pstmt.setObject(i+1, params[i]);			
		}
		//5:执行，并将执行结果保存在结果集中
		ResultSet resultSet=pstmt.executeQuery();
		//得到结果集中的原数据
		ResultSetMetaData metaData=resultSet.getMetaData();
		//得到原数据的列数
		int columnCount=metaData.getColumnCount();
		//将数据保存在结果集中
		List<Map<String, Object>> resultList=new ArrayList<Map<String, Object>>();
		while(resultSet.next()){
			//将列名和数据以map的形式进行存储
			Map<String, Object> resultMap=new HashMap<String, Object>();
			//对所有列进行循环
			for (int i = 1; i <= columnCount; i++) {
				//等到列名
				String ColumnName=metaData.getColumnName(i);
				//得到列名对应的值
				Object ColunmValue=resultSet.getObject(i);
				resultMap.put(ColumnName, ColunmValue);
			}
			resultList.add(resultMap);
		}
		//6：关闭资源
		pstmt.close();
		conn.close();
		
		return resultList;		
	}

}
