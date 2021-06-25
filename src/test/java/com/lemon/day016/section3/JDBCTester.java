package com.lemon.day016.section3;

import java.io.IOException;
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
import java.util.Properties;

/**
 * 1：增删改查数据库 
 * 2：查询数据库
 * 
 * @author liuxinai
 *
 */
public class JDBCTester {
	/**
	 * 对数据库进行增、删、改
	 * 
	 * @param sql
	 *            sql语句
	 * @param params
	 *            对sql进行参数化的参数
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	/**
	 * 数据库连接的url
	 */
	private static String url;
	/**
	 * 连接数据库的用户名
	 */
	private static String user;
	/**
	 * 连接数据库的密码
	 */
	private static String password;
	/**
	 * 将连接数据库进行抽取静态代码块，整个类中只进行一次连接
	 */
	static {
		try {
			Properties properties = new Properties();
			properties.load(JDBCTester.class.getResourceAsStream("/jdbc.properties"));
			String driver = properties.getProperty("jdbc.driver");
			// 1：注册驱动类
			Class.forName(driver);
			// 2:创建数据库连接
			url = properties.getProperty("jdbc.url");
			user = properties.getProperty("jdbc.user");
			password = properties.getProperty("jdbc.password");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
/**
 * 创建连接的对象，并得到连接
 * @return
 */
	private static Connection getConnection() {
		Connection conn = null;
		try {

			conn = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
/**
 * 对数据库进行增，删，改的操作
 * @param sql sql语句
 * @param params sql语句中需要的参数
 */
	public static void excute(String sql, Object... params) {
		Connection conn = getConnection();
		PreparedStatement pstmt=null;

		try {
			// 3：得到预编译的陈述对象
			pstmt = conn.prepareStatement(sql);
			// 4：给sql语句中的参数设值
			for (int i = 0; i < params.length; i++) {
				pstmt.setObject(i + 1, params[i]);
			}
			// 5:执行
			pstmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close(conn, pstmt);
		}

	}
/**
 * 查询方法
 * @param sql sql语句
 * @param params 语句中需要的参数
 * @return
 */
	public static List<Map<String, String>> query(String sql, String... params) {
		Connection conn = getConnection();
		PreparedStatement pstmt=null;
		ResultSet resultSet=null;
		// 将数据保存在结果集中
		// 一个excel中的一行=数据库中的一行=一个java自定义的对象=hashMap=json字典=xml
		List<Map<String, String>> resultList = null;
		try {
			// 3：得到预编译的陈述对象
			pstmt = conn.prepareStatement(sql);
			// 4：给sql语句中的参数设值
			for (int i = 0; i < params.length; i++) {
				pstmt.setObject(i + 1, params[i]);
			}
			// 5:执行，并将执行结果保存在结果集中
			resultSet = pstmt.executeQuery();
			// 得到结果集中的原数据
			ResultSetMetaData metaData = resultSet.getMetaData();
			// 得到原数据的列数
			int columnCount = metaData.getColumnCount();
			resultList = new ArrayList<Map<String, String>>();
			while (resultSet.next()) {
				// 将列名和数据以map的形式进行存储
				Map<String, String> resultMap = new HashMap<String, String>();
				// 对所有列进行循环
				for (int i = 1; i <= columnCount; i++) {
					// 等到列名
					String ColumnName = metaData.getColumnName(i);
					// 得到列名对应的值
					String ColunmValue = resultSet.getString(i);
					resultMap.put(ColumnName, ColunmValue);
				}
				resultList.add(resultMap);
				return resultList;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close(conn, pstmt, resultSet);
		}

		return null;
	}
/**
 * 关闭资源
 * @param conn 数据库的连接
 * @param pstmt 预编译的陈述对象
 * @param resultSet 结果集
 */
	private static void close(Connection conn, PreparedStatement pstmt, ResultSet resultSet) {
		// 6：关闭资源
		close(conn, pstmt);
		if (resultSet!=null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	private static void close(Connection conn, PreparedStatement pstmt) {
		// 6：关闭资源
		if (pstmt!=null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		if (conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}
