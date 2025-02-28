package com.tns.jdbcprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IUdemo {

	public static void main(String[] args) throws SQLException {
		Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/sowmya","postgres","Sowmya");
		Statement st=con.createStatement();
		
		//insert data
		String str="insert into student values(12,'charan','cse')";
		System.out.println("the sql staement "+str);
		int countno=st.executeUpdate(str);
		System.out.println(countno +"record inserted");
		
		String str1="insert into student values(13,'bindu','cse')";
		System.out.println("the sql staement "+str1);
		int countno1=st.executeUpdate(str1);
		System.out.println(countno1 +"record inserted");
		
		//delete data
		String sqldelete="delete from student where stuid=12";
		System.out.println("the deleted statement"+sqldelete);
		int countdelte=st.executeUpdate(sqldelete);
		System.out.println(countno +"record delete");
		
	}
}
