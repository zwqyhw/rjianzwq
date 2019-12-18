package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Tice {
	static Connection lianjie=null;
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		//通过获得连接连接对象
		lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zzz?characterEncoding=utf8", "root", "zwqyhw");
		File file=new File("d:\\tice");
		File[] wenjian=file.listFiles();
		System.out.println(wenjian.length);
		for(File file2:wenjian) {
			System.out.println(file2);
			if(file2.getName().endsWith("xlsx")) {
				dwj_slsx(file2);
			}else if(file2.getName().endsWith("xls")) {
				dwj_slx(file2);
			}
			
		}

	}


	public static void dwj_slsx(File wjm) throws Exception {
		FileInputStream fin=new FileInputStream(wjm);
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		
		for(int i=0;i<rows;i++) {
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			if(xuehao.equals("学号")) {
				continue;
			}
			XSSFCell cell16=row.getCell(19);
			String zuo=cell16.getStringCellValue();
			
			XSSFCell cell17=row.getCell(20);
			String you=cell17.getStringCellValue();
			PreparedStatement ydy_yuju=lianjie.prepareStatement("update sheet1 set `左眼裸眼视力`=?,`右眼裸眼视力`=? where `学号`=?");
			ydy_yuju.setString(1, zuo);
			ydy_yuju.setString(2, you);
			ydy_yuju.setString(3, xuehao);
			ydy_yuju.executeUpdate();
		}
}
	public static void dwj_slx(File wjm) throws Exception {
		FileInputStream fin=new FileInputStream(wjm);
		HSSFWorkbook workbook=new HSSFWorkbook(fin);
		HSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		
		for(int i=0;i<rows;i++) {
			HSSFRow row=sheet.getRow(i);
			HSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			if(xuehao.equals("学号")) {
				continue;
			}
			HSSFCell cell16=row.getCell(19);
			String zuo=cell16.getStringCellValue();
			
			HSSFCell cell17=row.getCell(20);
			String you=cell17.getStringCellValue();
			PreparedStatement ydy_yuju=lianjie.prepareStatement("update sheet1 set `左眼裸眼视力`=?,`右眼裸眼视力`=? where `学号`=?");
			ydy_yuju.setString(1, zuo);
			ydy_yuju.setString(2, you);
			ydy_yuju.setString(3, xuehao);
			ydy_yuju.executeUpdate();
		}
}
}
