package com.io;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Sc_test {

	public static void main(String[] args) throws Exception {
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("测试环境");
		HSSFRow row0 = sheet.createRow(0);
		HSSFCell cell = row0.createCell(0);
		cell.setCellValue("年级");
		row0.createCell(0).setCellValue("班级编号");
		row0.createCell(1).setCellValue("班级名称");
		row0.createCell(2).setCellValue("项目测试");
		row0.createCell(3).setCellValue("测试时间");
		row0.createCell(4).setCellValue("测试地点");
		row0.createCell(5).setCellValue("测试器材");
		row0.createCell(6).setCellValue("测试老师");
		row0.createCell(7).setCellValue("测试方法(手工/仪器)");
		Path bjxx = Paths.get("d:\\班级信息.txt");
		List<String> lines = Files.readAllLines(bjxx);
		for (int j=0;j<lines.size();j++) {
			String[] zfcsz = lines.get(j).split("\t");
			for (int i = j * 10 + 1; i < j * 10 + 11; i++) {
				HSSFRow rowi = sheet.createRow(i);
				rowi.createCell(0).setCellValue("43");
				rowi.createCell(1).setCellValue(zfcsz[0]);
				rowi.createCell(2).setCellValue(zfcsz[1]);

				if (i % 10 == 1) {
					rowi.createCell(3).setCellValue("2019/10/29");
					rowi.createCell(4).setCellValue("体育馆");
					rowi.createCell(5).setCellValue("跳远垫");
					rowi.createCell(6).setCellValue("张杰");
					rowi.createCell(7).setCellValue("电子");
				}

				if (i % 10 == 2) {
					rowi.createCell(3).setCellValue("2019/10/29");
					rowi.createCell(4).setCellValue("体育馆");
					rowi.createCell(5).setCellValue("跳高杆");
					rowi.createCell(6).setCellValue("王力宏");
					rowi.createCell(7).setCellValue("手工");
				}
				if (i % 10 == 3) {
					rowi.createCell(0).setCellValue("45");
					rowi.createCell(3).setCellValue("2019/10/29");
					rowi.createCell(4).setCellValue("体育馆");
					rowi.createCell(5).setCellValue("仰卧起坐");
					rowi.createCell(6).setCellValue("杨幂");
					rowi.createCell(7).setCellValue("电子");
				}
				if (i % 10 == 4) {
					rowi.createCell(3).setCellValue("2019/10/29");
					rowi.createCell(4).setCellValue("体育馆");
					rowi.createCell(5).setCellValue("器材");
					rowi.createCell(6).setCellValue("刘颖");
					rowi.createCell(7).setCellValue("电子");
				}
				if (i % 10 == 5) {
					rowi.createCell(3).setCellValue("2019/10/29");
					rowi.createCell(4).setCellValue("体育馆");
					rowi.createCell(5).setCellValue("皮筋");
					rowi.createCell(6).setCellValue("张学友");
					rowi.createCell(7).setCellValue("手工");
				}
				if (i % 10 == 6) {
					rowi.createCell(3).setCellValue("2019/10/29");
					rowi.createCell(4).setCellValue("体育馆");
					rowi.createCell(5).setCellValue("跳远");
					rowi.createCell(6).setCellValue("章节");
					rowi.createCell(7).setCellValue("手工");
				}
				if (i % 10 == 7) {
					rowi.createCell(3).setCellValue("2019/10/29");
					rowi.createCell(4).setCellValue("体育馆");
					rowi.createCell(5).setCellValue("跳远");
					rowi.createCell(6).setCellValue("章节");
					rowi.createCell(7).setCellValue("手工");
				}
				if (i % 10 == 8) {
					rowi.createCell(3).setCellValue("2019/10/29");
					rowi.createCell(4).setCellValue("体育馆");
					rowi.createCell(5).setCellValue("跳远");
					rowi.createCell(6).setCellValue("章节");
					rowi.createCell(7).setCellValue("手工");
				}
				if (i % 10 == 9) {
					rowi.createCell(3).setCellValue("2019/10/29");
					rowi.createCell(4).setCellValue("体育馆");
					rowi.createCell(5).setCellValue("跳远");
					rowi.createCell(6).setCellValue("章节");
					rowi.createCell(7).setCellValue("手工");
				}
				if (i % 10 == 0) {
					rowi.createCell(3).setCellValue("2019/10/29");
					rowi.createCell(4).setCellValue("体育馆");
					rowi.createCell(5).setCellValue("跳远");
					rowi.createCell(6).setCellValue("章节");
					rowi.createCell(7).setCellValue("手工");
				}

			}
		}
		FileOutputStream fout = new FileOutputStream("d:\\测试模板.xls");
		wb.write(fout);
		fout.close();
	}

}
