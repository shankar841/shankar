package demo6;

import java.sql.*;

public class test6 
{

	public static void main(String[] args) throws Exception 
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/KFI","root","root");
	Statement statement=connection.createStatement();
	//statement.execute("create database KFI");
	//statement.execute("create table collectiondetails(id integer primary key,name varchar(40) not null,collection bigint)");
	//statement.executeUpdate("insert into collectiondetails(1,'KGF',1000000000)");
	//statement.executeUpdate("update collectiondetails set collection=50000000000 where id=2");
	//ResultSet e=statement.executeQuery("select * from collectiondetails ");
  statement.executeUpdate("drop database  kfi");
//	while (e.next())
		//System.out.println(e.getInt(1)+" "+e.getString(2)+" "+e.getLong(3));
  
	connection.close();

	}

}
