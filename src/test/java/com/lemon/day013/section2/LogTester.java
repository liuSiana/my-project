package com.lemon.day013.section2;

import org.apache.log4j.Logger;

public class LogTester {
	static Logger logger=Logger.getLogger(LogTester.class);
	public static void main(String[] args) {
		System.out.println("LogTester.mian()");
		logger.error("错误信息");
		logger.warn("警告信息");
		logger.info("提示信息");
		logger.debug("调试信息");
	}
}
