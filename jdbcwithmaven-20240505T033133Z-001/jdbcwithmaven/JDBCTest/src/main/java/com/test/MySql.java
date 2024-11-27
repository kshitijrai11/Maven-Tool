package com.test;
import java.sql.*;
import java.io.*;
public class MySql
{
	public static void main(String []ss)
	{
		try{
Class.forName("com.mysql.jdbc.Driver");

// Connection c=DriverManager.getConnection("jdbc:mysql://localhost/appsquadz1", "appsquadz1", "appsquadz1");
//Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/codesquadz3", "codesquadz3", "codesquadz3");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","codesquadz");
	
String t1="lalu";
int t2=420;

Statement s = c.createStatement();
s.executeUpdate("create table emp163(name varchar(20), salary int)" );
s.close();
PreparedStatement ps=c.prepareStatement("insert into emp163 values(?,?)");
ps.setString(1,t1);
ps.setInt(2,t2);
ps.executeUpdate();
ps.close();
 ps=c.prepareStatement("select * from emp163 where salary=?");
ps.setInt(1,t2);
ResultSet result1=ps.executeQuery();

		while(result1.next())
		{
System.out.println("name" + result1.getString(1));
System.out.println("salary" + result1.getString(2));
			
		}


		
		}catch(SQLException e)
		{
			System.out.println(e);	
		}		
		catch(Exception i){System.out.println(i);}
	}
}




















