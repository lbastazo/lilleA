package com.inti.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.init.entities.Employe;
import com.inti.dao.impl.EmployeDAO;
import com.inti.services.impl.EmployeService;
import com.inti.services.interfaces.IEmployeService;


@WebServlet("/Delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    IEmployeService employeService= new EmployeService();   
  
    public DeleteServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long idEmp=Long.parseLong(request.getParameter("pId"));
		Employe emp=employeService.findOne(Employe.class, idEmp);
		employeService.remove(emp);
		request.setAttribute("employes", employeService.findAll(Employe.class));
		request.getRequestDispatcher("accueil.jsp").forward(request, response);
	}
	
}
