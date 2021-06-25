package com.lemon.day016.section5;


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
/**
 * JDBC连接数据库并操作数据库
 * @author liuxinai
 *
 */
public class JDBCUtil {
	/**
	 * 增、删、改
	 * @param sql：sql语句
	 * @param params：对应的sql语句中的参数，为可变参数
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void excute(String sql,Object...params) throws ClassNotFoundException, SQLException {
//		1、注册一个驱动程序
		Class.forName("com.mysql.jdbc.Driver");
//		2、创建数据库连接
		String url="jdbc:mysql://10.2.2.15:3306/lxa_test";
		String user="root";
		String password="Tiger2017";
		Connection conn=DriverManager.getConnection(url, user, password);
//		3、创建预编译的陈述对象
		PreparedStatement pstmt=conn.prepareStatement(sql);
		int paramsLen=params.length;
		for(int i=0;i<paramsLen;i++){
			pstmt.setObject(i+1, params[i]);
		}
//		4、执行sql语句
		pstmt.execute();
//		5、关闭所有资源
		pstmt.close();
		conn.close();
	}
/**
 * 查询数据库
 * @param sql 查询语句
 * @param params 查询语句中所需的条件参数
 * @return 返回一个结果List，List中存储的是一个一个的Map，一个结果的列名和该列对应的值
 * @throws ClassNotFoundException
 * @throws SQLException
 */
	public static List<Map<String, Object>> queryExcute(String sql,Object...params) throws ClassNotFoundException, SQLException {
//		1、创建一个驱动程序
		Class.forName("com.mysql.jdbc.Driver");
//		2、创建数据库连接
		String url="jdbc:mysql://10.2.2.15:3306/lxa_test";
		String user="root";
		String password="Tiger2017";
		Connection conn=DriverManager.getConnection(url, user, password);
//		3、创建预编译陈述对象
		PreparedStatement pstmt=conn.prepareStatement(sql);
		int paramsLen=params.length;
		for(int i=0;i<paramsLen;i++){
			pstmt.setObject(i+1, params[i]);
		}
//		4、执行sql
		ResultSet resultSet=pstmt.executeQuery();
		//获取结果集的元数据
		ResultSetMetaData resultData=resultSet.getMetaData();
		//获取元数据的列数
		int columnCount=resultData.getColumnCount();
		/**
		 * 一个excel中的一行=数据库中的一行=一个java自定义类对象=hashmap=json字典=xml
		 */
		List<Map<String, Object>> resultList=new ArrayList<Map<String,Object>>();
		//创建一个Map用来存储查询结果中的列名和对应的值
		Map<String, Object> resultMap;
		//使用while循环，如果结果集中还有下一条数据就进行循环
		while(resultSet.next()){
			resultMap=new HashMap<String, Object>();
			//循环取出每一列对应的列名和该列对应的值
			for(int i=1;i<=columnCount;i++){
				String columnName=resultData.getColumnName(i);
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
