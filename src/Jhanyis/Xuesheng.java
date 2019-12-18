package Jhanyis;

public class Xuesheng extends Pesson{
	public  int age;
	
	
	public Xuesheng() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Xuesheng(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class A{}
class B extends A{}
class C extends A{}
