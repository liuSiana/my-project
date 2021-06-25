package com.lemon.day012.util;

import java.io.File;
import java.util.ArrayList;
/**
 * 文件工具包
 * @author liuxinai
 *
 */
public class FileUtil {
	/**
	 * 删除一个文件夹：
	 * 1、删除文件夹的时候必须先删除文件夹下的所有文件
	 * 2、删除文件之后再把文件夹进行删除
	 * @param pathname
	 */
	public static void delDir(String pathname) {
		File file=new File(pathname);
		
		try {
			File[] files=file.listFiles();
			for (File subFile : files) {
				if (subFile.isDirectory()) {
					delDir(subFile.getAbsolutePath());
					System.out.println(subFile.getAbsolutePath());
				}else{
					subFile.delete();//删除文件夹下的文件
				}
			}
			file.delete();//删除文件夹
		} catch (Exception e) {
			System.out.println("文件不存在");
			e.printStackTrace();
		}
	}
/**
 * 在一个文件夹中搜索文件
 */
	//创建一个全局变量，存储每次遍历得到的文件名，避免在递归过程中重新创建池子，导致只保存最后的结果
	static ArrayList<String> fileAbsolutePathList=new ArrayList<String>();
	
	public static ArrayList<String> findFile(String pathname, String keyword) {
		//创建一个文件
		File file=new File(pathname);
		//得到所有的子文件列表
		File[] subFiles=file.listFiles();
		//循环这些子文件
		for (File subfile : subFiles) {
			//判断是否为文件夹
			//如果是文件夹，重新调用方法，进入下一级
			if (subfile.isDirectory()) {
				findFile(subfile.getAbsolutePath(), keyword);
			}else {
				//如果是文件，得到文件名称
				String fileName=subfile.getName();
				//对比文件名称是否包含关键词，如果包含，得到文件的绝对路径
				if (fileName.contains(keyword)) {
					String fileAbsolutePath=subfile.getAbsolutePath();
					fileAbsolutePathList.add(fileAbsolutePath);
				}
			}
			
		}
		return fileAbsolutePathList;
	}
	

}
