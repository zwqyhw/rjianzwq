package com.abbbb;
abstract class Animal{
	abstract void shout();
}
class Cat extends Animal{
	public void shout() {
		System.out.println("喵喵...");
	}
}
public class E15 {

	public static void main(String[] args) {
		Animal an1=new Cat();
		an1.shout();

	}

}
