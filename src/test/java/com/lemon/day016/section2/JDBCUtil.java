package com.lemon.day016.section2;

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
import java.util.Properties;

public class JDBCUtil {
	/**
	 * 数据库的连接地址url
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

	static {
		try {
			// 连接数据库
			// 解析properties文件
			Properties properties = new Properties();
			properties.load(JDBCUtil.class.getResourceAsStream("/jdbc.properties"));
			String driver = properties.getProperty("jdbc.driver");
			Class.forName(driver);
			// 获取配置文件中的数据
			url = properties.getProperty("jdbc.url");
			user = properties.getProperty("jdbc.user");
			password = properties.getProperty("jdbc.password");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return 返回连接
	 */
	private static Connection getConnection() {

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;

	}

	/**
	 * 对数据库进行增、删、改
	 * 
	 * @param sql
	 * @param params
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void excute(String sql, Object... params) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			// 4对数据库进行预编译
			int length = params.length;
			for (int i = 0; i < length; i++) {
				Object object = params[i];
				pstmt.setObject(i + 1, object);
			}

			// 5:ִ执行数据的操作
			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 关闭资源
			close(conn, pstmt);
		}
	}

	/**
	 * 查询数据库
	 * 
	 * @param sql
	 * @param params
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static List<Map<String, String>> query(String sql, Object... params) {
		Connection conn = getConnection();
		List<Map<String, String>> recordsList = new ArrayList<Map<String, String>>();
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;
		try {
			pstmt = conn.prepareStatement(sql);
			// 对数据库进行预编译
			int length = params.length;
			for (int i = 0; i < length; i++) {
				Object object = params[i];
				pstmt.setObject(i + 1, object);
			}

			// 5:操作数据库ִ
			resultSet = pstmt.executeQuery(sql);

			// excel表格中的一行=数据库中的一行=一个java自定义类对象=hashMap=json=xml

			while (resultSet.next()) {
				Map<String, String> redordsMap = new HashMap<String, String>();
				ResultSetMetaData metaData = resultSet.getMetaData();
				int columnCount = metaData.getColumnCount();
				for (int i = 1; i <= columnCount; i++) {
					String columnName = metaData.getColumnName(i);
					String columnValue = resultSet.getString(i);
					redordsMap.put(columnName, columnValue);
				}
				recordsList.add(redordsMap);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 关闭资源
			close(conn, pstmt, resultSet);
		}

		return recordsList;
	}
/**
 * 关闭资源
 * @param conn 关闭连接
 * @param pstmt 关闭陈述对象
 * @param resultSet 关闭结果集
 */
	private static void close(Connection conn, PreparedStatement pstmt, ResultSet resultSet) {
			if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			close(conn, pstmt);
		}
	}
/**
 * 关闭资源
 * @param conn 数据库连接
 * @param pstmt 陈述对象
 */
	private static void close(Connection conn, PreparedStatement pstmt) {
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
