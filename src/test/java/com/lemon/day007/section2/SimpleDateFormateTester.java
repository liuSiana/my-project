package com.lemon.day007.section2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateTester {
	public static void main(String[] args) {
		Date ss=new Date();
		System.out.println("获取当前的时间："+ss);
		System.out.println("时间戳："+ss.getTime());
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=simpleDateFormat.format(ss.getTime());
		System.out.println(""+time);
		SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("yyyy MM dd HH:mm:ss");
		String time1=simpleDateFormat1.format(ss.getTime());
		System.out.println(time1);
	}

}
