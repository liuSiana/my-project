package com.lemon.day016.section6;

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
	private static Connection getConnection() {
		Connection conn = null;
		Properties properties = new Properties();

		try {
			properties.load(JDBCUtil.class.getResourceAsStream("/jdbc.properties"));
			String driverName = properties.getProperty("jdbc.driver");
			String url = properties.getProperty("jdbc.url");
			String user = properties.getProperty("jdbc.user");
			String password = properties.getProperty("jdbc.password");
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void excute(String sql, Object... params) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			int paramsLen = params.length;
			for (int i = 0; i < paramsLen; i++) {
				pstmt.setObject(i + 1, params[i]);
			}
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt);

		}

	}

	public static List<Map<String, Object>> excuteQuery(String sql, Object... params) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;
		List<Map<String, Object>> resultList = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			int paramsLen = params.length;
			for (int i = 0; i < paramsLen; i++) {
				pstmt.setObject(i + 1, params[i]);
			}
			resultList = new ArrayList<Map<String, Object>>();
			resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				Map<String, Object> resultMap = new HashMap<String, Object>();
				ResultSetMetaData resultMetaData = resultSet.getMetaData();
				int columnCount = resultMetaData.getColumnCount();
				for (int i = 1; i <= columnCount; i++) {
					String columnName = resultMetaData.getColumnName(i);
					Object columnValue = resultSet.getObject(i);
					resultMap.put(columnName, columnValue);
				}
				resultList.add(resultMap);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt, resultSet);
		}

		return resultList;
	}

	private static void close(Connection conn, PreparedStatement pstmt) {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	private static void close(Connection conn, PreparedStatement pstmt, ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		close(conn, pstmt);
	}

}
