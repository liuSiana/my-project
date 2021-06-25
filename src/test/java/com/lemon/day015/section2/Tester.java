package com.lemon.day015.section2;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Tester {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		insert();
//		update();
//		delete();
		select();
	}
	private static void insert() throws ClassNotFoundException, SQLException {
		String sql="INSERT into member (regName,pwd,mobilePhone) VALUE(?,?,?)";
		JDBCUtil.excute(sql,"baby","123123123","18211111111");
	}
	private static void update() throws ClassNotFoundException, SQLException {
		String sql="UPDATE member SET leaveAmount=? WHERE regName=?;";
		JDBCUtil.excute(sql,3000.00,"baby");
	}
	private static void delete() throws ClassNotFoundException, SQLException {
		String sql="DELETE from member where regName=?;";
		JDBCUtil.excute(sql,"baby");
	}
	private static void select() throws ClassNotFoundException, SQLException {
		String sql="SELECT * from member;";
		List<Map<String, Object>> memberList=JDBCUtil.query(sql);
		for (Map<String, Object> memberMap : memberList) {
			for (Map.Entry<String, Object> entry : memberMap.entrySet()) {
				String name=entry.getKey();
				Object value=entry.getValue();
				System.out.print("["+name+":"+value+"]   ");
			}
			System.out.println();
		}
	}
}
