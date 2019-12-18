package com.jihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.CORBA.PUBLIC_MEMBER;

public class E79 {

	public static void main(String[] args) {
		List<E78> list=new ArrayList<>();
		E78 p1=new E78("Wang Yu",18,"男");
		E78 p2=new E78("Zhang San",28,"男");
		E78 p3=new E78("Li Si",20,"女");
		E78 p4=new E78("Wang Wu",12,"男");
		list=Arrays.asList(p1,p2,p3,p4);
		
		//old
		for(E78 pm : list) {
		System.out.println(pm.getName());
		}
		
		//New1   map:映射   collect:收集
		List<String> list2=list.stream().map(a->a.getName()).collect(Collectors.toList());
		System.out.println(list2);
		
		//New2   
		List<String> list3=list.stream().map(E78::getName).collect(Collectors.toList());
		System.out.println(list3);
		
		//New3   
		List<String> list4=list.stream().map(a->{
			System.out.println(a.getName());
			return a.getName();
		}).collect(Collectors.toList());
		System.out.println(list4);
	}
	

}
