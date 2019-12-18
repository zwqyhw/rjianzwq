package com.e;

import org.omg.CORBA.PRIVATE_MEMBER;

@FunctionalInterface
interface printable{
	void print(String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E25 {
	private static void printUpper(String text, printable pt) {
		pt.print(text);
	}

	public static void main(String[] args) {
		StringUtils stu=new StringUtils();
		printUpper("hello",t->stu.printUpperCase(t));
		printUpper("world",stu::printUpperCase);

	}




		
	}

