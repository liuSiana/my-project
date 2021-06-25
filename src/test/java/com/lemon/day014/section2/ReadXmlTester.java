package com.lemon.day014.section2;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ReadXmlTester {

	public static void main(String[] args) throws DocumentException {
		List<Student> students=readXML();
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private static List<Student> readXML() throws DocumentException {
		// 1：创建SaxReader对象
		SAXReader saxReader=new SAXReader();
		//2：读取一个文件
		Document document=saxReader.read(ReadXmlTester.class.getResourceAsStream("/students.xml"));//从类的根路径下去找
		//3：获取根元素
		Element rootElement=document.getRootElement();
		//获取根元素的名称
		String name=rootElement.getName();
		//获取根元素下的所有子元素的list
		List<Element> subElements=rootElement.elements();
		//创建一个学生的list对象，将所有解析出来的学生信息添加到学生对象中
		List<Student> students=new ArrayList<Student>();
		//循环遍历子元素list
		for (Element subElement : subElements) {
			Student student=new Student();
			//获取子元素的属性
			Attribute elementAttr=subElement.attribute("id");
			//获得属性的值
			String idValue=elementAttr.getValue();
//			System.out.print("id-->"+idValue+",");
			//将属性的值添加到student对象中
			student.setId(idValue);
			//获取孙子元素的list
			List<Element> studentInfos=subElement.elements();
//			System.out.println(studentInfos.size());
			//遍历孙子元素的list--学生信息
			for (Element studentInfo : studentInfos) {
				//获取学生信息的元素名称
				String studentInfoName=studentInfo.getName();
				//获取孙子元素的值
				String studentInfoValue=studentInfo.getStringValue();
//				System.out.print(studentInfoName+"-->"+studentInfoValue+",");
				//将学生信息元素的值设置到对应元素中
				if ("name".equals(studentInfoName)) {
					student.setName(studentInfoValue);
				}else if ("age".equals(studentInfoName)) {
					student.setAge(studentInfoValue);
				}else if ("gender".equals(studentInfoName)) {
					student.setGender(studentInfoValue);		
				}else if ("class".equals(studentInfoName)) {
					student.setClassName(studentInfoValue);
				}
			}
			//添加学生信息到学生对象中
			students.add(student);
		}
		return students;
	}

}
