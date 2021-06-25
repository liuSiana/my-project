package com.lemon.day014.section4;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class ReadXMLTester {
	public static void main(String[] args) throws DocumentException {
     List<Student> students=readXML();
     for (Student student : students) {
		System.out.println(student);
	}
	}

	private static List<Student> readXML() throws DocumentException {
		//		1:载入xml文件
				SAXReader saxReader=new SAXReader();
				Document document=saxReader.read(Reader.class.getResourceAsStream("/students.xml"));
		//		2：获取xml文件的根元素
				Element rootElement=document.getRootElement();
		//		3:获取子元素集合
				List<Element> subElementList=rootElement.elements();
		//		4:遍历子元素
				List<Student> students=new ArrayList<Student>();
				Student student=null;
				for (Element subElement : subElementList) {
					student=new Student();
					Attribute studentAttr=subElement.attribute("id");
					String studentAttrInfoId=studentAttr.getValue();
					student.setId(studentAttrInfoId);
					List<Element> studentInfos=subElement.elements();
					for (Element studentInfo : studentInfos) {
						String studentInfoName=studentInfo.getName();
						String studentInfoValue=studentInfo.getStringValue();
//						System.out.println(studentInfoName+studentInfoValue);
						if ("name".equals(studentInfoName)) {
							student.setName(studentInfoValue);
						}else if ("gender".equals(studentInfoName)) {
							student.setGender(studentInfoValue);
						}else if ("age".equals(studentInfoName)) {
							student.setAge(studentInfoValue);
						}else if ("className".equals(studentInfoName)) {
							student.setClassName(studentInfoValue);
						}
					}
					students.add(student);
				}
				return students;
	}

}
