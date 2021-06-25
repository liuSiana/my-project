package com.lemon.day016.section2;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Tester {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		insert();
//		update();
//		delete();
		select();
//		StaticTester staticTester=new StaticTester();
	}
	private static void insert(){
		String sql="INSERT into member (regName,pwd,mobilePhone) VALUE(?,?,?)";
		JDBCUtil.excute(sql,"baby","123123123","18211111111");
	}
	private static void update(){
		String sql="UPDATE member SET leaveAmount=? WHERE regName=?;";
		JDBCUtil.excute(sql,3000.00,"baby");
	}
	private static void delete(){
		String sql="DELETE from member where regName=?;";
		JDBCUtil.excute(sql,"baby");
	}
	private static void select() {
		String sql="SELECT * from member;";
		List<Map<String, String>> memberList=JDBCUtil.query(sql);
		for (Map<String, String> memberMap : memberList) {
			for (Map.Entry<String, String> entry : memberMap.entrySet()) {
				String name=entry.getKey();
				String value=entry.getValue();
				System.out.print("["+name+":"+value+"]   ");
			}
			System.out.println();
		}
	}
}
