package com.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Bjxx {

	public static void main(String[] args) throws Exception {
		//定义一个文件对象
		Path wjs=Paths.get("d:\\班级信息.txt");
		Path bjbh=Paths.get("d:\\求班级编号.txt");
		Path bjmc=Paths.get("d:\\班级编号.txt");
		List<String> neirong=new ArrayList<>();
		Files.createFile(bjmc);
		//读取文件内容
		List<String> lines=Files.readAllLines(wjs);
		List<String> names=Files.readAllLines(bjbh);
		for (String name:names) {
			for (String line:lines) {
			String[] zfcsz=line.split("\t");
			if(name.equals(zfcsz[1])) {
			//System.out.println(zfcsz[0]);
			neirong.add(zfcsz[0]);
			}
		}
		}
		//System.out.println(neirong);
		Files.write(bjmc, neirong, StandardOpenOption.APPEND);
	
		}

}
