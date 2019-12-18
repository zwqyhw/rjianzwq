package com.zfc;

import java.util.*;

public class E47 {

	public static void main(String[] args) {
		Properties properties=System.getProperties();
		System.out.println(properties);
		Set<String> propertName=properties.stringPropertyNames();
		for (String key : propertName) {
			String value=System.getProperty(key);
			System.out.println(key+"---->"+value);
			
		}
	}

}
