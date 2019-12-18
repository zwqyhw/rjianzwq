package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Shili {

	public static void main(String[] args) throws Exception {
		FileInputStream shilisj=new FileInputStream("shili.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(shilisj);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		Map map=new HashMap();
		for (int i = 1; i < rows; i++) {
			XSSFRow rowi=sheet.getRow(i);
			Iterator<Cell> celljihe=rowi.cellIterator();
			List list=new ArrayList<>();
			while (celljihe.hasNext()) {
				Cell cell=(Cell) celljihe.next();
			if(cell.getCellType()==CellType.STRING) {
			list.add(cell.getStringCellValue());
			}else 
			if(cell.getCellType()==CellType.NUMERIC) {
			list.add(cell.getNumericCellValue());
			}
			}
			map.put(list.get(3),list);
		}
		FileInputStream shilisj_dest=new FileInputStream("18rj2.xlsx");
		XSSFWorkbook wb_dest=new XSSFWorkbook(shilisj_dest);
		XSSFSheet sheet_dest=wb_dest.getSheet("Sheet1");
		int rows_dest=sheet_dest.getLastRowNum();
		for (int i = 1; i < rows_dest; i++) {
			XSSFRow rowi_dest=sheet_dest.getRow(i);
			String xuehao=rowi_dest.getCell(3).getStringCellValue();
			List list_dest=(ArrayList)map.get(xuehao);
			System.out.println(list_dest);	
			if(list_dest!=null) {
				rowi_dest.createCell(15,CellType.STRING).setCellValue(list_dest.get(11).toString());
				rowi_dest.createCell(16,CellType.STRING).setCellValue(list_dest.get(12).toString());
			}
		}
		FileOutputStream shilisjshu_dest=new FileOutputStream("18rj2.xlsx");
		wb_dest.write(shilisjshu_dest);
		shilisjshu_dest.close();
	}

}
