package com.yichang;
class BlcException extends Exception{

	public BlcException() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public BlcException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}
	
}
public class E31 {
	//throws用在方法申明的最後
	//throw用在方法體內部
public static int divide(int z,int y)throws Exception {
		if(z==0) {
			throw new Exception("除數不能為0");
		}
		int result=(z/y);
		return result;
	}
	public static void main(String[] args) {
		int result;
		try {
			 result = divide(4,0);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("错误错误错误:"+e.getMessage());
		}	
	}

}