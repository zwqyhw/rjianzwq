package com.jihe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class E80 {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("张三","李四","王五","赵四");
		Stream<String> pa=list.parallelStream();
		System.out.println(pa.isParallel());
		
		Stream<String> st=Stream.of("张三","李四","王五","赵四");
		Stream<String>parallel=st.parallel();
		System.out.println(parallel.isParallel());
	}

}
