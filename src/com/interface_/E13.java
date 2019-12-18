package com.interface_;

interface Animal{
	int ID=1;
	void breathe();
	default void getType(String type) {
		System.out.println("属于");
	}


    static int getID() {
	return Animal.ID;
	}
}
class Dog implements  Animal{
		public void breathe(){
			System.out.println("宝强汪汪叫");
		}
	}
public class E13 {
	public static void main(String[] args) {
	System.out.println(Animal.getID());
	Dog dog=new Dog();
	System.out.println(Animal.ID);
	dog.breathe();
	dog.getType("宝强狗");
	}

}




