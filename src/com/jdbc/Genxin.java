package com.jdbc;

import java.sql.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

public class Genxin {

	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//通过获得连接连接对象
		Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc", "root", "zwqyhw");
		//通过连接对象获得语句对象
		Statement yuju=lianjie.createStatement();
		String sql="select * from tb_user";
		ResultSet rs=yuju.executeQuery(sql);
		System.out.println("id | name | +sex");
		while (rs.next()) 
		{
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String sex=rs.getString("sex");
			System.out.println(id+"  | "+name+" | "+sex);
		}

	}

}
