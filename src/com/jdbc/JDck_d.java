package com.jdbc;

import java.sql.*;


public class JDck_d {

	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//通过获得连接连接对象
		Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc", "root", "zwqyhw");
		//通过连接对象获得语句对象
		Statement yuju=lianjie.createStatement();
		//定义更新sql语句
		String sql="UPDATE tb_user SET email ='jack@163.com' WHERE id= 2 ";
		//通过语句对象执行sql
		yuju.execute(sql);
	}

}
