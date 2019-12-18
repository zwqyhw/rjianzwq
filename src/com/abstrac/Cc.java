package com.abstrac;

abstract class Animal{
	public abstract void shout();

	}

	class Dog extends Animal{
		public void shout() {
			System.out.println("宝强汪汪叫");
		}
		}
public class Cc {

	public static void main(String[] args) {
	Dog dog=new Dog();
	dog.shout();
	}

}
