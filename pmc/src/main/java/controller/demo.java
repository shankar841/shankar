package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServle

public class demo extends GenericServlet
{
	@Override
	public void init() throws SecurityException
	{
		System.out.println("servlet instance object is created");
	}
	@Override
	public void service(Servlet )
	
	
	
	@Override
	public void destroy() {
		 System.out.println("destroy the method is called");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
}
