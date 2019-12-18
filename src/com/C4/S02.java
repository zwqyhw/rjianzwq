package com.C4;
class Anmial_1{
	public Anmial_1(String name) {
		System.out.println("你是一只"+name);
	}
}
class Dog_1 extends Anmial_1{
	public Dog_1() {
		super("张宝强");
	}
}
public class S02{
	public static void maun(String[] atgs) {
		Dog_1 dog=new Dog_1();
	}
}


