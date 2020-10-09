package com.inti.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inti.entities.Gerant;
import com.inti.services.impl.GerantService;
import com.inti.services.interfaces.IGerantService;

// @WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    IGerantService GerantService = new GerantService();
    
 
    public LoginServlet() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("register.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login=request.getParameter("login");
		String password=request.getParameter("password");
		if(GerantService.findWithLoginAndPassword(login, password) != null) {
			request.setAttribute("Gerants", GerantService.findAll(Gerant.class));
			request.setAttribute("log", "Bonjour" + ((Gerant) GerantService.findWithLoginAndPassword(login, password)).getNom()
					+" - "+ ((Gerant) GerantService.findWithLoginAndPassword(login, password)).getPrenom() );
		request.getRequestDispatcher("accueil.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "login ou password incorrect");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	
	}
	
	}


