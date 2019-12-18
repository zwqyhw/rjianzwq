package com.jihe;

import java.util.Arrays;

public class E77 {
	
	public static void main(String[] args) {
		int[] arr= {9,8,3,5,2};
		System.out.println("排序前:");
		printArray(arr);
		Arrays.sort(arr);
		System.out.println("\n排序后:");
		printArray(arr);
		
		int index=Arrays.binarySearch(arr, 8);
		System.out.println("\n元素8在排序后的數值中的索引是:"+index);
		
		//拷貝數組元素
		int[] copiedArr=Arrays.copyOfRange(arr, 2, 8);
		System.out.println("\n被拷貝的數組是:");
		printArray(copiedArr);
		//替換數組元素
		Arrays.fill(arr,8);
		System.out.println("\n被拷貝的數組元素替換成8以後是:");
		printArray(arr);
	}
	
	private static void printArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1) {
				System.out.print(arr[i]+" ");
			}
			else
			{
				System.out.print(arr[i]);
			}
			
		}
		
	}

}
