package com.lemon.day016.section6;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class tester{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		insert();
		query();
	}

	private static void insert() throws ClassNotFoundException, SQLException {
		String sql="INSERT into member(regName,pwd,mobilephone) VALUES(?,?,?);";
		String regName="Jack";
		String pwd="123123";
		String mobilePhone="13200000000";
		JDBCUtil.excute(sql,regName,pwd,mobilePhone);
	}
	private static void query() throws ClassNotFoundException, SQLException {
		String sql="select * from member;";
		List<Map<String, Object>> resultList=JDBCUtil.excuteQuery(sql);
		for (Map<String, Object> memberMap : resultList) {
			for (Map.Entry<String, Object> entry : memberMap.entrySet()) {
				String columnName=entry.getKey();
				Object columnValue=entry.getValue();
				System.out.print("["+columnName+":"+columnValue+"]");
			}
			System.out.println();
		}
	}
}
