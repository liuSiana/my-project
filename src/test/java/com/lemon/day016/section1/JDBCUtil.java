package com.lemon.day016.section1;

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
	
	private static String url;

	private static String user;
	
	private static String password;

	static {
		try {
			
			Properties properties = new Properties();
			properties.load(JDBCUtil.class.getResourceAsStream("/jdbc.properties"));
			String driver = properties.getProperty("jdbc.driver");
			Class.forName(driver);
			
			url = properties.getProperty("jdbc.url");
			user = properties.getProperty("jdbc.user");
			password = properties.getProperty("jdbc.password");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	private static Connection getConnection() {

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;

	}


	public static void excute(String sql, Object... params) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			
			int length = params.length;
			for (int i = 0; i < length; i++) {
				Object object = params[i];
				pstmt.setObject(i + 1, object);
			}

			
			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			close(conn, pstmt);
		}
	}


	public static List<Map<String, Object>> query(String sql, Object... params) {
		Connection conn = getConnection();
		List<Map<String, Object>> recordsList = new ArrayList<Map<String, Object>>();
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;
		try {
			pstmt = conn.prepareStatement(sql);
			
			int length = params.length;
			for (int i = 0; i < length; i++) {
				Object object = params[i];
				pstmt.setObject(i + 1, object);
			}

			
			resultSet = pstmt.executeQuery(sql);


			while (resultSet.next()) {
				Map<String, Object> redordsMap = new HashMap<String, Object>();
				ResultSetMetaData metaData = resultSet.getMetaData();
				int columnCount = metaData.getColumnCount();
				for (int i = 1; i <= columnCount; i++) {
					String columnName = metaData.getColumnName(i);
					Object columnValue = resultSet.getObject(i);
					redordsMap.put(columnName, columnValue);
				}
				recordsList.add(redordsMap);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			close(conn, pstmt, resultSet);
		}

		return recordsList;
	}

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

	private static void close(Connection conn, PreparedStatement pstmt) {
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
