package com.yichang;

public class E29 {
	public static int divide(int z,int y) {
		try {
		int result=(z/y);
		return result;
		}catch(Exception e) {
			System.out.println("捕获到程序运行时错误"+e.getMessage());
		}finally{
			System.out.println("无论如何都要执行finally代码块");
		}
		return -1;
	}

	public static void main(String[] args) {
		int result=divide(4,0);
		if(result==-1) {
			System.out.println("程序发生错误");
		}else{
			System.out.println(result);
		}
		
		
	}

}
