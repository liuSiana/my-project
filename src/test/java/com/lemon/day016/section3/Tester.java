package com.lemon.day016.section3;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Tester {
	public static void main(String[] args){
		JDBCTester jdbcTester=new JDBCTester();
//		excute("INSERT INTO member (RegName,Pwd,MobilePhone) VALUE(?,?,?)", "Summer","111111","13100000000");
		String sql="select * from member;";
		List<Map<String, String>> resultList=JDBCTester.query(sql);
		for (Map<String, String> map : resultList) {
			for (Entry<String, String> entry : map.entrySet()) {
				System.out.print("["+entry.getKey()+":"+entry.getValue()+"]");
			}
			System.out.println();
		}
	}
}
