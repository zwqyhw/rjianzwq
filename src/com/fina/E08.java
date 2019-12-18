package com.fina;
class Animal{
	final String name="动物";//如果一个成员变量被final修饰,则该变量在本类中不能再次被赋值
	public  void shout() {
	
	}
		@Override
		public String toString() {
			return "这是一只宝强";
		} 
 }
class Dog extends Animal{
	String name="动物";
	@Override
	public  void shout() {}
	@Override
	public String toString() {
		return "这是一只猪";
	}
}

public class E08 {

	public static void main(String[] args) {
		Animal dw=new Animal();
		System.out.println(dw);
		Dog xg=new Dog();
		System.out.println(xg);
		
	}

}
