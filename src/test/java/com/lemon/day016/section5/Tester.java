package com.lemon.day016.section5;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Tester {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// insert();
		// update();
		// delete();
		query();
	}

	private static void insert() throws ClassNotFoundException, SQLException {
		String sql = "INSERT into member(regName,pwd,mobilephone) VALUES(?,?,?);";
		JDBCUtil.excute(sql, "Jack", "12345678", "18211111111");
	}

	private static void update() throws ClassNotFoundException, SQLException {
		String sql = "UPDATE member SET LeaveAmount=? WHERE regname=?;";
		JDBCUtil.excute(sql, 1000.0, "Jack");
	}

	private static void delete() throws ClassNotFoundException, SQLException {
		String sql = "delete from member where id=?;";
		JDBCUtil.excute(sql, 1);
	}

	private static void query() throws ClassNotFoundException, SQLException {
		String sql = "select regName,mobilePhone from member where id=9;";
		List<Map<String, Object>> resultList = JDBCUtil.queryExcute(sql);
		for (Map<String, Object> memberMap : resultList) {
			for (Map.Entry<String, Object> entry : memberMap.entrySet()) {
				String name = entry.getKey();
				Object value = entry.getValue();
				System.out.print("[" + name + ":" + value + "]   ");
			}
			System.out.println();
		}
	}

}
