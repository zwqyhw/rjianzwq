package com.C4;
class Anmial{
	//fieid:成员变量
	String name;
	//Method:成员方法
	void shot() {
		System.out.println("动物发出叫声");
	}
}
class Dog extends Anmial{
	//方法的重写
	@Override
	void shot() {
		System.out.println("汪汪....");
	}
	//继承了Animal类所有成员变量和成员方法
	public void printName() {
		System.out.println("name="+name);
	}
}
public class S1 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.name="张宝强";
		dog.printName();
		dog.shot();

	}

}
