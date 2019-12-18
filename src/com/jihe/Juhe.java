package com.jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Juhe {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("張三");
		list.add("李四");
		list.add("張大名");
		list.add("張利");
		
		//把集合變成流
		Stream<String> liu=list.stream();
		liu.forEach(j->System.out.println(j));
		
		Stream<String> liu2=list.stream();
		Stream<String> liu3=liu2.filter(k->k.startsWith("張"));
		System.out.println("集合中所有姓張的人:");
		liu3.forEach(j->System.out.println(j));
		
		System.out.println("集合中第二個和第三個姓張的人:");
		list.stream().filter(k->k.startsWith("張")).skip(1).limit(2).forEach(j->System.out.println(j));
		
		System.out.println("連接集合中第二個和第三個姓張的人:");
		String string=list.stream().filter(k->k.startsWith("張")).skip(1).limit(2).collect(Collectors.joining(","));
		System.out.println(string);
	}

}
