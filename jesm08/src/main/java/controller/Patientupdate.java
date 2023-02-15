package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Daopatience;
import dto.Dtopatience;
@WebServlet("/def")
public class Patientupdate extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String S1 = req.getParameter("pid");
	int pid = Integer.parseInt(S1);
	String S2 = req.getParameter("pblood");
	Dtopatience dtopatience = new Dtopatience();
	dtopatience.setPid(pid);
	dtopatience.setPblood(S2);
	Daopatience daopatience = new Daopatience();
	daopatience.update(dtopatience);
	//super.doPost(req, resp);
}
}
