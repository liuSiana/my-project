//package com.lemon.test;
//
//import java.io.InputStream;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//
//public class TestClass {
//	  public static Object[][] readExcel(String pathExcel,int sheetIndex,int startRow,int endRow,int startCell,int endCell){
//	        System.out.println("+++++++++++");
//	        //1����ȡExcel�ļ���������������Դ�ļ���Ϊ����
//	        InputStream is=TestClass.class.getResourceAsStream(pathExcel);
//	        //2����ù�����
//	        try {
//	            Workbook workbook=WorkbookFactory.create(is);
//	            System.out.println("��ȡ��������");
//	            // 3����ù�����--������ӿڱ��
//	            Sheet sheet=workbook.getSheetAt(sheetIndex);
//	            //4������У���ÿһ�н���ѭ��
//	            for (int i = startRow; i <=endRow ; i++) {
//	                Row row=sheet.getRow(i-1);
//	                System.out.println("���ǵ�"+i+"��");
//	                //5������У���ÿһ�н���ѭ��
//	                for (int j = startCell; j <=endCell ; j++) {
//	                    Cell cell=row.getCell(j-1);
//	                   String cellValue= cell.getStringCellValue();
//	                    System.out.println(cellValue);
//	                }
//	            }
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//	        return null;
//	}
//
//	    public static void main(String[] args) {
//	        readExcel("/api.xlsx",1,2,3,1,4);
//	    }
//
//}
