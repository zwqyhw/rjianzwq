package yhw;

import java.io.Serializable;

public class Lei extends Object implements Serializable{
	//定义四个内部类
	//class是关键字 class前面可以添加修饰符
	//第一种修饰符是作用范围:public公有的 protected 受保护的 private 私有的 什么都不写也可以
	//第二种修饰符是工能性的:static:静态的;final 最终的（表示该类不恩能够被继承）
	public static final class A extends Object implements Serializable{}
	protected static final class B extends Object implements Serializable{}
	private static final class C extends Object implements Serializable{}
	static final class D extends Object implements Serializable{}
	//定义两个成员变量,修饰符+数据类型+成员变量
	public static int a;
	public static String name;
	//定义两个
	public synchronized void setAge(int nianlin) {}
	public synchronized int getAge() {
		return 0;}
}
