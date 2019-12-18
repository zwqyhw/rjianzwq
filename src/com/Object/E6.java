package com.Object;

import com.Object.Animal;

class Animal extends java.lang.Object{
	void shout(){
		System.out.println("动物叫!");
	}
	@Override
	public String toString() {
		return "这是一只动物";
	}
		
	}

public class E6 {

	public static void main(String[] args) {
		Animal dw=new Animal();
		System.out.println(dw.toString());

	}

}