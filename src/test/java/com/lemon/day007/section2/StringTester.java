package com.lemon.day007.section2;

public class StringTester {
	
	public static void main(String[] args) {
	String str="Hello#World!!";
	//以XX字符串开头
	//startWith
	Boolean flag=str.startsWith("abd");
	System.out.println(flag);
	
	//endWith 
	Boolean flag1=str.endsWith("!");
	System.out.println(flag1);
	
	//取部分字符串subString
	String subString=str.substring(3);
	System.out.println(subString);
	String subString1=str.substring(1, 7);//从索引1开始取，到索引7结束，不包含第7个字符
	System.out.println(subString1);
	System.out.println(str.substring(0,str.indexOf("o")));//从索引0开始取，到#号之前的字符串
	System.out.println("----------------------------------------");
	
	//以特定的字符分割字符串
	String[] arry=str.split("#");
	for (String string : arry) {
		System.out.print(string+"     ");
	}
	System.out.println();
	
	//字符串查找  indexOf  lastIndexOf 
	String str4="Hello#World#java4";
	int aint=str4.indexOf("#");//第一个字符出现的索引
	int bint=str4.lastIndexOf("#");//最后一个字符出现的索引
	System.out.println("####################");
	System.out.println(bint);
	
	//是否包含某个字符  contains
	Boolean flag5=str4.contains("Hello");
	System.out.println("flag5="+flag5);
	
	//字符串比较    equals   compareTo  ==
	String str1="Hello";
	String str2="hello";
	System.out.println("equals的对比结果"+str1.equals(str2));//对内容的比较
	System.out.println("compareTo对比结果"+str1.compareTo(str2));//compareTo()的返回值是int,它是先对比对应字符的大小(ASCII码顺序)
//	1如果字符串相等，返回0
//	2如果第一个字符和参数的第一个字符不等，结束比较，返回它们之间的差值（ASCII码值）如果是负数，则前面的字符串的值小于后面的字符串，如果是正数，则前面的字符串的值大于后面的字符串的值
//	3如果第一个字符和参数的第一个字符相等,则以第二个字符和参数的第二个字符做比较,以此类推,直至比较的字符或被比较的字符有一方全比较完,这时就比较字符的长度. 
	System.out.println("==========================");
	System.out.println("==的比较结果："+(str1==str2));//内存地址的比较
	
	//equalsIgnoreCase不区分大小写进行比较
	System.out.println("equalsIgnoreCase的比较结果："+str1.equalsIgnoreCase(str2));
	
	//拼接字符串  concat
	System.out.println("concat拼接字符串："+str1.concat(str2));
	
	//判断是否为空  isEmpty
	Boolean flag2=str.isEmpty();
	System.out.println(flag2);
	
	//去掉空格  trim
	String str6=" H ello ";
	System.out.println("去掉空格的结果："+str6.trim());
	
	//获取字符串的长度 lenth
	System.out.println("获取字符串的长度"+str6.length());
	
	//字符与字符串 toCharArry
	char[] chars=str.toCharArray();
//	System.out.println("循环之前的输出"+str.toCharArray());//执行完之后是一个字符串数组
	for (char c : chars) {
		System.out.println("循环输出所有字符串："+c);
	}
	
	//charAt  定位到字符串的某个位置
	char achar=str.charAt(1);
	System.out.println(achar);
	
	//�ֽ����ַ���  getBytes
	
	
	//大小写转换 toUpperCase toLowerCase
	System.out.println("转换成大写："+str.toUpperCase());
	System.out.println("转换成小写："+str.toLowerCase());
	
	//替换 replace replaceFirst replaceAll
	String str7="aaabbbccc";
	System.out.println("替换后的字符串："+str7.replace("aaa", "dddd"));
	
	//字符串描述  valueOf
	Integer integer=Integer.valueOf(9);
	Double double1=Double.valueOf(10);
	Float float1=Float.valueOf("10");
	
	Integer b=Integer.valueOf("18",16);//使用16进制
	System.out.println(integer);
	System.out.println(double1);
	System.out.println(float1);
	System.out.println(b);
	
	
}

}
