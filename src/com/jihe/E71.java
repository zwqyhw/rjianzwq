package com.jihe;

import java.util.HashSet;

class Persen{
	String name;
	int age;
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Persen other = (Persen) obj;
		return name.equals(other.name);
	}
	@Override
	public String toString() {
		return name+ ":"+ age;
	}
	public Persen(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
public class E71 {

	public static void main(String[] args) {
		Persen p1=new Persen("das",14);
		Persen p2=new Persen("dadas",20);
		Persen p3=new Persen("dagz",20);
		Persen p4=new Persen("dagz",20);
		HashSet<Persen> ts=new HashSet<Persen>();
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		System.out.println(ts);
	}
}
