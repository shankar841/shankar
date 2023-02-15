package demo4;

import java.sql.*;


public class jecm4 {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jecm4","root","root");
		Statement statement=connection.createStatement();
		//statement.execute("create table studentdatabase(id integer primary key,name varchar(40) not null,phonenumber bigint unique)");
		statement.execute("insert into studentdatabase values(2,'pushpa',3524)");
		connection.close();
		

	}

}
