package com.jihe;
import java.util.HashSet;

class Student{
	String id;
	String name;
	public Student(String id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return id+" "+name;
	}
	@Override
	public int hashCode() {
	return id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Student other=(Student) obj;
		return id.equals(other.id);
	}
	public Student(int i, String name2) {
		// TODO 自动生成的构造函数存根
	}
}

public class E67 {
	
	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<Student>();
		Student stu1=new Student("1", "Jack");
		Student stu2=new Student("2", "Rose");
		Student stu3=new Student("2", "Rose");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);
	}

}
