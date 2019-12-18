package com.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bjxx2 {

	public static void main(String[] args) throws Exception {
		//定义一个文件对象
		Path wjs=Paths.get("d:\\班级信息.txt");
		Path bjbh=Paths.get("d:\\求班级编号.txt");
		Path bjmc=Paths.get("d:\\班级编号1.txt");
		List<String> neirong=new ArrayList<>();
		Files.createFile(bjmc);
		//读取文件内容
		List<String> lines=Files.readAllLines(wjs);
		List<String> names=Files.readAllLines(bjbh);
		Map<String,String> map=new HashMap<>();
			for (String line:lines) {
			String[] zfcsz=line.split("\t");
			map.put(zfcsz[1],zfcsz[0]);
			}
			for (String name:names) {
			neirong.add(map.get(name));
			}
		
	

		Files.write(bjmc, neirong, StandardOpenOption.APPEND);
	
		}

}

	


