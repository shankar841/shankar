package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Daopatience;
import dto.Dtopatience;
@WebServlet("/abc")
public class Controller extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
	
String s1=req.getParameter("pid");
int pid=Integer.parseInt(s1);
String pname=req.getParameter("pname");
String pblood=req.getParameter("pblood");

Dtopatience dtopatience=new Dtopatience();
dtopatience.setPid(pid);
dtopatience.setPname(pname);
dtopatience.setPblood(pblood);


Daopatience daopatience=new Daopatience();
daopatience.update(dtopatience);



}
}
