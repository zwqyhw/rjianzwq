package com.e;
//函數式接口注解:表明注解下面的接口有僅有一個抽象方法
@FunctionalInterface
interface Animal{
	void shout() ;		
}
@FunctionalInterface
interface Calculate{
	int sum(int a,int b);
}
public class E21 {

	public static void main(String[] args) {
		String name="小花";
		Animalshout(new Animal() {
			@Override
			public void shout() {
				System.out.println(name+"喵喵");
				
			}
		});
		Animalshout(()->System.out.println(name+"寶強"));
			showsum(10,30,(x,y)->x+y);
		
		
	}
	//第三種方法，用lambda表達式調用shout方法
	//lambda表達式有三個部份組成;
	//():參數列表->箭牌{方法主體}
	private static void showsum(int i, int j, Calculate c) {
		System.out.println(i+"+"+j+"的和是"+c.sum(i,j));
		
	}

	private static void Animalshout(Animal animal) {
	animal.shout();
		
	}

}
