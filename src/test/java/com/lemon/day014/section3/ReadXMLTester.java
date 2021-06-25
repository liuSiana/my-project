package com.lemon.day014.section3;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class ReadXMLTester {
	public static void main(String[] args) throws DocumentException {
		List<Student> list=readXML();
		for (Student student : list) {
			System.out.println(student);
		}
	}

	private static List<Student> readXML() throws DocumentException {
		//		1:加载xml文件
				SAXReader saxReader=new SAXReader();
				Document document=saxReader.read(ReadXMLTester.class.getResourceAsStream("/students.xml"));
		//		2：获取xml文件的根元素
				Element rootElement=document.getRootElement();
		//		3：获取子元素
				List<Element> elements=rootElement.elements();
				List<Student> students=new ArrayList<Student>();
				for (Element subElement : elements) {
					Student student=new Student();
					Attribute studentInfoIdAttr=subElement.attribute("id");
					String studentInfoIdValue=studentInfoIdAttr.getValue();
					student.setId(studentInfoIdValue);
					List<Element> studentInfoList=subElement.elements();
					for (Element studentInfo : studentInfoList) {
						String studentInfoName=studentInfo.getName();
						String studentInfoValue=studentInfo.getStringValue();
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
