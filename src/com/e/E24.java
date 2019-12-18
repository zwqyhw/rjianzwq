package com.e;
@FunctionalInterface
interface Calcable{
	int calc(int num);
}
class Math{
	public static int abs (int num) {
		if(num<0) {
			return -num;
		}else {
			return num;
		}
	}
}
public class E24 {

	public static void main(String[] args) {
		printAbs (-10,n->Math.abs(n));
		printAbs(-10,Math::abs );

	}

	private static void printAbs(int i, Calcable c) {
		System.out.println(c.calc(i));
		
	}

}
