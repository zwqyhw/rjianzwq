package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class E65 {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("sut1");
		arraylist.add("sut2");
		arraylist.add("sut3");
		arraylist.add("sut4");
		Iterator<String> it=arraylist.iterator();
		while (it.hasNext()) {
			Object obj = (Object) it.next();
			if(obj.equals("sut2")) {
				arraylist.remove(obj);
				break;
			}
		}
		System.out.println(arraylist);
	}
}
