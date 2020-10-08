package com.inti.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.init.entities.Employe;
import com.inti.services.impl.ManagerService;
import com.inti.services.interfaces.IService;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	IService<Employe> employeService=new ManagerService<>();
	
    public RegisterServlet() {
        super();
        
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SimpleDateFormat dateN=new SimpleDateFormat("dd/MM/yyyy");
		try {
			employeService.save(new Employe(request.getParameter("nom"), request.getParameter("prenom")
					, dateN.parse(request.getParameter("dateN")),
					request.getParameter("login"), request.getParameter("password")));
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
	}

}
