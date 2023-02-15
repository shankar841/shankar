package demo7;

import java.sql.*;
import java.util.Scanner;




public class demo8 {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/shankar","root","root");
Scanner sc=new Scanner(System.in);
boolean flag=true;
while(flag)
{
	System.out.println("1.addstudent");
	System.out.println("2.modify mock rating");
	System.out.println("3.modefy number of requirements");
	System.out.println("4.delete the student");
	System.out.println("5.exit");
	System.out.println("enter the number");
	switch(sc.nextInt()) {
	case 1:{PreparedStatement ps=connection.prepareStatement("insert into new_table values(?,?,?,?,?,?)");
	System.out.println("enter id");
	ps.setInt(1, sc.nextInt());
	System.out.println("enter name");
	ps.setString(2, sc.next());
	System.out.println("enter java rating");
	ps.setString(3, sc.next());
	System.out.println("enetr sql rating");
	ps.setString(4, sc.next());
	System.out.println("enter web rating");
	ps.setString(5, sc.next());
	System.out.println("enter no of requirements");
	ps.setString(6, sc.next());
	}
	break;
	case 2:{
		PreparedStatement ps=connection.prepareStatement("update new_table set=sqlrating where id=?");
	System.out.println("enter id");
	ps.setInt(1, sc.nextInt());
	}break;
	}
}
	connection.close();
		

	}

}
