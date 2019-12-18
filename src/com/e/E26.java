package com.e;
@FunctionalInterface
interface personBuilder{
	person buildPerson(String name);
	
}
class person{
	private String name;
	public person(String name) {
		this.name=name;
		}
	public String getName() {
		return name;
	}
	}

public class E26 {
	public static void printName(String name,personBuilder builder) {
		System.out.println(builder.buildPerson(name).getName());
	}

	public static void main(String[] args) {
		printName("张杰",name->new person(name));
		printName("周雯倩",person::new);

	}

}
