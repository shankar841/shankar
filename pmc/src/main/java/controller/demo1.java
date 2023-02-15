package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/abc")
public class demo1  extends GenericServlet
{
@Override
public void init() throws ServletException 
{
System.out.println("object is created");
}
@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service is method");
		
	}
@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy methhod ");
	}
}
