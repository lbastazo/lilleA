package com.inti.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.init.entities.Employe;
import com.inti.services.impl.EmployeService;
import com.inti.services.interfaces.IEmployeService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    IEmployeService employeService = new EmployeService();
    
 
    public LoginServlet() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("register.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login=request.getParameter("login");
		String password=request.getParameter("password");
		if(employeService.findWithLoginAndPassword(login, password) != null) {
			request.setAttribute("employes", employeService.findAll(Employe.class));
			request.setAttribute("log",
					"Bonjour Mr Yugo" + employeService.findWithLoginAndPassword(login, password).getNomEmploye()
					+" - "+ employeService.findWithLoginAndPassword(login, password).getPrenomEmploye() );
		request.getRequestDispatcher("accueil.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "login ou password incorrect");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	
	}
	
	}


