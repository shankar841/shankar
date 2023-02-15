package demo7;

import java.sql.*;
import java.util.Scanner;
public class test7 
{
public static void main(String[] args) throws Exception
{
	@SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm31","root","root");
boolean flag=true;
while(flag)
{
	System.out.println("1.added/n2.exit");
	switch(scanner.nextInt())
	{
	case 1:
	{
		PreparedStatement preparedStatement=connection.prepareStatement("insert into studentdetails values(?,?,?)");
		System.out.println("enter the id");
		preparedStatement.setInt(1, scanner.nextInt());
		System.out.println("enter the name");
		preparedStatement.setString(2,scanner.next());
		System.out.println("enter the city");
		preparedStatement.setString(3, scanner.next());
		preparedStatement.executeUpdate();
		System.out.println("added");
		
	}
	break;
	case 2:
	{
		flag=false;
		System.out.println("thank you");
		break;
	}
	default :
	{
		System.out.println("invaild");
		break;
		
	}
}
	connection.close();


}

}
}
