package com.io;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Files_test {

	public static void main(String[] args) throws Exception {
		//定义一个路径目录
		Path lujing=Paths.get("D:\\360Downloads555\\444");
		//用File工具类根据path对象创建多级目录
		Files.createDirectories(lujing);
		//定义一个文件的对象
		Path wj=Paths.get("D:\\360Downloads555\\444\\test.txt");
		//用File工具类根据path对象创建文件,文件只能创建一次
		Files.createFile(wj);
		//向集合添加内容
		List<String> neirong=new ArrayList<>();
		neirong.add("这是一个测试文件");
		//把集合里的内容写入文件
		Files.write(wj, neirong, StandardOpenOption.APPEND);
		List<String> lines=Files.readAllLines(wj);
		System.out.println("文件内容为"+lines);
		System.out.println("文件大小为"+Files.size(wj)+"字节");
	}

}
