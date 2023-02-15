package demo8;

import java.sql.*;
import java.util.Scanner;






public class test9 {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/shanm","root","root");
		//Statement statement=connection.createStatement();
		//statement.execute("create table SD(usn Integer,name Varchar(20),branch Varchar(20),collegename Varchar(40),CGPA varchar(20))");
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			System.out.println("1.addstudent");
			System.out.println("2.update branch by taking usn");
			System.out.println("3.update cgpa by taking usn ");
			System.out.println("4.fetch the students by taking usn");
			System.out.println("5.delete students by taking usn");
			System.out.println("6.fetch all the details from table");
			System.out.println("7.delete all the students");
			System.out.println("8.exit");
			switch(sc.nextInt()) {
			case 1:{PreparedStatement ps=connection.prepareStatement("insert into new_table values(?,?,?,?,?,?)");
			System.out.println("enter usn");
			ps.setInt(1, sc.nextInt());
			System.out.println("enter name");
			ps.setString(2, sc.next());
			System.out.println("enter ");
			ps.setString(3, sc.next());
			System.out.println("enetr sql rating");
			ps.setString(4, sc.next());
			System.out.println("enter web rating");
			ps.setString(5, sc.next());
			System.out.println("enter no of requirements");
			ps.setString(6, sc.next());
			}
			
			}
		connection.close();
		

	}

}
