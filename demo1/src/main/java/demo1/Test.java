package demo1;

import java.sql.*;
public class Test 
{
public static void main(String[] args) throws Exception
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sheela","root","root");
	Statement statement=connection.createStatement();
	// boolean e=statement.execute(create database sheela);
	boolean e=statement.execute("create table monday(id integer primary key,name varchar(20))");
	connection.close();
	System.out.println("database is created");
	System.out.println(e);
}
}
