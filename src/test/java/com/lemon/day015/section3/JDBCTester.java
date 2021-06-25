package com.lemon.day015.section3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * JDBC:Java DataBase Connection
 * Java用来连接数据库的技术
 * 连接数据库：
 * 主机：120.78.128.25
 * 用户名：futurevistor
 * 密码：123456
 * 端口号：3306
 * @author liuxinai
 *
 */
public class JDBCTester{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		insertMethod("INSERT INTO member (RegName,Pwd,MobilePhone) VALUE(?,?,?)","Lily","123456","1320000000");
//		insertMethod("UPDATE member SET RegName='Lucy' where id=?;","101");
//		insertMethod("DELETE from member where id=?","101");
//		updateMethod();
//		deleteMethod();
		List<HashMap<String, Object>> list=queryMethod("select * from member;");
		for (HashMap<String, Object> hashMap : list) {
			for (Entry<String, Object> entry : hashMap.entrySet()) {
				String key=entry.getKey();
				Object value=entry.getValue();
				System.out.print("["+key+":"+value+"]");
			}
			System.out.println();
		}
	}

	public static void insertMethod(String sql,Object ...params) throws ClassNotFoundException, SQLException {
		//1：加载驱动文件
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://120.78.128.25:3306/future";
		String user="futurevistor";
		String password="123456";
		//2：创建一个数据库连接
		Connection conn=DriverManager.getConnection(url, user, password);
		//3：准备sql
//		String sql="INSERT INTO member (RegName,Pwd,MobilePhone) VALUE(?,?,?)";
		
		//4:创建一个陈述对象
//		Statement stmt=conn.createStatement();
		//预编译的方法，可以对sql语句进行预先检测
		PreparedStatement pstmt=conn.prepareStatement(sql);
		for (int i = 0; i < params.length; i++) {
			Object paramObj=params[i];
			pstmt.setObject(i+1,paramObj);
		}
		//5：执行sql
		pstmt.execute();
		//6：关闭资源
		pstmt.close();
		conn.close();
	}
	/*private static void updateMethod() throws ClassNotFoundException, SQLException {
		//1：加载驱动文件
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://120.78.128.25:3306/future";
		String user="futurevistor";
		String password="123456";
		//2：创建一个数据库连接
		Connection conn=DriverManager.getConnection(url, user, password);
		//3：准备sql
		String sql="UPDATE member SET RegName='Lucy' where id='94';";
		
		//4:创建一个陈述对象
		Statement stmt=conn.createStatement();
		//5：执行sql
		stmt.execute(sql);
		//6：关闭资源
		stmt.close();
		conn.close();
	}
	private static void deleteMethod() throws ClassNotFoundException, SQLException {
		//1：加载驱动文件
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://120.78.128.25:3306/future";
		String user="futurevistor";
		String password="123456";
		//2：创建一个数据库连接
		Connection conn=DriverManager.getConnection(url, user, password);
		//3：准备sql
		String sql="DELETE from member where id=?";
		
		//4:创建一个陈述对象
//		Statement stmt=conn.createStatement();
		PreparedStatement pstmt=conn.prepareStatement(sql);
		//5：执行sql
		pstmt.setString(1,"96");
		pstmt.execute();
		//6：关闭资源
		pstmt.close();
		conn.close();
	}*/
	private static List<HashMap<String, Object>> queryMethod(String sql,Object ...params) throws ClassNotFoundException, SQLException {
		//1：加载驱动文件
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://120.78.128.25:3306/future";
		String user="futurevistor";
		String password="123456";
		//2：创建一个数据库连接
		Connection conn=DriverManager.getConnection(url, user, password);
		//3：准备sql
//		String sql="select * from member;";		
		//4:创建一个陈述对象
		PreparedStatement pstmt=conn.prepareStatement(sql);
//		Statement stmt=conn.createStatement();
		int paramsLength=params.length;
		for (int i = 0; i < paramsLength; i++) {
			Object objectParam=params[i];
			pstmt.setObject(i+1, objectParam);
		}
		//5：执行sql,得到结果集
		ResultSet resultSet=pstmt.executeQuery();
		//得到原数据
		ResultSetMetaData recordsList=resultSet.getMetaData();
		//得到原数据的列数
		int columnCount=recordsList.getColumnCount();
		List<HashMap<String, Object>> resultList=new ArrayList<HashMap<String,Object>>();
		//当结果集中还有下一条数据时，进行循环
		while (resultSet.next()) {
			HashMap<String, Object> resultMap=new HashMap<String, Object>();
			for (int i = 1; i <= columnCount; i++) {
				String columnName=recordsList.getColumnName(i);
				Object columnValue=resultSet.getObject(i);
				resultMap.put(columnName, columnValue);
			}
			resultList.add(resultMap);
		}
		
		//6：关闭资源
		pstmt.close();
		conn.close();
		
		return resultList;
	}

}
