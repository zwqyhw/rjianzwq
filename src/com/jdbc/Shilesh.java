package com.jdbc;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Shilesh {

	public static void main(String[] args) throws Exception {
			FileInputStream fin=new FileInputStream("shili.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(fin);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			int rows=sheet.getLastRowNum();
			for(int i=0;i<rows;i++) {
				XSSFRow row=sheet.getRow(i);
				XSSFCell cell=row.getCell(3);
				String xuehao=cell.getStringCellValue();
				
				XSSFCell cell16=row.getCell(15);
				String zuo=cell16.getStringCellValue();
				
				XSSFCell cell17=row.getCell(16);
				String you=cell17.getStringCellValue();
				
				Class.forName("com.mysql.jdbc.Driver");
				//通过获得连接连接对象
				Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zzz?characterEncoding=utf8", "root", "zwqyhw");
				PreparedStatement ydy_yuju=lianjie.prepareStatement("update sheet1 set `左眼裸眼视力`=?,`右眼裸眼视力`=? where `学号`=?");
				ydy_yuju.setString(1, zuo);
				ydy_yuju.setString(2, you);
				ydy_yuju.setString(3, xuehao);
				ydy_yuju.executeUpdate();
			}
	}

}
