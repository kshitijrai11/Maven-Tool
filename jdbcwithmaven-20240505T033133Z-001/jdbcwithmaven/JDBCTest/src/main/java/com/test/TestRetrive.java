package com.test;

import java.sql.*;
public class TestRetrive
{
	public static void main(String []ss)
	{
	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
Statement s = c.createStatement();

 ResultSet result1=s.executeQuery("select * from emp101");

		while(result1.next())
		{
System.out.println( result1.getString(1)+"="+ result1.getString(2));

		
		}

		}catch(SQLException e)
		{
			System.out.println(e);	
		}		
		catch(Exception i){System.out.println(i);}
	}
}
//C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib\ojdbc14.jar
