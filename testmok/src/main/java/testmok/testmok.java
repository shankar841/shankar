package testmok;

import java.sql.*;
import java.util.Scanner;

public class testmok 
{
public static void main(String[] args) throws Exception

{
	Scanner sc=new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jecm6","root","root");
	
	PreparedStatement ps=c.prepareStatement("select * from sd where id=?");
	System.out.println("enetr the id");
	ps.setInt(1,sc.nextInt());
	
	ResultSet e=ps.executeQuery();
			e.next();
			System.out.println(e.getInt(1)+e.getString(2)+e.getString(3));
	
	
	
	
	ps.execute();
	c.close();
}
}
