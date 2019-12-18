package com.zfc;

public class E45 {

	public static void main(String[] args) {
		String s="我爱你中国";
		StringBuffer zfcsz=new StringBuffer(s);
		System.out.println(zfcsz);
		//添加
		zfcsz.append("!");
		System.out.println(zfcsz);
		zfcsz.insert(3,',');
		System.out.println(zfcsz);
		//删除
		zfcsz.delete(2,4);
		System.out.println(zfcsz);
		//修改
		zfcsz.replace(2,4,"香港");
		System.out.println(zfcsz);
		//反转
		zfcsz.reverse();
		System.out.println(zfcsz);
	}

}
