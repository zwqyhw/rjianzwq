package com.jibengfangfa;

@FunctionalInterface
interface printable {
	void print(stringUtils su, String str);
}

class stringUtils {
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}

public class E27 {
	private static void printUpper(stringUtils su, String text, printable pt) {
		pt.print(su, text);
	}

	public static void main(String[] args) {
		printUpper(new stringUtils(), "hello", (Object, t) -> Object.printUpperCase(t));
		printUpper(new stringUtils(), "world", stringUtils::printUpperCase);

	}
}
