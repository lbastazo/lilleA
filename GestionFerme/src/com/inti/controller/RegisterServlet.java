package com.inti.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inti.entities.Gerant;
import com.inti.services.impl.ManagerService;
import com.inti.services.interfaces.IService;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	IService<Gerant> GerantService=new ManagerService<>();
	
    public RegisterServlet() {
        super();
        
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SimpleDateFormat dateN=new SimpleDateFormat("dd/MM/yyyy");
		GerantService.save(new Gerant());
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

}
